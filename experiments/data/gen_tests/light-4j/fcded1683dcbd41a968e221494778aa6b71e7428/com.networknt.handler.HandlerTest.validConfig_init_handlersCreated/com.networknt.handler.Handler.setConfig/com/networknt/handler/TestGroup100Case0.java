package com.networknt.handler;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup100Case0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test01");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.initChains();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Chain secondBeforeFirst uses Unknown handler: com.networknt.handler.sample.SampleHttpHandler2");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test02");
        com.networknt.handler.Handler.setConfig("Expected an exception to be thrown");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test03");
        com.networknt.handler.Handler.setConfig("post");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test04");
        com.networknt.handler.Handler.initHandlers();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test05");
        com.networknt.handler.Handler.setConfig("Failed to inject handler.yml paths from: \001");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test06");
        com.networknt.handler.Handler.setConfig("Invalid format provided for class label: \001");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test07");
        com.networknt.handler.Handler.setConfig("secondBeforeFirst");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test08");
        com.networknt.handler.Handler.initPaths();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test09");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.setConfig("invalid-method");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Bad paths element in invalid-method config [ Invalid HTTP method: hello ]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test10");
        com.networknt.handler.Handler.initDefaultHandlers();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test11");
        com.networknt.handler.Handler.setConfig("Could not construct a handler with values provided as a list: \001");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test12");
        com.networknt.handler.Handler.setConfig("PUT");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test13");
        com.networknt.handler.Handler.setConfig("Configured class: \001 has not been found");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test14");
        com.networknt.handler.Handler.setConfig("and method");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test15");
        com.networknt.handler.Handler.setConfig("and path");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test16");
        com.networknt.handler.Handler.setConfig("Could not construct a handler with values provided as a map: \001");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test17");
        com.networknt.handler.Handler.setConfig("@");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test18");
        com.networknt.handler.Handler.setConfig("Unknown handler or chain: \001");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test19");
        com.networknt.handler.Handler.setConfig("hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test20");
        com.networknt.handler.Handler.setConfig("source");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test21");
        com.networknt.handler.Handler.setConfig("Configured class: \001 has not been found. Declared label was: \001");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test22");
        com.networknt.handler.Handler.setConfig("");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test23");
        com.networknt.handler.Handler.setConfig("Unsupported type of handler provided: \001");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test24");
        com.networknt.handler.Handler.setConfig("Chain \001 uses Unknown handler: \001");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test25");
        com.networknt.handler.Handler.setConfig("POST");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test26");
        com.networknt.handler.Handler.setConfig("put");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test27");
        com.networknt.handler.Handler.setConfig("com.networknt.handler.sample.SampleHttpHandler1");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test28");
        com.networknt.handler.Handler.setConfig("\001 config");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test29");
        com.networknt.handler.Handler.setConfig("third");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test30");
        // The following exception was thrown during execution in test generation
        try {
            com.networknt.handler.Handler.setConfig("handler");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unknown handler or chain: secondBeforeFirst");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test31");
        com.networknt.handler.Handler.setConfig("some-chain");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test32");
        com.networknt.handler.Handler.setConfig("Could not instantiate handler class: \001");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test33");
        com.networknt.handler.Handler.setConfig("com.networknt.handler.sample.SampleHttpHandler1@Hello");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test34");
        com.networknt.handler.Handler.setConfig("Hello");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test35");
        com.networknt.handler.Handler.setConfig("Conflicting source");
    }
}

