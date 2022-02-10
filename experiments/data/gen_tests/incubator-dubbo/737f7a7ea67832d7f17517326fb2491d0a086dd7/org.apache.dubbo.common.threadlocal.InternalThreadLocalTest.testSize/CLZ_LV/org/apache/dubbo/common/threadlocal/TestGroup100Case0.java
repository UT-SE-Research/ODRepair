package org.apache.dubbo.common.threadlocal;

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
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.getIfSet();
        org.junit.Assert.assertNull(internalThreadLocalMap0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        int int0 = java.lang.Thread.NORM_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.remove();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.destroy();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        int int0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.nextVariableIndex();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        int int0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.lastVariableIndex();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        int int0 = java.lang.Thread.MAX_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.Object obj0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.UNSET;
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5);
        java.lang.Class<?> wildcardClass7 = internalThread5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        int int0 = java.lang.Thread.MIN_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4, "hi!");
        java.lang.Class<?> wildcardClass7 = internalThread4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap6 = internalThread5.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "Too many thread-local indexed variables", (long) (short) 1);
        java.lang.Class<?> wildcardClass10 = internalThread5.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = null;
        internalThread4.setThreadLocalMap(internalThreadLocalMap5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap8 = internalThread4.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "get method false!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread10.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap12);
        org.junit.Assert.assertNull(internalThreadLocalMap11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "");
        java.lang.Class<?> wildcardClass3 = internalThread2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "set is not equals get");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread8, "removeAll failed!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        java.lang.Class<?> wildcardClass11 = internalThread10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7, "Too many thread-local indexed variables");
        java.lang.Class<?> wildcardClass10 = internalThread9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = internalThread2.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "Too many thread-local indexed variables");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7);
        java.lang.Class<?> wildcardClass10 = internalThread7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = internalThread5.threadLocalMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = internalThreadLocalMap7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(internalThreadLocalMap7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread9, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap14 = internalThread13.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread13, "value", (long) '4');
        java.lang.Class<?> wildcardClass18 = internalThread17.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = null;
        internalThread12.setThreadLocalMap(internalThreadLocalMap13);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread15, "removeAll failed!", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread15, "remove failed!", (long) (short) 100);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread13, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap16 = internalThread15.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap16);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = null;
        internalThread4.setThreadLocalMap(internalThreadLocalMap5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "remove failed!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread8, "set failed");
        java.lang.Class<?> wildcardClass13 = internalThread8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap6 = null;
        internalThread5.setThreadLocalMap(internalThreadLocalMap6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = internalThread9.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap12);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap14 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap14);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "removeAll failed!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread10, "remove failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap16 = null;
        internalThread15.setThreadLocalMap(internalThreadLocalMap16);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread10.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        java.lang.Class<?> wildcardClass13 = internalThread12.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread10.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap13);
        org.junit.Assert.assertNull(internalThreadLocalMap11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap4 = internalThread3.threadLocalMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = internalThreadLocalMap4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(internalThreadLocalMap4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread10.threadLocalMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = internalThreadLocalMap11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(internalThreadLocalMap11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10);
        java.lang.Class<?> wildcardClass14 = internalThread10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "value");
        java.lang.Class<?> wildcardClass15 = internalThread14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2, "");
        java.lang.Class<?> wildcardClass5 = internalThread2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1);
        java.lang.Class<?> wildcardClass3 = internalThread1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10, "");
        java.lang.Class<?> wildcardClass13 = internalThread10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = null;
        internalThread4.setThreadLocalMap(internalThreadLocalMap5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        java.lang.Class<?> wildcardClass8 = internalThread4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap6 = null;
        internalThread5.setThreadLocalMap(internalThreadLocalMap6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "size method is wrong!");
        java.lang.Class<?> wildcardClass12 = internalThread11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) (short) 10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6, "set failed", 100L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread10, "remove failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10);
        java.lang.Class<?> wildcardClass16 = internalThread15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap2 = internalThread1.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread12.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread12, "removeAll failed!", (long) 10);
        java.lang.Class<?> wildcardClass19 = internalThread18.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap13);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread8, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread12.threadLocalMap();
        java.lang.Class<?> wildcardClass14 = internalThread12.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("value");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread9, "remove failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread12, "");
        java.lang.Class<?> wildcardClass15 = internalThread14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, "set is not equals get");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3);
        java.lang.Class<?> wildcardClass6 = internalThread5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = internalThread11.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread11, "hi!", 10L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread11, "set failed");
        java.lang.Class<?> wildcardClass18 = internalThread11.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7, "size method is wrong!", (long) (short) 100);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread7.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread0 = new org.apache.dubbo.common.threadlocal.InternalThread();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread0, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread0, "remove failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread0, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = null;
        internalThread6.setThreadLocalMap(internalThreadLocalMap7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("hi!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap2 = null;
        internalThread1.setThreadLocalMap(internalThreadLocalMap2);
        java.lang.Class<?> wildcardClass4 = internalThread1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = null;
        internalThread4.setThreadLocalMap(internalThreadLocalMap5);
        java.lang.Class<?> wildcardClass7 = internalThread4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = null;
        internalThread6.setThreadLocalMap(internalThreadLocalMap7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread12, "");
        java.lang.Class<?> wildcardClass15 = internalThread14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, "set is not equals get");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = null;
        internalThread4.setThreadLocalMap(internalThreadLocalMap5);
        java.lang.Class<?> wildcardClass7 = internalThread4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.ThreadGroup threadGroup5 = null;
        java.lang.Runnable runnable6 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup5, runnable6, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, (java.lang.Runnable) internalThread11);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap14 = null;
        internalThread13.setThreadLocalMap(internalThreadLocalMap14);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread13);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread16, "removeAll failed!", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread20 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread19);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread22 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread20, "set failed");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "value");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap3 = internalThread2.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = null;
        internalThread5.setThreadLocalMap(internalThreadLocalMap7);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = null;
        internalThread5.setThreadLocalMap(internalThreadLocalMap9);
        java.lang.Class<?> wildcardClass11 = internalThread5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap2 = null;
        internalThread1.setThreadLocalMap(internalThreadLocalMap2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8, "onRemove method failed!", (-1L));
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = null;
        internalThread6.setThreadLocalMap(internalThreadLocalMap12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread14, "", (long) (byte) -1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = null;
        internalThread6.setThreadLocalMap(internalThreadLocalMap7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6);
        java.lang.Class<?> wildcardClass12 = internalThread6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = internalThread11.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread11.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread11, "value");
        org.junit.Assert.assertNull(internalThreadLocalMap12);
        org.junit.Assert.assertNull(internalThreadLocalMap13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = null;
        internalThread12.setThreadLocalMap(internalThreadLocalMap13);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread15, "removeAll failed!", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread18);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap20 = null;
        internalThread19.setThreadLocalMap(internalThreadLocalMap20);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = null;
        internalThread5.setThreadLocalMap(internalThreadLocalMap11);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread5.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = null;
        internalThread6.setThreadLocalMap(internalThreadLocalMap12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap15 = null;
        internalThread6.setThreadLocalMap(internalThreadLocalMap15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = null;
        internalThread11.setThreadLocalMap(internalThreadLocalMap12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread14, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread16, "remove failed!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = null;
        internalThread4.setThreadLocalMap(internalThreadLocalMap5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "get method false!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap8 = null;
        internalThread7.setThreadLocalMap(internalThreadLocalMap8);
        java.lang.Class<?> wildcardClass10 = internalThread7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = internalThread6.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "Too many thread-local indexed variables", (long) (short) 1);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread10.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap14 = internalThread10.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap7);
        org.junit.Assert.assertNull(internalThreadLocalMap11);
        org.junit.Assert.assertNull(internalThreadLocalMap14);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "set is not equals get");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap3 = null;
        internalThread2.setThreadLocalMap(internalThreadLocalMap3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "hi!");
        java.lang.Class<?> wildcardClass12 = internalThread9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("get method false!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread8, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap14 = null;
        internalThread8.setThreadLocalMap(internalThreadLocalMap14);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread16);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread17);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread17, "", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread24 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread21, "set is not equals get", 0L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap3 = internalThread2.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2, "onRemove method failed!");
        org.junit.Assert.assertNull(internalThreadLocalMap3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread5.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        java.lang.Class<?> wildcardClass13 = internalThread5.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = internalThread6.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "Too many thread-local indexed variables", (long) (short) 1);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread10.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10);
        java.lang.Class<?> wildcardClass13 = internalThread12.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap7);
        org.junit.Assert.assertNull(internalThreadLocalMap11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "remove failed!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread12.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread12, "hi!", 10L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread20 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread18, "size method is wrong!");
        org.junit.Assert.assertNull(internalThreadLocalMap13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "set is not equals get");
        java.lang.Class<?> wildcardClass3 = internalThread2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread4, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread4, "get method false!", 0L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap10 = null;
        internalThread4.setThreadLocalMap(internalThreadLocalMap10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread4, "hi!", 10L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread8, "remove failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap14 = internalThread13.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap14);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread10, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap15 = internalThread14.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread14, "value", (long) '4');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread18, "size method is wrong!", (long) (byte) 100);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread23 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread18, "size method is wrong!");
        org.junit.Assert.assertNull(internalThreadLocalMap15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread12, "", (long) (byte) 100);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap8 = internalThread5.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = internalThread5.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap8);
        org.junit.Assert.assertNull(internalThreadLocalMap9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable2, "size method is wrong!", (long) (byte) 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread7.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread15);
        org.junit.Assert.assertNull(internalThreadLocalMap13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap8 = null;
        internalThread6.setThreadLocalMap(internalThreadLocalMap8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap2 = internalThread1.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = null;
        internalThread12.setThreadLocalMap(internalThreadLocalMap13);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread15, "removeAll failed!", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread20 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread15, "");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread();
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap2 = null;
        internalThread1.setThreadLocalMap(internalThreadLocalMap2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread1, "");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap6 = null;
        internalThread5.setThreadLocalMap(internalThreadLocalMap6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2, "value");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "set failed");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "value", (long) 0);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6, "remove failed!", (long) (short) -1);
        java.lang.Class<?> wildcardClass10 = internalThread6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2, "hi!");
        java.lang.Class<?> wildcardClass5 = internalThread4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2, "get method false!");
        java.lang.Class<?> wildcardClass6 = internalThread2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        java.lang.Class<?> wildcardClass9 = internalThread8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7);
        java.lang.Class<?> wildcardClass9 = internalThread7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = null;
        internalThread2.setThreadLocalMap(internalThreadLocalMap5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "removeAll failed!", (long) 10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3, "set is not equals get");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = null;
        internalThread8.setThreadLocalMap(internalThreadLocalMap9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread12.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread12, "hi!", 10L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread20 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread12, "set failed");
        java.lang.Class<?> wildcardClass21 = internalThread20.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap13);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap10 = null;
        internalThread7.setThreadLocalMap(internalThreadLocalMap10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread0 = new org.apache.dubbo.common.threadlocal.InternalThread();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread0, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread0, "remove failed!");
        java.lang.Class<?> wildcardClass5 = internalThread4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread12.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread12, "removeAll failed!", (long) 10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap19 = null;
        internalThread12.setThreadLocalMap(internalThreadLocalMap19);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap22 = null;
        internalThread12.setThreadLocalMap(internalThreadLocalMap22);
        org.junit.Assert.assertNull(internalThreadLocalMap13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        java.lang.Class<?> wildcardClass12 = internalThread5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "Too many thread-local indexed variables");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = null;
        internalThread6.setThreadLocalMap(internalThreadLocalMap12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread14);
        java.lang.Class<?> wildcardClass16 = internalThread14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) (short) 10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "removeAll failed!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap8 = null;
        internalThread7.setThreadLocalMap(internalThreadLocalMap8);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap10 = internalThread7.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "", (long) (byte) 10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread7, "size method is wrong!", (long) (byte) 0);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread16);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap18 = null;
        internalThread17.setThreadLocalMap(internalThreadLocalMap18);
        org.junit.Assert.assertNull(internalThreadLocalMap10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap10 = internalThread9.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
        org.junit.Assert.assertNull(internalThreadLocalMap10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread5.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.junit.Assert.assertNull(internalThreadLocalMap11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "", (long) (byte) -1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.lang.Runnable runnable0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(runnable0, "set failed");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = internalThread6.threadLocalMap();
        java.lang.Class<?> wildcardClass8 = internalThread6.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread11, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread11, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread15, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread15, "hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread5.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap15 = internalThread14.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap11);
        org.junit.Assert.assertNull(internalThreadLocalMap15);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread4, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread4, "", (long) 5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread12.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread12, "removeAll failed!", (long) 10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap19 = null;
        internalThread12.setThreadLocalMap(internalThreadLocalMap19);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap22 = null;
        internalThread21.setThreadLocalMap(internalThreadLocalMap22);
        org.junit.Assert.assertNull(internalThreadLocalMap13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap8 = null;
        internalThread7.setThreadLocalMap(internalThreadLocalMap8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread11, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread13, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread15);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread16, "get method false!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread0 = new org.apache.dubbo.common.threadlocal.InternalThread();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread0, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread0, "remove failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread0, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = null;
        internalThread0.setThreadLocalMap(internalThreadLocalMap7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3, "set is not equals get");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = null;
        internalThread7.setThreadLocalMap(internalThreadLocalMap9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = null;
        internalThread12.setThreadLocalMap(internalThreadLocalMap13);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread15, "removeAll failed!", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread20 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread18, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread22 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread20, "");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap23 = internalThread22.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap23);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap4 = null;
        internalThread2.setThreadLocalMap(internalThreadLocalMap4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread12.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread14);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread14);
        org.junit.Assert.assertNull(internalThreadLocalMap13);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap2 = null;
        internalThread1.setThreadLocalMap(internalThreadLocalMap2);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap4 = internalThread1.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("value");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap2 = null;
        internalThread1.setThreadLocalMap(internalThreadLocalMap2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = null;
        internalThread11.setThreadLocalMap(internalThreadLocalMap12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread11);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap15 = null;
        internalThread11.setThreadLocalMap(internalThreadLocalMap15);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap17 = null;
        internalThread11.setThreadLocalMap(internalThreadLocalMap17);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("remove failed!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2, "remove failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = internalThread2.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap3 = null;
        internalThread2.setThreadLocalMap(internalThreadLocalMap3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread10, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap15 = internalThread14.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread14, "value", (long) '4');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread18, "size method is wrong!", (long) (byte) 100);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread22 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread21);
        org.junit.Assert.assertNull(internalThreadLocalMap15);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread15);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread16);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = internalThread3.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap10 = internalThread9.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap7);
        org.junit.Assert.assertNull(internalThreadLocalMap10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread5, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread8, "remove failed!", (long) (short) -1);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread8, "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread4, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread7, "set is not equals get");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread9, "set failed");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap4 = internalThread3.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "Too many thread-local indexed variables");
        org.junit.Assert.assertNull(internalThreadLocalMap4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = null;
        internalThread5.setThreadLocalMap(internalThreadLocalMap11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread13, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap16 = null;
        internalThread15.setThreadLocalMap(internalThreadLocalMap16);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap10 = internalThread9.threadLocalMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = internalThreadLocalMap10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(internalThreadLocalMap10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread4, "hi!", (long) 0);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.ThreadGroup threadGroup5 = null;
        java.lang.ThreadGroup threadGroup6 = null;
        java.lang.Runnable runnable7 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup6, runnable7, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread13, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup5, (java.lang.Runnable) internalThread13, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap18 = internalThread17.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, (java.lang.Runnable) internalThread17, "value", (long) '4');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread24 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread21, "size method is wrong!", (long) (byte) 100);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread27 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread24, "", (long) 5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread29 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread24, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread32 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread24, "value", (long) (byte) 100);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread34 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread24, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread36 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread24, "value");
        org.junit.Assert.assertNull(internalThreadLocalMap18);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = internalThread6.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "Too many thread-local indexed variables", (long) (short) 1);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread10.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap14 = null;
        internalThread13.setThreadLocalMap(internalThreadLocalMap14);
        org.junit.Assert.assertNull(internalThreadLocalMap7);
        org.junit.Assert.assertNull(internalThreadLocalMap11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2, "");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap12);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap14 = internalThread10.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10, "get method false!", (long) '#');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread20 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread17, "set failed", (long) (byte) -1);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread22 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread17, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread23 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread17);
        org.junit.Assert.assertNull(internalThreadLocalMap14);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = null;
        internalThread6.setThreadLocalMap(internalThreadLocalMap12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread14);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread14, "Too many thread-local indexed variables");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = null;
        internalThread11.setThreadLocalMap(internalThreadLocalMap12);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread11, "hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread4, "set failed", (long) (short) 100);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread9, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread9, "size method is wrong!", (long) (byte) 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread();
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap4 = null;
        internalThread3.setThreadLocalMap(internalThreadLocalMap4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread3, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7, "get method false!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap15 = internalThread14.threadLocalMap();
        java.lang.Class<?> wildcardClass16 = internalThread14.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap6 = null;
        internalThread5.setThreadLocalMap(internalThreadLocalMap6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread11);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread("Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1, "hi!");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread16, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread18);
        java.lang.Class<?> wildcardClass20 = internalThread18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.lang.Runnable runnable0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread(runnable0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = null;
        internalThread12.setThreadLocalMap(internalThreadLocalMap13);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread15, "removeAll failed!", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread15);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread19, "removeAll failed!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2, "onRemove method failed!", (long) ' ');
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap6 = internalThread5.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "Too many thread-local indexed variables", (long) (short) 1);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.junit.Assert.assertNull(internalThreadLocalMap6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap15 = internalThread10.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap15);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8, "onRemove method failed!", (-1L));
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread12, "get method false!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = internalThread4.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = null;
        internalThread12.setThreadLocalMap(internalThreadLocalMap13);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread15, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread15);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread15, "onRemove method failed!", (long) (byte) 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread11, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread11, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap16 = internalThread15.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread15, "value", (long) '4');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread22 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread19, "size method is wrong!", (long) (byte) 100);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread25 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread22, "", (long) 5);
        java.lang.Class<?> wildcardClass26 = internalThread22.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap16);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread12.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread12, "removeAll failed!", (long) 10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap19 = null;
        internalThread18.setThreadLocalMap(internalThreadLocalMap19);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap21 = internalThread18.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread23 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread18, "remove failed!");
        org.junit.Assert.assertNull(internalThreadLocalMap13);
        org.junit.Assert.assertNull(internalThreadLocalMap21);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "", (long) 5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = internalThread11.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = null;
        internalThread7.setThreadLocalMap(internalThreadLocalMap9);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread7.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7, "get method false!", (long) '#');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap15 = internalThread14.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap11);
        org.junit.Assert.assertNull(internalThreadLocalMap15);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = null;
        internalThread11.setThreadLocalMap(internalThreadLocalMap12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread14, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread14, "set failed", 10L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap20 = internalThread19.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap20);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = internalThread11.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread11, "hi!", 10L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap16 = null;
        internalThread11.setThreadLocalMap(internalThreadLocalMap16);
        java.lang.Class<?> wildcardClass18 = internalThread11.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap6 = null;
        internalThread5.setThreadLocalMap(internalThreadLocalMap6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5);
        java.lang.Class<?> wildcardClass9 = internalThread5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = internalThread6.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "Too many thread-local indexed variables", (long) (short) 1);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread10.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.junit.Assert.assertNull(internalThreadLocalMap7);
        org.junit.Assert.assertNull(internalThreadLocalMap11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread11);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread10, "remove failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread15, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread0 = new org.apache.dubbo.common.threadlocal.InternalThread();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread0);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread0, "get method false!");
        java.lang.Class<?> wildcardClass4 = internalThread3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap4 = null;
        internalThread3.setThreadLocalMap(internalThreadLocalMap4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3, "remove failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap8 = internalThread7.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = internalThread8.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread8, "Too many thread-local indexed variables", (long) (short) 1);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread12.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread15, "set failed", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread18, "remove failed!", 1L);
        org.junit.Assert.assertNull(internalThreadLocalMap9);
        org.junit.Assert.assertNull(internalThreadLocalMap13);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread11, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread11, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap16 = internalThread15.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread15, "value", (long) '4');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread22 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread19, "size method is wrong!", (long) (byte) 100);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread25 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread22, "", (long) 5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread26 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread25);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap27 = null;
        internalThread26.setThreadLocalMap(internalThreadLocalMap27);
        org.junit.Assert.assertNull(internalThreadLocalMap16);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10, "removeAll failed!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread13, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap16 = internalThread13.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap16);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "set failed");
        java.lang.Class<?> wildcardClass8 = internalThread7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "", (long) 5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
        java.lang.Class<?> wildcardClass11 = internalThread10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = internalThread11.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread11.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread11, "size method is wrong!", (long) 100);
        org.junit.Assert.assertNull(internalThreadLocalMap12);
        org.junit.Assert.assertNull(internalThreadLocalMap13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = internalThread8.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread8, "Too many thread-local indexed variables", (long) (short) 1);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread12.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread12, "Too many thread-local indexed variables", (long) (byte) 1);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread12, "set failed");
        org.junit.Assert.assertNull(internalThreadLocalMap9);
        org.junit.Assert.assertNull(internalThreadLocalMap13);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread("");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread4, "set is not equals get");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6, "set is not equals get", 10L);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("set is not equals get");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread4, "remove failed!", 0L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "removeAll failed!", (long) (short) 100);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.ThreadGroup threadGroup5 = null;
        java.lang.Runnable runnable6 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup5, runnable6, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, (java.lang.Runnable) internalThread9, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap15 = internalThread14.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread14, "hi!", 10L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread18);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread22 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread18, "set is not equals get", (long) (short) 100);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread23 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread18);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread24 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread18);
        org.junit.Assert.assertNull(internalThreadLocalMap15);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10, "value", 1L);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = null;
        internalThread6.setThreadLocalMap(internalThreadLocalMap7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10, "hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = null;
        internalThread4.setThreadLocalMap(internalThreadLocalMap5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "Too many thread-local indexed variables");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = internalThread6.threadLocalMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = internalThreadLocalMap7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(internalThreadLocalMap7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = null;
        internalThread9.setThreadLocalMap(internalThreadLocalMap11);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread9.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread9, "get method false!", (long) '#');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread16, "set failed", (long) (byte) -1);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread16, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap22 = internalThread16.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap13);
        org.junit.Assert.assertNull(internalThreadLocalMap22);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = null;
        internalThread4.setThreadLocalMap(internalThreadLocalMap5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread12.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread12, "hi!", 10L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread16);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap18 = null;
        internalThread16.setThreadLocalMap(internalThreadLocalMap18);
        org.junit.Assert.assertNull(internalThreadLocalMap13);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap14 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap14);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap16 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap16);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap6 = null;
        internalThread2.setThreadLocalMap(internalThreadLocalMap6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = null;
        internalThread11.setThreadLocalMap(internalThreadLocalMap12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread14, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread14, "set failed", 10L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread14, "set failed");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap3 = null;
        internalThread2.setThreadLocalMap(internalThreadLocalMap3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "value", (long) (-1));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = null;
        internalThread4.setThreadLocalMap(internalThreadLocalMap5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap10 = null;
        internalThread9.setThreadLocalMap(internalThreadLocalMap10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap8 = null;
        internalThread7.setThreadLocalMap(internalThreadLocalMap8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread7, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7, "set failed");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread10, "remove failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread15, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap18 = null;
        internalThread15.setThreadLocalMap(internalThreadLocalMap18);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = null;
        internalThread8.setThreadLocalMap(internalThreadLocalMap9);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread8.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread8, "", (long) (byte) 10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread8, "size method is wrong!", (long) (byte) 0);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread17);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread20 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread17, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread22 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread17, "onRemove method failed!");
        org.junit.Assert.assertNull(internalThreadLocalMap11);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = internalThread5.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = internalThread5.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap7);
        org.junit.Assert.assertNull(internalThreadLocalMap9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap8 = null;
        internalThread3.setThreadLocalMap(internalThreadLocalMap8);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap10 = null;
        internalThread3.setThreadLocalMap(internalThreadLocalMap10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread10, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap15 = internalThread14.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread14, "value", (long) '4');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread18, "size method is wrong!", (long) (byte) 100);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread23 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread18, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread24 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread23);
        org.junit.Assert.assertNull(internalThreadLocalMap15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = null;
        internalThread12.setThreadLocalMap(internalThreadLocalMap13);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread15, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread15);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread20 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread15, "size method is wrong!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread12.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread12, "removeAll failed!", (long) 10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap19 = null;
        internalThread18.setThreadLocalMap(internalThreadLocalMap19);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread18);
        org.junit.Assert.assertNull(internalThreadLocalMap13);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = internalThread11.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread13);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread13, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap17 = internalThread13.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap12);
        org.junit.Assert.assertNull(internalThreadLocalMap17);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread11, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread11, "value");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread11, "get method false!", 0L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread8, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread10, "Too many thread-local indexed variables", 1L);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = null;
        internalThread6.setThreadLocalMap(internalThreadLocalMap12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread14);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread15);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread15, "get method false!");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread2, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap6 = internalThread2.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread2);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap10 = null;
        internalThread9.setThreadLocalMap(internalThreadLocalMap10);
        org.junit.Assert.assertNull(internalThreadLocalMap6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread8, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap14 = internalThread13.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread13, "hi!", 10L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread17);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread17, "set is not equals get", (long) (short) 100);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread22 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread17);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread24 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread17, "hi!");
        org.junit.Assert.assertNull(internalThreadLocalMap14);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = internalThread8.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread8, "Too many thread-local indexed variables", (long) (short) 1);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = internalThread12.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread15, "set failed", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread15, "removeAll failed!", (long) (byte) 100);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap22 = null;
        internalThread21.setThreadLocalMap(internalThreadLocalMap22);
        org.junit.Assert.assertNull(internalThreadLocalMap9);
        org.junit.Assert.assertNull(internalThreadLocalMap13);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "", (long) 5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "removeAll failed!");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread5, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread5, "", (long) 5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread12);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap6 = null;
        internalThread5.setThreadLocalMap(internalThreadLocalMap6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread8);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7, "size method is wrong!", (long) (short) 100);
        java.lang.Class<?> wildcardClass11 = internalThread7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap8 = null;
        internalThread7.setThreadLocalMap(internalThreadLocalMap8);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap10 = internalThread7.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "", (long) (byte) 10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread7, "size method is wrong!", (long) (byte) 0);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread16);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread17);
        org.junit.Assert.assertNull(internalThreadLocalMap10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread7, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread15, "removeAll failed!", (long) 0);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread15);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap20 = internalThread19.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap20);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread9, "onRemove method failed!", (-1L));
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread9, "Too many thread-local indexed variables", 1L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread16, "remove failed!", (long) (byte) 1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set is not equals get", (long) (byte) 1);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread5, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread5, "", (long) 5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = null;
        internalThread5.setThreadLocalMap(internalThreadLocalMap13);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = null;
        internalThread6.setThreadLocalMap(internalThreadLocalMap7);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = internalThread6.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) (byte) 10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6, "size method is wrong!", (long) (byte) 0);
        java.lang.Class<?> wildcardClass16 = internalThread6.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = internalThread10.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = internalThread10.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = null;
        internalThread10.setThreadLocalMap(internalThreadLocalMap13);
        org.junit.Assert.assertNull(internalThreadLocalMap11);
        org.junit.Assert.assertNull(internalThreadLocalMap12);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = null;
        internalThread12.setThreadLocalMap(internalThreadLocalMap13);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread15, "removeAll failed!", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread20 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread18, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread20);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread22 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread20);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, "set is not equals get");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = null;
        internalThread3.setThreadLocalMap(internalThreadLocalMap5);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = internalThread3.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3);
        org.junit.Assert.assertNull(internalThreadLocalMap7);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.lang.ThreadGroup threadGroup0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread1 = new org.apache.dubbo.common.threadlocal.InternalThread();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread1, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "onRemove method failed!", 1L);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread10, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap15 = internalThread14.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread14, "value", (long) '4');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread18, "size method is wrong!", (long) (byte) 100);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread23 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread18, "onRemove method failed!");
        java.lang.Class<?> wildcardClass24 = internalThread18.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap15);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread3 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread3);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread3, "get method false!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread3, "", (long) 5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.Runnable runnable5 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, runnable5, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread8, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread10);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap13 = null;
        internalThread12.setThreadLocalMap(internalThreadLocalMap13);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread15, "size method is wrong!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread15);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread19 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread18);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, "set is not equals get");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap7 = null;
        internalThread5.setThreadLocalMap(internalThreadLocalMap7);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = internalThread5.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread5, "remove failed!", (long) (-1));
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread13);
        org.junit.Assert.assertNull(internalThreadLocalMap9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.Runnable runnable1 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, runnable1, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap5 = null;
        internalThread4.setThreadLocalMap(internalThreadLocalMap5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap10 = internalThread7.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread9, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread9, "value", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6, "set is not equals get", (-1L));
        java.lang.Class<?> wildcardClass16 = internalThread6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread10, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread10, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap15 = internalThread14.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread14, "value", (long) '4');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread21 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread14, "onRemove method failed!", (long) (-1));
        org.apache.dubbo.common.threadlocal.InternalThread internalThread23 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread14, "set is not equals get");
        org.junit.Assert.assertNull(internalThreadLocalMap15);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap12 = internalThread6.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread14, "set is not equals get");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap17 = null;
        internalThread14.setThreadLocalMap(internalThreadLocalMap17);
        java.lang.Class<?> wildcardClass19 = internalThread14.getClass();
        org.junit.Assert.assertNull(internalThreadLocalMap12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread4 = new org.apache.dubbo.common.threadlocal.InternalThread("set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread4);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread6, "remove failed!", (long) 5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread6, "get method false!", (long) (byte) 10);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread12, "set is not equals get");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread5, "", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap11 = null;
        internalThread5.setThreadLocalMap(internalThreadLocalMap11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread13, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread15, "Too many thread-local indexed variables");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread9, "onRemove method failed!", (long) '#');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread15 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread14);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread15, "removeAll failed!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.Runnable runnable4 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, runnable4, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread10 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread12 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread9, "remove failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "Too many thread-local indexed variables");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread9, "onRemove method failed!", (long) ' ');
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap18 = null;
        internalThread17.setThreadLocalMap(internalThreadLocalMap18);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.Runnable runnable2 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread5 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, runnable2, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread7 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread5, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread7);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap9 = null;
        internalThread7.setThreadLocalMap(internalThreadLocalMap9);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.Runnable runnable3 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread6 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, runnable3, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread8 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread9 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread6);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread9, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread9, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap14 = internalThread13.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread13, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread17 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread13);
        org.junit.Assert.assertNull(internalThreadLocalMap14);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.lang.ThreadGroup threadGroup0 = null;
        java.lang.ThreadGroup threadGroup1 = null;
        java.lang.ThreadGroup threadGroup2 = null;
        java.lang.ThreadGroup threadGroup3 = null;
        java.lang.ThreadGroup threadGroup4 = null;
        java.lang.ThreadGroup threadGroup5 = null;
        java.lang.ThreadGroup threadGroup6 = null;
        java.lang.ThreadGroup threadGroup7 = null;
        java.lang.Runnable runnable8 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread11 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup7, runnable8, "set failed", 100L);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread13 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread11, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread14 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread11);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread16 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread14, "");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread18 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup6, (java.lang.Runnable) internalThread14, "set failed");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap19 = internalThread18.threadLocalMap();
        org.apache.dubbo.common.threadlocal.InternalThread internalThread22 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup5, (java.lang.Runnable) internalThread18, "value", (long) '4');
        org.apache.dubbo.common.threadlocal.InternalThread internalThread25 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup4, (java.lang.Runnable) internalThread22, "size method is wrong!", (long) (byte) 100);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread28 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup3, (java.lang.Runnable) internalThread25, "", (long) 5);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread30 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread25, "hi!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread33 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup2, (java.lang.Runnable) internalThread25, "value", (long) (byte) 100);
        org.apache.dubbo.common.threadlocal.InternalThread internalThread35 = new org.apache.dubbo.common.threadlocal.InternalThread((java.lang.Runnable) internalThread25, "removeAll failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread37 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup1, (java.lang.Runnable) internalThread35, "onRemove method failed!");
        org.apache.dubbo.common.threadlocal.InternalThread internalThread40 = new org.apache.dubbo.common.threadlocal.InternalThread(threadGroup0, (java.lang.Runnable) internalThread37, "Too many thread-local indexed variables", (long) 100);
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap41 = internalThread37.threadLocalMap();
        org.junit.Assert.assertNull(internalThreadLocalMap19);
        org.junit.Assert.assertNull(internalThreadLocalMap41);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.lang.Runnable runnable0 = null;
        org.apache.dubbo.common.threadlocal.InternalThread internalThread2 = new org.apache.dubbo.common.threadlocal.InternalThread(runnable0, "set is not equals get");
    }
}

