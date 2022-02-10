package com.alibaba.csp.sentinel;

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
        com.alibaba.csp.sentinel.util.function.Predicate<java.lang.Throwable> throwablePredicate0 = null;
        com.alibaba.csp.sentinel.Tracer.exceptionPredicate = throwablePredicate0;
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.alibaba.csp.sentinel.util.AssertUtil.notEmpty("trace or ignore classes must not be null", "test-context-");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.context.Context context1 = null;
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, context1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        int int0 = com.alibaba.csp.sentinel.context.ContextUtil.contextSize();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.Class<? extends java.lang.Throwable> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray3 = (java.lang.Class<? extends java.lang.Throwable>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        com.alibaba.csp.sentinel.Tracer.traceClasses = wildcardClassArray3;
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.alibaba.csp.sentinel.util.AssertUtil.notEmpty("exception predicate must not be null", "test-context-");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.alibaba.csp.sentinel.context.ContextUtil contextUtil0 = new com.alibaba.csp.sentinel.context.ContextUtil();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.alibaba.csp.sentinel.util.AssertUtil.notNull((java.lang.Object) (byte) 100, "hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.alibaba.csp.sentinel.context.ContextUtil.exit();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.util.AssertUtil.assertNotBlank("", "test-context-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: test-context-");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.alibaba.csp.sentinel.util.AssertUtil.assertState(true, "trace or ignore classes must not be null");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.util.AssertUtil.assertState(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.Throwable throwable0 = null;
        boolean boolean1 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException(throwable0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode0, "exception predicate must not be null");
        org.junit.Assert.assertNotNull(context2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.alibaba.csp.sentinel.context.Context context0 = com.alibaba.csp.sentinel.context.ContextUtil.getContext();
        org.junit.Assert.assertNull(context0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getOriginNode();
        int int6 = context2.getOriginCurThreadNum();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.alibaba.csp.sentinel.util.AssertUtil.isTrue(true, "trace or ignore classes must not be null");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.alibaba.csp.sentinel.util.function.Predicate<java.lang.Throwable> throwablePredicate0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.Tracer.setExceptionPredicate(throwablePredicate0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: exception predicate must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode2 = null;
        com.alibaba.csp.sentinel.context.Context context4 = new com.alibaba.csp.sentinel.context.Context(defaultNode2, "");
        com.alibaba.csp.sentinel.node.Node node5 = context4.getCurNode();
        java.lang.String str6 = context4.getOrigin();
        com.alibaba.csp.sentinel.node.Node node7 = context4.getOriginNode();
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, (int) (byte) 0, context4);
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context4, runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.alibaba.csp.sentinel.context.NullContext nullContext0 = new com.alibaba.csp.sentinel.context.NullContext();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "exception predicate must not be null");
        java.lang.Class<?> wildcardClass3 = context2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.alibaba.csp.sentinel.util.AssertUtil.notNull((java.lang.Object) 0L, "test");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.StackTraceElement[] stackTraceElementArray0 = com.alibaba.csp.sentinel.slots.block.BlockException.sentinelStackTrace;
        java.lang.Class<?> wildcardClass1 = stackTraceElementArray0.getClass();
        org.junit.Assert.assertNotNull(stackTraceElementArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.alibaba.csp.sentinel.util.AssertUtil.isTrue(true, "exception predicate must not be null");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        java.lang.String str1 = runtimeException0.toString();
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.RuntimeException: SentinelBlockException" + "'", str1, "java.lang.RuntimeException: SentinelBlockException");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.util.AssertUtil.isTrue(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String str0 = com.alibaba.csp.sentinel.slots.block.BlockException.BLOCK_EXCEPTION_MSG_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SentinelBlockException: " + "'", str0, "SentinelBlockException: ");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.alibaba.csp.sentinel.util.AssertUtil.assertNotBlank("hi!", "hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.Entry entry1 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) runtimeException0, entry1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode10 = context6.getEntranceNode();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) ' ', context6);
        java.lang.RuntimeException runtimeException12 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        // The following exception was thrown during execution in test generation
        try {
            runtimeException0.addSuppressed((java.lang.Throwable) runtimeException12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Self-suppression not permitted");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(defaultNode10);
        org.junit.Assert.assertNotNull(runtimeException12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context(defaultNode1, "");
        com.alibaba.csp.sentinel.node.Node node4 = context3.getCurNode();
        java.lang.String str5 = context3.getOrigin();
        com.alibaba.csp.sentinel.node.Node node6 = context3.getLastNode();
        java.lang.String str7 = context3.getName();
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, context3);
        java.lang.String str9 = context3.getOrigin();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        double double11 = context10.getOriginBlockQps();
        com.alibaba.csp.sentinel.context.Context context13 = com.alibaba.csp.sentinel.context.ContextUtil.enter("hi!");
        com.alibaba.csp.sentinel.node.Node node14 = context13.getLastNode();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.Context context15 = context10.setCurNode(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(context13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        java.lang.String str9 = context2.toString();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context2, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}" + "'", str9, "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        double double9 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode10 = context2.getEntranceNode();
        double double11 = context2.getOriginPassReqQps();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(defaultNode10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        boolean boolean1 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) runtimeException0);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) runtimeException0);
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        java.lang.String str14 = runtimeException0.toString();
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.RuntimeException: SentinelBlockException" + "'", str14, "java.lang.RuntimeException: SentinelBlockException");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.alibaba.csp.sentinel.Tracer tracer0 = new com.alibaba.csp.sentinel.Tracer();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.alibaba.csp.sentinel.util.AssertUtil.notEmpty("test", "SentinelBlockException: ");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String str0 = com.alibaba.csp.sentinel.slots.block.BlockException.BLOCK_EXCEPTION_FLAG;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SentinelBlockException" + "'", str0, "SentinelBlockException");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        double double9 = context2.getOriginPassReqQps();
        long long10 = context2.getOriginBlockRequest();
        com.alibaba.csp.sentinel.Entry entry11 = context2.getCurEntry();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray0 = com.alibaba.csp.sentinel.Tracer.getExceptionsToTrace();
        com.alibaba.csp.sentinel.Tracer.traceClasses = wildcardClassArray0;
        org.junit.Assert.assertNotNull(wildcardClassArray0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("trace or ignore classes must not be null");
        com.alibaba.csp.sentinel.Entry entry2 = context1.getCurEntry();
        org.junit.Assert.assertNotNull(context1);
        org.junit.Assert.assertNull(entry2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("test");
        org.junit.Assert.assertNotNull(context1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context("trace or ignore classes must not be null", defaultNode1, false);
        com.alibaba.csp.sentinel.context.Context context5 = com.alibaba.csp.sentinel.context.ContextUtil.enter("hi!");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getLastNode();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.Context context7 = context3.setCurNode(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context(defaultNode1, "");
        com.alibaba.csp.sentinel.node.Node node4 = context3.getCurNode();
        java.lang.String str5 = context3.getOrigin();
        com.alibaba.csp.sentinel.node.Node node6 = context3.getLastNode();
        java.lang.String str7 = context3.getName();
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, context3);
        double double9 = context3.getOriginAvgRt();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        java.lang.String str4 = errorEntryFreeException1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-" + "'", str4, "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.alibaba.csp.sentinel.util.AssertUtil.assertNotBlank("Context{name='', entranceNode=null, curEntry=null, origin='', async=false}", "exception predicate must not be null");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray0 = com.alibaba.csp.sentinel.Tracer.ignoreClasses;
        java.lang.Class<?> wildcardClass1 = null; // flaky: wildcardClassArray0.getClass();
// flaky:         org.junit.Assert.assertNotNull(wildcardClassArray0);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.alibaba.csp.sentinel.util.AssertUtil.notEmpty("trace or ignore classes must not be null", "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.alibaba.csp.sentinel.util.AssertUtil.notEmpty("hi!", "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.util.AssertUtil.assertState(false, "test-context-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: test-context-");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = errorEntryFreeException1;
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray0 = com.alibaba.csp.sentinel.Tracer.traceClasses;
        com.alibaba.csp.sentinel.Tracer.traceClasses = wildcardClassArray0;
        org.junit.Assert.assertNotNull(wildcardClassArray0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.StackTraceElement[] stackTraceElementArray0 = com.alibaba.csp.sentinel.slots.block.BlockException.sentinelStackTrace;
        com.alibaba.csp.sentinel.slots.block.BlockException.sentinelStackTrace = stackTraceElementArray0;
        com.alibaba.csp.sentinel.slots.block.BlockException.sentinelStackTrace = stackTraceElementArray0;
        com.alibaba.csp.sentinel.slots.block.BlockException.sentinelStackTrace = stackTraceElementArray0;
        org.junit.Assert.assertNotNull(stackTraceElementArray0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.alibaba.csp.sentinel.util.AssertUtil.assertNotBlank("Context{name='', entranceNode=null, curEntry=null, origin='', async=false}", "test-context-");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        java.lang.Class<?> wildcardClass9 = context2.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Entry entry2 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry2);
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.util.AssertUtil.notNull((java.lang.Object) entry2, "trace or ignore classes must not be null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: trace or ignore classes must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.alibaba.csp.sentinel.util.AssertUtil.notEmpty("SentinelBlockException", "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray2 = (java.lang.Class<? extends java.lang.Throwable>[]) classArray1;
        com.alibaba.csp.sentinel.Tracer.traceClasses = wildcardClassArray2;
        com.alibaba.csp.sentinel.Tracer.ignoreClasses = wildcardClassArray2;
        com.alibaba.csp.sentinel.Tracer.setExceptionsToIgnore(wildcardClassArray2);
        java.lang.Class<?> wildcardClass6 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.context.Context context15 = context5.setOrigin("SentinelBlockException: ");
        com.alibaba.csp.sentinel.Entry entry16 = null;
        com.alibaba.csp.sentinel.context.Context context17 = context5.setCurEntry(entry16);
        double double18 = context5.getOriginPassQps();
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(context15);
        org.junit.Assert.assertNotNull(context17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.alibaba.csp.sentinel.util.AssertUtil.notEmpty("Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}", "exception predicate must not be null");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.alibaba.csp.sentinel.util.AssertUtil.assertState(true, "SentinelBlockException: ");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
        java.lang.String str2 = errorEntryFreeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.alibaba.csp.sentinel.ErrorEntryFreeException: com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-" + "'", str2, "com.alibaba.csp.sentinel.ErrorEntryFreeException: com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.context.Context context15 = context5.setOrigin("SentinelBlockException: ");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode16 = context15.getEntranceNode();
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(context15);
        org.junit.Assert.assertNull(defaultNode16);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "exception predicate must not be null");
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context2, runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.util.AssertUtil.isTrue(false, "test");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: test");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) runtimeException0);
        org.junit.Assert.assertNotNull(runtimeException0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        boolean boolean7 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context2);
        boolean boolean8 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context2);
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(context10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.Node node8 = context2.getLastNode();
        long long9 = context2.getOriginBlockRequest();
        int int10 = context2.getOriginCurThreadNum();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "trace or ignore classes must not be null");
        java.lang.String str3 = context2.getOrigin();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.alibaba.csp.sentinel.util.function.Predicate<java.lang.Throwable> throwablePredicate0 = com.alibaba.csp.sentinel.Tracer.exceptionPredicate;
        org.junit.Assert.assertNull(throwablePredicate0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode15 = null;
        com.alibaba.csp.sentinel.context.Context context17 = new com.alibaba.csp.sentinel.context.Context(defaultNode15, "");
        com.alibaba.csp.sentinel.node.Node node18 = context17.getCurNode();
        java.lang.String str19 = context17.getOrigin();
        com.alibaba.csp.sentinel.node.Node node20 = context17.getLastNode();
        java.lang.String str21 = context17.getName();
        boolean boolean22 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context17);
        double double23 = context17.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, 1, context17);
        java.lang.Throwable[] throwableArray25 = runtimeException0.getSuppressed();
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        java.lang.Class<?> wildcardClass4 = errorEntryFreeException1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        java.lang.String str11 = context2.toString();
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context2, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}" + "'", str11, "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        double double11 = context10.getOriginTotalQps();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray0 = com.alibaba.csp.sentinel.Tracer.getExceptionsToTrace();
        com.alibaba.csp.sentinel.Tracer.ignoreClasses = wildcardClassArray0;
        com.alibaba.csp.sentinel.Tracer.setExceptionsToIgnore(wildcardClassArray0);
        com.alibaba.csp.sentinel.Tracer.traceClasses = wildcardClassArray0;
        com.alibaba.csp.sentinel.Tracer.setExceptionsToIgnore(wildcardClassArray0);
        org.junit.Assert.assertNotNull(wildcardClassArray0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        boolean boolean3 = context2.isAsync();
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        java.lang.String str11 = context2.toString();
        com.alibaba.csp.sentinel.node.Node node12 = context2.getLastNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}" + "'", str11, "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        double double11 = context10.getOriginPassReqQps();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode2 = null;
        com.alibaba.csp.sentinel.context.Context context4 = new com.alibaba.csp.sentinel.context.Context(defaultNode2, "");
        com.alibaba.csp.sentinel.node.Node node5 = context4.getCurNode();
        java.lang.String str6 = context4.getOrigin();
        com.alibaba.csp.sentinel.node.Node node7 = context4.getOriginNode();
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, (int) (byte) 0, context4);
        double double9 = context4.getOriginPassReqQps();
        long long10 = context4.getOriginTotalRequest();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.alibaba.csp.sentinel.util.AssertUtil.assertNotBlank("SentinelBlockException: ", "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("hi!");
        com.alibaba.csp.sentinel.node.Node node2 = context1.getLastNode();
        double double3 = context1.getOriginAvgRt();
        com.alibaba.csp.sentinel.Entry entry4 = null;
        com.alibaba.csp.sentinel.context.Context context5 = context1.setCurEntry(entry4);
        double double6 = context5.getOriginPassQps();
        org.junit.Assert.assertNotNull(context1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        java.lang.String str9 = context2.getName();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context2, runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        java.lang.String str11 = context10.getName();
        com.alibaba.csp.sentinel.node.Node node12 = context10.getLastNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        java.lang.String str10 = context6.getName();
        boolean boolean11 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context6);
        double double12 = context6.getOriginPassReqQps();
        int int13 = context6.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context6);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode15 = context6.getEntranceNode();
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(defaultNode15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("trace or ignore classes must not be null");
        java.lang.String str2 = context1.toString();
        org.junit.Assert.assertNotNull(context1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.context.Context context10 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context10.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context13 = new com.alibaba.csp.sentinel.context.Context(defaultNode11, "test-context-");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.Context context14 = context2.setCurNode((com.alibaba.csp.sentinel.node.Node) defaultNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertNotNull(defaultNode11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) runtimeException0);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "exception predicate must not be null");
        double double6 = context5.getOriginBlockQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, context5);
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.alibaba.csp.sentinel.util.AssertUtil.notEmpty("SentinelBlockException", "java.lang.RuntimeException: SentinelBlockException");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        boolean boolean7 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        boolean boolean8 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.alibaba.csp.sentinel.context.Context context0 = null;
        boolean boolean1 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException");
        org.junit.Assert.assertNotNull(context1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.Entry entry7 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry7);
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException10 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException10, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode13 = null;
        com.alibaba.csp.sentinel.context.Context context15 = new com.alibaba.csp.sentinel.context.Context(defaultNode13, "");
        com.alibaba.csp.sentinel.node.Node node16 = context15.getCurNode();
        java.lang.String str17 = context15.getOrigin();
        com.alibaba.csp.sentinel.node.Node node18 = context15.getLastNode();
        java.lang.String str19 = context15.getName();
        boolean boolean20 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context15);
        double double21 = context15.getOriginPassReqQps();
        int int22 = context15.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException10, context15);
        errorEntryFreeException1.addSuppressed((java.lang.Throwable) errorEntryFreeException10);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException10, (int) (byte) 100);
        java.lang.String str27 = errorEntryFreeException10.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-" + "'", str27, "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.alibaba.csp.sentinel.util.AssertUtil.isTrue(true, "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException3 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        runtimeException0.addSuppressed((java.lang.Throwable) errorEntryFreeException3);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode6 = null;
        com.alibaba.csp.sentinel.context.Context context8 = new com.alibaba.csp.sentinel.context.Context(defaultNode6, "hi!");
        com.alibaba.csp.sentinel.node.Node node9 = context8.getCurNode();
        long long10 = context8.getOriginTotalRequest();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context8.getEntranceNode();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException3, (int) ' ', context8);
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(defaultNode11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "hi!");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        int int4 = context2.getOriginCurThreadNum();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) runtimeException0, (int) (byte) 0);
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        boolean boolean17 = com.alibaba.csp.sentinel.Tracer.shouldTrace((java.lang.Throwable) runtimeException0);
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        double double11 = context10.getOriginBlockQps();
        double double12 = context10.getOriginPassQps();
        com.alibaba.csp.sentinel.node.Node node13 = context10.getLastNode();
        java.lang.String str14 = context10.toString();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}" + "'", str14, "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.Entry entry7 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry7);
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException10 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException10, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode13 = null;
        com.alibaba.csp.sentinel.context.Context context15 = new com.alibaba.csp.sentinel.context.Context(defaultNode13, "");
        com.alibaba.csp.sentinel.node.Node node16 = context15.getCurNode();
        java.lang.String str17 = context15.getOrigin();
        com.alibaba.csp.sentinel.node.Node node18 = context15.getLastNode();
        java.lang.String str19 = context15.getName();
        boolean boolean20 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context15);
        double double21 = context15.getOriginPassReqQps();
        int int22 = context15.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException10, context15);
        errorEntryFreeException1.addSuppressed((java.lang.Throwable) errorEntryFreeException10);
        java.lang.Throwable[] throwableArray25 = errorEntryFreeException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context("trace or ignore classes must not be null", defaultNode1, false);
        com.alibaba.csp.sentinel.Entry entry4 = null;
        com.alibaba.csp.sentinel.context.Context context5 = context3.setCurEntry(entry4);
        double double6 = context3.getOriginBlockQps();
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.Node node8 = context2.getLastNode();
        long long9 = context2.getOriginBlockRequest();
        com.alibaba.csp.sentinel.node.Node node10 = context2.getOriginNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray7 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.context.Context context11 = com.alibaba.csp.sentinel.context.ContextUtil.enter("test", "hi!");
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, (int) '4', context11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(context11);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        java.lang.String str10 = context6.getName();
        boolean boolean11 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context6);
        double double12 = context6.getOriginPassReqQps();
        int int13 = context6.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context6);
        com.alibaba.csp.sentinel.context.Context context18 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}");
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, (int) (short) 1, context18);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(context18);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context2, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.Entry entry1 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) runtimeException0, entry1);
        java.lang.Throwable[] throwableArray3 = runtimeException0.getSuppressed();
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.Node node8 = context2.getLastNode();
        long long9 = context2.getOriginBlockRequest();
        com.alibaba.csp.sentinel.context.Context context12 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode13 = context12.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context15 = new com.alibaba.csp.sentinel.context.Context(defaultNode13, "test-context-");
        com.alibaba.csp.sentinel.context.Context context17 = new com.alibaba.csp.sentinel.context.Context(defaultNode13, "test-context-");
        com.alibaba.csp.sentinel.context.Context context19 = new com.alibaba.csp.sentinel.context.Context(defaultNode13, "SentinelBlockException: ");
        com.alibaba.csp.sentinel.context.Context context21 = new com.alibaba.csp.sentinel.context.Context(defaultNode13, "com.alibaba.csp.sentinel.ErrorEntryFreeException: com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.Context context22 = context2.setCurNode((com.alibaba.csp.sentinel.node.Node) defaultNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(context12);
        org.junit.Assert.assertNotNull(defaultNode13);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.util.AssertUtil.assertState(false, "SentinelBlockException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: SentinelBlockException: ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray2 = (java.lang.Class<? extends java.lang.Throwable>[]) classArray1;
        com.alibaba.csp.sentinel.Tracer.traceClasses = wildcardClassArray2;
        com.alibaba.csp.sentinel.Tracer.ignoreClasses = wildcardClassArray2;
        com.alibaba.csp.sentinel.Tracer.ignoreClasses = wildcardClassArray2;
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.alibaba.csp.sentinel.util.AssertUtil.notNull((java.lang.Object) "SentinelBlockException", "SentinelBlockException: ");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.util.AssertUtil.isTrue(false, "test-context-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: test-context-");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode6 = context2.getEntranceNode();
        boolean boolean7 = context2.isAsync();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(defaultNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.ContextUtil.enter("Context{name='', entranceNode=null, curEntry=null, origin='', async=false}", "com.alibaba.csp.sentinel.ErrorEntryFreeException: com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
        org.junit.Assert.assertNotNull(context2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.alibaba.csp.sentinel.util.AssertUtil.isTrue(true, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("hi!");
        com.alibaba.csp.sentinel.node.Node node2 = context1.getLastNode();
        double double3 = context1.getOriginAvgRt();
        com.alibaba.csp.sentinel.Entry entry4 = null;
        com.alibaba.csp.sentinel.context.Context context5 = context1.setCurEntry(entry4);
        double double6 = context1.getOriginAvgRt();
        org.junit.Assert.assertNotNull(context1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) runtimeException0, (int) (short) 100);
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) runtimeException0);
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.Entry entry1 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) runtimeException0, entry1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode10 = context6.getEntranceNode();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) ' ', context6);
        boolean boolean12 = com.alibaba.csp.sentinel.Tracer.shouldTrace((java.lang.Throwable) runtimeException0);
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(defaultNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode2 = null;
        com.alibaba.csp.sentinel.context.Context context4 = new com.alibaba.csp.sentinel.context.Context(defaultNode2, "");
        com.alibaba.csp.sentinel.node.Node node5 = context4.getCurNode();
        java.lang.String str6 = context4.getOrigin();
        com.alibaba.csp.sentinel.node.Node node7 = context4.getOriginNode();
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, (int) (byte) 0, context4);
        double double9 = context4.getOriginPassReqQps();
        double double10 = context4.getOriginTotalQps();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = context2.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "test-context-");
        com.alibaba.csp.sentinel.context.Context context7 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "test-context-");
        com.alibaba.csp.sentinel.context.Context context9 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "SentinelBlockException: ");
        com.alibaba.csp.sentinel.context.Context context11 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode3, "");
        com.alibaba.csp.sentinel.util.AssertUtil.notNull((java.lang.Object) "", "exception predicate must not be null");
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertNotNull(defaultNode3);
        org.junit.Assert.assertNotNull(context11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        java.lang.Throwable[] throwableArray2 = runtimeException0.getSuppressed();
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        double double9 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode10 = context2.getEntranceNode();
        com.alibaba.csp.sentinel.Entry entry11 = null;
        com.alibaba.csp.sentinel.context.Context context12 = context2.setCurEntry(entry11);
        double double13 = context2.getOriginPassQps();
        double double14 = context2.getOriginBlockQps();
        com.alibaba.csp.sentinel.node.Node node15 = context2.getCurNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(defaultNode10);
        org.junit.Assert.assertNotNull(context12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.alibaba.csp.sentinel.context.Context context3 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = context3.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "test-context-");
        com.alibaba.csp.sentinel.context.Context context8 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "test-context-");
        com.alibaba.csp.sentinel.context.Context context10 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "SentinelBlockException: ");
        com.alibaba.csp.sentinel.context.Context context12 = new com.alibaba.csp.sentinel.context.Context("java.lang.RuntimeException: SentinelBlockException", defaultNode4, true);
        com.alibaba.csp.sentinel.context.Context context14 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode4, "test-context-");
        com.alibaba.csp.sentinel.context.Context context16 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "exception predicate must not be null");
        org.junit.Assert.assertNotNull(context3);
        org.junit.Assert.assertNotNull(defaultNode4);
        org.junit.Assert.assertNotNull(context14);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.RuntimeException runtimeException0 = null;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        int int9 = context2.getOriginCurThreadNum();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("test-context-");
        double double2 = context1.getOriginPassReqQps();
        org.junit.Assert.assertNotNull(context1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        boolean boolean11 = context10.isAsync();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) runtimeException0, (int) '4');
        com.alibaba.csp.sentinel.util.AssertUtil.notNull((java.lang.Object) '4', "exception predicate must not be null");
        org.junit.Assert.assertNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        java.lang.String str10 = context6.getName();
        boolean boolean11 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context6);
        double double12 = context6.getOriginPassReqQps();
        int int13 = context6.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context6);
        boolean boolean15 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.alibaba.csp.sentinel.util.AssertUtil.assertNotBlank("com.alibaba.csp.sentinel.ErrorEntryFreeException: com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-", "test-context-");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.alibaba.csp.sentinel.util.AssertUtil.assertNotBlank("test-context-", "com.alibaba.csp.sentinel.ErrorEntryFreeException: com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        java.lang.String str10 = context6.getName();
        boolean boolean11 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context6);
        double double12 = context6.getOriginPassReqQps();
        int int13 = context6.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context6);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (short) 0);
        java.lang.String str17 = errorEntryFreeException1.toString();
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-" + "'", str17, "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context("trace or ignore classes must not be null", defaultNode1, false);
        com.alibaba.csp.sentinel.Entry entry4 = null;
        com.alibaba.csp.sentinel.context.Context context5 = context3.setCurEntry(entry4);
        java.lang.String str6 = context3.toString();
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Context{name='trace or ignore classes must not be null', entranceNode=null, curEntry=null, origin='', async=false}" + "'", str6, "Context{name='trace or ignore classes must not be null', entranceNode=null, curEntry=null, origin='', async=false}");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode2 = null;
        com.alibaba.csp.sentinel.context.Context context4 = new com.alibaba.csp.sentinel.context.Context(defaultNode2, "");
        com.alibaba.csp.sentinel.node.Node node5 = context4.getCurNode();
        java.lang.String str6 = context4.getOrigin();
        com.alibaba.csp.sentinel.node.Node node7 = context4.getOriginNode();
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, (int) (byte) 0, context4);
        com.alibaba.csp.sentinel.Entry entry9 = context4.getCurEntry();
        boolean boolean10 = context4.isAsync();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        long long7 = context2.getOriginBlockRequest();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        boolean boolean9 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context2);
        java.lang.String str10 = context2.toString();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}" + "'", str10, "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        double double9 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode10 = context2.getEntranceNode();
        com.alibaba.csp.sentinel.Entry entry11 = null;
        com.alibaba.csp.sentinel.context.Context context12 = context2.setCurEntry(entry11);
        java.lang.String str13 = context2.getOrigin();
        java.lang.String str14 = context2.getOrigin();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(defaultNode10);
        org.junit.Assert.assertNotNull(context12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        boolean boolean14 = com.alibaba.csp.sentinel.Tracer.shouldTrace((java.lang.Throwable) runtimeException0);
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        org.junit.Assert.assertNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "hi!");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        long long4 = context2.getOriginTotalRequest();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode5 = context2.getEntranceNode();
        long long6 = context2.getOriginBlockRequest();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(defaultNode5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) runtimeException0);
        org.junit.Assert.assertNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.alibaba.csp.sentinel.context.Context context4 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode5 = context4.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context7 = new com.alibaba.csp.sentinel.context.Context(defaultNode5, "test-context-");
        com.alibaba.csp.sentinel.context.Context context9 = new com.alibaba.csp.sentinel.context.Context(defaultNode5, "test-context-");
        com.alibaba.csp.sentinel.context.Context context11 = new com.alibaba.csp.sentinel.context.Context(defaultNode5, "SentinelBlockException: ");
        com.alibaba.csp.sentinel.context.Context context13 = new com.alibaba.csp.sentinel.context.Context("java.lang.RuntimeException: SentinelBlockException", defaultNode5, true);
        com.alibaba.csp.sentinel.context.Context context15 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode5, "test-context-");
        com.alibaba.csp.sentinel.context.Context context17 = new com.alibaba.csp.sentinel.context.Context("Context{name='trace or ignore classes must not be null', entranceNode=null, curEntry=null, origin='', async=false}", defaultNode5, false);
        org.junit.Assert.assertNotNull(context4);
        org.junit.Assert.assertNotNull(defaultNode5);
        org.junit.Assert.assertNotNull(context15);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.alibaba.csp.sentinel.util.AssertUtil.assertState(true, "Context{name='trace or ignore classes must not be null', entranceNode=null, curEntry=null, origin='', async=false}");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        java.lang.String str11 = context2.toString();
        double double12 = context2.getOriginAvgRt();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}" + "'", str11, "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        java.lang.String str10 = context6.getName();
        boolean boolean11 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context6);
        double double12 = context6.getOriginPassReqQps();
        int int13 = context6.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context6);
        java.lang.String str15 = context6.getOrigin();
        java.lang.String str16 = context6.toString();
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}" + "'", str16, "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.Entry entry7 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry7);
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException10 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException10, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode13 = null;
        com.alibaba.csp.sentinel.context.Context context15 = new com.alibaba.csp.sentinel.context.Context(defaultNode13, "");
        com.alibaba.csp.sentinel.node.Node node16 = context15.getCurNode();
        java.lang.String str17 = context15.getOrigin();
        com.alibaba.csp.sentinel.node.Node node18 = context15.getLastNode();
        java.lang.String str19 = context15.getName();
        boolean boolean20 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context15);
        double double21 = context15.getOriginPassReqQps();
        int int22 = context15.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException10, context15);
        errorEntryFreeException1.addSuppressed((java.lang.Throwable) errorEntryFreeException10);
        com.alibaba.csp.sentinel.Entry entry25 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode2 = null;
        com.alibaba.csp.sentinel.context.Context context4 = new com.alibaba.csp.sentinel.context.Context(defaultNode2, "");
        com.alibaba.csp.sentinel.node.Node node5 = context4.getCurNode();
        java.lang.String str6 = context4.getOrigin();
        com.alibaba.csp.sentinel.node.Node node7 = context4.getOriginNode();
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, (int) (byte) 0, context4);
        long long9 = context4.getOriginBlockRequest();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.Entry entry7 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry7);
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException10 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException10, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode13 = null;
        com.alibaba.csp.sentinel.context.Context context15 = new com.alibaba.csp.sentinel.context.Context(defaultNode13, "");
        com.alibaba.csp.sentinel.node.Node node16 = context15.getCurNode();
        java.lang.String str17 = context15.getOrigin();
        com.alibaba.csp.sentinel.node.Node node18 = context15.getLastNode();
        java.lang.String str19 = context15.getName();
        boolean boolean20 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context15);
        double double21 = context15.getOriginPassReqQps();
        int int22 = context15.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException10, context15);
        errorEntryFreeException1.addSuppressed((java.lang.Throwable) errorEntryFreeException10);
        boolean boolean25 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = runtimeException0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(runtimeException0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context("trace or ignore classes must not be null", defaultNode1, false);
        com.alibaba.csp.sentinel.Entry entry4 = null;
        com.alibaba.csp.sentinel.context.Context context5 = context3.setCurEntry(entry4);
        java.lang.String str6 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode7 = context5.getEntranceNode();
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(defaultNode7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context(defaultNode1, "");
        com.alibaba.csp.sentinel.node.Node node4 = context3.getCurNode();
        java.lang.String str5 = context3.getOrigin();
        com.alibaba.csp.sentinel.node.Node node6 = context3.getLastNode();
        java.lang.String str7 = context3.getName();
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, context3);
        long long9 = context3.getOriginBlockRequest();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.alibaba.csp.sentinel.util.function.Predicate<? extends java.lang.Throwable> wildcardPredicate0 = com.alibaba.csp.sentinel.Tracer.getExceptionPredicate();
        org.junit.Assert.assertNull(wildcardPredicate0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "hi!");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        long long4 = context2.getOriginTotalRequest();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode5 = context2.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context8 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode9 = context8.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context11 = new com.alibaba.csp.sentinel.context.Context(defaultNode9, "test-context-");
        com.alibaba.csp.sentinel.context.Context context13 = new com.alibaba.csp.sentinel.context.Context(defaultNode9, "test-context-");
        com.alibaba.csp.sentinel.context.Context context15 = new com.alibaba.csp.sentinel.context.Context(defaultNode9, "SentinelBlockException: ");
        com.alibaba.csp.sentinel.context.Context context17 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode9, "");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.Context context18 = context2.setCurNode((com.alibaba.csp.sentinel.node.Node) defaultNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(defaultNode5);
        org.junit.Assert.assertNotNull(context8);
        org.junit.Assert.assertNotNull(defaultNode9);
        org.junit.Assert.assertNotNull(context17);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.Entry entry14 = null;
        com.alibaba.csp.sentinel.context.Context context15 = context5.setCurEntry(entry14);
        com.alibaba.csp.sentinel.node.Node node16 = context5.getLastNode();
        org.junit.Assert.assertNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(context15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context("trace or ignore classes must not be null", defaultNode1, false);
        com.alibaba.csp.sentinel.Entry entry4 = null;
        com.alibaba.csp.sentinel.context.Context context5 = context3.setCurEntry(entry4);
        java.lang.String str6 = context5.getOrigin();
        double double7 = context5.getOriginBlockQps();
        double double8 = context5.getOriginTotalQps();
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        long long7 = context2.getOriginBlockRequest();
        double double8 = context2.getOriginPassReqQps();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray0 = com.alibaba.csp.sentinel.Tracer.getExceptionsToIgnore();
        com.alibaba.csp.sentinel.Tracer.setExceptionsToIgnore(wildcardClassArray0);
        org.junit.Assert.assertNotNull(wildcardClassArray0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray0 = com.alibaba.csp.sentinel.Tracer.ignoreClasses;
        com.alibaba.csp.sentinel.Tracer.setExceptionsToTrace(wildcardClassArray0);
        com.alibaba.csp.sentinel.Tracer.setExceptionsToTrace(wildcardClassArray0);
        org.junit.Assert.assertNotNull(wildcardClassArray0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.alibaba.csp.sentinel.util.AssertUtil.notEmpty("trace or ignore classes must not be null", "exception predicate must not be null");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        com.alibaba.csp.sentinel.Entry entry8 = null;
        com.alibaba.csp.sentinel.context.Context context9 = context2.setCurEntry(entry8);
        int int10 = context9.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Entry entry11 = context9.getCurEntry();
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context9, runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(context9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("hi!");
        java.lang.String str2 = context1.toString();
        long long3 = context1.getOriginBlockRequest();
        org.junit.Assert.assertNotNull(context1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.alibaba.csp.sentinel.context.Context context3 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = context3.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context("hi!", defaultNode4, true);
        com.alibaba.csp.sentinel.context.Context context8 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode4, "");
        org.junit.Assert.assertNotNull(context3);
        org.junit.Assert.assertNotNull(defaultNode4);
        org.junit.Assert.assertNotNull(context8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context("trace or ignore classes must not be null", defaultNode1, false);
        com.alibaba.csp.sentinel.node.Node node4 = context3.getLastNode();
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        double double11 = context10.getOriginBlockQps();
        com.alibaba.csp.sentinel.node.Node node12 = context10.getOriginNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.ContextUtil.enter("test", "hi!");
        int int3 = context2.getOriginCurThreadNum();
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        long long7 = context2.getOriginBlockRequest();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        boolean boolean9 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context2);
        com.alibaba.csp.sentinel.context.Context context11 = context2.setOrigin("hi!");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(context11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) runtimeException0);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context("test", defaultNode4, true);
        com.alibaba.csp.sentinel.context.Context context8 = context6.setOrigin("java.lang.RuntimeException: SentinelBlockException");
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (byte) 100, context6);
        org.junit.Assert.assertNull(runtimeException0);
        org.junit.Assert.assertNotNull(context8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("");
        org.junit.Assert.assertNotNull(context1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.util.AssertUtil.assertNotBlank("", "java.lang.RuntimeException: SentinelBlockException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.lang.RuntimeException: SentinelBlockException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.Node node8 = context2.getLastNode();
        long long9 = context2.getOriginBlockRequest();
        com.alibaba.csp.sentinel.Entry entry10 = context2.getCurEntry();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getOriginNode();
        com.alibaba.csp.sentinel.node.Node node6 = context2.getLastNode();
        boolean boolean7 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.context.Context context15 = context5.setOrigin("SentinelBlockException: ");
        com.alibaba.csp.sentinel.context.Context context18 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode19 = context18.getEntranceNode();
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.Context context20 = context5.setCurNode((com.alibaba.csp.sentinel.node.Node) defaultNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(context15);
        org.junit.Assert.assertNotNull(context18);
        org.junit.Assert.assertNotNull(defaultNode19);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = context2.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "test-context-");
        com.alibaba.csp.sentinel.context.Context context7 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode3, "Context{name='trace or ignore classes must not be null', entranceNode=null, curEntry=null, origin='', async=false}");
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertNotNull(defaultNode3);
        org.junit.Assert.assertNotNull(context7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.Entry entry14 = null;
        com.alibaba.csp.sentinel.context.Context context15 = context5.setCurEntry(entry14);
        java.lang.Runnable runnable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context15, runnable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(context15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "trace or ignore classes must not be null");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getLastNode();
        int int4 = context2.getOriginCurThreadNum();
        double double5 = context2.getOriginBlockQps();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.Entry entry1 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry(throwable0, entry1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        boolean boolean4 = com.alibaba.csp.sentinel.Tracer.shouldTrace((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException6 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
        errorEntryFreeException1.addSuppressed((java.lang.Throwable) errorEntryFreeException6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.context.Context context15 = context5.setOrigin("SentinelBlockException: ");
        com.alibaba.csp.sentinel.Entry entry16 = null;
        com.alibaba.csp.sentinel.context.Context context17 = context5.setCurEntry(entry16);
        com.alibaba.csp.sentinel.node.Node node18 = context17.getOriginNode();
        org.junit.Assert.assertNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(context15);
        org.junit.Assert.assertNotNull(context17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        double double11 = context10.getOriginBlockQps();
        double double12 = context10.getOriginPassQps();
        com.alibaba.csp.sentinel.context.Context context15 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode16 = context15.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context18 = new com.alibaba.csp.sentinel.context.Context(defaultNode16, "test-context-");
        com.alibaba.csp.sentinel.context.Context context20 = new com.alibaba.csp.sentinel.context.Context(defaultNode16, "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
        com.alibaba.csp.sentinel.context.Context context22 = new com.alibaba.csp.sentinel.context.Context(defaultNode16, "SentinelBlockException: ");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.Context context23 = context10.setCurNode((com.alibaba.csp.sentinel.node.Node) defaultNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(context15);
        org.junit.Assert.assertNotNull(defaultNode16);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context("trace or ignore classes must not be null", defaultNode1, false);
        com.alibaba.csp.sentinel.Entry entry4 = null;
        com.alibaba.csp.sentinel.context.Context context5 = context3.setCurEntry(entry4);
        double double6 = context3.getOriginAvgRt();
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        java.lang.String str10 = context6.getName();
        boolean boolean11 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context6);
        double double12 = context6.getOriginPassReqQps();
        int int13 = context6.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context6);
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = errorEntryFreeException1;
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        double double9 = context2.getOriginPassReqQps();
        long long10 = context2.getOriginBlockRequest();
        double double11 = context2.getOriginTotalQps();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "exception predicate must not be null");
        java.lang.String str3 = context2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Context{name='exception predicate must not be null', entranceNode=null, curEntry=null, origin='', async=false}" + "'", str3, "Context{name='exception predicate must not be null', entranceNode=null, curEntry=null, origin='', async=false}");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        long long7 = context2.getOriginBlockRequest();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        boolean boolean9 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context2);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode10 = context2.getEntranceNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(defaultNode10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray7 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = null;
        com.alibaba.csp.sentinel.context.Context context10 = new com.alibaba.csp.sentinel.context.Context(defaultNode8, "exception predicate must not be null");
        double double11 = context10.getOriginBlockQps();
        boolean boolean12 = context10.isAsync();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context10);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode14 = null;
        com.alibaba.csp.sentinel.context.Context context16 = new com.alibaba.csp.sentinel.context.Context(defaultNode14, "");
        com.alibaba.csp.sentinel.node.Node node17 = context16.getCurNode();
        java.lang.String str18 = context16.getOrigin();
        com.alibaba.csp.sentinel.node.Node node19 = context16.getCurNode();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context16);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.Entry entry7 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry7);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginAvgRt();
        java.lang.String str9 = context2.toString();
        double double10 = context2.getOriginTotalQps();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}" + "'", str9, "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode2 = null;
        com.alibaba.csp.sentinel.context.Context context4 = new com.alibaba.csp.sentinel.context.Context(defaultNode2, "");
        com.alibaba.csp.sentinel.node.Node node5 = context4.getCurNode();
        java.lang.String str6 = context4.getOrigin();
        com.alibaba.csp.sentinel.node.Node node7 = context4.getOriginNode();
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, (int) (byte) 0, context4);
        double double9 = context4.getOriginPassReqQps();
        double double10 = context4.getOriginPassReqQps();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray2 = (java.lang.Class<? extends java.lang.Throwable>[]) classArray1;
        com.alibaba.csp.sentinel.Tracer.traceClasses = wildcardClassArray2;
        com.alibaba.csp.sentinel.Tracer.setExceptionsToTrace(wildcardClassArray2);
        com.alibaba.csp.sentinel.Tracer.setExceptionsToIgnore(wildcardClassArray2);
        com.alibaba.csp.sentinel.Tracer.traceClasses = wildcardClassArray2;
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "exception predicate must not be null");
        boolean boolean3 = context2.isAsync();
        double double4 = context2.getOriginAvgRt();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        boolean boolean4 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.context.Context context15 = context5.setOrigin("SentinelBlockException: ");
        long long16 = context15.getOriginTotalRequest();
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(context15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException3 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        runtimeException0.addSuppressed((java.lang.Throwable) errorEntryFreeException3);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode6 = null;
        com.alibaba.csp.sentinel.context.Context context8 = new com.alibaba.csp.sentinel.context.Context(defaultNode6, "");
        com.alibaba.csp.sentinel.node.Node node9 = context8.getCurNode();
        java.lang.String str10 = context8.getOrigin();
        com.alibaba.csp.sentinel.node.Node node11 = context8.getLastNode();
        java.lang.String str12 = context8.getName();
        java.lang.String str13 = context8.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode14 = context8.getEntranceNode();
        double double15 = context8.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, 10, context8);
        java.lang.Throwable[] throwableArray17 = runtimeException0.getSuppressed();
        boolean boolean18 = com.alibaba.csp.sentinel.Tracer.shouldTrace((java.lang.Throwable) runtimeException0);
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(defaultNode14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.alibaba.csp.sentinel.context.Context context3 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = context3.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "test-context-");
        com.alibaba.csp.sentinel.context.Context context8 = new com.alibaba.csp.sentinel.context.Context("Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}", defaultNode4, true);
        org.junit.Assert.assertNotNull(context3);
        org.junit.Assert.assertNotNull(defaultNode4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.lang.StackTraceElement[] stackTraceElementArray0 = new java.lang.StackTraceElement[] {};
        com.alibaba.csp.sentinel.slots.block.BlockException.sentinelStackTrace = stackTraceElementArray0;
        org.junit.Assert.assertNotNull(stackTraceElementArray0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context(defaultNode1, "");
        com.alibaba.csp.sentinel.node.Node node4 = context3.getCurNode();
        java.lang.String str5 = context3.getOrigin();
        com.alibaba.csp.sentinel.node.Node node6 = context3.getLastNode();
        java.lang.String str7 = context3.getName();
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, context3);
        com.alibaba.csp.sentinel.Entry entry9 = null;
        com.alibaba.csp.sentinel.context.Context context10 = context3.setCurEntry(entry9);
        double double11 = context3.getOriginBlockQps();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        double double11 = context10.getOriginBlockQps();
        double double12 = context10.getOriginPassQps();
        int int13 = context10.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.context.Context context15 = context10.setOrigin("com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(context15);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.util.AssertUtil.notEmpty("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray0 = null;
        com.alibaba.csp.sentinel.Tracer.ignoreClasses = wildcardClassArray0;
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context(defaultNode1, "");
        com.alibaba.csp.sentinel.node.Node node4 = context3.getCurNode();
        java.lang.String str5 = context3.getOrigin();
        com.alibaba.csp.sentinel.node.Node node6 = context3.getLastNode();
        java.lang.String str7 = context3.getName();
        java.lang.String str8 = context3.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode9 = context3.getEntranceNode();
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, context3);
        double double11 = context3.getOriginAvgRt();
        boolean boolean12 = context3.isAsync();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(defaultNode9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.Node node8 = context2.getLastNode();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode9 = context2.getEntranceNode();
        int int10 = context2.getOriginCurThreadNum();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(defaultNode9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        java.lang.String str10 = context6.getName();
        boolean boolean11 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context6);
        double double12 = context6.getOriginPassReqQps();
        int int13 = context6.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context6);
        java.lang.String str15 = context6.getOrigin();
        boolean boolean16 = context6.isAsync();
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.Entry entry7 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry7);
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException10 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException10, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode13 = null;
        com.alibaba.csp.sentinel.context.Context context15 = new com.alibaba.csp.sentinel.context.Context(defaultNode13, "");
        com.alibaba.csp.sentinel.node.Node node16 = context15.getCurNode();
        java.lang.String str17 = context15.getOrigin();
        com.alibaba.csp.sentinel.node.Node node18 = context15.getLastNode();
        java.lang.String str19 = context15.getName();
        boolean boolean20 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context15);
        double double21 = context15.getOriginPassReqQps();
        int int22 = context15.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException10, context15);
        errorEntryFreeException1.addSuppressed((java.lang.Throwable) errorEntryFreeException10);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode25 = null;
        com.alibaba.csp.sentinel.context.Context context27 = new com.alibaba.csp.sentinel.context.Context(defaultNode25, "exception predicate must not be null");
        double double28 = context27.getOriginBlockQps();
        boolean boolean29 = context27.isAsync();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException10, context27);
        com.alibaba.csp.sentinel.context.Context context32 = null;
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException10, 100, context32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode6 = context2.getEntranceNode();
        double double7 = context2.getOriginBlockQps();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(defaultNode6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.alibaba.csp.sentinel.util.AssertUtil.assertNotBlank("test", "");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        java.lang.String str10 = context6.getName();
        boolean boolean11 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context6);
        double double12 = context6.getOriginPassReqQps();
        int int13 = context6.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context6);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (short) 0);
        boolean boolean17 = com.alibaba.csp.sentinel.Tracer.shouldTrace((java.lang.Throwable) errorEntryFreeException1);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        double double9 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode10 = context2.getEntranceNode();
        com.alibaba.csp.sentinel.Entry entry11 = null;
        com.alibaba.csp.sentinel.context.Context context12 = context2.setCurEntry(entry11);
        double double13 = context2.getOriginPassQps();
        double double14 = context2.getOriginBlockQps();
        com.alibaba.csp.sentinel.util.AssertUtil.notNull((java.lang.Object) double14, "java.lang.RuntimeException: SentinelBlockException");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(defaultNode10);
        org.junit.Assert.assertNotNull(context12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode2 = null;
        com.alibaba.csp.sentinel.context.Context context4 = new com.alibaba.csp.sentinel.context.Context(defaultNode2, "");
        com.alibaba.csp.sentinel.node.Node node5 = context4.getCurNode();
        java.lang.String str6 = context4.getOrigin();
        com.alibaba.csp.sentinel.node.Node node7 = context4.getOriginNode();
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, (int) (byte) 0, context4);
        double double9 = context4.getOriginPassReqQps();
        com.alibaba.csp.sentinel.node.Node node10 = context4.getOriginNode();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context4, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        double double9 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode10 = context2.getEntranceNode();
        com.alibaba.csp.sentinel.Entry entry11 = null;
        com.alibaba.csp.sentinel.context.Context context12 = context2.setCurEntry(entry11);
        double double13 = context2.getOriginPassQps();
        java.lang.Class<?> wildcardClass14 = context2.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(defaultNode10);
        org.junit.Assert.assertNotNull(context12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = errorEntryFreeException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.context.Context context3 = com.alibaba.csp.sentinel.context.ContextUtil.enter("hi!");
        com.alibaba.csp.sentinel.node.Node node4 = context3.getLastNode();
        double double5 = context3.getOriginAvgRt();
        com.alibaba.csp.sentinel.Entry entry6 = null;
        com.alibaba.csp.sentinel.context.Context context7 = context3.setCurEntry(entry6);
        com.alibaba.csp.sentinel.Entry entry8 = null;
        com.alibaba.csp.sentinel.context.Context context9 = context3.setCurEntry(entry8);
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, (int) (short) 0, context9);
        org.junit.Assert.assertNotNull(context3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(context7);
        org.junit.Assert.assertNotNull(context9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context("test", defaultNode1, true);
        com.alibaba.csp.sentinel.context.Context context5 = context3.setOrigin("java.lang.RuntimeException: SentinelBlockException");
        boolean boolean6 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context5);
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) runtimeException0, (int) (byte) 0);
        com.alibaba.csp.sentinel.context.Context context19 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode20 = context19.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context22 = new com.alibaba.csp.sentinel.context.Context("hi!", defaultNode20, true);
        double double23 = context22.getOriginBlockQps();
        com.alibaba.csp.sentinel.node.Node node24 = context22.getCurNode();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, context22);
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(context19);
        org.junit.Assert.assertNotNull(defaultNode20);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.alibaba.csp.sentinel.util.AssertUtil.assertNotBlank("hi!", "exception predicate must not be null");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.alibaba.csp.sentinel.context.Context context4 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode5 = context4.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context7 = new com.alibaba.csp.sentinel.context.Context(defaultNode5, "test-context-");
        com.alibaba.csp.sentinel.context.Context context9 = new com.alibaba.csp.sentinel.context.Context(defaultNode5, "test-context-");
        com.alibaba.csp.sentinel.context.Context context11 = new com.alibaba.csp.sentinel.context.Context(defaultNode5, "SentinelBlockException: ");
        com.alibaba.csp.sentinel.context.Context context13 = new com.alibaba.csp.sentinel.context.Context("java.lang.RuntimeException: SentinelBlockException", defaultNode5, true);
        com.alibaba.csp.sentinel.context.Context context15 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode5, "test-context-");
        com.alibaba.csp.sentinel.context.Context context17 = new com.alibaba.csp.sentinel.context.Context("java.lang.RuntimeException: SentinelBlockException", defaultNode5, true);
        org.junit.Assert.assertNotNull(context4);
        org.junit.Assert.assertNotNull(defaultNode5);
        org.junit.Assert.assertNotNull(context15);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("hi!");
        java.lang.String str2 = context1.toString();
        java.lang.String str3 = context1.getOrigin();
        org.junit.Assert.assertNotNull(context1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        long long7 = context2.getOriginBlockRequest();
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context2, runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        boolean boolean7 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = errorEntryFreeException1;
        java.lang.String str9 = errorEntryFreeException1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-" + "'", str9, "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        boolean boolean7 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context2);
        com.alibaba.csp.sentinel.node.Node node8 = context2.getOriginNode();
        com.alibaba.csp.sentinel.node.Node node9 = context2.getLastNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.alibaba.csp.sentinel.context.Context context3 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = context3.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context("hi!", defaultNode4, true);
        boolean boolean7 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context6);
        org.junit.Assert.assertNotNull(context3);
        org.junit.Assert.assertNotNull(defaultNode4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.alibaba.csp.sentinel.util.AssertUtil.notEmpty("Context{name='', entranceNode=null, curEntry=null, origin='', async=false}", "Context{name='exception predicate must not be null', entranceNode=null, curEntry=null, origin='', async=false}");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        java.lang.String str10 = context6.getName();
        boolean boolean11 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context6);
        double double12 = context6.getOriginPassReqQps();
        int int13 = context6.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context6);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (short) 0);
        java.lang.Throwable[] throwableArray17 = errorEntryFreeException1.getSuppressed();
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = context2.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "test-context-");
        com.alibaba.csp.sentinel.context.Context context7 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "test-context-");
        com.alibaba.csp.sentinel.context.Context context9 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "SentinelBlockException: ");
        com.alibaba.csp.sentinel.context.Context context11 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode3, "");
        com.alibaba.csp.sentinel.context.Context context13 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "SentinelBlockException: ");
        com.alibaba.csp.sentinel.context.Context context15 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "Context{name='exception predicate must not be null', entranceNode=null, curEntry=null, origin='', async=false}");
        double double16 = context15.getOriginAvgRt();
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertNotNull(defaultNode3);
        org.junit.Assert.assertNotNull(context11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray2 = (java.lang.Class<? extends java.lang.Throwable>[]) classArray1;
        com.alibaba.csp.sentinel.Tracer.traceClasses = wildcardClassArray2;
        com.alibaba.csp.sentinel.Tracer.setExceptionsToTrace(wildcardClassArray2);
        com.alibaba.csp.sentinel.Tracer.traceClasses = wildcardClassArray2;
        com.alibaba.csp.sentinel.Tracer.ignoreClasses = wildcardClassArray2;
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.alibaba.csp.sentinel.util.AssertUtil.assertState(true, "exception predicate must not be null");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getOriginNode();
        long long6 = context2.getOriginTotalRequest();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context10, runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Entry entry2 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry2);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        java.lang.String str10 = context6.getName();
        java.lang.String str11 = context6.getName();
        com.alibaba.csp.sentinel.node.Node node12 = context6.getLastNode();
        boolean boolean13 = context6.isAsync();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context6);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) ' ');
        java.lang.String str17 = errorEntryFreeException1.toString();
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-" + "'", str17, "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException3 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        runtimeException0.addSuppressed((java.lang.Throwable) errorEntryFreeException3);
        boolean boolean5 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException3);
        java.lang.String str6 = errorEntryFreeException3.toString();
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-" + "'", str6, "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Entry entry2 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry2);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        java.lang.String str10 = context6.getName();
        java.lang.String str11 = context6.getName();
        com.alibaba.csp.sentinel.node.Node node12 = context6.getLastNode();
        boolean boolean13 = context6.isAsync();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context6);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) ' ');
        java.lang.RuntimeException runtimeException17 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException17;
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException20 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        runtimeException17.addSuppressed((java.lang.Throwable) errorEntryFreeException20);
        errorEntryFreeException1.addSuppressed((java.lang.Throwable) runtimeException17);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(runtimeException17);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "hi!");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        long long4 = context2.getOriginTotalRequest();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode5 = context2.getEntranceNode();
        com.alibaba.csp.sentinel.node.Node node6 = context2.getCurNode();
        java.lang.String str7 = context2.getOrigin();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(defaultNode5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.alibaba.csp.sentinel.util.AssertUtil.notEmpty("SentinelBlockException: ", "java.lang.RuntimeException: SentinelBlockException");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        boolean boolean5 = context2.isAsync();
        double double6 = context2.getOriginTotalQps();
        com.alibaba.csp.sentinel.node.Node node7 = context2.getLastNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("hi!");
        double double11 = context10.getOriginBlockQps();
        double double12 = context10.getOriginPassQps();
        boolean boolean13 = context10.isAsync();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.Entry entry7 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry7);
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException10 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException10, (int) (byte) 1);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode13 = null;
        com.alibaba.csp.sentinel.context.Context context15 = new com.alibaba.csp.sentinel.context.Context(defaultNode13, "");
        com.alibaba.csp.sentinel.node.Node node16 = context15.getCurNode();
        java.lang.String str17 = context15.getOrigin();
        com.alibaba.csp.sentinel.node.Node node18 = context15.getLastNode();
        java.lang.String str19 = context15.getName();
        boolean boolean20 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context15);
        double double21 = context15.getOriginPassReqQps();
        int int22 = context15.getOriginCurThreadNum();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException10, context15);
        errorEntryFreeException1.addSuppressed((java.lang.Throwable) errorEntryFreeException10);
        java.lang.String str25 = errorEntryFreeException10.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-" + "'", str25, "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "hi!");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        long long4 = context2.getOriginTotalRequest();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode5 = context2.getEntranceNode();
        com.alibaba.csp.sentinel.node.Node node6 = context2.getCurNode();
        boolean boolean7 = context2.isAsync();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(defaultNode5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.alibaba.csp.sentinel.context.Context context3 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = context3.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context("hi!", defaultNode4, true);
        boolean boolean7 = context6.isAsync();
        com.alibaba.csp.sentinel.Entry entry8 = context6.getCurEntry();
        org.junit.Assert.assertNotNull(context3);
        org.junit.Assert.assertNotNull(defaultNode4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.ContextUtil.enter("test", "hi!");
        java.lang.String str3 = context2.toString();
        long long4 = context2.getOriginTotalRequest();
        com.alibaba.csp.sentinel.Entry entry5 = context2.getCurEntry();
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(entry5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException3 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        runtimeException0.addSuppressed((java.lang.Throwable) errorEntryFreeException3);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode6 = null;
        com.alibaba.csp.sentinel.context.Context context8 = new com.alibaba.csp.sentinel.context.Context(defaultNode6, "");
        com.alibaba.csp.sentinel.node.Node node9 = context8.getCurNode();
        java.lang.String str10 = context8.getOrigin();
        com.alibaba.csp.sentinel.node.Node node11 = context8.getLastNode();
        java.lang.String str12 = context8.getName();
        java.lang.String str13 = context8.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode14 = context8.getEntranceNode();
        double double15 = context8.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, 10, context8);
        java.lang.Throwable[] throwableArray17 = runtimeException0.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) runtimeException0, (int) (short) -1);
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(defaultNode14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        org.junit.Assert.assertNotNull(context1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.ContextUtil.enter("exception predicate must not be null", "test");
        java.lang.String str3 = context2.getOrigin();
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.util.AssertUtil.isTrue(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.alibaba.csp.sentinel.context.Context context3 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = context3.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "test-context-");
        com.alibaba.csp.sentinel.context.Context context8 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "test-context-");
        com.alibaba.csp.sentinel.context.Context context10 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "SentinelBlockException: ");
        com.alibaba.csp.sentinel.context.Context context12 = new com.alibaba.csp.sentinel.context.Context("java.lang.RuntimeException: SentinelBlockException", defaultNode4, true);
        com.alibaba.csp.sentinel.context.Context context14 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode4, "test-context-");
        com.alibaba.csp.sentinel.context.Context context16 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode4, "SentinelBlockException");
        org.junit.Assert.assertNotNull(context3);
        org.junit.Assert.assertNotNull(defaultNode4);
        org.junit.Assert.assertNotNull(context14);
        org.junit.Assert.assertNotNull(context16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        boolean boolean7 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        double double9 = context2.getOriginPassReqQps();
        boolean boolean10 = context2.isAsync();
        double double11 = context2.getOriginPassQps();
        com.alibaba.csp.sentinel.context.Context context13 = context2.setOrigin("Context{name='exception predicate must not be null', entranceNode=null, curEntry=null, origin='', async=false}");
        double double14 = context13.getOriginTotalQps();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(context13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Entry entry2 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry2);
        boolean boolean4 = com.alibaba.csp.sentinel.Tracer.shouldTrace((java.lang.Throwable) errorEntryFreeException1);
        java.lang.String str5 = errorEntryFreeException1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-" + "'", str5, "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.context.Context context15 = context5.setOrigin("SentinelBlockException: ");
        com.alibaba.csp.sentinel.Entry entry16 = null;
        com.alibaba.csp.sentinel.context.Context context17 = context5.setCurEntry(entry16);
        long long18 = context17.getOriginBlockRequest();
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(context15);
        org.junit.Assert.assertNotNull(context17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        boolean boolean4 = com.alibaba.csp.sentinel.Tracer.shouldTrace((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.Entry entry5 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry5);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = null;
        com.alibaba.csp.sentinel.context.Context context10 = new com.alibaba.csp.sentinel.context.Context(defaultNode8, "");
        com.alibaba.csp.sentinel.node.Node node11 = context10.getCurNode();
        java.lang.String str12 = context10.getOrigin();
        com.alibaba.csp.sentinel.node.Node node13 = context10.getLastNode();
        java.lang.String str14 = context10.getName();
        java.lang.String str15 = context10.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode16 = context10.getEntranceNode();
        double double17 = context10.getOriginPassReqQps();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode18 = context10.getEntranceNode();
        com.alibaba.csp.sentinel.Entry entry19 = null;
        com.alibaba.csp.sentinel.context.Context context20 = context10.setCurEntry(entry19);
        double double21 = context10.getOriginPassQps();
        com.alibaba.csp.sentinel.node.Node node22 = context10.getOriginNode();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, (int) (short) 0, context10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(defaultNode16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(defaultNode18);
        org.junit.Assert.assertNotNull(context20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = null;
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "");
        com.alibaba.csp.sentinel.node.Node node6 = context5.getCurNode();
        java.lang.String str7 = context5.getOrigin();
        com.alibaba.csp.sentinel.node.Node node8 = context5.getLastNode();
        java.lang.String str9 = context5.getName();
        java.lang.String str10 = context5.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode11 = context5.getEntranceNode();
        double double12 = context5.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, (int) (short) 10, context5);
        com.alibaba.csp.sentinel.Entry entry14 = null;
        com.alibaba.csp.sentinel.context.Context context15 = context5.setCurEntry(entry14);
        java.lang.String str16 = context5.toString();
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(defaultNode11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(context15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}" + "'", str16, "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException3 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        runtimeException0.addSuppressed((java.lang.Throwable) errorEntryFreeException3);
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = errorEntryFreeException3;
        org.junit.Assert.assertNotNull(runtimeException0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.Entry entry8 = context2.getCurEntry();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.Entry entry7 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry7);
        java.lang.String str9 = errorEntryFreeException1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-" + "'", str9, "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Entry entry6 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry6);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = null;
        com.alibaba.csp.sentinel.context.Context context10 = new com.alibaba.csp.sentinel.context.Context(defaultNode8, "");
        com.alibaba.csp.sentinel.node.Node node11 = context10.getCurNode();
        java.lang.String str12 = context10.getOrigin();
        com.alibaba.csp.sentinel.node.Node node13 = context10.getLastNode();
        java.lang.String str14 = context10.getName();
        java.lang.String str15 = context10.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode16 = context10.getEntranceNode();
        double double17 = context10.getOriginPassReqQps();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode18 = context10.getEntranceNode();
        com.alibaba.csp.sentinel.Entry entry19 = null;
        com.alibaba.csp.sentinel.context.Context context20 = context10.setCurEntry(entry19);
        double double21 = context10.getOriginPassQps();
        double double22 = context10.getOriginBlockQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context10);
        java.lang.String str24 = context10.getOrigin();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(defaultNode16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(defaultNode18);
        org.junit.Assert.assertNotNull(context20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context("trace or ignore classes must not be null", defaultNode1, false);
        com.alibaba.csp.sentinel.Entry entry4 = null;
        com.alibaba.csp.sentinel.context.Context context5 = context3.setCurEntry(entry4);
        java.lang.String str6 = context5.getOrigin();
        double double7 = context5.getOriginBlockQps();
        boolean boolean8 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context5);
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("SentinelBlockException");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, 2);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.util.AssertUtil.isTrue(false, "SentinelBlockException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SentinelBlockException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.alibaba.csp.sentinel.context.Context context3 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = context3.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context("hi!", defaultNode4, true);
        double double7 = context6.getOriginBlockQps();
        com.alibaba.csp.sentinel.node.Node node8 = context6.getCurNode();
        int int9 = context6.getOriginCurThreadNum();
        boolean boolean10 = context6.isAsync();
        org.junit.Assert.assertNotNull(context3);
        org.junit.Assert.assertNotNull(defaultNode4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.Tracer.setExceptionsToTrace(wildcardClassArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: trace or ignore classes must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray7 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = null;
        com.alibaba.csp.sentinel.context.Context context10 = new com.alibaba.csp.sentinel.context.Context(defaultNode8, "exception predicate must not be null");
        double double11 = context10.getOriginBlockQps();
        boolean boolean12 = context10.isAsync();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context10);
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException16 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean17 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException16);
        java.lang.Throwable[] throwableArray18 = errorEntryFreeException16.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException16, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException16);
        java.lang.Throwable[] throwableArray22 = errorEntryFreeException16.getSuppressed();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode23 = null;
        com.alibaba.csp.sentinel.context.Context context25 = new com.alibaba.csp.sentinel.context.Context(defaultNode23, "exception predicate must not be null");
        double double26 = context25.getOriginBlockQps();
        boolean boolean27 = context25.isAsync();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException16, context25);
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, 0, context25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Entry entry2 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException1, entry2);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = null;
        com.alibaba.csp.sentinel.context.Context context6 = new com.alibaba.csp.sentinel.context.Context(defaultNode4, "");
        com.alibaba.csp.sentinel.node.Node node7 = context6.getCurNode();
        java.lang.String str8 = context6.getOrigin();
        com.alibaba.csp.sentinel.node.Node node9 = context6.getLastNode();
        java.lang.String str10 = context6.getName();
        java.lang.String str11 = context6.getName();
        com.alibaba.csp.sentinel.node.Node node12 = context6.getLastNode();
        boolean boolean13 = context6.isAsync();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context6);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) ' ');
        com.alibaba.csp.sentinel.context.Context context20 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode21 = context20.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context23 = new com.alibaba.csp.sentinel.context.Context(defaultNode21, "test-context-");
        com.alibaba.csp.sentinel.context.Context context25 = new com.alibaba.csp.sentinel.context.Context(defaultNode21, "test-context-");
        com.alibaba.csp.sentinel.context.Context context27 = new com.alibaba.csp.sentinel.context.Context(defaultNode21, "SentinelBlockException: ");
        com.alibaba.csp.sentinel.context.Context context29 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode21, "");
        com.alibaba.csp.sentinel.context.Context context31 = new com.alibaba.csp.sentinel.context.Context(defaultNode21, "SentinelBlockException: ");
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, (int) (short) 1, context31);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(context20);
        org.junit.Assert.assertNotNull(defaultNode21);
        org.junit.Assert.assertNotNull(context29);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        long long4 = context2.getOriginBlockRequest();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        boolean boolean6 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getOrigin();
        double double8 = context2.getOriginPassQps();
        com.alibaba.csp.sentinel.context.Context context10 = context2.setOrigin("");
        com.alibaba.csp.sentinel.node.Node node11 = context10.getCurNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.lang.Throwable throwable0 = null;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode2 = null;
        com.alibaba.csp.sentinel.context.Context context4 = new com.alibaba.csp.sentinel.context.Context(defaultNode2, "");
        com.alibaba.csp.sentinel.node.Node node5 = context4.getCurNode();
        java.lang.String str6 = context4.getOrigin();
        com.alibaba.csp.sentinel.node.Node node7 = context4.getOriginNode();
        com.alibaba.csp.sentinel.Tracer.traceContext(throwable0, (int) (byte) 0, context4);
        com.alibaba.csp.sentinel.Entry entry9 = context4.getCurEntry();
        java.lang.String str10 = context4.getOrigin();
        java.lang.Class<?> wildcardClass11 = context4.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray0 = com.alibaba.csp.sentinel.Tracer.getExceptionsToIgnore();
        com.alibaba.csp.sentinel.Tracer.ignoreClasses = wildcardClassArray0;
        org.junit.Assert.assertNotNull(wildcardClassArray0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context("trace or ignore classes must not be null", defaultNode1, false);
        com.alibaba.csp.sentinel.Entry entry4 = null;
        com.alibaba.csp.sentinel.context.Context context5 = context3.setCurEntry(entry4);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode6 = context5.getEntranceNode();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode7 = context5.getEntranceNode();
        double double8 = context5.getOriginPassReqQps();
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertNull(defaultNode6);
        org.junit.Assert.assertNull(defaultNode7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "exception predicate must not be null");
        double double3 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode4 = context2.getEntranceNode();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(defaultNode4);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        double double9 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode10 = context2.getEntranceNode();
        com.alibaba.csp.sentinel.Entry entry11 = null;
        com.alibaba.csp.sentinel.context.Context context12 = context2.setCurEntry(entry11);
        java.lang.String str13 = context2.getOrigin();
        long long14 = context2.getOriginTotalRequest();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(defaultNode10);
        org.junit.Assert.assertNotNull(context12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException3 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        runtimeException0.addSuppressed((java.lang.Throwable) errorEntryFreeException3);
        boolean boolean5 = com.alibaba.csp.sentinel.Tracer.shouldTrace((java.lang.Throwable) runtimeException0);
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.alibaba.csp.sentinel.util.AssertUtil.notEmpty("Context{name='exception predicate must not be null', entranceNode=null, curEntry=null, origin='', async=false}", "SentinelBlockException: ");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context("test", defaultNode1, true);
        com.alibaba.csp.sentinel.context.Context context5 = context3.setOrigin("java.lang.RuntimeException: SentinelBlockException");
        java.lang.String str6 = context5.getOrigin();
        com.alibaba.csp.sentinel.context.Context context9 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode10 = context9.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context12 = new com.alibaba.csp.sentinel.context.Context(defaultNode10, "test-context-");
        com.alibaba.csp.sentinel.context.Context context14 = new com.alibaba.csp.sentinel.context.Context(defaultNode10, "test-context-");
        com.alibaba.csp.sentinel.context.Context context16 = new com.alibaba.csp.sentinel.context.Context(defaultNode10, "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.Context context17 = context5.setCurNode((com.alibaba.csp.sentinel.node.Node) defaultNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(context5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.RuntimeException: SentinelBlockException" + "'", str6, "java.lang.RuntimeException: SentinelBlockException");
        org.junit.Assert.assertNotNull(context9);
        org.junit.Assert.assertNotNull(defaultNode10);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.lang.Class<? extends java.lang.Throwable>[] wildcardClassArray0 = com.alibaba.csp.sentinel.Tracer.getExceptionsToTrace();
        com.alibaba.csp.sentinel.Tracer.ignoreClasses = wildcardClassArray0;
        com.alibaba.csp.sentinel.Tracer.setExceptionsToIgnore(wildcardClassArray0);
        com.alibaba.csp.sentinel.Tracer.setExceptionsToTrace(wildcardClassArray0);
        com.alibaba.csp.sentinel.Tracer.ignoreClasses = wildcardClassArray0;
        org.junit.Assert.assertNotNull(wildcardClassArray0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("exception predicate must not be null");
        org.junit.Assert.assertNotNull(context1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException3 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        runtimeException0.addSuppressed((java.lang.Throwable) errorEntryFreeException3);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode6 = null;
        com.alibaba.csp.sentinel.context.Context context8 = new com.alibaba.csp.sentinel.context.Context(defaultNode6, "");
        com.alibaba.csp.sentinel.node.Node node9 = context8.getCurNode();
        java.lang.String str10 = context8.getOrigin();
        com.alibaba.csp.sentinel.node.Node node11 = context8.getLastNode();
        java.lang.String str12 = context8.getName();
        java.lang.String str13 = context8.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode14 = context8.getEntranceNode();
        double double15 = context8.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException0, 10, context8);
        java.lang.Throwable[] throwableArray17 = runtimeException0.getSuppressed();
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(defaultNode14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode3 = context2.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context5 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "test-context-");
        com.alibaba.csp.sentinel.context.Context context7 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "test-context-");
        com.alibaba.csp.sentinel.context.Context context9 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "SentinelBlockException: ");
        com.alibaba.csp.sentinel.context.Context context11 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode3, "");
        com.alibaba.csp.sentinel.context.Context context13 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "SentinelBlockException: ");
        com.alibaba.csp.sentinel.context.Context context15 = new com.alibaba.csp.sentinel.context.Context(defaultNode3, "Context{name='exception predicate must not be null', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.context.Context context17 = com.alibaba.csp.sentinel.context.Context.newAsyncContext(defaultNode3, "hi!");
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertNotNull(defaultNode3);
        org.junit.Assert.assertNotNull(context11);
        org.junit.Assert.assertNotNull(context17);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("hi!");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException4 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Entry entry5 = null;
        com.alibaba.csp.sentinel.Tracer.traceEntry((java.lang.Throwable) errorEntryFreeException4, entry5);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode7 = null;
        com.alibaba.csp.sentinel.context.Context context9 = new com.alibaba.csp.sentinel.context.Context(defaultNode7, "");
        com.alibaba.csp.sentinel.node.Node node10 = context9.getCurNode();
        java.lang.String str11 = context9.getOrigin();
        com.alibaba.csp.sentinel.node.Node node12 = context9.getLastNode();
        java.lang.String str13 = context9.getName();
        java.lang.String str14 = context9.getName();
        com.alibaba.csp.sentinel.node.Node node15 = context9.getLastNode();
        boolean boolean16 = context9.isAsync();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException4, context9);
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context9);
        com.alibaba.csp.sentinel.context.Context context20 = context9.setOrigin("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(context20);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        java.lang.RuntimeException runtimeException4 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException4;
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode7 = null;
        com.alibaba.csp.sentinel.context.Context context9 = new com.alibaba.csp.sentinel.context.Context(defaultNode7, "");
        com.alibaba.csp.sentinel.node.Node node10 = context9.getCurNode();
        java.lang.String str11 = context9.getOrigin();
        com.alibaba.csp.sentinel.node.Node node12 = context9.getLastNode();
        java.lang.String str13 = context9.getName();
        java.lang.String str14 = context9.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode15 = context9.getEntranceNode();
        double double16 = context9.getOriginPassReqQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) runtimeException4, (int) (short) 10, context9);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) runtimeException4, (int) '4');
        errorEntryFreeException1.addSuppressed((java.lang.Throwable) runtimeException4);
        org.junit.Assert.assertNotNull(runtimeException4);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(defaultNode15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getOriginNode();
        double double6 = context2.getOriginPassQps();
        int int7 = context2.getOriginCurThreadNum();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION = runtimeException0;
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException3 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        runtimeException0.addSuppressed((java.lang.Throwable) errorEntryFreeException3);
        boolean boolean5 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException3);
        boolean boolean6 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException3);
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray7 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = null;
        com.alibaba.csp.sentinel.context.Context context10 = new com.alibaba.csp.sentinel.context.Context(defaultNode8, "exception predicate must not be null");
        double double11 = context10.getOriginBlockQps();
        boolean boolean12 = context10.isAsync();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context10);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode14 = null;
        com.alibaba.csp.sentinel.context.Context context16 = new com.alibaba.csp.sentinel.context.Context(defaultNode14, "");
        com.alibaba.csp.sentinel.node.Node node17 = context16.getCurNode();
        java.lang.String str18 = context16.getOrigin();
        com.alibaba.csp.sentinel.node.Node node19 = context16.getCurNode();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context16);
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode21 = context16.getEntranceNode();
        double double22 = context16.getOriginAvgRt();
        int int23 = context16.getOriginCurThreadNum();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(defaultNode21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        java.lang.StackTraceElement stackTraceElement0 = null;
        java.lang.StackTraceElement[] stackTraceElementArray1 = new java.lang.StackTraceElement[] { stackTraceElement0 };
        com.alibaba.csp.sentinel.slots.block.BlockException.sentinelStackTrace = stackTraceElementArray1;
        com.alibaba.csp.sentinel.slots.block.BlockException.sentinelStackTrace = stackTraceElementArray1;
        com.alibaba.csp.sentinel.slots.block.BlockException.sentinelStackTrace = stackTraceElementArray1;
        org.junit.Assert.assertNotNull(stackTraceElementArray1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.ContextUtil.enter("hi!", "Context{name='', entranceNode=null, curEntry=null, origin='hi!', async=false}");
        com.alibaba.csp.sentinel.Entry entry3 = context2.getCurEntry();
        double double4 = context2.getOriginPassReqQps();
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertNull(entry3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        boolean boolean2 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        java.lang.Throwable[] throwableArray3 = errorEntryFreeException1.getSuppressed();
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 100);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (short) 10);
        java.lang.Throwable[] throwableArray8 = errorEntryFreeException1.getSuppressed();
        java.lang.Throwable[] throwableArray9 = errorEntryFreeException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("hi!");
        java.lang.String str2 = context1.toString();
        com.alibaba.csp.sentinel.node.Node node3 = context1.getLastNode();
        org.junit.Assert.assertNotNull(context1);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode2 = null;
        com.alibaba.csp.sentinel.context.Context context4 = new com.alibaba.csp.sentinel.context.Context(defaultNode2, "");
        com.alibaba.csp.sentinel.node.Node node5 = context4.getCurNode();
        java.lang.String str6 = context4.getOrigin();
        com.alibaba.csp.sentinel.node.Node node7 = context4.getLastNode();
        java.lang.String str8 = context4.getName();
        java.lang.String str9 = context4.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode10 = context4.getEntranceNode();
        double double11 = context4.getOriginPassReqQps();
        boolean boolean12 = context4.isAsync();
        double double13 = context4.getOriginPassQps();
        com.alibaba.csp.sentinel.Tracer.traceContext((java.lang.Throwable) errorEntryFreeException1, context4);
        boolean boolean15 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) errorEntryFreeException1);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(defaultNode10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.ContextUtil.enter("test", "hi!");
        java.lang.String str3 = context2.toString();
        long long4 = context2.getOriginTotalRequest();
        com.alibaba.csp.sentinel.Entry entry5 = null;
        com.alibaba.csp.sentinel.context.Context context6 = context2.setCurEntry(entry5);
        org.junit.Assert.assertNotNull(context2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(context6);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        java.lang.String str3 = context2.toString();
        com.alibaba.csp.sentinel.Entry entry4 = null;
        com.alibaba.csp.sentinel.context.Context context5 = context2.setCurEntry(entry4);
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context5, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}" + "'", str3, "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        org.junit.Assert.assertNotNull(context5);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode1 = null;
        com.alibaba.csp.sentinel.context.Context context3 = new com.alibaba.csp.sentinel.context.Context("trace or ignore classes must not be null", defaultNode1, false);
        boolean boolean4 = context3.isAsync();
        boolean boolean5 = com.alibaba.csp.sentinel.context.ContextUtil.isDefaultContext(context3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.lang.RuntimeException runtimeException0 = com.alibaba.csp.sentinel.slots.block.BlockException.THROW_OUT_EXCEPTION;
        boolean boolean1 = com.alibaba.csp.sentinel.slots.block.BlockException.isBlockException((java.lang.Throwable) runtimeException0);
        com.alibaba.csp.sentinel.util.AssertUtil.notNull((java.lang.Object) runtimeException0, "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        boolean boolean4 = com.alibaba.csp.sentinel.Tracer.shouldTrace((java.lang.Throwable) runtimeException0);
        org.junit.Assert.assertNotNull(runtimeException0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        java.lang.String str4 = context2.getOrigin();
        com.alibaba.csp.sentinel.node.Node node5 = context2.getLastNode();
        java.lang.String str6 = context2.getName();
        java.lang.String str7 = context2.getName();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode8 = context2.getEntranceNode();
        double double9 = context2.getOriginPassReqQps();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode10 = context2.getEntranceNode();
        com.alibaba.csp.sentinel.Entry entry11 = null;
        com.alibaba.csp.sentinel.context.Context context12 = context2.setCurEntry(entry11);
        java.lang.String str13 = context2.getOrigin();
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context2, runnable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(defaultNode8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(defaultNode10);
        org.junit.Assert.assertNotNull(context12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1, (int) (byte) 1);
        boolean boolean4 = com.alibaba.csp.sentinel.Tracer.shouldTrace((java.lang.Throwable) errorEntryFreeException1);
        com.alibaba.csp.sentinel.Tracer.trace((java.lang.Throwable) errorEntryFreeException1);
        java.lang.String str6 = errorEntryFreeException1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-" + "'", str6, "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        com.alibaba.csp.sentinel.ErrorEntryFreeException errorEntryFreeException1 = new com.alibaba.csp.sentinel.ErrorEntryFreeException("test-context-");
        java.lang.String str2 = errorEntryFreeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-" + "'", str2, "com.alibaba.csp.sentinel.ErrorEntryFreeException: test-context-");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "trace or ignore classes must not be null");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getLastNode();
        double double4 = context2.getOriginPassQps();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode0 = null;
        com.alibaba.csp.sentinel.context.Context context2 = new com.alibaba.csp.sentinel.context.Context(defaultNode0, "hi!");
        com.alibaba.csp.sentinel.node.Node node3 = context2.getCurNode();
        long long4 = context2.getOriginTotalRequest();
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode5 = context2.getEntranceNode();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.context.ContextUtil.runOnContext(context2, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(defaultNode5);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        // The following exception was thrown during execution in test generation
        try {
            com.alibaba.csp.sentinel.util.AssertUtil.isTrue(false, "Context{name='exception predicate must not be null', entranceNode=null, curEntry=null, origin='', async=false}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Context{name='exception predicate must not be null', entranceNode=null, curEntry=null, origin='', async=false}");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}
