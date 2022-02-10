package com.alibaba.csp.sentinel;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup100Case0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test1");
        java.lang.Throwable throwable0 = null;
        boolean boolean1 = com.alibaba.csp.sentinel.Tracer.shouldTrace(throwable0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test2");
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
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test3");
        com.alibaba.csp.sentinel.util.function.Predicate<? extends java.lang.Throwable> wildcardPredicate0 = com.alibaba.csp.sentinel.Tracer.getExceptionPredicate();
        org.junit.Assert.assertNull(wildcardPredicate0);
    }
}

