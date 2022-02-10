package com.networknt.handler;

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
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.initChains();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Chain secondBeforeFirst uses Unknown handler: com.networknt.handler.sample.SampleHttpHandler2");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test2");
        com.networknt.handler.Handler.initHandlers();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test3");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.initPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unknown handler or chain: secondBeforeFirst");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test4");
        com.networknt.handler.Handler.initDefaultHandlers();
    }
}

