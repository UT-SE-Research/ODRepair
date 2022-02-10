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
        com.alibaba.csp.sentinel.util.function.Predicate<? extends java.lang.Throwable> wildcardPredicate0 = com.alibaba.csp.sentinel.Tracer.getExceptionPredicate();
        org.junit.Assert.assertNull(wildcardPredicate0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test2");
        java.lang.Throwable throwable0 = null;
        boolean boolean1 = com.alibaba.csp.sentinel.Tracer.shouldTrace(throwable0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

