package io.dropwizard.metrics;

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
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        io.dropwizard.metrics.SharedMetricRegistries.clear();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.util.Set<java.lang.String> strSet0 = io.dropwizard.metrics.SharedMetricRegistries.names();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        io.dropwizard.metrics.SharedMetricRegistries.remove("two");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        io.dropwizard.metrics.SharedMetricRegistries.remove("");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.dropwizard.metrics.SharedMetricRegistries.remove("borg");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        io.dropwizard.metrics.SharedMetricRegistries.remove("Default metric registry name is already set.");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        io.dropwizard.metrics.SharedMetricRegistries.remove("foobah");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        io.dropwizard.metrics.SharedMetricRegistries.remove("Default registry name has not been set.");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        io.dropwizard.metrics.SharedMetricRegistries.remove("hi!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        io.dropwizard.metrics.SharedMetricRegistries.remove("one");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = null; // flaky: io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = null; // flaky: io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry7);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry8);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("Default registry name has not been set.");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry2);
        org.junit.Assert.assertNotNull(metricRegistry2);
        org.junit.Assert.assertNotNull(metricRegistry3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = null; // flaky: io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry10);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry4);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("hi!");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("hi!");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("Default metric registry name is already set.");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("hi!");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("two");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("Default metric registry name is already set.");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry15);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("Default registry name has not been set.");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("Default metric registry name is already set.");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry2);
        org.junit.Assert.assertNotNull(metricRegistry2);
        org.junit.Assert.assertNotNull(metricRegistry3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("two");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry19);
        io.dropwizard.metrics.MetricRegistry metricRegistry21 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry19);
        io.dropwizard.metrics.MetricRegistry metricRegistry22 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry21);
        io.dropwizard.metrics.MetricRegistry metricRegistry23 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry22);
        io.dropwizard.metrics.MetricRegistry metricRegistry24 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry23);
        io.dropwizard.metrics.MetricRegistry metricRegistry25 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry23);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
        org.junit.Assert.assertNotNull(metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry21);
        org.junit.Assert.assertNotNull(metricRegistry22);
        org.junit.Assert.assertNotNull(metricRegistry23);
        org.junit.Assert.assertNotNull(metricRegistry24);
        org.junit.Assert.assertNotNull(metricRegistry25);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry19);
        io.dropwizard.metrics.MetricRegistry metricRegistry21 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
        org.junit.Assert.assertNotNull(metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry21);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry18);
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry18);
        io.dropwizard.metrics.MetricRegistry metricRegistry21 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
        org.junit.Assert.assertNotNull(metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry21);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry15);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry15);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry15);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry18);
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry18);
        io.dropwizard.metrics.MetricRegistry metricRegistry21 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry20);
        io.dropwizard.metrics.MetricRegistry metricRegistry22 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry21);
        io.dropwizard.metrics.MetricRegistry metricRegistry23 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry21);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
        org.junit.Assert.assertNotNull(metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry21);
        org.junit.Assert.assertNotNull(metricRegistry22);
        org.junit.Assert.assertNotNull(metricRegistry23);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry15);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry15);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry15);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry18);
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry18);
        io.dropwizard.metrics.MetricRegistry metricRegistry21 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry20);
        io.dropwizard.metrics.MetricRegistry metricRegistry22 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry21);
        io.dropwizard.metrics.MetricRegistry metricRegistry23 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry21);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
        org.junit.Assert.assertNotNull(metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry21);
        org.junit.Assert.assertNotNull(metricRegistry22);
        org.junit.Assert.assertNotNull(metricRegistry23);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry19);
        io.dropwizard.metrics.MetricRegistry metricRegistry21 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
        org.junit.Assert.assertNotNull(metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry21);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("two");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("hi!");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("two");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("hi!");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("two");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("two");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry19);
        io.dropwizard.metrics.MetricRegistry metricRegistry21 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry19);
        io.dropwizard.metrics.MetricRegistry metricRegistry22 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry21);
        io.dropwizard.metrics.MetricRegistry metricRegistry23 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry22);
        io.dropwizard.metrics.MetricRegistry metricRegistry24 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry23);
        io.dropwizard.metrics.MetricRegistry metricRegistry25 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry23);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
        org.junit.Assert.assertNotNull(metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry21);
        org.junit.Assert.assertNotNull(metricRegistry22);
        org.junit.Assert.assertNotNull(metricRegistry23);
        org.junit.Assert.assertNotNull(metricRegistry24);
        org.junit.Assert.assertNotNull(metricRegistry25);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("Default metric registry name is already set.");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("Default metric registry name is already set.");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("hi!");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("Default metric registry name is already set.");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("hi!");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry2);
        org.junit.Assert.assertNotNull(metricRegistry2);
        org.junit.Assert.assertNotNull(metricRegistry3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("hi!");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("Default metric registry name is already set.");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry15);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry19);
        io.dropwizard.metrics.MetricRegistry metricRegistry21 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry19);
        io.dropwizard.metrics.MetricRegistry metricRegistry22 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry21);
        io.dropwizard.metrics.MetricRegistry metricRegistry23 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry22);
        io.dropwizard.metrics.MetricRegistry metricRegistry24 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry23);
        io.dropwizard.metrics.MetricRegistry metricRegistry25 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry24);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
        org.junit.Assert.assertNotNull(metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry21);
        org.junit.Assert.assertNotNull(metricRegistry22);
        org.junit.Assert.assertNotNull(metricRegistry23);
        org.junit.Assert.assertNotNull(metricRegistry24);
        org.junit.Assert.assertNotNull(metricRegistry25);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry15);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry15);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry15);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry18);
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry18);
        io.dropwizard.metrics.MetricRegistry metricRegistry21 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry20);
        io.dropwizard.metrics.MetricRegistry metricRegistry22 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry20);
        io.dropwizard.metrics.MetricRegistry metricRegistry23 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
        org.junit.Assert.assertNotNull(metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry21);
        org.junit.Assert.assertNotNull(metricRegistry22);
        org.junit.Assert.assertNotNull(metricRegistry23);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry19);
        io.dropwizard.metrics.MetricRegistry metricRegistry21 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
        org.junit.Assert.assertNotNull(metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry21);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("hi!");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry15);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("hi!");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry15);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("two");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry18);
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry18);
        io.dropwizard.metrics.MetricRegistry metricRegistry21 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
        org.junit.Assert.assertNotNull(metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry21);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("hi!");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry9);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("two");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry2);
        org.junit.Assert.assertNotNull(metricRegistry2);
        org.junit.Assert.assertNotNull(metricRegistry3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry13);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry16);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry10 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry10);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("borg", metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
        org.junit.Assert.assertNotNull(metricRegistry10);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry12);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry14);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry17);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry18);
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry18);
        io.dropwizard.metrics.MetricRegistry metricRegistry21 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry11);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(metricRegistry13);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricRegistry15);
        org.junit.Assert.assertNotNull(metricRegistry16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(metricRegistry18);
        org.junit.Assert.assertNotNull(metricRegistry19);
        org.junit.Assert.assertNotNull(metricRegistry20);
        org.junit.Assert.assertNotNull(metricRegistry21);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("foobah", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("one", metricRegistry5);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.add("hi!", metricRegistry7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = io.dropwizard.metrics.SharedMetricRegistries.add("two", metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(metricRegistry9);
    }
}
