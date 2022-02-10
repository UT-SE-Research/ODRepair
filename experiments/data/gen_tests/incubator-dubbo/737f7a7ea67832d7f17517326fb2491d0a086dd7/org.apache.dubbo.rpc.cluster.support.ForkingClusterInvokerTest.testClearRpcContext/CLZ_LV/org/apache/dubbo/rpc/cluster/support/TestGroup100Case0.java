package org.apache.dubbo.rpc.cluster.support;

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
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, 0.0d, (short) 0, "Succeeded to forking invoke provider !" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = org.mockito.Mockito.ignoreStubs(objArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.lang.Float");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, 0.0, 0, Succeeded to forking invoke provider !]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, 0.0, 0, Succeeded to forking invoke provider !]");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        int int0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.lastVariableIndex();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.Mockito.verify(strComparable0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() should be a mock but is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?    not: verify(mock.someMethod());?Also, if you use @Mock annotation don't miss openMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(strComparableSet0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.Comparable<java.lang.String> strComparable0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(strComparable0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SMART_NULLS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SMART_NULLS));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.CharSequence charSequence0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.Iterable<org.mockito.stubbing.Answer<java.lang.Object>> objAnswerIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(objAnswerIterable0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        long long1 = org.mockito.ArgumentMatchers.eq((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.mockito.Mockito> mockitoIterable1 = org.mockito.Mockito.spy(mockitoIterable0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoIterable0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4', 10.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder4 = org.mockito.Mockito.inOrder(objArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4, 10.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4, 10.0, 1.0]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        int int0 = java.lang.Thread.NORM_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.only();
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        short short1 = org.mockito.ArgumentMatchers.eq((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.mockito.stubbing.BaseStubber baseStubber0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(baseStubber0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        boolean boolean1 = org.mockito.ArgumentMatchers.eq(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        int int0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.nextVariableIndex();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.mockito.ArgumentMatcher<java.lang.Character> charArgumentMatcher0 = null;
        char char1 = org.mockito.ArgumentMatchers.charThat(charArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[100.0]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("method1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.mockito.ArgumentMatcher<java.lang.Long> longArgumentMatcher0 = null;
        long long1 = org.mockito.ArgumentMatchers.longThat(longArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap3 = internalThread2.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("Succeeded to forking invoke provider !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        char char1 = org.mockito.ArgumentMatchers.eq('4');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(objAnswer0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.Iterable<org.mockito.MockingDetails> mockingDetailsIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(mockingDetailsIterable0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(mockitoFramework0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative value is not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        char char0 = org.mockito.ArgumentMatchers.anyChar();
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\000' + "'", char0 == '\000');
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.validateMockitoUsage();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.mockito.ArgumentMatcher<java.lang.Double> doubleArgumentMatcher0 = null;
        double double1 = org.mockito.ArgumentMatchers.doubleThat(doubleArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.String str0 = org.mockito.ArgumentMatchers.anyString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(mockitoFramework0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(strComparableSet0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.util.Collection<java.lang.Throwable[]> throwableArrayCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(throwableArrayCollection0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.get();
        boolean boolean3 = internalThreadLocalMap0.setIndexedVariable(5, (java.lang.Object) (byte) 0);
        boolean boolean6 = internalThreadLocalMap0.setIndexedVariable((int) '#', (java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(internalThreadLocalMap0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        double double0 = org.mockito.ArgumentMatchers.anyDouble();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "value", 1L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = internalThread3.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.remove();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) 'a');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        int int0 = java.lang.Thread.MIN_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.lang.reflect.AnnotatedElement annotatedElement0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(annotatedElement0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atMostOnce();
        org.junit.Assert.assertNotNull(verificationMode0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        short short0 = org.mockito.ArgumentMatchers.anyShort();
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        byte byte0 = org.mockito.ArgumentMatchers.anyByte();
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        char char1 = org.mockito.ArgumentMatchers.eq('#');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.util.regex.Pattern pattern0 = null;
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches(pattern0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.Comparable<java.lang.String> strComparable1 = org.mockito.ArgumentMatchers.eq((java.lang.Comparable<java.lang.String>) "Succeeded to forking invoke provider !");
        org.junit.Assert.assertNull(strComparable1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.mockito.ArgumentMatcher<java.lang.Float> floatArgumentMatcher0 = null;
        float float1 = org.mockito.ArgumentMatchers.floatThat(floatArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber0 = org.mockito.Mockito.doCallRealMethod();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        int int1 = org.mockito.ArgumentMatchers.eq((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.util.List<org.apache.dubbo.common.threadlocal.InternalThreadLocalMap> internalThreadLocalMapList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(internalThreadLocalMapList0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.mockito.Mockito.clearAllCaches();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.Map<java.lang.String[], java.lang.Comparable<java.lang.String>> strArrayMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(strArrayMap0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.mockito.stubbing.BaseStubber baseStubber0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(baseStubber0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (short) 100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        boolean boolean0 = org.mockito.ArgumentMatchers.anyBoolean();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        short short1 = org.mockito.ArgumentMatchers.eq((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.mockito.ArgumentMatcher<java.lang.Boolean> booleanArgumentMatcher0 = null;
        boolean boolean1 = org.mockito.ArgumentMatchers.booleanThat(booleanArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.getIfSet();
        org.mockito.verification.VerificationMode verificationMode3 = org.mockito.Mockito.atLeast((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = internalThreadLocalMap0.setIndexedVariable((int) '\000', (java.lang.Object) verificationMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(internalThreadLocalMap0);
        org.junit.Assert.assertNotNull(verificationMode3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("Succeeded to forking invoke provider !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(verificationAfterDelay0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(internalThread0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(strComparableCollection0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder4 = org.mockito.Mockito.inOrder((java.lang.Object[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.util.Set<java.lang.String[]> strArraySet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(strArraySet0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        int int0 = java.lang.Thread.MAX_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        byte byte1 = org.mockito.ArgumentMatchers.eq((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(internalThread0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        char char1 = org.mockito.ArgumentMatchers.eq('\000');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) (byte) 100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.lang.Class<?> wildcardClass0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread4, "value", 1L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap8 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.get();
        internalThread7.setThreadLocalMap(internalThreadLocalMap8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7, "Too many thread-local indexed variables", (long) '4');
        org.junit.Assert.assertNotNull(internalThreadLocalMap8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        short short1 = org.mockito.ArgumentMatchers.eq((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn(obj0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("value");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.get();
        boolean boolean3 = internalThreadLocalMap0.setIndexedVariable(5, (java.lang.Object) (byte) 0);
        org.mockito.verification.VerificationMode verificationMode5 = org.mockito.Mockito.atLeastOnce();
        boolean boolean6 = internalThreadLocalMap0.setIndexedVariable((int) (short) 0, (java.lang.Object) verificationMode5);
        java.lang.Object obj8 = internalThreadLocalMap0.removeIndexedVariable(0);
        org.junit.Assert.assertNotNull(internalThreadLocalMap0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(verificationMode5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "Wanted invocations count: at least 1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "Wanted invocations count: at least 1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "Wanted invocations count: at least 1");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(verificationWithTimeout0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout3 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout1, strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(verificationWithTimeout3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderOngoingStubbing1 = org.mockito.Mockito.when(mockitoSessionBuilder0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
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
        java.util.Set<java.lang.CharSequence> charSequenceSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(charSequenceSet0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("Succeeded to forking invoke provider !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.mockito.ArgumentMatchers.same(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.ArgumentMatchers.refEq("method1", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber4 = org.mockito.Mockito.doReturn((java.lang.Object) '\000', (java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (short) 1);
        org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doReturn((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(stubber2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread0 = new org.apache.dubbo.common.threadlocal.InternalThread();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Thread thread1 = org.mockito.Mockito.verify((java.lang.Thread) internalThread0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type InternalThread and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        org.mockito.verification.VerificationMode verificationMode4 = org.mockito.Mockito.atLeast((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable5 = org.mockito.Mockito.verify((java.io.Serializable) str2, verificationMode4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() should be a mock but is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?    not: verify(mock.someMethod());?Also, if you use @Mock annotation don't miss openMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(verificationMode4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("set attachment failed!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList0 = org.mockito.ArgumentMatchers.anyList();
        java.util.List<java.lang.reflect.GenericDeclaration> genericDeclarationList1 = org.mockito.ArgumentMatchers.same(genericDeclarationList0);
        org.junit.Assert.assertNotNull(genericDeclarationList0);
        org.junit.Assert.assertNull(genericDeclarationList1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        double double1 = org.mockito.ArgumentMatchers.eq(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass1 = mockSettings0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.mockito.Mockito.verify(wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Class and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber0 = org.mockito.Mockito.doNothing();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass1 = mockSettings0.getClass();
        org.mockito.MockSettings mockSettings2 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass3 = mockSettings2.getClass();
        org.mockito.MockSettings mockSettings4 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass5 = mockSettings4.getClass();
        org.mockito.MockSettings mockSettings6 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass7 = mockSettings6.getClass();
        org.mockito.MockSettings mockSettings8 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass9 = mockSettings8.getClass();
        org.mockito.MockSettings mockSettings10 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass11 = mockSettings10.getClass();
        java.lang.Class[] classArray13 = new java.lang.Class[6];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        wildcardClassArray14[0] = wildcardClass1;
        wildcardClassArray14[1] = wildcardClass3;
        wildcardClassArray14[2] = wildcardClass5;
        wildcardClassArray14[3] = wildcardClass7;
        wildcardClassArray14[4] = wildcardClass9;
        wildcardClassArray14[5] = wildcardClass11;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(wildcardClassArray14);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(mockSettings2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(mockSettings4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(mockSettings6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mockSettings8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mockSettings10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.mockito.ArgumentMatcher<java.lang.Byte> byteArgumentMatcher0 = null;
        byte byte1 = org.mockito.ArgumentMatchers.byteThat(byteArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.mockito.ArgumentMatchers.same(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder5 = org.mockito.Mockito.inOrder((java.lang.Object[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "value", 1L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.get();
        internalThread3.setThreadLocalMap(internalThreadLocalMap7);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.get();
        boolean boolean12 = internalThreadLocalMap9.setIndexedVariable(5, (java.lang.Object) (byte) 0);
        org.mockito.verification.VerificationMode verificationMode14 = org.mockito.Mockito.atLeastOnce();
        boolean boolean15 = internalThreadLocalMap9.setIndexedVariable((int) (short) 0, (java.lang.Object) verificationMode14);
        java.lang.Object obj17 = internalThreadLocalMap9.indexedVariable((int) ' ');
        internalThread3.setThreadLocalMap(internalThreadLocalMap9);
        org.junit.Assert.assertNotNull(internalThreadLocalMap7);
        org.junit.Assert.assertNotNull(internalThreadLocalMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(verificationMode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass1 = mockSettings0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement2 = org.mockito.Mockito.spy((java.lang.reflect.AnnotatedElement) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot mock/spy class java.lang.Class?Mockito cannot mock/spy because :? - final class");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.Class<?> wildcardClass0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.Mockito.lenient();
        org.mockito.verification.VerificationMode verificationMode2 = org.mockito.Mockito.atLeast((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.LenientStubber lenientStubber3 = org.mockito.Mockito.verify(lenientStubber0, verificationMode2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type DefaultLenientStubber and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lenientStubber0);
        org.junit.Assert.assertNotNull(verificationMode2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.Comparable<java.lang.String> strComparable0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(strComparable0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = org.mockito.Mockito.spy((java.lang.CharSequence) "Too many thread-local indexed variables");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot mock/spy class java.lang.String?Mockito cannot mock/spy because :? - final class");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("");
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread5, "value", 1L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.get();
        internalThread5.setThreadLocalMap(internalThreadLocalMap9);
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay12 = org.mockito.Mockito.after((long) ' ');
        java.lang.Object[] objArray13 = new java.lang.Object[] { verificationMode1, internalThreadLocalMap9, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions(objArray13);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(internalThreadLocalMap9);
        org.junit.Assert.assertNotNull(verificationAfterDelay12);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.ArgumentMatchers.refEq("method1", strArray2);
        java.lang.Object[] objArray4 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.mockito.ArgumentMatchers.same(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber6 = org.mockito.Mockito.doReturn((java.lang.Object) objAnswer0, (java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.lang.Object obj0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.UNSET;
        org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn(obj0);
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(stubber1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        int int0 = org.mockito.ArgumentMatchers.anyInt();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(mockitoIterable0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "value", 1L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.get();
        internalThread6.setThreadLocalMap(internalThreadLocalMap7);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.get();
        boolean boolean12 = internalThreadLocalMap9.setIndexedVariable(5, (java.lang.Object) (byte) 0);
        org.mockito.verification.VerificationMode verificationMode14 = org.mockito.Mockito.atLeastOnce();
        boolean boolean15 = internalThreadLocalMap9.setIndexedVariable((int) (short) 0, (java.lang.Object) verificationMode14);
        java.lang.Object obj17 = internalThreadLocalMap9.removeIndexedVariable(0);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap19 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.getIfSet();
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet20 = org.mockito.ArgumentMatchers.anySet();
        java.lang.Object[] objArray21 = new java.lang.Object[] { internalThreadLocalMap7, obj17, 0L, internalThreadLocalMap19, strComparableSet20 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray22 = org.mockito.Mockito.ignoreStubs(objArray21);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.apache.dubbo.common.threadlocal.InternalThreadLocalMap");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internalThreadLocalMap7);
        org.junit.Assert.assertNotNull(internalThreadLocalMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(verificationMode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "Wanted invocations count: at least 1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "Wanted invocations count: at least 1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "Wanted invocations count: at least 1");
        org.junit.Assert.assertNotNull(internalThreadLocalMap19);
        org.junit.Assert.assertNotNull(strComparableSet20);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.util.Map<java.util.Set<java.lang.Comparable<java.lang.String>>, org.mockito.MockSettings> strComparableSetMap0 = org.mockito.ArgumentMatchers.anyMap();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.util.Map<java.util.Set<java.lang.Comparable<java.lang.String>>, org.mockito.MockSettings>> comparableSetMapOngoingStubbing1 = org.mockito.Mockito.when(strComparableSetMap0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSetMap0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder1 = org.mockito.ArgumentMatchers.same(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNull(mockitoSessionBuilder1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.get();
        java.util.List<java.lang.Object[]> objArrayList2 = org.mockito.ArgumentMatchers.anyList();
        boolean boolean3 = internalThreadLocalMap0.setIndexedVariable((int) '\000', (java.lang.Object) objArrayList2);
        org.junit.Assert.assertNotNull(internalThreadLocalMap0);
        org.junit.Assert.assertNotNull(objArrayList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet0 = null;
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet1 = org.mockito.ArgumentMatchers.eq(strComparableSet0);
        org.junit.Assert.assertNull(strComparableSet1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.getIfSet();
        int int1 = internalThreadLocalMap0.size();
        org.junit.Assert.assertNotNull(internalThreadLocalMap0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.util.List<java.lang.reflect.AnnotatedElement> annotatedElementList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(annotatedElementList0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.lang.reflect.Type type0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.util.Set<java.util.Map<java.util.Set<java.lang.Comparable<java.lang.String>>, org.mockito.MockSettings>> comparableSetMapSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(comparableSetMapSet0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.get();
        boolean boolean3 = internalThreadLocalMap0.setIndexedVariable(5, (java.lang.Object) (byte) 0);
        org.mockito.verification.VerificationMode verificationMode5 = org.mockito.Mockito.atLeastOnce();
        boolean boolean6 = internalThreadLocalMap0.setIndexedVariable((int) (short) 0, (java.lang.Object) verificationMode5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = internalThreadLocalMap0.removeIndexedVariable((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internalThreadLocalMap0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(verificationMode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder1 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder3 = org.mockito.ArgumentMatchers.same(mockitoSessionBuilder2);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder4 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder5 = org.mockito.Mockito.mockitoSession();
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray6 = new org.mockito.session.MockitoSessionBuilder[] { mockitoSessionBuilder0, mockitoSessionBuilder1, mockitoSessionBuilder2, mockitoSessionBuilder4, mockitoSessionBuilder5 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(mockitoSessionBuilderArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder1);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder2);
        org.junit.Assert.assertNull(mockitoSessionBuilder3);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder4);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder5);
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        long long0 = org.mockito.ArgumentMatchers.anyLong();
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.destroy();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass1 = mockSettings0.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration2 = org.mockito.ArgumentMatchers.same((java.lang.reflect.GenericDeclaration) wildcardClass1);
        org.junit.Assert.assertNotNull(mockSettings0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(genericDeclaration2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("Failed to forking invoke provider");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.mockito.MockSettings mockSettings0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(mockSettings0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        float float1 = org.mockito.ArgumentMatchers.eq(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) 100);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.ArgumentMatchers.refEq("method1", strArray2);
        java.lang.Object[] objArray4 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.mockito.ArgumentMatchers.same(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber6 = org.mockito.Mockito.doReturn((java.lang.Object) 0.0f, (java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        int int1 = org.mockito.ArgumentMatchers.eq(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(internalThread0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("Failed to forking invoke provider");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(mockitoSessionBuilder0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.mockito.ArgumentMatchers.same(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset((java.lang.Object[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout3 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout1, strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(verificationWithTimeout3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls(0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative and zero values are not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.util.Set<java.lang.Object> objSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(objSet0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(verificationMode0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        long long1 = org.mockito.ArgumentMatchers.eq((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.util.Map<java.util.Set<java.lang.Comparable<java.lang.String>>, org.mockito.MockSettings> strComparableSetMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.mockito.verification.VerificationMode verificationMode2 = org.mockito.Mockito.atMost((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.util.Set<java.lang.Comparable<java.lang.String>>, org.mockito.MockSettings> strComparableSetMap3 = org.mockito.Mockito.verify(strComparableSetMap0, verificationMode2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type HashMap and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSetMap0);
        org.junit.Assert.assertNotNull(verificationMode2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        double double1 = org.mockito.ArgumentMatchers.eq((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.lang.Iterable<java.util.Collection<java.lang.Comparable<java.lang.String>>> strComparableCollectionIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(strComparableCollectionIterable0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass1 = mockSettings0.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout3 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout5 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout3, strArray4);
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(verificationWithTimeout3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(verificationWithTimeout5);
        org.junit.Assert.assertNull(annotatedElement6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(genericDeclaration0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast(0);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.mockito.ArgumentMatchers.refEq("method1", strArray3);
        java.lang.Object[] objArray5 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.mockito.ArgumentMatchers.same(strArray3);
        org.mockito.verification.VerificationMode verificationMode7 = org.mockito.ArgumentMatchers.refEq(verificationMode1, strArray6);
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(verificationMode7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.Mockito.framework();
        org.mockito.MockitoFramework mockitoFramework1 = org.mockito.ArgumentMatchers.eq(mockitoFramework0);
        org.mockito.MockitoFramework mockitoFramework2 = org.mockito.Mockito.framework();
        org.mockito.MockitoFramework mockitoFramework3 = org.mockito.Mockito.framework();
        org.mockito.MockitoFramework mockitoFramework4 = org.mockito.Mockito.framework();
        org.mockito.MockitoFramework mockitoFramework5 = org.mockito.ArgumentMatchers.eq(mockitoFramework4);
        org.mockito.MockitoFramework mockitoFramework6 = org.mockito.Mockito.framework();
        org.mockito.MockitoFramework[] mockitoFrameworkArray7 = new org.mockito.MockitoFramework[] { mockitoFramework0, mockitoFramework2, mockitoFramework3, mockitoFramework4, mockitoFramework6 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(mockitoFrameworkArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoFramework0);
        org.junit.Assert.assertNull(mockitoFramework1);
        org.junit.Assert.assertNotNull(mockitoFramework2);
        org.junit.Assert.assertNotNull(mockitoFramework3);
        org.junit.Assert.assertNotNull(mockitoFramework4);
        org.junit.Assert.assertNull(mockitoFramework5);
        org.junit.Assert.assertNotNull(mockitoFramework6);
        org.junit.Assert.assertNotNull(mockitoFrameworkArray7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls(100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) ' ');
        org.mockito.verification.VerificationMode verificationMode3 = org.mockito.Mockito.times((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationAfterDelay verificationAfterDelay4 = org.mockito.Mockito.verify(verificationAfterDelay1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type After and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
        org.junit.Assert.assertNotNull(verificationMode3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.io.Serializable serializable0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.util.List<org.mockito.stubbing.Stubber> stubberList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(stubberList0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        float float1 = org.mockito.ArgumentMatchers.eq((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.lang.CharSequence charSequence0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout3 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout1, strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder4 = org.mockito.Mockito.inOrder((java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(verificationWithTimeout3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (byte) 10);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.MockSettings mockSettings1 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass2 = mockSettings1.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout4 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout6 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout4, strArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray5);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder8 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder0, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations((java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(verificationWithTimeout4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(verificationWithTimeout6);
        org.junit.Assert.assertNull(annotatedElement7);
        org.junit.Assert.assertNull(mockitoSessionBuilder8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        short short1 = org.mockito.ArgumentMatchers.eq((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.mockito.ArgumentMatchers.same(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions((java.lang.Object[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.ArgumentMatchers.refEq("method1", strArray2);
        java.lang.Object[] objArray4 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.mockito.ArgumentMatchers.same(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber6 = org.mockito.Mockito.doReturn((java.lang.Object) "Too many thread-local indexed variables", (java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        double double1 = org.mockito.ArgumentMatchers.eq((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
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
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(strComparableSet0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3);
        org.mockito.MockSettings mockSettings5 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass6 = mockSettings5.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout8 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout10 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout8, strArray9);
        java.lang.reflect.AnnotatedElement annotatedElement11 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber12 = org.mockito.Mockito.doReturn((java.lang.Object) internalThread4, (java.lang.Object[]) strArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(verificationWithTimeout8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(verificationWithTimeout10);
        org.junit.Assert.assertNull(annotatedElement11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.String[][] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(strArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.mockito.ArgumentMatchers argumentMatchers0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(argumentMatchers0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_MOCKS;
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) objAnswer0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_MOCKS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_MOCKS));
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(lenientStubber0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions(objArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        int int1 = org.mockito.ArgumentMatchers.eq(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("attach");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.lang.Throwable throwable0 = null;
        java.lang.Throwable[] throwableArray1 = new java.lang.Throwable[] { throwable0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doThrow(throwableArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.util.Map<org.mockito.verification.VerificationWithTimeout, java.lang.Object[]> verificationWithTimeoutMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(verificationWithTimeoutMap0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.ArgumentMatchers.refEq("method1", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber4 = org.mockito.Mockito.doReturn((java.lang.Object) 1.0f, (java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.lang.Object obj0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        float float0 = org.mockito.ArgumentMatchers.anyFloat();
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout3 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout1, strArray2);
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout5 = org.mockito.Mockito.timeout((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = org.mockito.Mockito.verify(strArray2, (org.mockito.verification.VerificationMode) verificationWithTimeout5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type String[] and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(verificationWithTimeout3);
        org.junit.Assert.assertNotNull(verificationWithTimeout5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap3 = internalThread2.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.MockSettings mockSettings1 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass2 = mockSettings1.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout4 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout6 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout4, strArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray5);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder8 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder0, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(verificationWithTimeout4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(verificationWithTimeout6);
        org.junit.Assert.assertNull(annotatedElement7);
        org.junit.Assert.assertNull(mockitoSessionBuilder8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (short) 100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        float float1 = org.mockito.ArgumentMatchers.eq((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        char char1 = org.mockito.ArgumentMatchers.eq('a');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(verificationWithTimeout0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread4, "value", 1L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap8 = internalThread7.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7, "Too many thread-local indexed variables", (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber12 = org.mockito.Mockito.doReturn((java.lang.Object) "Too many thread-local indexed variables");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(internalThreadLocalMap8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times(100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.util.Map<java.util.Set<java.lang.Comparable<java.lang.String>>, org.mockito.MockSettings> strComparableSetMap2 = org.mockito.ArgumentMatchers.anyMap();
        java.util.Map<org.mockito.verification.VerificationWithTimeout, java.lang.Object[]> verificationWithTimeoutMap3 = org.mockito.ArgumentMatchers.anyMap();
        java.util.Set<java.util.Map<java.util.Set<java.lang.Comparable<java.lang.String>>, org.mockito.MockSettings>> comparableSetMapSet5 = org.mockito.ArgumentMatchers.anySet();
        java.lang.Object[] objArray6 = new java.lang.Object[] { "Succeeded to forking invoke provider !", 10, strComparableSetMap2, verificationWithTimeoutMap3, "Failed to forking invoke provider", comparableSetMapSet5 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder7 = org.mockito.Mockito.inOrder(objArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSetMap2);
        org.junit.Assert.assertNotNull(verificationWithTimeoutMap3);
        org.junit.Assert.assertNotNull(comparableSetMapSet5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Succeeded to forking invoke provider !, 10, {}, {}, Failed to forking invoke provider, []]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Succeeded to forking invoke provider !, 10, {}, {}, Failed to forking invoke provider, []]");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("Succeeded to forking invoke provider !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.mockito.ArgumentMatcher<java.lang.Short> shortArgumentMatcher0 = null;
        short short1 = org.mockito.ArgumentMatchers.shortThat(shortArgumentMatcher0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.util.Collection<java.lang.reflect.GenericDeclaration> genericDeclarationCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) genericDeclarationCollection0);
        org.junit.Assert.assertNotNull(genericDeclarationCollection0);
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("value");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.Object> objOngoingStubbing3 = org.mockito.Mockito.when((java.lang.Object) internalThread2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout(0L);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.util.Map<org.mockito.ArgumentMatchers, java.lang.Iterable<org.mockito.Mockito>> argumentMatchersMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(argumentMatchersMap0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("clear attachment failed!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(verificationMode0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(genericDeclaration0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.mockito.Mockito mockito0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(mockito0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "attach");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("Too many thread-local indexed variables");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("method1");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.Mockito.mockitoSession();
        org.mockito.MockSettings mockSettings3 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass4 = mockSettings3.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout6 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout8 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout6, strArray7);
        java.lang.reflect.AnnotatedElement annotatedElement9 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray7);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder10 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder2, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber11 = org.mockito.Mockito.doReturn((java.lang.Object) "method1", (java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(verificationWithTimeout6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(verificationWithTimeout8);
        org.junit.Assert.assertNull(annotatedElement9);
        org.junit.Assert.assertNull(mockitoSessionBuilder10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList0 = org.mockito.ArgumentMatchers.anyList();
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList1 = org.mockito.ArgumentMatchers.anyList();
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList2 = org.mockito.ArgumentMatchers.anyList();
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList3 = org.mockito.ArgumentMatchers.anyList();
        java.util.Collection[] collectionArray5 = new java.util.Collection[4];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Comparable<java.lang.String>>[] strComparableCollectionArray6 = (java.util.Collection<java.lang.Comparable<java.lang.String>>[]) collectionArray5;
        strComparableCollectionArray6[0] = strComparableList0;
        strComparableCollectionArray6[1] = strComparableList1;
        strComparableCollectionArray6[2] = strComparableList2;
        strComparableCollectionArray6[3] = strComparableList3;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(strComparableCollectionArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList0);
        org.junit.Assert.assertNotNull(strComparableList1);
        org.junit.Assert.assertNotNull(strComparableList2);
        org.junit.Assert.assertNotNull(strComparableList3);
        org.junit.Assert.assertNotNull(collectionArray5);
        org.junit.Assert.assertNotNull(strComparableCollectionArray6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("Too many thread-local indexed variables");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.util.Map<java.lang.Iterable<org.mockito.Mockito>, java.lang.Object[]> mockitoIterableMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(mockitoIterableMap0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        boolean boolean1 = org.mockito.ArgumentMatchers.eq(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.util.List<java.lang.Object> objList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(objList0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        long long1 = org.mockito.ArgumentMatchers.eq((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) 0);
        org.mockito.MockingDetails[] mockingDetailsArray2 = new org.mockito.MockingDetails[] { mockingDetails1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.clearInvocations(mockingDetailsArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingDetails1);
        org.junit.Assert.assertNotNull(mockingDetailsArray2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.util.Collection<java.lang.Object[]> objArrayCollection0 = org.mockito.ArgumentMatchers.anyCollection();
        org.junit.Assert.assertNotNull(objArrayCollection0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.util.List<java.lang.Runnable> runnableList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(runnableList0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.ArgumentMatchers.refEq("method1", strArray2);
        java.lang.Object[] objArray4 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.mockito.ArgumentMatchers.same(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber6 = org.mockito.Mockito.doReturn((java.lang.Object) mockito0, (java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.MockSettings mockSettings1 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass2 = mockSettings1.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout4 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout6 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout4, strArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray5);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder8 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder0, strArray5);
        java.lang.Object[] objArray9 = new java.lang.Object[] { mockitoSessionBuilder8 };
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder10 = org.mockito.Mockito.mockitoSession();
        org.mockito.MockSettings mockSettings11 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass12 = mockSettings11.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout14 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout16 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout14, strArray15);
        java.lang.reflect.AnnotatedElement annotatedElement17 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass12, strArray15);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder18 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder10, strArray15);
        java.lang.Object[] objArray19 = new java.lang.Object[] { mockitoSessionBuilder18 };
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder20 = org.mockito.Mockito.mockitoSession();
        org.mockito.MockSettings mockSettings21 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass22 = mockSettings21.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout24 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout26 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout24, strArray25);
        java.lang.reflect.AnnotatedElement annotatedElement27 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass22, strArray25);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder28 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder20, strArray25);
        java.lang.Object[] objArray29 = new java.lang.Object[] { mockitoSessionBuilder28 };
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder30 = org.mockito.Mockito.mockitoSession();
        org.mockito.MockSettings mockSettings31 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass32 = mockSettings31.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout34 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout36 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout34, strArray35);
        java.lang.reflect.AnnotatedElement annotatedElement37 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass32, strArray35);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder38 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder30, strArray35);
        java.lang.Object[] objArray39 = new java.lang.Object[] { mockitoSessionBuilder38 };
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder40 = org.mockito.Mockito.mockitoSession();
        org.mockito.MockSettings mockSettings41 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass42 = mockSettings41.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout44 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout46 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout44, strArray45);
        java.lang.reflect.AnnotatedElement annotatedElement47 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass42, strArray45);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder48 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder40, strArray45);
        java.lang.Object[] objArray49 = new java.lang.Object[] { mockitoSessionBuilder48 };
        java.lang.Object[][] objArray50 = new java.lang.Object[][] { objArray9, objArray19, objArray29, objArray39, objArray49 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(objArray50);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(verificationWithTimeout4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(verificationWithTimeout6);
        org.junit.Assert.assertNull(annotatedElement7);
        org.junit.Assert.assertNull(mockitoSessionBuilder8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[null]");
        org.junit.Assert.assertNotNull(mockitoSessionBuilder10);
        org.junit.Assert.assertNotNull(mockSettings11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(verificationWithTimeout14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(verificationWithTimeout16);
        org.junit.Assert.assertNull(annotatedElement17);
        org.junit.Assert.assertNull(mockitoSessionBuilder18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[null]");
        org.junit.Assert.assertNotNull(mockitoSessionBuilder20);
        org.junit.Assert.assertNotNull(mockSettings21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(verificationWithTimeout24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(verificationWithTimeout26);
        org.junit.Assert.assertNull(annotatedElement27);
        org.junit.Assert.assertNull(mockitoSessionBuilder28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[null]");
        org.junit.Assert.assertNotNull(mockitoSessionBuilder30);
        org.junit.Assert.assertNotNull(mockSettings31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(verificationWithTimeout34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNull(verificationWithTimeout36);
        org.junit.Assert.assertNull(annotatedElement37);
        org.junit.Assert.assertNull(mockitoSessionBuilder38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[null]");
        org.junit.Assert.assertNotNull(mockitoSessionBuilder40);
        org.junit.Assert.assertNotNull(mockSettings41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(verificationWithTimeout44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNull(verificationWithTimeout46);
        org.junit.Assert.assertNull(annotatedElement47);
        org.junit.Assert.assertNull(mockitoSessionBuilder48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[null]");
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.lang.Runnable runnable0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread(runnable0);
        java.lang.Class<?> wildcardClass2 = internalThread1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(internalThread0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.Mockito.lenient();
        org.mockito.stubbing.BaseStubber baseStubber1 = org.mockito.ArgumentMatchers.eq((org.mockito.stubbing.BaseStubber) lenientStubber0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.LenientStubber lenientStubber2 = org.mockito.Mockito.verify(lenientStubber0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type DefaultLenientStubber and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lenientStubber0);
        org.junit.Assert.assertNull(baseStubber1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.lang.Iterable<java.lang.Throwable[]> throwableArrayIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(throwableArrayIterable0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread4, "value", 1L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread4, "method1");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.apache.dubbo.common.threadlocal.InternalThread> internalThreadOngoingStubbing10 = org.mockito.Mockito.when(internalThread9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("Failed to forking invoke provider");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray1 = org.mockito.Mockito.ignoreStubs(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        double double1 = org.mockito.ArgumentMatchers.eq((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) '\000');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEFAULTS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.mockito.ArgumentMatchers.same(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        float float1 = org.mockito.ArgumentMatchers.eq(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("set attachment failed!");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("value");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) ' ');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        float float1 = org.mockito.ArgumentMatchers.eq((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder0 = org.mockito.Mockito.mockitoSession();
        org.mockito.MockSettings mockSettings1 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass2 = mockSettings1.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout4 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout6 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout4, strArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray5);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder8 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder0, strArray5);
        java.util.Map<java.lang.String[], java.lang.Comparable<java.lang.String>> strArrayMap9 = org.mockito.ArgumentMatchers.anyMap();
        org.mockito.stubbing.LenientStubber lenientStubber10 = org.mockito.Mockito.lenient();
        java.lang.Object[] objArray11 = new java.lang.Object[] { mockitoSessionBuilder8, strArrayMap9, lenientStubber10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = org.mockito.Mockito.ignoreStubs(objArray11);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is null!");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilder0);
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(verificationWithTimeout4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(verificationWithTimeout6);
        org.junit.Assert.assertNull(annotatedElement7);
        org.junit.Assert.assertNull(mockitoSessionBuilder8);
        org.junit.Assert.assertNotNull(strArrayMap9);
        org.junit.Assert.assertNotNull(lenientStubber10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.verification.VerificationAfterDelay> verificationAfterDelayOngoingStubbing2 = org.mockito.Mockito.when(verificationAfterDelay1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout2 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout4 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout2, strArray3);
        java.lang.CharSequence charSequence5 = org.mockito.ArgumentMatchers.refEq((java.lang.CharSequence) "", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationWithTimeout2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(verificationWithTimeout4);
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.util.Set<org.mockito.session.MockitoSessionBuilder> mockitoSessionBuilderSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(mockitoSessionBuilderSet0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.util.Set<org.mockito.Mockito> mockitoSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(mockitoSet0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.Throwable[] throwableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doThrow(throwableArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        double double1 = org.mockito.ArgumentMatchers.eq((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.Mockito.verify("Succeeded to forking invoke provider !");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type String and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.lang.Throwable throwable0 = null;
        java.lang.Throwable[] throwableArray1 = new java.lang.Throwable[] { throwable0 };
        java.lang.Throwable[][] throwableArray2 = new java.lang.Throwable[][] { throwableArray1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(throwableArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        long long1 = org.mockito.ArgumentMatchers.eq(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.mockito.ArgumentMatchers.same(strArray1);
        org.mockito.MockSettings mockSettings5 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass6 = mockSettings5.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout8 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout10 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout8, strArray9);
        java.lang.reflect.AnnotatedElement annotatedElement11 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray9);
        java.lang.Object[] objArray12 = org.mockito.ArgumentMatchers.refEq((java.lang.Object[]) strArray4, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset((java.io.Serializable[]) strArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor31.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(verificationWithTimeout8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(verificationWithTimeout10);
        org.junit.Assert.assertNull(annotatedElement11);
        org.junit.Assert.assertNull(objArray12);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_SELF;
        org.mockito.stubbing.Stubber stubber1 = null; // flaky: org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_SELF + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_SELF));
// flaky:         org.junit.Assert.assertNotNull(stubber1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((-1L));
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.FriendlyReminderException; message: ??Don't panic! I'm just a friendly reminder!?It is impossible for time to go backward, therefore...?You cannot put negative value of duration: (-1)?as argument of timer methods (after(), timeout())?");
        } catch (org.mockito.exceptions.misusing.FriendlyReminderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.mockito.stubbing.Stubber stubber0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(stubber0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "hi!", (-1L));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        long long1 = org.mockito.ArgumentMatchers.eq(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.util.List<org.mockito.verification.VerificationWithTimeout> verificationWithTimeoutList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(verificationWithTimeoutList0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.lang.Iterable<org.mockito.stubbing.LenientStubber> lenientStubberIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(lenientStubberIterable0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(verificationMode0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.util.Set<java.lang.String> strSet0 = org.mockito.ArgumentMatchers.anySet();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        double double1 = org.mockito.ArgumentMatchers.eq((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.io.Serializable serializable0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(serializable0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder3 = org.mockito.Mockito.inOrder((java.lang.Object[]) strArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.util.Map<java.util.List<java.lang.reflect.GenericDeclaration>, java.lang.Object> genericDeclarationListMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(genericDeclarationListMap0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration1 = org.mockito.Mockito.spy(genericDeclaration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(verificationMode0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.lang.String str1 = org.mockito.ArgumentMatchers.startsWith("clear attachment failed!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        java.util.Map<org.mockito.session.MockitoSessionBuilder, java.lang.Class<?>> mockitoSessionBuilderMap0 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull(mockitoSessionBuilderMap0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (short) 10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative and zero values are not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.ArgumentMatchers.refEq("method1", strArray2);
        java.lang.Object[] objArray4 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber5 = org.mockito.Mockito.doReturn((java.lang.Object) "Too many thread-local indexed variables", objArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after(100L);
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay3 = org.mockito.Mockito.after((long) ' ');
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay5 = org.mockito.Mockito.after(0L);
        org.mockito.verification.VerificationAfterDelay[] verificationAfterDelayArray6 = new org.mockito.verification.VerificationAfterDelay[] { verificationAfterDelay1, verificationAfterDelay3, verificationAfterDelay5 };
        // The following exception was thrown during execution in test generation
        try {
// flaky:             org.mockito.Mockito.reset(verificationAfterDelayArray6);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
        org.junit.Assert.assertNotNull(verificationAfterDelay3);
        org.junit.Assert.assertNotNull(verificationAfterDelay5);
        org.junit.Assert.assertNotNull(verificationAfterDelayArray6);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, "method1");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.lang.Object obj0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.lang.String str0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("method1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.lang.String str1 = org.mockito.ArgumentMatchers.contains("Too many thread-local indexed variables");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("method1");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.lang.Runnable runnable0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread(runnable0);
        java.lang.ThreadGroup threadGroup2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = internalThread4.threadLocalMap();
        java.lang.ThreadGroup threadGroup6 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup6, (java.lang.Runnable) internalThread9);
        java.lang.Thread[] threadArray11 = new java.lang.Thread[] { internalThread1, internalThread4, internalThread9 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(threadArray11);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(internalThreadLocalMap5);
        org.junit.Assert.assertNotNull(threadArray11);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) (byte) 1);
        org.mockito.stubbing.Stubber stubber2 = null; // flaky: org.mockito.Mockito.doReturn((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(verificationMode1);
// flaky:         org.junit.Assert.assertNotNull(stubber2);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.ArgumentMatchers.refEq("method1", strArray2);
        java.lang.String str4 = org.mockito.ArgumentMatchers.refEq("set attachment failed!", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) ' ');
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.mockito.ArgumentMatchers.refEq("method1", strArray3);
        java.lang.Object[] objArray5 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber6 = org.mockito.Mockito.doReturn((java.lang.Object) verificationMode1, objArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.util.List<java.lang.reflect.Type> typeList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(typeList0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.lang.Iterable<org.mockito.stubbing.BaseStubber> baseStubberIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(baseStubberIterable0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(lenientStubber0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap6 = internalThread2.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2);
        org.junit.Assert.assertNull(internalThreadLocalMap6);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        java.lang.CharSequence charSequence0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(charSequence0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "value", 1L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = internalThread6.threadLocalMap();
        java.lang.Object[] objArray8 = new java.lang.Object[] { internalThread6 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions(objArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(internalThreadLocalMap7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[Thread[value,5,main]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[Thread[value,5,main]]");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        java.lang.Thread thread2 = org.mockito.ArgumentMatchers.eq((java.lang.Thread) internalThread1);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1, "Too many thread-local indexed variables");
        org.junit.Assert.assertNull(thread2);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable1 = org.mockito.Mockito.spy((java.io.Serializable) "Failed to forking invoke provider");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Cannot mock/spy class java.lang.String?Mockito cannot mock/spy because :? - final class");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(verificationWithTimeout0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6, "");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.mockito.verification.VerificationMode verificationMode2 = org.mockito.Mockito.atLeast((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.mockito.Mockito> mockitoIterable3 = org.mockito.Mockito.verify(mockitoIterable0, verificationMode2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type ArrayList and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoIterable0);
        org.junit.Assert.assertNotNull(verificationMode2);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        org.mockito.Mockito mockito0 = new org.mockito.Mockito();
        org.mockito.Mockito mockito1 = org.mockito.ArgumentMatchers.eq(mockito0);
        org.junit.Assert.assertNull(mockito1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls(10);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "clear attachment failed!");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) '\000');
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay2 = org.mockito.ArgumentMatchers.same(verificationAfterDelay1);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
        org.junit.Assert.assertNull(verificationAfterDelay2);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        double double1 = org.mockito.ArgumentMatchers.eq((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.lang.String str1 = org.mockito.ArgumentMatchers.endsWith("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        org.mockito.stubbing.Stubber stubber0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(stubber0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times(1);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout3 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout1, strArray2);
        java.lang.Class<?> wildcardClass4 = verificationWithTimeout1.getClass();
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(verificationWithTimeout3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        java.lang.Runnable runnable0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(runnable0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "method1");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.mockito.MockSettings mockSettings1 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass2 = mockSettings1.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout4 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout6 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout4, strArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray5);
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable8 = org.mockito.ArgumentMatchers.refEq(mockitoIterable0, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.mockito.Mockito> mockitoIterable9 = org.mockito.Mockito.verify(mockitoIterable0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type ArrayList and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoIterable0);
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(verificationWithTimeout4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(verificationWithTimeout6);
        org.junit.Assert.assertNull(annotatedElement7);
        org.junit.Assert.assertNull(mockitoIterable8);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList0 = org.mockito.ArgumentMatchers.anyList();
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection1 = org.mockito.ArgumentMatchers.eq((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList0);
        org.junit.Assert.assertNotNull(strComparableList0);
        org.junit.Assert.assertNull(strComparableCollection1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.mockito.MockSettings mockSettings1 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass2 = mockSettings1.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout4 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout6 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout4, strArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray5);
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable8 = org.mockito.ArgumentMatchers.refEq(mockitoIterable0, strArray5);
        org.mockito.verification.VerificationMode verificationMode10 = org.mockito.Mockito.calls((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.mockito.Mockito> mockitoIterable11 = org.mockito.Mockito.verify(mockitoIterable8, verificationMode10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() should be a mock but is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?    not: verify(mock.someMethod());?Also, if you use @Mock annotation don't miss openMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoIterable0);
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(verificationWithTimeout4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(verificationWithTimeout6);
        org.junit.Assert.assertNull(annotatedElement7);
        org.junit.Assert.assertNull(mockitoIterable8);
        org.junit.Assert.assertNotNull(verificationMode10);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) 'a');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        java.lang.Object obj0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        java.util.List<org.mockito.Mockito> mockitoList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(mockitoList0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        java.lang.Class<?> wildcardClass0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(wildcardClass0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after(100L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.mockito.ArgumentMatchers.refEq("method1", strArray3);
        java.lang.Object[] objArray5 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.mockito.ArgumentMatchers.same(strArray3);
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay7 = org.mockito.ArgumentMatchers.refEq(verificationAfterDelay1, strArray6);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(verificationAfterDelay7);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) ' ');
        org.mockito.MockingDetails mockingDetails2 = org.mockito.Mockito.mockingDetails((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.mockito.Mockito.spy((java.lang.Object) mockingDetails2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor31.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor32.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor32.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor31.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
        org.junit.Assert.assertNotNull(mockingDetails2);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        int int1 = org.mockito.ArgumentMatchers.eq(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = internalThread4.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap6 = internalThread4.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap5);
        org.junit.Assert.assertNull(internalThreadLocalMap6);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after((long) (short) 0);
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        org.mockito.stubbing.Answer answer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer(answer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEEP_STUBS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
// flaky:             org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. you are trying to stub a final method, which is not supported? 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEEP_STUBS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEEP_STUBS));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "set attachment failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2, "value");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        org.mockito.MockingDetails mockingDetails0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(mockingDetails0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        org.mockito.stubbing.LenientStubber lenientStubber0 = org.mockito.Mockito.lenient();
        org.mockito.stubbing.BaseStubber baseStubber1 = org.mockito.ArgumentMatchers.eq((org.mockito.stubbing.BaseStubber) lenientStubber0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.stubbing.LenientStubber> lenientStubberOngoingStubbing2 = org.mockito.Mockito.when(lenientStubber0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lenientStubber0);
        org.junit.Assert.assertNull(baseStubber1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        java.util.List<java.lang.String[]> strArrayList0 = org.mockito.ArgumentMatchers.anyList();
        org.junit.Assert.assertNotNull(strArrayList0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        org.mockito.stubbing.BaseStubber baseStubber0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(baseStubber0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay0 = org.mockito.ArgumentMatchers.notNull();
        org.junit.Assert.assertNull(verificationAfterDelay0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEFAULTS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.stubbing.Answer<java.lang.Object>> objAnswerOngoingStubbing1 = org.mockito.Mockito.when(objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor32.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.verify(verificationWithTimeout0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() should be a mock but is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?    not: verify(mock.someMethod());?Also, if you use @Mock annotation don't miss openMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (byte) 0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        java.lang.Iterable<org.apache.dubbo.common.threadlocal.InternalThread> internalThreadIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.junit.Assert.assertNotNull(internalThreadIterable0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        long long1 = org.mockito.ArgumentMatchers.eq((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout2 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout4 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout2, strArray3);
        java.lang.CharSequence charSequence5 = org.mockito.ArgumentMatchers.refEq((java.lang.CharSequence) "", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder6 = org.mockito.Mockito.inOrder((java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationWithTimeout2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(verificationWithTimeout4);
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative and zero values are not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("Succeeded to forking invoke provider !");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        org.mockito.verification.VerificationMode verificationMode0 = org.mockito.Mockito.atLeastOnce();
        java.lang.Class<?> wildcardClass1 = verificationMode0.getClass();
        org.mockito.verification.VerificationMode verificationMode2 = org.mockito.Mockito.never();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type3 = org.mockito.Mockito.verify((java.lang.reflect.Type) wildcardClass1, verificationMode2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Class and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(verificationMode2);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray0 = org.mockito.ArgumentMatchers.any();
        org.junit.Assert.assertNull(mockitoSessionBuilderArray0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (short) 0);
        org.mockito.verification.VerificationMode verificationMode3 = org.mockito.Mockito.atLeast((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationWithTimeout verificationWithTimeout4 = org.mockito.Mockito.verify(verificationWithTimeout1, verificationMode3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Timeout and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
        org.junit.Assert.assertNotNull(verificationMode3);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet0 = org.mockito.ArgumentMatchers.anySet();
        java.lang.Object[] objArray1 = new java.lang.Object[] { strComparableSet0 };
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable2 = org.mockito.ArgumentMatchers.anyIterable();
        org.mockito.MockSettings mockSettings3 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass4 = mockSettings3.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout6 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout8 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout6, strArray7);
        java.lang.reflect.AnnotatedElement annotatedElement9 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray7);
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable10 = org.mockito.ArgumentMatchers.refEq(mockitoIterable2, strArray7);
        java.lang.Object[] objArray11 = org.mockito.ArgumentMatchers.refEq(objArray1, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSet0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[[]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[[]]");
        org.junit.Assert.assertNotNull(mockitoIterable2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(verificationWithTimeout6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(verificationWithTimeout8);
        org.junit.Assert.assertNull(annotatedElement9);
        org.junit.Assert.assertNull(mockitoIterable10);
        org.junit.Assert.assertNull(objArray11);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.lang.reflect.Type type0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(type0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer1 = org.mockito.ArgumentMatchers.eq(objAnswer0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber2 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertNull(objAnswer1);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        java.lang.reflect.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type1 = org.mockito.Mockito.verify(type0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() should be a mock but is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?    not: verify(mock.someMethod());?Also, if you use @Mock annotation don't miss openMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.mockito.MockSettings mockSettings1 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass2 = mockSettings1.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout4 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout6 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout4, strArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray5);
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable8 = org.mockito.ArgumentMatchers.refEq(mockitoIterable0, strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoIterable0);
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(verificationWithTimeout4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(verificationWithTimeout6);
        org.junit.Assert.assertNull(annotatedElement7);
        org.junit.Assert.assertNull(mockitoIterable8);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        org.mockito.ArgumentMatchers argumentMatchers0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(argumentMatchers0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("value");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls(5);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet0 = org.mockito.ArgumentMatchers.anySet();
        java.lang.Object[] objArray1 = new java.lang.Object[] { strComparableSet0 };
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable2 = org.mockito.ArgumentMatchers.anyIterable();
        org.mockito.MockSettings mockSettings3 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass4 = mockSettings3.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout6 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout8 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout6, strArray7);
        java.lang.reflect.AnnotatedElement annotatedElement9 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray7);
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable10 = org.mockito.ArgumentMatchers.refEq(mockitoIterable2, strArray7);
        java.lang.Object[] objArray11 = org.mockito.ArgumentMatchers.refEq(objArray1, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions(objArray1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor35.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSet0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[[]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[[]]");
        org.junit.Assert.assertNotNull(mockitoIterable2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(verificationWithTimeout6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(verificationWithTimeout8);
        org.junit.Assert.assertNull(annotatedElement9);
        org.junit.Assert.assertNull(mockitoIterable10);
        org.junit.Assert.assertNull(objArray11);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.RETURNS_DEEP_STUBS;
        org.mockito.stubbing.Stubber stubber1 = null; // flaky: org.mockito.Mockito.doReturn((java.lang.Object) objAnswer0);
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.RETURNS_DEEP_STUBS + "'", objAnswer0.equals(org.mockito.Answers.RETURNS_DEEP_STUBS));
// flaky:         org.junit.Assert.assertNotNull(stubber1);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times(0);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread0 = new org.apache.dubbo.common.threadlocal.InternalThread();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread0);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        org.mockito.ArgumentMatchers argumentMatchers0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(argumentMatchers0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(objAnswer0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        int int1 = org.mockito.ArgumentMatchers.eq((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        java.lang.String str1 = org.mockito.ArgumentMatchers.matches("Too many thread-local indexed variables");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2, "attach", (long) '4');
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost(1);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        java.util.Set<org.mockito.Mockito> mockitoSet0 = org.mockito.ArgumentMatchers.anySet();
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable1 = org.mockito.ArgumentMatchers.anyIterable();
        org.mockito.MockSettings mockSettings2 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass3 = mockSettings2.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout5 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout7 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout5, strArray6);
        java.lang.reflect.AnnotatedElement annotatedElement8 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass3, strArray6);
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable9 = org.mockito.ArgumentMatchers.refEq(mockitoIterable1, strArray6);
        java.util.Set<org.mockito.Mockito> mockitoSet10 = org.mockito.ArgumentMatchers.anySet();
        java.lang.Iterable[] iterableArray12 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<org.mockito.Mockito>[] mockitoIterableArray13 = (java.lang.Iterable<org.mockito.Mockito>[]) iterableArray12;
        mockitoIterableArray13[0] = mockitoSet0;
        mockitoIterableArray13[1] = mockitoIterable1;
        mockitoIterableArray13[2] = mockitoSet10;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(mockitoIterableArray13);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor35.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSet0);
        org.junit.Assert.assertNotNull(mockitoIterable1);
        org.junit.Assert.assertNotNull(mockSettings2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(verificationWithTimeout5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(verificationWithTimeout7);
        org.junit.Assert.assertNull(annotatedElement8);
        org.junit.Assert.assertNull(mockitoIterable9);
        org.junit.Assert.assertNotNull(mockitoSet10);
        org.junit.Assert.assertNotNull(iterableArray12);
        org.junit.Assert.assertNotNull(mockitoIterableArray13);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        int int1 = org.mockito.ArgumentMatchers.eq((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "set attachment failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap3 = internalThread2.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap3);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) 0);
        java.util.Collection<java.lang.reflect.GenericDeclaration> genericDeclarationCollection2 = org.mockito.ArgumentMatchers.anyCollection();
        org.mockito.MockingDetails mockingDetails3 = org.mockito.Mockito.mockingDetails((java.lang.Object) genericDeclarationCollection2);
        org.mockito.MockingDetails mockingDetails5 = org.mockito.Mockito.mockingDetails((java.lang.Object) 0);
        org.mockito.MockingDetails mockingDetails7 = org.mockito.Mockito.mockingDetails((java.lang.Object) 0);
        org.mockito.MockingDetails mockingDetails9 = org.mockito.Mockito.mockingDetails((java.lang.Object) 100.0f);
        org.mockito.MockingDetails[] mockingDetailsArray10 = new org.mockito.MockingDetails[] { mockingDetails1, mockingDetails3, mockingDetails5, mockingDetails7, mockingDetails9 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(mockingDetailsArray10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingDetails1);
        org.junit.Assert.assertNotNull(genericDeclarationCollection2);
        org.junit.Assert.assertNotNull(mockingDetails3);
        org.junit.Assert.assertNotNull(mockingDetails5);
        org.junit.Assert.assertNotNull(mockingDetails7);
        org.junit.Assert.assertNotNull(mockingDetails9);
        org.junit.Assert.assertNotNull(mockingDetailsArray10);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        java.util.Map<java.util.Set<java.lang.Comparable<java.lang.String>>, org.mockito.MockSettings> strComparableSetMap0 = org.mockito.ArgumentMatchers.anyMap();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.ArgumentMatchers.refEq("method1", strArray2);
        java.util.Map<java.util.Set<java.lang.Comparable<java.lang.String>>, org.mockito.MockSettings> strComparableSetMap4 = org.mockito.ArgumentMatchers.refEq(strComparableSetMap0, strArray2);
        org.junit.Assert.assertNotNull(strComparableSetMap0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strComparableSetMap4);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread6, "value", 1L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread6, "method1");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread11, "set attachment failed!", (long) (short) 0);
        java.lang.Class<?> wildcardClass16 = internalThread15.getClass();
        org.mockito.verification.VerificationMode verificationMode18 = org.mockito.Mockito.atLeast((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = org.mockito.Mockito.verify(wildcardClass16, verificationMode18);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Class and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(verificationMode18);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer0 = org.mockito.Mockito.CALLS_REAL_METHODS;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) objAnswer0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + objAnswer0 + "' != '" + org.mockito.Answers.CALLS_REAL_METHODS + "'", objAnswer0.equals(org.mockito.Answers.CALLS_REAL_METHODS));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.times((int) '4');
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.Mockito.mockitoSession();
        org.mockito.MockSettings mockSettings3 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass4 = mockSettings3.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout6 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout8 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout6, strArray7);
        java.lang.reflect.AnnotatedElement annotatedElement9 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass4, strArray7);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder10 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder2, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber11 = org.mockito.Mockito.doReturn((java.lang.Object) '4', (java.lang.Object[]) strArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationMode1);
        org.junit.Assert.assertNotNull(mockitoSessionBuilder2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(verificationWithTimeout6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(verificationWithTimeout8);
        org.junit.Assert.assertNull(annotatedElement9);
        org.junit.Assert.assertNull(mockitoSessionBuilder10);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.FriendlyReminderException; message: ??Don't panic! I'm just a friendly reminder!?It is impossible for time to go backward, therefore...?You cannot put negative value of duration: (-1)?as argument of timer methods (after(), timeout())?");
        } catch (org.mockito.exceptions.misusing.FriendlyReminderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        double double1 = org.mockito.ArgumentMatchers.eq((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        java.lang.Runnable runnable0 = org.mockito.ArgumentMatchers.anyVararg();
        org.junit.Assert.assertNull(runnable0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread5, "value", 1L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = internalThread8.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8, "Too many thread-local indexed variables", (-1L));
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread8);
        org.junit.Assert.assertNull(internalThreadLocalMap9);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "clear attachment failed!", (long) (byte) 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        org.mockito.MockingDetails mockingDetails1 = org.mockito.Mockito.mockingDetails((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(mockingDetails1);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay1 = org.mockito.Mockito.after(0L);
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout3 = org.mockito.Mockito.timeout((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode4 = org.mockito.Mockito.verify((org.mockito.verification.VerificationMode) verificationAfterDelay1, (org.mockito.verification.VerificationMode) verificationWithTimeout3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type After and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationAfterDelay1);
        org.junit.Assert.assertNotNull(verificationWithTimeout3);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "method1");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        java.lang.ThreadGroup threadGroup4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, (java.lang.Runnable) internalThread6, "Succeeded to forking invoke provider !");
        java.lang.ThreadGroup threadGroup10 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup10, (java.lang.Runnable) internalThread13);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread14);
        java.lang.ThreadGroup threadGroup16 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread18);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread20 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup16, (java.lang.Runnable) internalThread19);
        java.lang.ThreadGroup threadGroup21 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread23 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup21, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread24 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread23);
        java.lang.Runnable[] runnableArray25 = new java.lang.Runnable[] { internalThread2, internalThread9, internalThread14, internalThread19, internalThread24 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.reset(runnableArray25);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(runnableArray25);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.description("Failed to forking invoke provider");
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        java.lang.Throwable[] throwableArray0 = new java.lang.Throwable[] {};
        org.mockito.stubbing.Stubber stubber1 = null; // flaky: org.mockito.Mockito.doThrow(throwableArray0);
        org.mockito.stubbing.BaseStubber baseStubber2 = null; // flaky: org.mockito.Mockito.spy((org.mockito.stubbing.BaseStubber) stubber1);
        org.junit.Assert.assertNotNull(throwableArray0);
// flaky:         org.junit.Assert.assertNotNull(stubber1);
// flaky:         org.junit.Assert.assertNotNull(baseStubber2);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        org.mockito.session.MockitoSessionBuilder[] mockitoSessionBuilderArray0 = new org.mockito.session.MockitoSessionBuilder[] {};
        org.mockito.Mockito.clearInvocations(mockitoSessionBuilderArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyZeroInteractions((java.lang.Object[]) mockitoSessionBuilderArray0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoSessionBuilderArray0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test373");
        java.util.Map<java.util.Set<java.lang.Comparable<java.lang.String>>, org.mockito.MockSettings> strComparableSetMap0 = org.mockito.ArgumentMatchers.isNotNull();
        org.junit.Assert.assertNull(strComparableSetMap0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test374");
        org.mockito.ArgumentMatchers argumentMatchers0 = org.mockito.ArgumentMatchers.anyObject();
        org.junit.Assert.assertNull(argumentMatchers0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test375");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout1 = org.mockito.Mockito.timeout(100L);
        org.junit.Assert.assertNotNull(verificationWithTimeout1);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test376");
        org.mockito.MockSettings mockSettings0 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass1 = mockSettings0.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout3 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout5 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout3, strArray4);
        java.lang.reflect.AnnotatedElement annotatedElement6 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray4);
        org.mockito.MockSettings mockSettings7 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass8 = mockSettings7.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout10 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout12 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout10, strArray11);
        java.lang.reflect.AnnotatedElement annotatedElement13 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass8, strArray11);
        java.lang.reflect.AnnotatedElement annotatedElement14 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass1, strArray11);
        org.junit.Assert.assertNotNull(mockSettings0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(verificationWithTimeout3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(verificationWithTimeout5);
        org.junit.Assert.assertNull(annotatedElement6);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(verificationWithTimeout10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(verificationWithTimeout12);
        org.junit.Assert.assertNull(annotatedElement13);
        org.junit.Assert.assertNull(annotatedElement14);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test377");
        java.lang.Runnable runnable0 = org.mockito.ArgumentMatchers.isNull();
        org.junit.Assert.assertNull(runnable0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test378");
        long long1 = org.mockito.ArgumentMatchers.eq((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test379");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "Too many thread-local indexed variables");
        java.lang.Class<?> wildcardClass3 = internalThread2.getClass();
        org.mockito.verification.VerificationMode verificationMode5 = org.mockito.Mockito.description("method1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement6 = org.mockito.Mockito.verify((java.lang.reflect.AnnotatedElement) wildcardClass3, verificationMode5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is of type Class and is not a mock!?Make sure you place the parenthesis correctly!?See the examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(verificationMode5);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test380");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: Negative value is not allowed here");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test381");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) '4');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test382");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "Succeeded to forking invoke provider !");
        java.lang.Thread thread3 = org.mockito.ArgumentMatchers.eq((java.lang.Thread) internalThread2);
        org.junit.Assert.assertNull(thread3);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test383");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = internalThread2.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap5);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test384");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4, "");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test385");
        java.lang.Thread[] threadArray0 = new java.lang.Thread[] {};
// flaky:         org.mockito.Mockito.reset(threadArray0);
        org.junit.Assert.assertNotNull(threadArray0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test386");
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable0 = org.mockito.ArgumentMatchers.anyIterable();
        org.mockito.MockSettings mockSettings1 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass2 = mockSettings1.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout4 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout6 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout4, strArray5);
        java.lang.reflect.AnnotatedElement annotatedElement7 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass2, strArray5);
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable8 = org.mockito.ArgumentMatchers.refEq(mockitoIterable0, strArray5);
        java.lang.Iterable<org.mockito.Mockito> mockitoIterable9 = org.mockito.ArgumentMatchers.eq(mockitoIterable0);
        org.junit.Assert.assertNotNull(mockitoIterable0);
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(verificationWithTimeout4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(verificationWithTimeout6);
        org.junit.Assert.assertNull(annotatedElement7);
        org.junit.Assert.assertNull(mockitoIterable8);
        org.junit.Assert.assertNull(mockitoIterable9);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test387");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "value", 1L);
        org.mockito.MockingDetails mockingDetails7 = org.mockito.Mockito.mockingDetails((java.lang.Object) internalThread3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<org.mockito.MockingDetails> mockingDetailsOngoingStubbing8 = org.mockito.Mockito.when(mockingDetails7);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.GeneratedMethodAccessor35.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingDetails7);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test388");
        float float1 = org.mockito.ArgumentMatchers.eq((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test389");
        org.mockito.MockitoFramework mockitoFramework0 = org.mockito.Mockito.framework();
        org.mockito.MockitoFramework mockitoFramework1 = org.mockito.ArgumentMatchers.eq(mockitoFramework0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.MockitoFramework mockitoFramework2 = org.mockito.Mockito.spy(mockitoFramework0);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor40.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockitoFramework0);
        org.junit.Assert.assertNull(mockitoFramework1);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test390");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) '4');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test391");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2, "Succeeded to forking invoke provider !");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.Runnable> runnableOngoingStubbing6 = org.mockito.Mockito.when((java.lang.Runnable) internalThread5);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be 'a method call on a mock'.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because:?1. you stub either of: final/private/equals()/hashCode() methods.?   Those methods *cannot* be stubbed/verified.?   Mocking methods declared on non-public parent classes is not supported.?2. inside when() you don't call method on mock but on some other object.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test392");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atMost((int) (short) 100);
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test393");
        java.util.Map<org.mockito.MockingDetails, java.lang.Throwable[]> mockingDetailsMap0 = org.mockito.ArgumentMatchers.anyMap();
        java.lang.Class<?> wildcardClass1 = mockingDetailsMap0.getClass();
        org.junit.Assert.assertNotNull(mockingDetailsMap0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test394");
        java.io.Serializable serializable1 = org.mockito.ArgumentMatchers.same((java.io.Serializable) (short) 0);
        org.junit.Assert.assertEquals("'" + serializable1 + "' != '" + (short) 0 + "'", serializable1, (short) 0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test395");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout2 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout4 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout2, strArray3);
        java.lang.CharSequence charSequence5 = org.mockito.ArgumentMatchers.refEq((java.lang.CharSequence) "", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoMoreInteractions((java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(verificationWithTimeout2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(verificationWithTimeout4);
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test396");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("attach");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3, "Failed to forking invoke provider");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3, "attach", (long) 1);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "Failed to forking invoke provider");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test397");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.Stubber stubber1 = org.mockito.Mockito.doReturn((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.InvalidUseOfMatchersException; message: ?Misplaced or misused argument matcher detected here:??-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)?-> at sun.reflect.GeneratedMethodAccessor31.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)?-> at sun.reflect.GeneratedMethodAccessor25.invoke(Unknown Source)??You cannot use argument matchers outside of verification or stubbing.?Examples of correct usage of argument matchers:?    when(mock.get(anyInt())).thenReturn(null);?    doThrow(new RuntimeException()).when(mock).someVoidMethod(anyObject());?    verify(mock).someMethod(contains(\"foo\"))??This message may appear after an NullPointerException if the last matcher is returning an object ?like any() but the stubbed method signature expect a primitive argument, in this case,?use primitive alternatives.?    when(mock.get(any())); // bad use, will raise NPE?    when(mock.get(anyInt())); // correct usage use??Also, this error might show up because you use argument matchers with methods that cannot be mocked.?Following methods *cannot* be stubbed/verified: final/private/equals()/hashCode().?Mocking methods declared on non-public parent classes is not supported.?");
        } catch (org.mockito.exceptions.misusing.InvalidUseOfMatchersException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test398");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.ThreadGroup threadGroup5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup5, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, (java.lang.Runnable) internalThread7, "value", 1L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread7, "method1");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread12, "Too many thread-local indexed variables", (long) (byte) 1);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread16, "hi!");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test399");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, "Succeeded to forking invoke provider !");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread4, "value", 1L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap8 = internalThread7.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7, "");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread7.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.junit.Assert.assertNull(internalThreadLocalMap8);
        org.junit.Assert.assertNull(internalThreadLocalMap11);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test400");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.mockito.ArgumentMatchers.refEq("method1", strArray2);
        java.lang.String str4 = org.mockito.ArgumentMatchers.refEq("set attachment failed!", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.Mockito.verifyNoInteractions((java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyNoInteractions(mockOne, mockTwo);?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test401");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.atLeast((int) '#');
        org.junit.Assert.assertNotNull(verificationMode1);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test402");
        long long1 = org.mockito.ArgumentMatchers.eq((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test403");
        short short1 = org.mockito.ArgumentMatchers.eq((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test404");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.mockito.ArgumentMatchers.refEq("method1", strArray1);
        java.lang.Object[] objArray3 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.mockito.ArgumentMatchers.same(strArray1);
        org.mockito.MockSettings mockSettings5 = org.mockito.Mockito.withSettings();
        java.lang.Class<?> wildcardClass6 = mockSettings5.getClass();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout8 = org.mockito.Mockito.timeout((long) (short) 100);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout10 = org.mockito.ArgumentMatchers.refEq(verificationWithTimeout8, strArray9);
        java.lang.reflect.AnnotatedElement annotatedElement11 = org.mockito.ArgumentMatchers.refEq((java.lang.reflect.AnnotatedElement) wildcardClass6, strArray9);
        java.lang.Object[] objArray12 = org.mockito.ArgumentMatchers.refEq((java.lang.Object[]) strArray4, strArray9);
        org.mockito.MockingDetails mockingDetails13 = org.mockito.Mockito.mockingDetails((java.lang.Object) strArray9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(verificationWithTimeout8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(verificationWithTimeout10);
        org.junit.Assert.assertNull(annotatedElement11);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertNotNull(mockingDetails13);
    }
}
