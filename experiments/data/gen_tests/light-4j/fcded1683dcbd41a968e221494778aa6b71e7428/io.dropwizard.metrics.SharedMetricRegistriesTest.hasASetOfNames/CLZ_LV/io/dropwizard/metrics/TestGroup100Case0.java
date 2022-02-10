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
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.MetricSet metricSet2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricSet metricSet3 = metricRegistry0.register("Default metric registry name is already set.", metricSet2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry0 = io.dropwizard.metrics.SharedMetricRegistries.getDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Default registry name has not been set.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.util.concurrent.ConcurrentMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap0 = null;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry(metricNameMap0);
        java.util.concurrent.ConcurrentMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap3 = null;
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry(metricNameMap3);
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry5 = metricRegistry1.register("two", metricRegistry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.MetricName metricName1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.Timer timer2 = metricRegistry0.timer(metricName1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.util.concurrent.ConcurrentMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap0 = null;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry(metricNameMap0);
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap3 = metricRegistry1.getTimers(metricFilter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        io.dropwizard.metrics.Metered metered4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.Metered metered5 = metricRegistry0.register("Default metric registry name is already set.", metered4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(meter2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.util.concurrent.ConcurrentMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap0 = null;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry(metricNameMap0);
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.Counter counter3 = metricRegistry1.counter("borg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        java.lang.String str0 = io.dropwizard.metrics.MetricName.SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "." + "'", str0, ".");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        io.dropwizard.metrics.Timer timer0 = new io.dropwizard.metrics.Timer();
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timer0.update((long) (byte) 10, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.util.Set<java.lang.String> strSet0 = io.dropwizard.metrics.SharedMetricRegistries.names();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        io.dropwizard.metrics.MetricName metricName0 = io.dropwizard.metrics.MetricName.EMPTY;
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricName metricName2 = metricName0.tagged(strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricName0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap2 = metricRegistry1.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener3 = null;
        metricRegistry1.removeListener(metricRegistryListener3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.setDefault("borg.foobah.one", metricRegistry1);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricRegistry5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        io.dropwizard.metrics.SharedMetricRegistries.clear();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        io.dropwizard.metrics.Timer timer0 = new io.dropwizard.metrics.Timer();
        double double1 = timer0.getFiveMinuteRate();
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timer0.update((long) 0, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry1.removeListener(metricRegistryListener2);
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap5 = metricRegistry1.getMeters(metricFilter4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.util.concurrent.ConcurrentMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap0 = null;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry(metricNameMap0);
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer4 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer5 = metricRegistry2.register("borg", timer4);
        // The following exception was thrown during execution in test generation
        try {
            metricRegistry1.registerAll((io.dropwizard.metrics.MetricSet) metricRegistry2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timer5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter2 = metricRegistry0.counter("Default metric registry name is already set.");
        java.lang.String[] strArray6 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName7 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray6);
        io.dropwizard.metrics.MetricName metricName9 = metricName7.resolve("borg");
        io.dropwizard.metrics.Meter meter10 = metricRegistry0.meter(metricName7);
        double double11 = meter10.getOneMinuteRate();
        org.junit.Assert.assertNotNull(counter2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(metricName7);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertNotNull(meter10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap2 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter5 = metricRegistry3.counter("Default metric registry name is already set.");
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        io.dropwizard.metrics.MetricName metricName12 = metricName10.resolve("borg");
        io.dropwizard.metrics.Meter meter13 = metricRegistry3.meter(metricName10);
        java.util.concurrent.ConcurrentMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap14 = null;
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = new io.dropwizard.metrics.MetricRegistry(metricNameMap14);
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.Metric metric16 = metricRegistry0.register(metricName10, (io.dropwizard.metrics.Metric) metricRegistry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(counter5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(meter13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        io.dropwizard.metrics.Clock clock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.Meter meter1 = new io.dropwizard.metrics.Meter(clock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        histogram12.update((int) (short) 100);
        io.dropwizard.metrics.Snapshot snapshot15 = histogram12.getSnapshot();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertNotNull(snapshot15);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter3 = metricRegistry1.counter("Default metric registry name is already set.");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.Meter meter11 = metricRegistry1.meter(metricName8);
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.setDefault("borg", metricRegistry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Default metric registry name is already set.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(counter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(meter11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricRegistry1.addListener(metricRegistryListener2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("one");
        org.junit.Assert.assertNotNull(metricRegistry1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        io.dropwizard.metrics.Timer timer4 = metricRegistry0.timer("borg.foobah.one");
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertNotNull(timer4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Timer> timerMetricBuilder0 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.TIMERS;
        org.junit.Assert.assertNotNull(timerMetricBuilder0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        io.dropwizard.metrics.Counter counter0 = new io.dropwizard.metrics.Counter();
        counter0.inc();
        counter0.dec((long) (short) 10);
        counter0.inc((long) '#');
        counter0.inc();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        double double3 = meter2.getOneMinuteRate();
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.Meter meter11 = metricRegistry0.meter(metricName10);
        meter11.mark((long) 'a');
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(meter11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry2);
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Counter> metricNameMap5 = metricRegistry3.getCounters(metricFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry2);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        meter2.mark();
        double double4 = meter2.getFifteenMinuteRate();
        double double5 = meter2.getFiveMinuteRate();
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Counter> counterMetricBuilder0 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.COUNTERS;
        org.junit.Assert.assertNotNull(counterMetricBuilder0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.Histogram histogram3 = null; // flaky: metricRegistry1.histogram(".");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: . is already used for a different type of metric");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.util.concurrent.ConcurrentMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap0 = null;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry(metricNameMap0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap2 = metricRegistry1.getGauges();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.add("Default registry name has not been set.", metricRegistry2);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry2.getMetrics();
        org.junit.Assert.assertNotNull(metricRegistry2);
        org.junit.Assert.assertNotNull(metricRegistry3);
        org.junit.Assert.assertNotNull(metricNameMap4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer3 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer4 = metricRegistry1.register("borg", timer3);
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.setDefault("borg.foobah.one.borg", metricRegistry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Default metric registry name is already set.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timer4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap15 = metricRegistry14.getGauges();
        boolean boolean16 = metricName8.equals((java.lang.Object) metricNameMap15);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricNameMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.dropwizard.metrics.Timer timer0 = new io.dropwizard.metrics.Timer();
        double double1 = timer0.getFiveMinuteRate();
        java.lang.Class<?> wildcardClass2 = timer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        java.lang.String str2 = timer1.toString();
        long long3 = timer1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.Snapshot snapshot4 = timer1.getSnapshot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str2, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.dropwizard.metrics.Counter counter0 = new io.dropwizard.metrics.Counter();
        counter0.inc();
        counter0.dec((long) (short) 10);
        counter0.inc((long) '#');
        java.lang.String str6 = counter0.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "26" + "'", str6, "26");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry0.removeListener(metricRegistryListener2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        java.lang.String str9 = metricName8.toString();
        java.lang.String[] strArray13 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName14 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray13);
        io.dropwizard.metrics.MetricName metricName16 = metricName14.resolve("borg");
        int int17 = metricName8.compareTo(metricName14);
        io.dropwizard.metrics.Meter meter18 = metricRegistry0.meter(metricName8);
        boolean boolean20 = metricName8.equals((java.lang.Object) "borg");
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "borg.foobah.one" + "'", str9, "borg.foobah.one");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertNotNull(metricName16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(meter18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter2 = metricRegistry0.counter("Default metric registry name is already set.");
        java.lang.String[] strArray6 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName7 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray6);
        io.dropwizard.metrics.MetricName metricName9 = metricName7.resolve("borg");
        io.dropwizard.metrics.Meter meter10 = metricRegistry0.meter(metricName7);
        double double11 = meter10.getFifteenMinuteRate();
        meter10.mark((long) (short) 100);
        org.junit.Assert.assertNotNull(counter2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(metricName7);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertNotNull(meter10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        histogram12.update((long) (byte) -1);
        histogram12.update((long) 10);
        histogram12.update((int) (byte) 10);
        histogram12.update((int) (short) 1);
        java.lang.String str21 = histogram12.toString();
        long long22 = histogram12.getCount();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1\n1\n10\n10\n" + "'", str21, "-1\n1\n10\n10\n");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 4L + "'", long22 == 4L);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap2 = metricRegistry1.getGauges();
        io.dropwizard.metrics.MetricFilter metricFilter3 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap4 = metricRegistry1.getGauges(metricFilter3);
        io.dropwizard.metrics.MetricFilter metricFilter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap6 = metricRegistry1.getMeters(metricFilter5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricNameMap4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter2 = metricRegistry0.counter("Default metric registry name is already set.");
        counter2.inc((long) (short) 100);
        counter2.dec();
        long long6 = counter2.getCount();
        org.junit.Assert.assertNotNull(counter2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 99L + "'", long6 == 99L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("Default registry name has not been set.");
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Counter> metricNameMap3 = metricRegistry1.getCounters(metricFilter2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Meter> meterMetricBuilder0 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.METERS;
        org.junit.Assert.assertNotNull(meterMetricBuilder0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap5 = metricRegistry0.getMeters(metricFilter4);
        io.dropwizard.metrics.Counter counter7 = new io.dropwizard.metrics.Counter();
        counter7.inc();
        counter7.dec((long) (short) 10);
        io.dropwizard.metrics.Counter counter11 = metricRegistry0.register("Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]", counter7);
        counter7.inc();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(counter11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        histogram12.update((int) (short) 100);
        histogram12.update(0);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        histogram12.update((long) (byte) -1);
        histogram12.update((int) (short) -1);
        histogram12.update(10L);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap5 = metricRegistry0.getMeters(metricFilter4);
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener6 = null;
        metricRegistry0.removeListener(metricRegistryListener6);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.dropwizard.metrics.Timer timer0 = new io.dropwizard.metrics.Timer();
        double double1 = timer0.getMeanRate();
        double double2 = timer0.getOneMinuteRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener4 = null;
        metricRegistry0.removeListener(metricRegistryListener4);
        io.dropwizard.metrics.MetricFilter metricFilter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricRegistry0.removeMatching(metricFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertNotNull(metricNameMap3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry0.removeListener(metricRegistryListener2);
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap5 = metricRegistry0.getTimers(metricFilter4);
        io.dropwizard.metrics.MetricFilter metricFilter6 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap7 = metricRegistry0.getGauges(metricFilter6);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(metricNameMap7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        io.dropwizard.metrics.MetricFilter metricFilter3 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap4 = metricRegistry0.getTimers(metricFilter3);
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricRegistry0.addListener(metricRegistryListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertNotNull(metricNameMap4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        java.lang.String str2 = timer1.toString();
        io.dropwizard.metrics.Timer.Context context3 = timer1.time();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = context3.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str2, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertNotNull(context3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry0.removeListener(metricRegistryListener2);
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap5 = metricRegistry0.getHistograms(metricFilter4);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry0.removeListener(metricRegistryListener2);
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap5 = metricRegistry0.getTimers(metricFilter4);
        io.dropwizard.metrics.Histogram histogram7 = metricRegistry0.histogram(".");
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(histogram7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        java.lang.String str2 = timer1.toString();
        io.dropwizard.metrics.Timer.Context context3 = timer1.time();
        java.lang.String str4 = context3.toString();
        java.lang.String str5 = context3.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str2, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertNotNull(context3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Timer.Context[start_time=4391094745197059, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705169076]" + "'", str4, "Timer.Context[start_time=4391094745197059, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705169076]");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Timer.Context[start_time=4391094745197059, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705169076]" + "'", str5, "Timer.Context[start_time=4391094745197059, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705169076]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter2 = metricRegistry0.counter("Default metric registry name is already set.");
        counter2.inc((long) 1);
        counter2.dec((long) (byte) 10);
        org.junit.Assert.assertNotNull(counter2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        java.lang.String str2 = timer1.toString();
        io.dropwizard.metrics.Timer.Context context3 = timer1.time();
        java.lang.String str4 = context3.toString();
        // The following exception was thrown during execution in test generation
        try {
            context3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str2, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertNotNull(context3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Timer.Context[start_time=4391094868404906, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705169199]" + "'", str4, "Timer.Context[start_time=4391094868404906, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705169199]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.dropwizard.metrics.Timer timer0 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer.Context context1 = timer0.time();
        context1.close();
        org.junit.Assert.assertNotNull(context1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Histogram histogram3 = metricRegistry0.histogram(".");
        java.util.SortedSet<io.dropwizard.metrics.MetricName> metricNameSet4 = metricRegistry0.getNames();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(histogram3);
        org.junit.Assert.assertNotNull(metricNameSet4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        meter2.mark();
        double double4 = meter2.getFiveMinuteRate();
        meter2.mark((-1L));
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        meter2.mark();
        long long4 = meter2.getCount();
        double double5 = meter2.getMeanRate();
        meter2.mark((long) 5);
        double double8 = meter2.getFifteenMinuteRate();
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1760.6284739400576d + "'", double5 == 1760.6284739400576d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        io.dropwizard.metrics.MetricFilter metricFilter3 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap4 = metricRegistry0.getTimers(metricFilter3);
        io.dropwizard.metrics.MetricFilter metricFilter5 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap6 = metricRegistry0.getGauges(metricFilter5);
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(metricNameMap6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        java.lang.String str2 = timer1.toString();
        long long3 = timer1.getCount();
        long long4 = timer1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.Snapshot snapshot5 = timer1.getSnapshot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str2, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.Meter meter3 = null; // flaky: metricRegistry1.meter(".");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener6 = null;
        metricRegistry5.removeListener(metricRegistryListener6);
        java.lang.String[] strArray11 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName12 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray11);
        java.lang.String str13 = metricName12.toString();
        boolean boolean14 = metricRegistry5.remove(metricName12);
        io.dropwizard.metrics.Counter counter15 = metricRegistry1.counter(metricName12);
        counter15.inc();
        counter15.inc((long) (-1));
        org.junit.Assert.assertNotNull(metricRegistry1);
// flaky:         org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "borg.foobah.one" + "'", str13, "borg.foobah.one");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(counter15);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap2 = metricRegistry1.getHistograms();
        io.dropwizard.metrics.Meter meter4 = metricRegistry1.meter("foobah");
        java.lang.String[] strArray8 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName9 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray8);
        io.dropwizard.metrics.MetricName metricName11 = metricName9.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder12 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram13 = metricRegistry1.getOrAdd(metricName9, histogramMetricBuilder12);
        io.dropwizard.metrics.MetricFilter metricFilter14 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Counter> metricNameMap15 = metricRegistry1.getCounters(metricFilter14);
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry16 = io.dropwizard.metrics.SharedMetricRegistries.setDefault("-1\n1\n10\n10\n", metricRegistry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Default metric registry name is already set.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(meter4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertNotNull(metricName11);
        org.junit.Assert.assertNotNull(histogramMetricBuilder12);
        org.junit.Assert.assertNotNull(histogram13);
        org.junit.Assert.assertNotNull(metricNameMap15);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer6 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer7 = metricRegistry4.register("borg", timer6);
        metricRegistry0.registerAll((io.dropwizard.metrics.MetricSet) metricRegistry4);
        io.dropwizard.metrics.MetricName metricName9 = new io.dropwizard.metrics.MetricName();
        io.dropwizard.metrics.Histogram histogram10 = metricRegistry0.histogram(metricName9);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(timer7);
        org.junit.Assert.assertNotNull(histogram10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        double double2 = timer1.getFiveMinuteRate();
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timer1.time(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        meter2.mark();
        double double4 = meter2.getFifteenMinuteRate();
        meter2.mark();
        java.lang.String str6 = meter2.toString();
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Meter[mean=17598.817359473444, 1m=0.0, 5m=0.0, 15m=0.0]" + "'", str6, "Meter[mean=17598.817359473444, 1m=0.0, 5m=0.0, 15m=0.0]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        io.dropwizard.metrics.Meter meter0 = new io.dropwizard.metrics.Meter();
        double double1 = meter0.getFifteenMinuteRate();
        double double2 = meter0.getFiveMinuteRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.util.concurrent.ConcurrentMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap0 = null;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry(metricNameMap0);
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Counter> metricNameMap3 = metricRegistry1.getCounters(metricFilter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        double double2 = timer1.getFiveMinuteRate();
        io.dropwizard.metrics.Timer.Context context3 = timer1.time();
        // The following exception was thrown during execution in test generation
        try {
            context3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(context3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        io.dropwizard.metrics.MetricFilter metricFilter13 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Counter> metricNameMap14 = metricRegistry0.getCounters(metricFilter13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter17 = metricRegistry15.counter("Default metric registry name is already set.");
        java.lang.String[] strArray21 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName22 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray21);
        io.dropwizard.metrics.MetricName metricName24 = metricName22.resolve("borg");
        io.dropwizard.metrics.Meter meter25 = metricRegistry15.meter(metricName22);
        io.dropwizard.metrics.MetricRegistry metricRegistry26 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap27 = metricRegistry26.getHistograms();
        io.dropwizard.metrics.Meter meter29 = metricRegistry26.meter("foobah");
        java.lang.String[] strArray33 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName34 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray33);
        io.dropwizard.metrics.MetricName metricName36 = metricName34.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder37 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram38 = metricRegistry26.getOrAdd(metricName34, histogramMetricBuilder37);
        io.dropwizard.metrics.Histogram histogram39 = metricRegistry0.getOrAdd(metricName22, histogramMetricBuilder37);
        java.lang.String[] strArray44 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName45 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray44);
        io.dropwizard.metrics.MetricName metricName46 = io.dropwizard.metrics.MetricRegistry.name("Default metric registry name is already set.", strArray44);
        io.dropwizard.metrics.MetricName metricName47 = metricName22.tagged(strArray44);
        io.dropwizard.metrics.MetricName metricName49 = metricName47.resolve("Timer.Context[start_time=4391094745197059, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705169076]");
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertNotNull(metricNameMap14);
        org.junit.Assert.assertNotNull(counter17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(metricName22);
        org.junit.Assert.assertNotNull(metricName24);
        org.junit.Assert.assertNotNull(meter25);
        org.junit.Assert.assertNotNull(metricNameMap27);
        org.junit.Assert.assertNotNull(meter29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(metricName34);
        org.junit.Assert.assertNotNull(metricName36);
        org.junit.Assert.assertNotNull(histogramMetricBuilder37);
        org.junit.Assert.assertNotNull(histogram38);
        org.junit.Assert.assertNotNull(histogram39);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(metricName45);
        org.junit.Assert.assertNotNull(metricName46);
        org.junit.Assert.assertNotNull(metricName47);
        org.junit.Assert.assertNotNull(metricName49);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        io.dropwizard.metrics.MetricName metricName1 = new io.dropwizard.metrics.MetricName("two");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        java.lang.String str2 = timer1.toString();
        long long3 = timer1.getCount();
        long long4 = timer1.getCount();
        double double5 = timer1.getFifteenMinuteRate();
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.Snapshot snapshot6 = timer1.getSnapshot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str2, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry1.removeListener(metricRegistryListener2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        java.lang.String str9 = metricName8.toString();
        boolean boolean10 = metricRegistry1.remove(metricName8);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap12 = metricRegistry11.getHistograms();
        io.dropwizard.metrics.Meter meter14 = metricRegistry11.meter("foobah");
        java.lang.String[] strArray18 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName19 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray18);
        io.dropwizard.metrics.MetricName metricName21 = metricName19.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder22 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram23 = metricRegistry11.getOrAdd(metricName19, histogramMetricBuilder22);
        histogram23.update((long) (byte) -1);
        histogram23.update((long) 10);
        histogram23.update((int) ' ');
        boolean boolean30 = metricName8.equals((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "borg.foobah.one" + "'", str9, "borg.foobah.one");
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(metricNameMap12);
        org.junit.Assert.assertNotNull(meter14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(metricName19);
        org.junit.Assert.assertNotNull(metricName21);
        org.junit.Assert.assertNotNull(histogramMetricBuilder22);
        org.junit.Assert.assertNotNull(histogram23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer2 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer3 = metricRegistry0.register("borg", timer2);
        long long4 = timer3.getCount();
        org.junit.Assert.assertNotNull(timer3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        histogram12.update((long) (byte) -1);
        long long15 = histogram12.getCount();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = io.dropwizard.metrics.MetricName.EMPTY_TAGS;
        io.dropwizard.metrics.MetricName metricName2 = new io.dropwizard.metrics.MetricName("borg.foobah.one.borg", strMap1);
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap5 = metricRegistry4.getHistograms();
        io.dropwizard.metrics.Meter meter7 = metricRegistry4.meter("foobah");
        java.lang.String[] strArray11 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName12 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray11);
        io.dropwizard.metrics.MetricName metricName14 = metricName12.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder15 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram16 = metricRegistry4.getOrAdd(metricName12, histogramMetricBuilder15);
        io.dropwizard.metrics.Meter meter17 = metricRegistry0.meter(metricName12);
        io.dropwizard.metrics.MetricName metricName19 = metricName12.resolve("borg.foobah.one.borg");
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap21 = metricRegistry20.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter22 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap23 = metricRegistry20.getGauges(metricFilter22);
        java.lang.String[] strArray27 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName28 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray27);
        io.dropwizard.metrics.MetricName metricName30 = metricName28.resolve("borg");
        io.dropwizard.metrics.Meter meter31 = metricRegistry20.meter(metricName30);
        io.dropwizard.metrics.MetricRegistry metricRegistry32 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter34 = metricRegistry32.counter("Default metric registry name is already set.");
        java.lang.String[] strArray38 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName39 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray38);
        io.dropwizard.metrics.MetricName metricName41 = metricName39.resolve("borg");
        io.dropwizard.metrics.Meter meter42 = metricRegistry32.meter(metricName39);
        int int43 = metricName30.compareTo(metricName39);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = metricName39.getTags();
        io.dropwizard.metrics.MetricName metricName45 = metricName12.tagged(strMap44);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(meter7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertNotNull(histogramMetricBuilder15);
        org.junit.Assert.assertNotNull(histogram16);
        org.junit.Assert.assertNotNull(meter17);
        org.junit.Assert.assertNotNull(metricName19);
        org.junit.Assert.assertNotNull(metricNameMap21);
        org.junit.Assert.assertNotNull(metricNameMap23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(metricName28);
        org.junit.Assert.assertNotNull(metricName30);
        org.junit.Assert.assertNotNull(meter31);
        org.junit.Assert.assertNotNull(counter34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(metricName39);
        org.junit.Assert.assertNotNull(metricName41);
        org.junit.Assert.assertNotNull(meter42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(metricName45);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.dropwizard.metrics.SharedMetricRegistries.remove("hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer2 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer3 = metricRegistry0.register("borg", timer2);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timer2.update((long) '#', timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timer3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        io.dropwizard.metrics.MetricName metricName0 = io.dropwizard.metrics.MetricName.EMPTY;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = io.dropwizard.metrics.MetricName.EMPTY_TAGS;
        io.dropwizard.metrics.MetricName metricName3 = new io.dropwizard.metrics.MetricName("", strMap2);
        io.dropwizard.metrics.MetricName metricName4 = metricName0.tagged(strMap2);
        org.junit.Assert.assertNotNull(metricName0);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(metricName4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate(".");
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap2 = metricRegistry1.getMetrics();
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(metricNameMap2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap5 = metricRegistry4.getHistograms();
        io.dropwizard.metrics.Meter meter7 = metricRegistry4.meter("foobah");
        java.lang.String[] strArray11 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName12 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray11);
        io.dropwizard.metrics.MetricName metricName14 = metricName12.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder15 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram16 = metricRegistry4.getOrAdd(metricName12, histogramMetricBuilder15);
        io.dropwizard.metrics.Meter meter17 = metricRegistry0.meter(metricName12);
        double double18 = meter17.getOneMinuteRate();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(meter7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertNotNull(histogramMetricBuilder15);
        org.junit.Assert.assertNotNull(histogram16);
        org.junit.Assert.assertNotNull(meter17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.Meter meter3 = null; // flaky: metricRegistry1.meter(".");
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricRegistry1.removeMatching(metricFilter4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry1);
// flaky:         org.junit.Assert.assertNotNull(meter3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        io.dropwizard.metrics.MetricName metricName1 = new io.dropwizard.metrics.MetricName(".");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry1.removeListener(metricRegistryListener2);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry1.getMetrics();
        metricRegistry1.removeAll();
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        java.lang.String str11 = metricName10.toString();
        java.lang.String[] strArray12 = null;
        io.dropwizard.metrics.MetricName metricName13 = metricName10.tagged(strArray12);
        io.dropwizard.metrics.Reservoir reservoir14 = null;
        io.dropwizard.metrics.Timer timer15 = new io.dropwizard.metrics.Timer(reservoir14);
        double double16 = timer15.getFifteenMinuteRate();
        io.dropwizard.metrics.Timer timer17 = metricRegistry1.register(metricName13, timer15);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = metricName13.getTags();
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "borg.foobah.one" + "'", str11, "borg.foobah.one");
        org.junit.Assert.assertNotNull(metricName13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(timer17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.Timer timer3 = metricRegistry0.timer("Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(timer3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges();
        io.dropwizard.metrics.Histogram histogram5 = metricRegistry0.histogram("Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        io.dropwizard.metrics.MetricFilter metricFilter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap7 = metricRegistry0.getMeters(metricFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(histogram5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap2 = metricRegistry1.getHistograms();
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry3.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter5 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap6 = metricRegistry3.getGauges(metricFilter5);
        java.lang.String[] strArray10 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName11 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray10);
        io.dropwizard.metrics.MetricName metricName13 = metricName11.resolve("borg");
        io.dropwizard.metrics.Meter meter14 = metricRegistry3.meter(metricName13);
        java.lang.String str15 = metricName13.getKey();
        io.dropwizard.metrics.Timer timer16 = metricRegistry1.timer(metricName13);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("Timer.Context[start_time=4391093301783227, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705167632]", metricRegistry1);
        io.dropwizard.metrics.Counter counter19 = null; // flaky: metricRegistry17.counter(".");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricRegistry17.addListener(metricRegistryListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(metricNameMap6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(metricName11);
        org.junit.Assert.assertNotNull(metricName13);
        org.junit.Assert.assertNotNull(meter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "borg.foobah.one.borg" + "'", str15, "borg.foobah.one.borg");
        org.junit.Assert.assertNotNull(timer16);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry17);
// flaky:         org.junit.Assert.assertNotNull(counter19);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap3 = metricRegistry2.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap5 = metricRegistry2.getGauges(metricFilter4);
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        io.dropwizard.metrics.MetricName metricName12 = metricName10.resolve("borg");
        io.dropwizard.metrics.Meter meter13 = metricRegistry2.meter(metricName12);
        java.lang.String str14 = metricName12.getKey();
        io.dropwizard.metrics.Timer timer15 = metricRegistry0.timer(metricName12);
        io.dropwizard.metrics.MetricFilter metricFilter16 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap17 = metricRegistry0.getGauges(metricFilter16);
        io.dropwizard.metrics.MetricFilter metricFilter18 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap19 = metricRegistry0.getHistograms(metricFilter18);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(meter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "borg.foobah.one.borg" + "'", str14, "borg.foobah.one.borg");
        org.junit.Assert.assertNotNull(timer15);
        org.junit.Assert.assertNotNull(metricNameMap17);
        org.junit.Assert.assertNotNull(metricNameMap19);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        io.dropwizard.metrics.Meter meter0 = new io.dropwizard.metrics.Meter();
        double double1 = meter0.getOneMinuteRate();
        double double2 = meter0.getOneMinuteRate();
        meter0.mark((long) '#');
        double double5 = meter0.getFiveMinuteRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.Meter meter3 = metricRegistry1.meter(".");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener6 = null;
        metricRegistry5.removeListener(metricRegistryListener6);
        java.lang.String[] strArray11 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName12 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray11);
        java.lang.String str13 = metricName12.toString();
        boolean boolean14 = metricRegistry5.remove(metricName12);
        io.dropwizard.metrics.Counter counter15 = metricRegistry1.counter(metricName12);
        counter15.dec();
        long long17 = counter15.getCount();
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "borg.foobah.one" + "'", str13, "borg.foobah.one");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(counter15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener3 = null;
        metricRegistry2.removeListener(metricRegistryListener3);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap5 = metricRegistry2.getMetrics();
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.setDefault("-1\n10\n", metricRegistry2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Default metric registry name is already set.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry2);
        org.junit.Assert.assertNotNull(metricNameMap5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry0.removeListener(metricRegistryListener2);
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap4 = metricRegistry0.getGauges();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap5 = metricRegistry0.getHistograms();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(metricNameMap5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap2 = metricRegistry1.getHistograms();
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry3.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter5 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap6 = metricRegistry3.getGauges(metricFilter5);
        java.lang.String[] strArray10 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName11 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray10);
        io.dropwizard.metrics.MetricName metricName13 = metricName11.resolve("borg");
        io.dropwizard.metrics.Meter meter14 = metricRegistry3.meter(metricName13);
        java.lang.String str15 = metricName13.getKey();
        io.dropwizard.metrics.Timer timer16 = metricRegistry1.timer(metricName13);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("Timer.Context[start_time=4391093301783227, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705167632]", metricRegistry1);
        io.dropwizard.metrics.MetricFilter metricFilter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricRegistry1.removeMatching(metricFilter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(metricNameMap6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(metricName11);
        org.junit.Assert.assertNotNull(metricName13);
        org.junit.Assert.assertNotNull(meter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "borg.foobah.one.borg" + "'", str15, "borg.foobah.one.borg");
        org.junit.Assert.assertNotNull(timer16);
        org.junit.Assert.assertNotNull(metricRegistry17);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer2 = metricRegistry0.timer("");
        io.dropwizard.metrics.MetricFilter metricFilter3 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap4 = metricRegistry0.getGauges(metricFilter3);
        org.junit.Assert.assertNotNull(timer2);
        org.junit.Assert.assertNotNull(metricNameMap4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener3 = null;
        metricRegistry2.removeListener(metricRegistryListener3);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap5 = metricRegistry2.getMetrics();
        metricRegistry2.removeAll();
        java.lang.String[] strArray10 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName11 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray10);
        java.lang.String str12 = metricName11.toString();
        java.lang.String[] strArray13 = null;
        io.dropwizard.metrics.MetricName metricName14 = metricName11.tagged(strArray13);
        io.dropwizard.metrics.Reservoir reservoir15 = null;
        io.dropwizard.metrics.Timer timer16 = new io.dropwizard.metrics.Timer(reservoir15);
        double double17 = timer16.getFifteenMinuteRate();
        io.dropwizard.metrics.Timer timer18 = metricRegistry2.register(metricName14, timer16);
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry19 = io.dropwizard.metrics.SharedMetricRegistries.setDefault(".", metricRegistry2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Default metric registry name is already set.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry2);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(metricName11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "borg.foobah.one" + "'", str12, "borg.foobah.one");
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(timer18);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap5 = metricRegistry4.getHistograms();
        io.dropwizard.metrics.Meter meter7 = metricRegistry4.meter("foobah");
        java.lang.String[] strArray11 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName12 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray11);
        io.dropwizard.metrics.MetricName metricName14 = metricName12.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder15 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram16 = metricRegistry4.getOrAdd(metricName12, histogramMetricBuilder15);
        io.dropwizard.metrics.Meter meter17 = metricRegistry0.meter(metricName12);
        io.dropwizard.metrics.MetricFilter metricFilter18 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap19 = metricRegistry0.getHistograms(metricFilter18);
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap20 = metricRegistry0.getHistograms();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(meter7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertNotNull(histogramMetricBuilder15);
        org.junit.Assert.assertNotNull(histogram16);
        org.junit.Assert.assertNotNull(meter17);
        org.junit.Assert.assertNotNull(metricNameMap19);
        org.junit.Assert.assertNotNull(metricNameMap20);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer6 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer7 = metricRegistry4.register("borg", timer6);
        metricRegistry0.registerAll((io.dropwizard.metrics.MetricSet) metricRegistry4);
        java.util.SortedSet<io.dropwizard.metrics.MetricName> metricNameSet9 = metricRegistry0.getNames();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(timer7);
        org.junit.Assert.assertNotNull(metricNameSet9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter2 = metricRegistry0.counter("Default metric registry name is already set.");
        java.lang.String[] strArray6 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName7 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray6);
        io.dropwizard.metrics.MetricName metricName9 = metricName7.resolve("borg");
        io.dropwizard.metrics.Meter meter10 = metricRegistry0.meter(metricName7);
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricRegistry0.addListener(metricRegistryListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(counter2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(metricName7);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertNotNull(meter10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.dropwizard.metrics.Timer timer0 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer.Context context1 = timer0.time();
        long long2 = context1.stop();
        org.junit.Assert.assertNotNull(context1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 77458L + "'", long2 == 77458L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.Timer timer3 = metricRegistry0.timer("26");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap5 = metricRegistry4.getHistograms();
        io.dropwizard.metrics.Meter meter7 = metricRegistry4.meter("foobah");
        java.lang.String[] strArray11 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName12 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray11);
        io.dropwizard.metrics.MetricName metricName14 = metricName12.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder15 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram16 = metricRegistry4.getOrAdd(metricName12, histogramMetricBuilder15);
        io.dropwizard.metrics.MetricFilter metricFilter17 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Counter> metricNameMap18 = metricRegistry4.getCounters(metricFilter17);
        io.dropwizard.metrics.MetricRegistry metricRegistry19 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter21 = metricRegistry19.counter("Default metric registry name is already set.");
        java.lang.String[] strArray25 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName26 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray25);
        io.dropwizard.metrics.MetricName metricName28 = metricName26.resolve("borg");
        io.dropwizard.metrics.Meter meter29 = metricRegistry19.meter(metricName26);
        io.dropwizard.metrics.MetricRegistry metricRegistry30 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap31 = metricRegistry30.getHistograms();
        io.dropwizard.metrics.Meter meter33 = metricRegistry30.meter("foobah");
        java.lang.String[] strArray37 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName38 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray37);
        io.dropwizard.metrics.MetricName metricName40 = metricName38.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder41 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram42 = metricRegistry30.getOrAdd(metricName38, histogramMetricBuilder41);
        io.dropwizard.metrics.Histogram histogram43 = metricRegistry4.getOrAdd(metricName26, histogramMetricBuilder41);
        java.lang.String[] strArray48 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName49 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray48);
        io.dropwizard.metrics.MetricName metricName50 = io.dropwizard.metrics.MetricRegistry.name("Default metric registry name is already set.", strArray48);
        io.dropwizard.metrics.MetricName metricName51 = metricName26.tagged(strArray48);
        boolean boolean52 = metricRegistry0.remove(metricName26);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(timer3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(meter7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertNotNull(histogramMetricBuilder15);
        org.junit.Assert.assertNotNull(histogram16);
        org.junit.Assert.assertNotNull(metricNameMap18);
        org.junit.Assert.assertNotNull(counter21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(metricName26);
        org.junit.Assert.assertNotNull(metricName28);
        org.junit.Assert.assertNotNull(meter29);
        org.junit.Assert.assertNotNull(metricNameMap31);
        org.junit.Assert.assertNotNull(meter33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(metricName38);
        org.junit.Assert.assertNotNull(metricName40);
        org.junit.Assert.assertNotNull(histogramMetricBuilder41);
        org.junit.Assert.assertNotNull(histogram42);
        org.junit.Assert.assertNotNull(histogram43);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(metricName49);
        org.junit.Assert.assertNotNull(metricName50);
        org.junit.Assert.assertNotNull(metricName51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener5 = null;
        metricRegistry0.removeListener(metricRegistryListener5);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap7 = metricRegistry0.getMetrics();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(metricNameMap7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        java.lang.String str2 = timer1.toString();
        long long3 = timer1.getCount();
        long long4 = timer1.getCount();
        java.lang.String str5 = timer1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str2, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str5, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.Timer timer3 = metricRegistry0.timer("26");
        double double4 = timer3.getMeanRate();
        io.dropwizard.metrics.Snapshot snapshot5 = timer3.getSnapshot();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(timer3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(snapshot5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("Timer.Context[start_time=4391093301783227, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705167632]");
        org.junit.Assert.assertNotNull(metricRegistry1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder0 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter3 = metricRegistry1.meter("hi!");
        meter3.mark();
        long long5 = meter3.getCount();
        boolean boolean6 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) meter3);
        io.dropwizard.metrics.Histogram histogram7 = histogramMetricBuilder0.newMetric();
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder8 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter11 = metricRegistry9.meter("hi!");
        meter11.mark();
        long long13 = meter11.getCount();
        boolean boolean14 = histogramMetricBuilder8.isInstance((io.dropwizard.metrics.Metric) meter11);
        boolean boolean15 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) meter11);
        double double16 = meter11.getMeanRate();
        org.junit.Assert.assertNotNull(histogramMetricBuilder0);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(histogram7);
        org.junit.Assert.assertNotNull(histogramMetricBuilder8);
        org.junit.Assert.assertNotNull(meter11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2538.7798623981316d + "'", double16 == 2538.7798623981316d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter2 = metricRegistry0.counter("Default metric registry name is already set.");
        counter2.inc();
        counter2.inc();
        org.junit.Assert.assertNotNull(counter2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.util.concurrent.ConcurrentMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap0 = null;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry(metricNameMap0);
        java.lang.String[] strArray5 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName6 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray5);
        io.dropwizard.metrics.MetricName metricName8 = metricName6.resolve("borg");
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.Meter meter11 = metricRegistry1.meter(metricName8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(metricName6);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter2 = metricRegistry0.counter("Default metric registry name is already set.");
        java.lang.String[] strArray6 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName7 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray6);
        io.dropwizard.metrics.MetricName metricName9 = metricName7.resolve("borg");
        io.dropwizard.metrics.Meter meter10 = metricRegistry0.meter(metricName7);
        meter10.mark((long) (byte) 100);
        org.junit.Assert.assertNotNull(counter2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(metricName7);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertNotNull(meter10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        io.dropwizard.metrics.MetricName metricName3 = new io.dropwizard.metrics.MetricName();
        io.dropwizard.metrics.Meter meter4 = new io.dropwizard.metrics.Meter();
        boolean boolean5 = metricName3.equals((java.lang.Object) meter4);
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder6 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter9 = metricRegistry7.meter("hi!");
        meter9.mark();
        long long11 = meter9.getCount();
        boolean boolean12 = histogramMetricBuilder6.isInstance((io.dropwizard.metrics.Metric) meter9);
        io.dropwizard.metrics.Meter meter13 = new io.dropwizard.metrics.Meter();
        double double14 = meter13.getOneMinuteRate();
        boolean boolean15 = histogramMetricBuilder6.isInstance((io.dropwizard.metrics.Metric) meter13);
        io.dropwizard.metrics.Histogram histogram16 = metricRegistry0.getOrAdd(metricName3, histogramMetricBuilder6);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = metricName3.getTags();
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(histogramMetricBuilder6);
        org.junit.Assert.assertNotNull(meter9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(histogram16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer2 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer3 = metricRegistry0.register("borg", timer2);
        double double4 = timer2.getFiveMinuteRate();
        long long5 = timer2.getCount();
        double double6 = timer2.getFiveMinuteRate();
        org.junit.Assert.assertNotNull(timer3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        io.dropwizard.metrics.MetricFilter metricFilter3 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap4 = metricRegistry0.getTimers(metricFilter3);
        io.dropwizard.metrics.MetricFilter metricFilter5 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap6 = metricRegistry0.getHistograms(metricFilter5);
        metricRegistry0.removeAll();
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(metricNameMap6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        io.dropwizard.metrics.Histogram histogram13 = histogramMetricBuilder11.newMetric();
        io.dropwizard.metrics.Histogram histogram14 = histogramMetricBuilder11.newMetric();
        histogram14.update((-1));
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertNotNull(histogram13);
        org.junit.Assert.assertNotNull(histogram14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry1.removeListener(metricRegistryListener2);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry1.getMetrics();
        metricRegistry1.removeAll();
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        java.lang.String str11 = metricName10.toString();
        java.lang.String[] strArray12 = null;
        io.dropwizard.metrics.MetricName metricName13 = metricName10.tagged(strArray12);
        io.dropwizard.metrics.Reservoir reservoir14 = null;
        io.dropwizard.metrics.Timer timer15 = new io.dropwizard.metrics.Timer(reservoir14);
        double double16 = timer15.getFifteenMinuteRate();
        io.dropwizard.metrics.Timer timer17 = metricRegistry1.register(metricName13, timer15);
        double double18 = timer17.getFifteenMinuteRate();
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "borg.foobah.one" + "'", str11, "borg.foobah.one");
        org.junit.Assert.assertNotNull(metricName13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(timer17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timer1.update(0L, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.dropwizard.metrics.MetricName metricName0 = new io.dropwizard.metrics.MetricName();
        io.dropwizard.metrics.Meter meter1 = new io.dropwizard.metrics.Meter();
        boolean boolean2 = metricName0.equals((java.lang.Object) meter1);
        meter1.mark();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder0 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter3 = metricRegistry1.meter("hi!");
        meter3.mark();
        long long5 = meter3.getCount();
        boolean boolean6 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) meter3);
        io.dropwizard.metrics.Histogram histogram7 = histogramMetricBuilder0.newMetric();
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder8 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter11 = metricRegistry9.meter("hi!");
        meter11.mark();
        long long13 = meter11.getCount();
        boolean boolean14 = histogramMetricBuilder8.isInstance((io.dropwizard.metrics.Metric) meter11);
        boolean boolean15 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) meter11);
        meter11.mark();
        org.junit.Assert.assertNotNull(histogramMetricBuilder0);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(histogram7);
        org.junit.Assert.assertNotNull(histogramMetricBuilder8);
        org.junit.Assert.assertNotNull(meter11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        meter2.mark();
        double double4 = meter2.getMeanRate();
        org.junit.Assert.assertNotNull(meter2);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 14959.534459287626d + "'", double4 == 14959.534459287626d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        io.dropwizard.metrics.MetricName metricName1 = new io.dropwizard.metrics.MetricName("Meter[mean=13913.301580087282, 1m=0.0, 5m=0.0, 15m=0.0]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter2 = metricRegistry0.counter("Default metric registry name is already set.");
        java.lang.Class<?> wildcardClass3 = metricRegistry0.getClass();
        org.junit.Assert.assertNotNull(counter2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap5 = metricRegistry4.getHistograms();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap6 = metricRegistry4.getMetrics();
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.Meter meter10 = metricRegistry8.meter(".");
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener13 = null;
        metricRegistry12.removeListener(metricRegistryListener13);
        java.lang.String[] strArray18 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName19 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray18);
        java.lang.String str20 = metricName19.toString();
        boolean boolean21 = metricRegistry12.remove(metricName19);
        io.dropwizard.metrics.Counter counter22 = metricRegistry8.counter(metricName19);
        metricRegistry4.registerAll((io.dropwizard.metrics.MetricSet) metricRegistry8);
        io.dropwizard.metrics.MetricRegistry metricRegistry24 = metricRegistry0.register(".", metricRegistry4);
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap25 = metricRegistry24.getGauges();
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(metricNameMap6);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(meter10);
        org.junit.Assert.assertNotNull(metricRegistry12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(metricName19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "borg.foobah.one" + "'", str20, "borg.foobah.one");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(counter22);
        org.junit.Assert.assertNotNull(metricRegistry24);
        org.junit.Assert.assertNotNull(metricNameMap25);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        histogram12.update((long) (byte) -1);
        histogram12.update((long) 10);
        java.lang.String str17 = histogram12.toString();
        long long18 = histogram12.getCount();
        java.lang.String str19 = histogram12.toString();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1\n10\n" + "'", str17, "-1\n10\n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1\n10\n" + "'", str19, "-1\n10\n");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        double double4 = meter3.getMeanRate();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.Meter meter11 = metricRegistry0.meter(metricName10);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap12 = metricRegistry0.getMetrics();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(meter11);
        org.junit.Assert.assertNotNull(metricNameMap12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder0 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap2 = metricRegistry1.getHistograms();
        io.dropwizard.metrics.Meter meter4 = metricRegistry1.meter("foobah");
        java.lang.String[] strArray8 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName9 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray8);
        io.dropwizard.metrics.MetricName metricName11 = metricName9.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder12 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram13 = metricRegistry1.getOrAdd(metricName9, histogramMetricBuilder12);
        boolean boolean14 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) histogram13);
        histogram13.update((int) (byte) 0);
        org.junit.Assert.assertNotNull(histogramMetricBuilder0);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(meter4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertNotNull(metricName11);
        org.junit.Assert.assertNotNull(histogramMetricBuilder12);
        org.junit.Assert.assertNotNull(histogram13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        io.dropwizard.metrics.Counter counter0 = new io.dropwizard.metrics.Counter();
        counter0.dec();
        counter0.dec();
        counter0.dec();
        counter0.inc((long) (-1));
        long long6 = counter0.getCount();
        counter0.inc(3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-4L) + "'", long6 == (-4L));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.Meter meter11 = metricRegistry0.meter(metricName10);
        io.dropwizard.metrics.MetricFilter metricFilter12 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap13 = metricRegistry0.getGauges(metricFilter12);
        io.dropwizard.metrics.MetricFilter metricFilter14 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap15 = metricRegistry0.getGauges(metricFilter14);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(meter11);
        org.junit.Assert.assertNotNull(metricNameMap13);
        org.junit.Assert.assertNotNull(metricNameMap15);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap2 = metricRegistry0.getTimers();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap3 = metricRegistry0.getMeters();
        java.util.SortedSet<io.dropwizard.metrics.MetricName> metricNameSet4 = metricRegistry0.getNames();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameSet4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap2 = metricRegistry1.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter3 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap4 = metricRegistry1.getGauges(metricFilter3);
        java.lang.String[] strArray8 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName9 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray8);
        io.dropwizard.metrics.MetricName metricName11 = metricName9.resolve("borg");
        io.dropwizard.metrics.Meter meter12 = metricRegistry1.meter(metricName11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap14 = metricRegistry13.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap15 = metricRegistry13.getTimers();
        boolean boolean16 = metricName11.equals((java.lang.Object) metricNameMap15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = io.dropwizard.metrics.MetricName.EMPTY_TAGS;
        io.dropwizard.metrics.MetricName metricName18 = metricName11.tagged(strMap17);
        io.dropwizard.metrics.MetricName metricName19 = new io.dropwizard.metrics.MetricName(".", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = metricName19.getTags();
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertNotNull(metricName11);
        org.junit.Assert.assertNotNull(meter12);
        org.junit.Assert.assertNotNull(metricNameMap14);
        org.junit.Assert.assertNotNull(metricNameMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(metricName18);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry1.removeListener(metricRegistryListener2);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry1.getMetrics();
        metricRegistry1.removeAll();
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        java.lang.String str11 = metricName10.toString();
        java.lang.String[] strArray12 = null;
        io.dropwizard.metrics.MetricName metricName13 = metricName10.tagged(strArray12);
        io.dropwizard.metrics.Reservoir reservoir14 = null;
        io.dropwizard.metrics.Timer timer15 = new io.dropwizard.metrics.Timer(reservoir14);
        double double16 = timer15.getFifteenMinuteRate();
        io.dropwizard.metrics.Timer timer17 = metricRegistry1.register(metricName13, timer15);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap19 = metricRegistry18.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter20 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap21 = metricRegistry18.getGauges(metricFilter20);
        java.lang.String[] strArray25 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName26 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray25);
        io.dropwizard.metrics.MetricName metricName28 = metricName26.resolve("borg");
        io.dropwizard.metrics.Meter meter29 = metricRegistry18.meter(metricName28);
        io.dropwizard.metrics.MetricRegistry metricRegistry30 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap31 = metricRegistry30.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap32 = metricRegistry30.getTimers();
        boolean boolean33 = metricName28.equals((java.lang.Object) metricNameMap32);
        java.util.Map<java.lang.String, java.lang.String> strMap34 = io.dropwizard.metrics.MetricName.EMPTY_TAGS;
        io.dropwizard.metrics.MetricName metricName35 = metricName28.tagged(strMap34);
        io.dropwizard.metrics.Reservoir reservoir36 = null;
        io.dropwizard.metrics.Timer timer37 = new io.dropwizard.metrics.Timer(reservoir36);
        java.lang.String str38 = timer37.toString();
        long long39 = timer37.getCount();
        double double40 = timer37.getMeanRate();
        io.dropwizard.metrics.Timer timer41 = metricRegistry1.register(metricName35, timer37);
        io.dropwizard.metrics.MetricFilter metricFilter42 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricRegistry1.removeMatching(metricFilter42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "borg.foobah.one" + "'", str11, "borg.foobah.one");
        org.junit.Assert.assertNotNull(metricName13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(timer17);
        org.junit.Assert.assertNotNull(metricNameMap19);
        org.junit.Assert.assertNotNull(metricNameMap21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(metricName26);
        org.junit.Assert.assertNotNull(metricName28);
        org.junit.Assert.assertNotNull(meter29);
        org.junit.Assert.assertNotNull(metricNameMap31);
        org.junit.Assert.assertNotNull(metricNameMap32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(metricName35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str38, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(timer41);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap5 = metricRegistry4.getHistograms();
        io.dropwizard.metrics.Meter meter7 = metricRegistry4.meter("foobah");
        java.lang.String[] strArray11 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName12 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray11);
        io.dropwizard.metrics.MetricName metricName14 = metricName12.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder15 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram16 = metricRegistry4.getOrAdd(metricName12, histogramMetricBuilder15);
        io.dropwizard.metrics.Meter meter17 = metricRegistry0.meter(metricName12);
        java.lang.String[] strArray21 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName22 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray21);
        io.dropwizard.metrics.MetricName metricName24 = metricName22.resolve("borg");
        java.lang.String str25 = metricName22.getKey();
        io.dropwizard.metrics.Meter meter26 = metricRegistry0.meter(metricName22);
        java.util.SortedSet<io.dropwizard.metrics.MetricName> metricNameSet27 = metricRegistry0.getNames();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap28 = metricRegistry0.getMeters();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(meter7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertNotNull(histogramMetricBuilder15);
        org.junit.Assert.assertNotNull(histogram16);
        org.junit.Assert.assertNotNull(meter17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(metricName22);
        org.junit.Assert.assertNotNull(metricName24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "borg.foobah.one" + "'", str25, "borg.foobah.one");
        org.junit.Assert.assertNotNull(meter26);
        org.junit.Assert.assertNotNull(metricNameSet27);
        org.junit.Assert.assertNotNull(metricNameMap28);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        io.dropwizard.metrics.Counter counter0 = new io.dropwizard.metrics.Counter();
        java.lang.String str1 = counter0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer2 = metricRegistry0.timer("");
        long long3 = timer2.getCount();
        org.junit.Assert.assertNotNull(timer2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer2 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer3 = metricRegistry0.register("borg", timer2);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap6 = metricRegistry5.getHistograms();
        io.dropwizard.metrics.Meter meter8 = metricRegistry5.meter("foobah");
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap9 = metricRegistry5.getMetrics();
        io.dropwizard.metrics.MetricName metricName11 = new io.dropwizard.metrics.MetricName("borg");
        io.dropwizard.metrics.Counter counter12 = metricRegistry5.counter(metricName11);
        io.dropwizard.metrics.MetricRegistry metricRegistry13 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap14 = metricRegistry13.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter15 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap16 = metricRegistry13.getGauges(metricFilter15);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap18 = metricRegistry17.getHistograms();
        io.dropwizard.metrics.Meter meter20 = metricRegistry17.meter("foobah");
        java.lang.String[] strArray24 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName25 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray24);
        io.dropwizard.metrics.MetricName metricName27 = metricName25.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder28 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram29 = metricRegistry17.getOrAdd(metricName25, histogramMetricBuilder28);
        io.dropwizard.metrics.Meter meter30 = metricRegistry13.meter(metricName25);
        java.lang.String[] strArray34 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName35 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray34);
        io.dropwizard.metrics.MetricName metricName37 = metricName35.resolve("borg");
        java.lang.String str38 = metricName35.getKey();
        io.dropwizard.metrics.Meter meter39 = metricRegistry13.meter(metricName35);
        java.lang.String str40 = metricName35.getKey();
        io.dropwizard.metrics.MetricName metricName42 = metricName35.resolve(".");
        io.dropwizard.metrics.Timer timer43 = metricRegistry5.timer(metricName42);
        io.dropwizard.metrics.MetricRegistry metricRegistry44 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap45 = metricRegistry44.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter46 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap47 = metricRegistry44.getGauges(metricFilter46);
        io.dropwizard.metrics.MetricRegistry metricRegistry48 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap49 = metricRegistry48.getHistograms();
        io.dropwizard.metrics.Meter meter51 = metricRegistry48.meter("foobah");
        java.lang.String[] strArray55 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName56 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray55);
        io.dropwizard.metrics.MetricName metricName58 = metricName56.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder59 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram60 = metricRegistry48.getOrAdd(metricName56, histogramMetricBuilder59);
        io.dropwizard.metrics.Meter meter61 = metricRegistry44.meter(metricName56);
        io.dropwizard.metrics.MetricRegistry metricRegistry62 = metricRegistry0.register(metricName42, metricRegistry44);
        org.junit.Assert.assertNotNull(timer3);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(metricNameMap6);
        org.junit.Assert.assertNotNull(meter8);
        org.junit.Assert.assertNotNull(metricNameMap9);
        org.junit.Assert.assertNotNull(counter12);
        org.junit.Assert.assertNotNull(metricNameMap14);
        org.junit.Assert.assertNotNull(metricNameMap16);
        org.junit.Assert.assertNotNull(metricNameMap18);
        org.junit.Assert.assertNotNull(meter20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(metricName25);
        org.junit.Assert.assertNotNull(metricName27);
        org.junit.Assert.assertNotNull(histogramMetricBuilder28);
        org.junit.Assert.assertNotNull(histogram29);
        org.junit.Assert.assertNotNull(meter30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(metricName35);
        org.junit.Assert.assertNotNull(metricName37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "borg.foobah.one" + "'", str38, "borg.foobah.one");
        org.junit.Assert.assertNotNull(meter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "borg.foobah.one" + "'", str40, "borg.foobah.one");
        org.junit.Assert.assertNotNull(metricName42);
        org.junit.Assert.assertNotNull(timer43);
        org.junit.Assert.assertNotNull(metricNameMap45);
        org.junit.Assert.assertNotNull(metricNameMap47);
        org.junit.Assert.assertNotNull(metricNameMap49);
        org.junit.Assert.assertNotNull(meter51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(metricName56);
        org.junit.Assert.assertNotNull(metricName58);
        org.junit.Assert.assertNotNull(histogramMetricBuilder59);
        org.junit.Assert.assertNotNull(histogram60);
        org.junit.Assert.assertNotNull(meter61);
        org.junit.Assert.assertNotNull(metricRegistry62);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap3 = metricRegistry2.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap5 = metricRegistry2.getGauges(metricFilter4);
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        io.dropwizard.metrics.MetricName metricName12 = metricName10.resolve("borg");
        io.dropwizard.metrics.Meter meter13 = metricRegistry2.meter(metricName12);
        java.lang.String str14 = metricName12.getKey();
        io.dropwizard.metrics.Timer timer15 = metricRegistry0.timer(metricName12);
        io.dropwizard.metrics.MetricFilter metricFilter16 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap17 = metricRegistry0.getGauges(metricFilter16);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap18 = metricRegistry0.getMetrics();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(meter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "borg.foobah.one.borg" + "'", str14, "borg.foobah.one.borg");
        org.junit.Assert.assertNotNull(timer15);
        org.junit.Assert.assertNotNull(metricNameMap17);
        org.junit.Assert.assertNotNull(metricNameMap18);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.Meter meter11 = metricRegistry0.meter(metricName10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap13 = metricRegistry12.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap14 = metricRegistry12.getTimers();
        boolean boolean15 = metricName10.equals((java.lang.Object) metricNameMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = io.dropwizard.metrics.MetricName.EMPTY_TAGS;
        io.dropwizard.metrics.MetricName metricName17 = metricName10.tagged(strMap16);
        java.lang.String str18 = metricName17.getKey();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(meter11);
        org.junit.Assert.assertNotNull(metricNameMap13);
        org.junit.Assert.assertNotNull(metricNameMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(metricName17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "borg.foobah.one.borg" + "'", str18, "borg.foobah.one.borg");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.lang.String[] strArray4 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName5 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray4);
        io.dropwizard.metrics.MetricName metricName6 = io.dropwizard.metrics.MetricRegistry.name("Timer.Context[start_time=4391093301783227, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705167632]", strArray4);
        io.dropwizard.metrics.MetricName metricName7 = io.dropwizard.metrics.MetricName.build(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(metricName5);
        org.junit.Assert.assertNotNull(metricName6);
        org.junit.Assert.assertNotNull(metricName7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap2 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.Meter meter6 = metricRegistry4.meter(".");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener9 = null;
        metricRegistry8.removeListener(metricRegistryListener9);
        java.lang.String[] strArray14 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName15 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray14);
        java.lang.String str16 = metricName15.toString();
        boolean boolean17 = metricRegistry8.remove(metricName15);
        io.dropwizard.metrics.Counter counter18 = metricRegistry4.counter(metricName15);
        metricRegistry0.registerAll((io.dropwizard.metrics.MetricSet) metricRegistry4);
        java.lang.String[] strArray25 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName26 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray25);
        io.dropwizard.metrics.MetricName metricName27 = io.dropwizard.metrics.MetricRegistry.name("one", strArray25);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = metricName27.getTags();
        io.dropwizard.metrics.MetricName metricName29 = new io.dropwizard.metrics.MetricName("Default registry name has not been set.", strMap28);
        io.dropwizard.metrics.Meter meter30 = metricRegistry0.meter(metricName29);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(meter6);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(metricName15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "borg.foobah.one" + "'", str16, "borg.foobah.one");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(counter18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(metricName26);
        org.junit.Assert.assertNotNull(metricName27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(meter30);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer2 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer3 = metricRegistry0.register("borg", timer2);
        java.lang.String str4 = timer2.toString();
        double double5 = timer2.getOneMinuteRate();
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timer2.time(runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str4, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry1.removeListener(metricRegistryListener2);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry1.getMetrics();
        metricRegistry1.removeAll();
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        java.lang.String str11 = metricName10.toString();
        java.lang.String[] strArray12 = null;
        io.dropwizard.metrics.MetricName metricName13 = metricName10.tagged(strArray12);
        io.dropwizard.metrics.Reservoir reservoir14 = null;
        io.dropwizard.metrics.Timer timer15 = new io.dropwizard.metrics.Timer(reservoir14);
        double double16 = timer15.getFifteenMinuteRate();
        io.dropwizard.metrics.Timer timer17 = metricRegistry1.register(metricName13, timer15);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap19 = metricRegistry18.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter20 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap21 = metricRegistry18.getGauges(metricFilter20);
        java.lang.String[] strArray25 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName26 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray25);
        io.dropwizard.metrics.MetricName metricName28 = metricName26.resolve("borg");
        io.dropwizard.metrics.Meter meter29 = metricRegistry18.meter(metricName28);
        io.dropwizard.metrics.MetricRegistry metricRegistry30 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap31 = metricRegistry30.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap32 = metricRegistry30.getTimers();
        boolean boolean33 = metricName28.equals((java.lang.Object) metricNameMap32);
        java.util.Map<java.lang.String, java.lang.String> strMap34 = io.dropwizard.metrics.MetricName.EMPTY_TAGS;
        io.dropwizard.metrics.MetricName metricName35 = metricName28.tagged(strMap34);
        io.dropwizard.metrics.Reservoir reservoir36 = null;
        io.dropwizard.metrics.Timer timer37 = new io.dropwizard.metrics.Timer(reservoir36);
        java.lang.String str38 = timer37.toString();
        long long39 = timer37.getCount();
        double double40 = timer37.getMeanRate();
        io.dropwizard.metrics.Timer timer41 = metricRegistry1.register(metricName35, timer37);
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.Snapshot snapshot42 = timer37.getSnapshot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "borg.foobah.one" + "'", str11, "borg.foobah.one");
        org.junit.Assert.assertNotNull(metricName13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(timer17);
        org.junit.Assert.assertNotNull(metricNameMap19);
        org.junit.Assert.assertNotNull(metricNameMap21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(metricName26);
        org.junit.Assert.assertNotNull(metricName28);
        org.junit.Assert.assertNotNull(meter29);
        org.junit.Assert.assertNotNull(metricNameMap31);
        org.junit.Assert.assertNotNull(metricNameMap32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(metricName35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str38, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(timer41);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder0 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter3 = metricRegistry1.meter("hi!");
        meter3.mark();
        long long5 = meter3.getCount();
        boolean boolean6 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) meter3);
        io.dropwizard.metrics.Meter meter7 = new io.dropwizard.metrics.Meter();
        double double8 = meter7.getOneMinuteRate();
        boolean boolean9 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) meter7);
        java.lang.Class<?> wildcardClass10 = histogramMetricBuilder0.getClass();
        org.junit.Assert.assertNotNull(histogramMetricBuilder0);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap2 = metricRegistry1.getHistograms();
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry3.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter5 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap6 = metricRegistry3.getGauges(metricFilter5);
        java.lang.String[] strArray10 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName11 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray10);
        io.dropwizard.metrics.MetricName metricName13 = metricName11.resolve("borg");
        io.dropwizard.metrics.Meter meter14 = metricRegistry3.meter(metricName13);
        java.lang.String str15 = metricName13.getKey();
        io.dropwizard.metrics.Timer timer16 = metricRegistry1.timer(metricName13);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("Timer.Context[start_time=4391093301783227, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705167632]", metricRegistry1);
        io.dropwizard.metrics.Counter counter19 = metricRegistry17.counter(".");
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap21 = metricRegistry20.getHistograms();
        io.dropwizard.metrics.Meter meter23 = metricRegistry20.meter("foobah");
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap24 = metricRegistry20.getMetrics();
        // The following exception was thrown during execution in test generation
        try {
            metricRegistry17.registerAll((io.dropwizard.metrics.MetricSet) metricRegistry20);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(metricNameMap6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(metricName11);
        org.junit.Assert.assertNotNull(metricName13);
        org.junit.Assert.assertNotNull(meter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "borg.foobah.one.borg" + "'", str15, "borg.foobah.one.borg");
        org.junit.Assert.assertNotNull(timer16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(counter19);
        org.junit.Assert.assertNotNull(metricNameMap21);
        org.junit.Assert.assertNotNull(meter23);
        org.junit.Assert.assertNotNull(metricNameMap24);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.String[] strArray3 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName4 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray3);
        io.dropwizard.metrics.MetricName metricName6 = metricName4.resolve("borg");
        java.lang.String str7 = metricName6.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(metricName4);
        org.junit.Assert.assertNotNull(metricName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "borg.foobah.one.borg" + "'", str7, "borg.foobah.one.borg");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap2 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.Meter meter6 = metricRegistry4.meter(".");
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener9 = null;
        metricRegistry8.removeListener(metricRegistryListener9);
        java.lang.String[] strArray14 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName15 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray14);
        java.lang.String str16 = metricName15.toString();
        boolean boolean17 = metricRegistry8.remove(metricName15);
        io.dropwizard.metrics.Counter counter18 = metricRegistry4.counter(metricName15);
        metricRegistry0.registerAll((io.dropwizard.metrics.MetricSet) metricRegistry4);
        java.lang.String[] strArray23 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName24 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray23);
        io.dropwizard.metrics.MetricName metricName26 = metricName24.resolve("borg");
        io.dropwizard.metrics.MetricName metricName27 = io.dropwizard.metrics.MetricName.EMPTY;
        java.lang.String str28 = metricName27.toString();
        int int29 = metricName24.compareTo(metricName27);
        io.dropwizard.metrics.Histogram histogram30 = metricRegistry4.histogram(metricName27);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(meter6);
        org.junit.Assert.assertNotNull(metricRegistry8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(metricName15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "borg.foobah.one" + "'", str16, "borg.foobah.one");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(counter18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(metricName24);
        org.junit.Assert.assertNotNull(metricName26);
        org.junit.Assert.assertNotNull(metricName27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(histogram30);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        meter2.mark();
        long long4 = meter2.getCount();
        double double5 = meter2.getMeanRate();
        meter2.mark((long) 5);
        java.lang.String str8 = meter2.toString();
        long long9 = meter2.getCount();
        double double10 = meter2.getMeanRate();
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 13653.741125068269d + "'", double5 == 13653.741125068269d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Meter[mean=61078.64894028545, 1m=0.0, 5m=0.0, 15m=0.0]" + "'", str8, "Meter[mean=61078.64894028545, 1m=0.0, 5m=0.0, 15m=0.0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 6L + "'", long9 == 6L);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50735.23815966379d + "'", double10 == 50735.23815966379d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter2 = metricRegistry0.counter("Default metric registry name is already set.");
        java.lang.String[] strArray6 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName7 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray6);
        io.dropwizard.metrics.MetricName metricName9 = metricName7.resolve("borg");
        io.dropwizard.metrics.Meter meter10 = metricRegistry0.meter(metricName7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap12 = metricRegistry11.getHistograms();
        io.dropwizard.metrics.Meter meter14 = metricRegistry11.meter("foobah");
        java.lang.String[] strArray18 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName19 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray18);
        io.dropwizard.metrics.MetricName metricName21 = metricName19.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder22 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram23 = metricRegistry11.getOrAdd(metricName19, histogramMetricBuilder22);
        io.dropwizard.metrics.MetricName metricName25 = metricName19.resolve("borg");
        java.lang.String[] strArray31 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName32 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray31);
        io.dropwizard.metrics.MetricName metricName33 = io.dropwizard.metrics.MetricRegistry.name("borg.foobah.one", strArray31);
        io.dropwizard.metrics.MetricName metricName34 = io.dropwizard.metrics.MetricRegistry.name("two", strArray31);
        io.dropwizard.metrics.MetricName metricName35 = metricName25.tagged(strArray31);
        boolean boolean36 = metricRegistry0.remove(metricName35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = metricName35.getTags();
        org.junit.Assert.assertNotNull(counter2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(metricName7);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertNotNull(meter10);
        org.junit.Assert.assertNotNull(metricNameMap12);
        org.junit.Assert.assertNotNull(meter14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(metricName19);
        org.junit.Assert.assertNotNull(metricName21);
        org.junit.Assert.assertNotNull(histogramMetricBuilder22);
        org.junit.Assert.assertNotNull(histogram23);
        org.junit.Assert.assertNotNull(metricName25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(metricName32);
        org.junit.Assert.assertNotNull(metricName33);
        org.junit.Assert.assertNotNull(metricName34);
        org.junit.Assert.assertNotNull(metricName35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strMap37);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer2 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer3 = metricRegistry0.register("borg", timer2);
        java.util.SortedSet<io.dropwizard.metrics.MetricName> metricNameSet4 = metricRegistry0.getNames();
        org.junit.Assert.assertNotNull(timer3);
        org.junit.Assert.assertNotNull(metricNameSet4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        histogram12.update((long) (byte) -1);
        histogram12.update((long) 10);
        histogram12.update((int) (byte) 10);
        histogram12.update(100);
        long long21 = histogram12.getCount();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 4L + "'", long21 == 4L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        io.dropwizard.metrics.MetricFilter metricFilter13 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Counter> metricNameMap14 = metricRegistry0.getCounters(metricFilter13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter17 = metricRegistry15.counter("Default metric registry name is already set.");
        java.lang.String[] strArray21 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName22 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray21);
        io.dropwizard.metrics.MetricName metricName24 = metricName22.resolve("borg");
        io.dropwizard.metrics.Meter meter25 = metricRegistry15.meter(metricName22);
        io.dropwizard.metrics.MetricRegistry metricRegistry26 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap27 = metricRegistry26.getHistograms();
        io.dropwizard.metrics.Meter meter29 = metricRegistry26.meter("foobah");
        java.lang.String[] strArray33 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName34 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray33);
        io.dropwizard.metrics.MetricName metricName36 = metricName34.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder37 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram38 = metricRegistry26.getOrAdd(metricName34, histogramMetricBuilder37);
        io.dropwizard.metrics.Histogram histogram39 = metricRegistry0.getOrAdd(metricName22, histogramMetricBuilder37);
        io.dropwizard.metrics.MetricName[] metricNameArray40 = new io.dropwizard.metrics.MetricName[] { metricName22 };
        io.dropwizard.metrics.MetricName metricName41 = io.dropwizard.metrics.MetricName.join(metricNameArray40);
        java.lang.Class<?> wildcardClass42 = metricNameArray40.getClass();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertNotNull(metricNameMap14);
        org.junit.Assert.assertNotNull(counter17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(metricName22);
        org.junit.Assert.assertNotNull(metricName24);
        org.junit.Assert.assertNotNull(meter25);
        org.junit.Assert.assertNotNull(metricNameMap27);
        org.junit.Assert.assertNotNull(meter29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(metricName34);
        org.junit.Assert.assertNotNull(metricName36);
        org.junit.Assert.assertNotNull(histogramMetricBuilder37);
        org.junit.Assert.assertNotNull(histogram38);
        org.junit.Assert.assertNotNull(histogram39);
        org.junit.Assert.assertNotNull(metricNameArray40);
        org.junit.Assert.assertNotNull(metricName41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        io.dropwizard.metrics.MetricFilter metricFilter13 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Counter> metricNameMap14 = metricRegistry0.getCounters(metricFilter13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter17 = metricRegistry15.counter("Default metric registry name is already set.");
        java.lang.String[] strArray21 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName22 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray21);
        io.dropwizard.metrics.MetricName metricName24 = metricName22.resolve("borg");
        io.dropwizard.metrics.Meter meter25 = metricRegistry15.meter(metricName22);
        io.dropwizard.metrics.MetricRegistry metricRegistry26 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap27 = metricRegistry26.getHistograms();
        io.dropwizard.metrics.Meter meter29 = metricRegistry26.meter("foobah");
        java.lang.String[] strArray33 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName34 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray33);
        io.dropwizard.metrics.MetricName metricName36 = metricName34.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder37 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram38 = metricRegistry26.getOrAdd(metricName34, histogramMetricBuilder37);
        io.dropwizard.metrics.Histogram histogram39 = metricRegistry0.getOrAdd(metricName22, histogramMetricBuilder37);
        io.dropwizard.metrics.MetricName[] metricNameArray40 = new io.dropwizard.metrics.MetricName[] { metricName22 };
        io.dropwizard.metrics.MetricName metricName41 = io.dropwizard.metrics.MetricName.join(metricNameArray40);
        io.dropwizard.metrics.MetricName metricName42 = io.dropwizard.metrics.MetricName.join(metricNameArray40);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertNotNull(metricNameMap14);
        org.junit.Assert.assertNotNull(counter17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(metricName22);
        org.junit.Assert.assertNotNull(metricName24);
        org.junit.Assert.assertNotNull(meter25);
        org.junit.Assert.assertNotNull(metricNameMap27);
        org.junit.Assert.assertNotNull(meter29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(metricName34);
        org.junit.Assert.assertNotNull(metricName36);
        org.junit.Assert.assertNotNull(histogramMetricBuilder37);
        org.junit.Assert.assertNotNull(histogram38);
        org.junit.Assert.assertNotNull(histogram39);
        org.junit.Assert.assertNotNull(metricNameArray40);
        org.junit.Assert.assertNotNull(metricName41);
        org.junit.Assert.assertNotNull(metricName42);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Clock clock1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.Timer timer2 = new io.dropwizard.metrics.Timer(reservoir0, clock1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        double double2 = timer1.getFifteenMinuteRate();
        io.dropwizard.metrics.Timer.Context context3 = timer1.time();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = context3.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(context3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer2 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer3 = metricRegistry0.register("borg", timer2);
        double double4 = timer2.getFiveMinuteRate();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timer2.time(runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timer3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap5 = metricRegistry0.getMeters(metricFilter4);
        java.util.SortedSet<io.dropwizard.metrics.MetricName> metricNameSet6 = metricRegistry0.getNames();
        io.dropwizard.metrics.Meter meter8 = metricRegistry0.meter("-1\n10\n");
        double double9 = meter8.getMeanRate();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(metricNameSet6);
        org.junit.Assert.assertNotNull(meter8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        java.util.concurrent.ConcurrentMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap13 = null;
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = new io.dropwizard.metrics.MetricRegistry(metricNameMap13);
        boolean boolean15 = histogramMetricBuilder11.isInstance((io.dropwizard.metrics.Metric) metricRegistry14);
        io.dropwizard.metrics.MetricFilter metricFilter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Counter> metricNameMap17 = metricRegistry14.getCounters(metricFilter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        io.dropwizard.metrics.Counter counter0 = new io.dropwizard.metrics.Counter();
        counter0.dec();
        counter0.dec((long) (byte) 1);
        counter0.dec();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        histogram12.update((long) (byte) -1);
        io.dropwizard.metrics.Snapshot snapshot15 = histogram12.getSnapshot();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertNotNull(snapshot15);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.dropwizard.metrics.Counter counter0 = new io.dropwizard.metrics.Counter();
        counter0.inc((long) '4');
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.Meter meter11 = metricRegistry0.meter(metricName10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter14 = metricRegistry12.counter("Default metric registry name is already set.");
        java.lang.String[] strArray18 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName19 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray18);
        io.dropwizard.metrics.MetricName metricName21 = metricName19.resolve("borg");
        io.dropwizard.metrics.Meter meter22 = metricRegistry12.meter(metricName19);
        int int23 = metricName10.compareTo(metricName19);
        io.dropwizard.metrics.Meter meter24 = new io.dropwizard.metrics.Meter();
        java.lang.String str25 = meter24.toString();
        boolean boolean26 = metricName10.equals((java.lang.Object) meter24);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(meter11);
        org.junit.Assert.assertNotNull(counter14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(metricName19);
        org.junit.Assert.assertNotNull(metricName21);
        org.junit.Assert.assertNotNull(meter22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Meter[mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0]" + "'", str25, "Meter[mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry1.removeListener(metricRegistryListener2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        java.lang.String str9 = metricName8.toString();
        boolean boolean10 = metricRegistry1.remove(metricName8);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap11 = metricRegistry1.getMetrics();
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "borg.foobah.one" + "'", str9, "borg.foobah.one");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(metricNameMap11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry0.removeListener(metricRegistryListener2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        java.lang.String str9 = metricName8.toString();
        java.lang.String[] strArray13 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName14 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray13);
        io.dropwizard.metrics.MetricName metricName16 = metricName14.resolve("borg");
        int int17 = metricName8.compareTo(metricName14);
        io.dropwizard.metrics.Meter meter18 = metricRegistry0.meter(metricName8);
        double double19 = meter18.getMeanRate();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "borg.foobah.one" + "'", str9, "borg.foobah.one");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertNotNull(metricName16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(meter18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.Meter meter11 = metricRegistry0.meter(metricName10);
        java.lang.String str12 = metricName10.getKey();
        java.lang.String str13 = metricName10.toString();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(meter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "borg.foobah.one.borg" + "'", str12, "borg.foobah.one.borg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "borg.foobah.one.borg" + "'", str13, "borg.foobah.one.borg");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.Meter meter3 = metricRegistry1.meter(".");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener6 = null;
        metricRegistry5.removeListener(metricRegistryListener6);
        java.lang.String[] strArray11 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName12 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray11);
        java.lang.String str13 = metricName12.toString();
        boolean boolean14 = metricRegistry5.remove(metricName12);
        io.dropwizard.metrics.Counter counter15 = metricRegistry1.counter(metricName12);
        counter15.inc(2L);
        counter15.inc();
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "borg.foobah.one" + "'", str13, "borg.foobah.one");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(counter15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter2 = metricRegistry0.counter("Default metric registry name is already set.");
        java.lang.String[] strArray6 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName7 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray6);
        io.dropwizard.metrics.MetricName metricName9 = metricName7.resolve("borg");
        io.dropwizard.metrics.Meter meter10 = metricRegistry0.meter(metricName7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap12 = metricRegistry11.getHistograms();
        io.dropwizard.metrics.Meter meter14 = metricRegistry11.meter("foobah");
        java.lang.String[] strArray18 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName19 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray18);
        io.dropwizard.metrics.MetricName metricName21 = metricName19.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder22 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram23 = metricRegistry11.getOrAdd(metricName19, histogramMetricBuilder22);
        io.dropwizard.metrics.MetricName metricName25 = metricName19.resolve("borg");
        java.lang.String[] strArray31 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName32 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray31);
        io.dropwizard.metrics.MetricName metricName33 = io.dropwizard.metrics.MetricRegistry.name("borg.foobah.one", strArray31);
        io.dropwizard.metrics.MetricName metricName34 = io.dropwizard.metrics.MetricRegistry.name("two", strArray31);
        io.dropwizard.metrics.MetricName metricName35 = metricName25.tagged(strArray31);
        boolean boolean36 = metricRegistry0.remove(metricName35);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap37 = metricRegistry0.getMetrics();
        java.lang.Class<?> wildcardClass38 = metricNameMap37.getClass();
        org.junit.Assert.assertNotNull(counter2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(metricName7);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertNotNull(meter10);
        org.junit.Assert.assertNotNull(metricNameMap12);
        org.junit.Assert.assertNotNull(meter14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(metricName19);
        org.junit.Assert.assertNotNull(metricName21);
        org.junit.Assert.assertNotNull(histogramMetricBuilder22);
        org.junit.Assert.assertNotNull(histogram23);
        org.junit.Assert.assertNotNull(metricName25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(metricName32);
        org.junit.Assert.assertNotNull(metricName33);
        org.junit.Assert.assertNotNull(metricName34);
        org.junit.Assert.assertNotNull(metricName35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(metricNameMap37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder0 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter3 = metricRegistry1.meter("hi!");
        meter3.mark();
        long long5 = meter3.getCount();
        boolean boolean6 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) meter3);
        io.dropwizard.metrics.Histogram histogram7 = histogramMetricBuilder0.newMetric();
        io.dropwizard.metrics.Histogram histogram8 = histogramMetricBuilder0.newMetric();
        org.junit.Assert.assertNotNull(histogramMetricBuilder0);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(histogram7);
        org.junit.Assert.assertNotNull(histogram8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter2 = metricRegistry0.counter("Default metric registry name is already set.");
        java.lang.String[] strArray6 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName7 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray6);
        io.dropwizard.metrics.MetricName metricName9 = metricName7.resolve("borg");
        io.dropwizard.metrics.Meter meter10 = metricRegistry0.meter(metricName7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap12 = metricRegistry11.getHistograms();
        io.dropwizard.metrics.Meter meter14 = metricRegistry11.meter("foobah");
        java.lang.String[] strArray18 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName19 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray18);
        io.dropwizard.metrics.MetricName metricName21 = metricName19.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder22 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram23 = metricRegistry11.getOrAdd(metricName19, histogramMetricBuilder22);
        io.dropwizard.metrics.MetricName metricName25 = metricName19.resolve("borg");
        java.lang.String[] strArray31 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName32 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray31);
        io.dropwizard.metrics.MetricName metricName33 = io.dropwizard.metrics.MetricRegistry.name("borg.foobah.one", strArray31);
        io.dropwizard.metrics.MetricName metricName34 = io.dropwizard.metrics.MetricRegistry.name("two", strArray31);
        io.dropwizard.metrics.MetricName metricName35 = metricName25.tagged(strArray31);
        boolean boolean36 = metricRegistry0.remove(metricName35);
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener37 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricRegistry0.addListener(metricRegistryListener37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(counter2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(metricName7);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertNotNull(meter10);
        org.junit.Assert.assertNotNull(metricNameMap12);
        org.junit.Assert.assertNotNull(meter14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(metricName19);
        org.junit.Assert.assertNotNull(metricName21);
        org.junit.Assert.assertNotNull(histogramMetricBuilder22);
        org.junit.Assert.assertNotNull(histogram23);
        org.junit.Assert.assertNotNull(metricName25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(metricName32);
        org.junit.Assert.assertNotNull(metricName33);
        org.junit.Assert.assertNotNull(metricName34);
        org.junit.Assert.assertNotNull(metricName35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        histogram12.update((long) (byte) -1);
        histogram12.update((long) 10);
        histogram12.update((int) (byte) 10);
        histogram12.update((int) (short) 1);
        java.lang.String str21 = histogram12.toString();
        io.dropwizard.metrics.Snapshot snapshot22 = histogram12.getSnapshot();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1\n1\n10\n10\n" + "'", str21, "-1\n1\n10\n10\n");
        org.junit.Assert.assertNotNull(snapshot22);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap5 = metricRegistry0.getMeters(metricFilter4);
        io.dropwizard.metrics.Counter counter7 = new io.dropwizard.metrics.Counter();
        counter7.inc();
        counter7.dec((long) (short) 10);
        io.dropwizard.metrics.Counter counter11 = metricRegistry0.register("Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]", counter7);
        counter11.dec();
        counter11.inc();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(counter11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap5 = metricRegistry4.getHistograms();
        io.dropwizard.metrics.Meter meter7 = metricRegistry4.meter("foobah");
        java.lang.String[] strArray11 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName12 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray11);
        io.dropwizard.metrics.MetricName metricName14 = metricName12.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder15 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram16 = metricRegistry4.getOrAdd(metricName12, histogramMetricBuilder15);
        io.dropwizard.metrics.Meter meter17 = metricRegistry0.meter(metricName12);
        java.lang.String[] strArray21 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName22 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray21);
        io.dropwizard.metrics.MetricName metricName24 = metricName22.resolve("borg");
        java.lang.String str25 = metricName22.getKey();
        io.dropwizard.metrics.Meter meter26 = metricRegistry0.meter(metricName22);
        java.lang.String str27 = metricName22.getKey();
        io.dropwizard.metrics.MetricName metricName29 = metricName22.resolve(".");
        io.dropwizard.metrics.MetricName metricName31 = metricName22.resolve("borg.foobah.one");
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(meter7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertNotNull(histogramMetricBuilder15);
        org.junit.Assert.assertNotNull(histogram16);
        org.junit.Assert.assertNotNull(meter17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(metricName22);
        org.junit.Assert.assertNotNull(metricName24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "borg.foobah.one" + "'", str25, "borg.foobah.one");
        org.junit.Assert.assertNotNull(meter26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "borg.foobah.one" + "'", str27, "borg.foobah.one");
        org.junit.Assert.assertNotNull(metricName29);
        org.junit.Assert.assertNotNull(metricName31);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry0.removeListener(metricRegistryListener2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        java.lang.String str9 = metricName8.toString();
        java.lang.String[] strArray13 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName14 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray13);
        io.dropwizard.metrics.MetricName metricName16 = metricName14.resolve("borg");
        int int17 = metricName8.compareTo(metricName14);
        io.dropwizard.metrics.Meter meter18 = metricRegistry0.meter(metricName8);
        io.dropwizard.metrics.MetricFilter metricFilter19 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap20 = metricRegistry0.getTimers(metricFilter19);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "borg.foobah.one" + "'", str9, "borg.foobah.one");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertNotNull(metricName16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(meter18);
        org.junit.Assert.assertNotNull(metricNameMap20);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.lang.String[] strArray4 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName5 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray4);
        io.dropwizard.metrics.MetricName metricName6 = io.dropwizard.metrics.MetricRegistry.name("borg.foobah.one", strArray4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = metricName6.getTags();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(metricName5);
        org.junit.Assert.assertNotNull(metricName6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry1.removeListener(metricRegistryListener2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        java.lang.String str9 = metricName8.toString();
        boolean boolean10 = metricRegistry1.remove(metricName8);
        io.dropwizard.metrics.MetricFilter metricFilter11 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap12 = metricRegistry1.getGauges(metricFilter11);
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "borg.foobah.one" + "'", str9, "borg.foobah.one");
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(metricNameMap12);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        java.util.concurrent.ConcurrentMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap13 = null;
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = new io.dropwizard.metrics.MetricRegistry(metricNameMap13);
        boolean boolean15 = histogramMetricBuilder11.isInstance((io.dropwizard.metrics.Metric) metricRegistry14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap16 = metricRegistry14.getGauges();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Counter> metricNameMap13 = metricRegistry0.getCounters();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap14 = metricRegistry0.getMeters();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener15 = null;
        metricRegistry0.removeListener(metricRegistryListener15);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertNotNull(metricNameMap13);
        org.junit.Assert.assertNotNull(metricNameMap14);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        io.dropwizard.metrics.Counter counter0 = new io.dropwizard.metrics.Counter();
        counter0.dec();
        long long2 = counter0.getCount();
        counter0.inc();
        counter0.dec((long) (short) 0);
        counter0.inc((long) (byte) 0);
        long long8 = counter0.getCount();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.dropwizard.metrics.SharedMetricRegistries.remove("");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap2 = metricRegistry0.getTimers();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap3 = metricRegistry0.getMeters();
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap6 = metricRegistry5.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener7 = null;
        metricRegistry5.removeListener(metricRegistryListener7);
        java.lang.String[] strArray12 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName13 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray12);
        java.lang.String str14 = metricName13.toString();
        java.lang.String[] strArray18 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName19 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray18);
        io.dropwizard.metrics.MetricName metricName21 = metricName19.resolve("borg");
        int int22 = metricName13.compareTo(metricName19);
        io.dropwizard.metrics.Meter meter23 = metricRegistry5.meter(metricName13);
        io.dropwizard.metrics.MetricRegistry metricRegistry24 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap25 = metricRegistry24.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter26 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap27 = metricRegistry24.getGauges(metricFilter26);
        java.lang.String[] strArray31 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName32 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray31);
        io.dropwizard.metrics.MetricName metricName34 = metricName32.resolve("borg");
        io.dropwizard.metrics.Meter meter35 = metricRegistry24.meter(metricName34);
        io.dropwizard.metrics.MetricRegistry metricRegistry36 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap37 = metricRegistry36.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap38 = metricRegistry36.getTimers();
        boolean boolean39 = metricName34.equals((java.lang.Object) metricNameMap38);
        io.dropwizard.metrics.Meter meter40 = metricRegistry5.meter(metricName34);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = metricName34.getTags();
        io.dropwizard.metrics.MetricName metricName42 = new io.dropwizard.metrics.MetricName("Default metric registry name is already set.", strMap41);
        io.dropwizard.metrics.Meter meter43 = metricRegistry0.meter(metricName42);
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap44 = metricRegistry0.getMeters();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(metricName13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "borg.foobah.one" + "'", str14, "borg.foobah.one");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(metricName19);
        org.junit.Assert.assertNotNull(metricName21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(meter23);
        org.junit.Assert.assertNotNull(metricNameMap25);
        org.junit.Assert.assertNotNull(metricNameMap27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(metricName32);
        org.junit.Assert.assertNotNull(metricName34);
        org.junit.Assert.assertNotNull(meter35);
        org.junit.Assert.assertNotNull(metricNameMap37);
        org.junit.Assert.assertNotNull(metricNameMap38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(meter40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(meter43);
        org.junit.Assert.assertNotNull(metricNameMap44);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap2 = metricRegistry0.getMeters();
        io.dropwizard.metrics.MetricFilter metricFilter3 = null;
        metricRegistry0.removeMatching(metricFilter3);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap2 = metricRegistry1.getHistograms();
        io.dropwizard.metrics.Meter meter4 = metricRegistry1.meter("foobah");
        java.lang.String[] strArray8 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName9 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray8);
        io.dropwizard.metrics.MetricName metricName11 = metricName9.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder12 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram13 = metricRegistry1.getOrAdd(metricName9, histogramMetricBuilder12);
        io.dropwizard.metrics.MetricFilter metricFilter14 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Counter> metricNameMap15 = metricRegistry1.getCounters(metricFilter14);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter18 = metricRegistry16.counter("Default metric registry name is already set.");
        java.lang.String[] strArray22 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName23 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray22);
        io.dropwizard.metrics.MetricName metricName25 = metricName23.resolve("borg");
        io.dropwizard.metrics.Meter meter26 = metricRegistry16.meter(metricName23);
        io.dropwizard.metrics.MetricRegistry metricRegistry27 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap28 = metricRegistry27.getHistograms();
        io.dropwizard.metrics.Meter meter30 = metricRegistry27.meter("foobah");
        java.lang.String[] strArray34 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName35 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray34);
        io.dropwizard.metrics.MetricName metricName37 = metricName35.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder38 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram39 = metricRegistry27.getOrAdd(metricName35, histogramMetricBuilder38);
        io.dropwizard.metrics.Histogram histogram40 = metricRegistry1.getOrAdd(metricName23, histogramMetricBuilder38);
        java.lang.String[] strArray45 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName46 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray45);
        io.dropwizard.metrics.MetricName metricName47 = io.dropwizard.metrics.MetricRegistry.name("Default metric registry name is already set.", strArray45);
        io.dropwizard.metrics.MetricName metricName48 = metricName23.tagged(strArray45);
        io.dropwizard.metrics.MetricName metricName49 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray45);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(meter4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertNotNull(metricName11);
        org.junit.Assert.assertNotNull(histogramMetricBuilder12);
        org.junit.Assert.assertNotNull(histogram13);
        org.junit.Assert.assertNotNull(metricNameMap15);
        org.junit.Assert.assertNotNull(counter18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(metricName23);
        org.junit.Assert.assertNotNull(metricName25);
        org.junit.Assert.assertNotNull(meter26);
        org.junit.Assert.assertNotNull(metricNameMap28);
        org.junit.Assert.assertNotNull(meter30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(metricName35);
        org.junit.Assert.assertNotNull(metricName37);
        org.junit.Assert.assertNotNull(histogramMetricBuilder38);
        org.junit.Assert.assertNotNull(histogram39);
        org.junit.Assert.assertNotNull(histogram40);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(metricName46);
        org.junit.Assert.assertNotNull(metricName47);
        org.junit.Assert.assertNotNull(metricName48);
        org.junit.Assert.assertNotNull(metricName49);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry1.removeListener(metricRegistryListener2);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry1.getMetrics();
        metricRegistry1.removeAll();
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap7 = metricRegistry6.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener8 = null;
        metricRegistry6.removeListener(metricRegistryListener8);
        java.lang.String[] strArray13 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName14 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray13);
        java.lang.String str15 = metricName14.toString();
        java.lang.String[] strArray19 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName20 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray19);
        io.dropwizard.metrics.MetricName metricName22 = metricName20.resolve("borg");
        int int23 = metricName14.compareTo(metricName20);
        io.dropwizard.metrics.Meter meter24 = metricRegistry6.meter(metricName14);
        io.dropwizard.metrics.MetricRegistry metricRegistry25 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap26 = metricRegistry25.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter27 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap28 = metricRegistry25.getGauges(metricFilter27);
        java.lang.String[] strArray32 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName33 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray32);
        io.dropwizard.metrics.MetricName metricName35 = metricName33.resolve("borg");
        io.dropwizard.metrics.Meter meter36 = metricRegistry25.meter(metricName35);
        io.dropwizard.metrics.MetricRegistry metricRegistry37 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap38 = metricRegistry37.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap39 = metricRegistry37.getTimers();
        boolean boolean40 = metricName35.equals((java.lang.Object) metricNameMap39);
        io.dropwizard.metrics.Meter meter41 = metricRegistry6.meter(metricName35);
        java.util.Map<java.lang.String, java.lang.String> strMap42 = metricName35.getTags();
        io.dropwizard.metrics.Meter meter43 = metricRegistry1.meter(metricName35);
        io.dropwizard.metrics.MetricRegistry metricRegistry44 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap45 = metricRegistry44.getHistograms();
        io.dropwizard.metrics.Meter meter47 = metricRegistry44.meter("foobah");
        metricRegistry1.registerAll((io.dropwizard.metrics.MetricSet) metricRegistry44);
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(metricNameMap7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "borg.foobah.one" + "'", str15, "borg.foobah.one");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(metricName20);
        org.junit.Assert.assertNotNull(metricName22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(meter24);
        org.junit.Assert.assertNotNull(metricNameMap26);
        org.junit.Assert.assertNotNull(metricNameMap28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(metricName33);
        org.junit.Assert.assertNotNull(metricName35);
        org.junit.Assert.assertNotNull(meter36);
        org.junit.Assert.assertNotNull(metricNameMap38);
        org.junit.Assert.assertNotNull(metricNameMap39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(meter41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(meter43);
        org.junit.Assert.assertNotNull(metricNameMap45);
        org.junit.Assert.assertNotNull(meter47);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        double double2 = timer1.getFiveMinuteRate();
        io.dropwizard.metrics.Timer.Context context3 = timer1.time();
        double double4 = timer1.getFifteenMinuteRate();
        double double5 = timer1.getFifteenMinuteRate();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(context3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener4 = null;
        metricRegistry0.removeListener(metricRegistryListener4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap7 = metricRegistry6.getMetrics();
        io.dropwizard.metrics.Timer timer9 = metricRegistry6.timer("26");
        metricRegistry0.registerAll((io.dropwizard.metrics.MetricSet) metricRegistry6);
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener11 = null;
        metricRegistry0.removeListener(metricRegistryListener11);
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap7);
        org.junit.Assert.assertNotNull(timer9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap2 = metricRegistry1.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener3 = null;
        metricRegistry1.removeListener(metricRegistryListener3);
        java.lang.String[] strArray8 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName9 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray8);
        java.lang.String str10 = metricName9.toString();
        java.lang.String[] strArray14 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName15 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray14);
        io.dropwizard.metrics.MetricName metricName17 = metricName15.resolve("borg");
        int int18 = metricName9.compareTo(metricName15);
        io.dropwizard.metrics.Meter meter19 = metricRegistry1.meter(metricName9);
        io.dropwizard.metrics.MetricRegistry metricRegistry20 = io.dropwizard.metrics.SharedMetricRegistries.add("Default metric registry name is already set.", metricRegistry1);
        io.dropwizard.metrics.MetricFilter metricFilter21 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap22 = metricRegistry1.getTimers(metricFilter21);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "borg.foobah.one" + "'", str10, "borg.foobah.one");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(metricName15);
        org.junit.Assert.assertNotNull(metricName17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(meter19);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry20);
        org.junit.Assert.assertNotNull(metricNameMap22);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry0.removeListener(metricRegistryListener2);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap6 = metricRegistry5.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter7 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap8 = metricRegistry5.getGauges(metricFilter7);
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap10 = metricRegistry9.getHistograms();
        io.dropwizard.metrics.Meter meter12 = metricRegistry9.meter("foobah");
        java.lang.String[] strArray16 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName17 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray16);
        io.dropwizard.metrics.MetricName metricName19 = metricName17.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder20 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram21 = metricRegistry9.getOrAdd(metricName17, histogramMetricBuilder20);
        io.dropwizard.metrics.Meter meter22 = metricRegistry5.meter(metricName17);
        io.dropwizard.metrics.MetricFilter metricFilter23 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap24 = metricRegistry5.getHistograms(metricFilter23);
        metricRegistry0.registerAll((io.dropwizard.metrics.MetricSet) metricRegistry5);
        java.util.Map<java.lang.String, java.lang.String> strMap27 = io.dropwizard.metrics.MetricName.EMPTY_TAGS;
        io.dropwizard.metrics.MetricName metricName28 = new io.dropwizard.metrics.MetricName("", strMap27);
        io.dropwizard.metrics.MetricName metricName30 = metricName28.resolve(".");
        io.dropwizard.metrics.Histogram histogram31 = metricRegistry5.histogram(metricName30);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(metricNameMap6);
        org.junit.Assert.assertNotNull(metricNameMap8);
        org.junit.Assert.assertNotNull(metricNameMap10);
        org.junit.Assert.assertNotNull(meter12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(metricName17);
        org.junit.Assert.assertNotNull(metricName19);
        org.junit.Assert.assertNotNull(histogramMetricBuilder20);
        org.junit.Assert.assertNotNull(histogram21);
        org.junit.Assert.assertNotNull(meter22);
        org.junit.Assert.assertNotNull(metricNameMap24);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(metricName30);
        org.junit.Assert.assertNotNull(histogram31);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap3 = metricRegistry2.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap5 = metricRegistry2.getGauges(metricFilter4);
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        io.dropwizard.metrics.MetricName metricName12 = metricName10.resolve("borg");
        io.dropwizard.metrics.Meter meter13 = metricRegistry2.meter(metricName12);
        java.lang.String str14 = metricName12.getKey();
        io.dropwizard.metrics.Timer timer15 = metricRegistry0.timer(metricName12);
        io.dropwizard.metrics.MetricRegistry metricRegistry16 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap17 = metricRegistry16.getHistograms();
        io.dropwizard.metrics.Meter meter19 = metricRegistry16.meter("foobah");
        java.lang.String[] strArray23 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName24 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray23);
        io.dropwizard.metrics.MetricName metricName26 = metricName24.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder27 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram28 = metricRegistry16.getOrAdd(metricName24, histogramMetricBuilder27);
        io.dropwizard.metrics.MetricName metricName30 = metricName24.resolve("borg");
        io.dropwizard.metrics.MetricRegistry metricRegistry31 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap32 = metricRegistry31.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter33 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap34 = metricRegistry31.getGauges(metricFilter33);
        java.lang.String[] strArray38 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName39 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray38);
        io.dropwizard.metrics.MetricName metricName41 = metricName39.resolve("borg");
        io.dropwizard.metrics.Meter meter42 = metricRegistry31.meter(metricName41);
        io.dropwizard.metrics.MetricRegistry metricRegistry43 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap44 = metricRegistry43.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap45 = metricRegistry43.getTimers();
        boolean boolean46 = metricName41.equals((java.lang.Object) metricNameMap45);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = io.dropwizard.metrics.MetricName.EMPTY_TAGS;
        io.dropwizard.metrics.MetricName metricName48 = metricName41.tagged(strMap47);
        io.dropwizard.metrics.MetricName[] metricNameArray49 = new io.dropwizard.metrics.MetricName[] { metricName12, metricName24, metricName48 };
        io.dropwizard.metrics.MetricName metricName50 = io.dropwizard.metrics.MetricName.join(metricNameArray49);
        io.dropwizard.metrics.MetricName metricName51 = io.dropwizard.metrics.MetricName.join(metricNameArray49);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(meter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "borg.foobah.one.borg" + "'", str14, "borg.foobah.one.borg");
        org.junit.Assert.assertNotNull(timer15);
        org.junit.Assert.assertNotNull(metricNameMap17);
        org.junit.Assert.assertNotNull(meter19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(metricName24);
        org.junit.Assert.assertNotNull(metricName26);
        org.junit.Assert.assertNotNull(histogramMetricBuilder27);
        org.junit.Assert.assertNotNull(histogram28);
        org.junit.Assert.assertNotNull(metricName30);
        org.junit.Assert.assertNotNull(metricNameMap32);
        org.junit.Assert.assertNotNull(metricNameMap34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(metricName39);
        org.junit.Assert.assertNotNull(metricName41);
        org.junit.Assert.assertNotNull(meter42);
        org.junit.Assert.assertNotNull(metricNameMap44);
        org.junit.Assert.assertNotNull(metricNameMap45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(metricName48);
        org.junit.Assert.assertNotNull(metricNameArray49);
        org.junit.Assert.assertNotNull(metricName50);
        org.junit.Assert.assertNotNull(metricName51);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer6 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer7 = metricRegistry4.register("borg", timer6);
        metricRegistry0.registerAll((io.dropwizard.metrics.MetricSet) metricRegistry4);
        java.lang.String[] strArray12 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName13 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap15 = metricRegistry14.getHistograms();
        io.dropwizard.metrics.Meter meter17 = metricRegistry14.meter("foobah");
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap18 = metricRegistry14.getMetrics();
        io.dropwizard.metrics.MetricName metricName20 = new io.dropwizard.metrics.MetricName("borg");
        io.dropwizard.metrics.Counter counter21 = metricRegistry14.counter(metricName20);
        int int22 = metricName13.compareTo(metricName20);
        io.dropwizard.metrics.MetricRegistry metricRegistry23 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap24 = metricRegistry23.getHistograms();
        io.dropwizard.metrics.Meter meter26 = metricRegistry23.meter("foobah");
        java.lang.String[] strArray30 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName31 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray30);
        io.dropwizard.metrics.MetricName metricName33 = metricName31.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder34 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram35 = metricRegistry23.getOrAdd(metricName31, histogramMetricBuilder34);
        io.dropwizard.metrics.Histogram histogram36 = histogramMetricBuilder34.newMetric();
        io.dropwizard.metrics.Histogram histogram37 = histogramMetricBuilder34.newMetric();
        io.dropwizard.metrics.Histogram histogram38 = metricRegistry0.getOrAdd(metricName13, histogramMetricBuilder34);
        io.dropwizard.metrics.Histogram histogram39 = histogramMetricBuilder34.newMetric();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(timer7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(metricName13);
        org.junit.Assert.assertNotNull(metricNameMap15);
        org.junit.Assert.assertNotNull(meter17);
        org.junit.Assert.assertNotNull(metricNameMap18);
        org.junit.Assert.assertNotNull(counter21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertNotNull(metricNameMap24);
        org.junit.Assert.assertNotNull(meter26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(metricName31);
        org.junit.Assert.assertNotNull(metricName33);
        org.junit.Assert.assertNotNull(histogramMetricBuilder34);
        org.junit.Assert.assertNotNull(histogram35);
        org.junit.Assert.assertNotNull(histogram36);
        org.junit.Assert.assertNotNull(histogram37);
        org.junit.Assert.assertNotNull(histogram38);
        org.junit.Assert.assertNotNull(histogram39);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.Meter meter11 = metricRegistry0.meter(metricName10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap13 = metricRegistry12.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap14 = metricRegistry12.getTimers();
        boolean boolean15 = metricName10.equals((java.lang.Object) metricNameMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = io.dropwizard.metrics.MetricName.EMPTY_TAGS;
        io.dropwizard.metrics.MetricName metricName17 = metricName10.tagged(strMap16);
        io.dropwizard.metrics.MetricName[] metricNameArray18 = new io.dropwizard.metrics.MetricName[] { metricName10 };
        io.dropwizard.metrics.MetricName metricName19 = io.dropwizard.metrics.MetricName.join(metricNameArray18);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(meter11);
        org.junit.Assert.assertNotNull(metricNameMap13);
        org.junit.Assert.assertNotNull(metricNameMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(metricName17);
        org.junit.Assert.assertNotNull(metricNameArray18);
        org.junit.Assert.assertNotNull(metricName19);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry1.removeListener(metricRegistryListener2);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry1.getMetrics();
        metricRegistry1.removeAll();
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        java.lang.String str11 = metricName10.toString();
        java.lang.String[] strArray12 = null;
        io.dropwizard.metrics.MetricName metricName13 = metricName10.tagged(strArray12);
        io.dropwizard.metrics.Reservoir reservoir14 = null;
        io.dropwizard.metrics.Timer timer15 = new io.dropwizard.metrics.Timer(reservoir14);
        double double16 = timer15.getFifteenMinuteRate();
        io.dropwizard.metrics.Timer timer17 = metricRegistry1.register(metricName13, timer15);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap19 = metricRegistry18.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter20 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap21 = metricRegistry18.getGauges(metricFilter20);
        java.lang.String[] strArray25 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName26 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray25);
        io.dropwizard.metrics.MetricName metricName28 = metricName26.resolve("borg");
        io.dropwizard.metrics.Meter meter29 = metricRegistry18.meter(metricName28);
        io.dropwizard.metrics.MetricRegistry metricRegistry30 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap31 = metricRegistry30.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap32 = metricRegistry30.getTimers();
        boolean boolean33 = metricName28.equals((java.lang.Object) metricNameMap32);
        java.util.Map<java.lang.String, java.lang.String> strMap34 = io.dropwizard.metrics.MetricName.EMPTY_TAGS;
        io.dropwizard.metrics.MetricName metricName35 = metricName28.tagged(strMap34);
        io.dropwizard.metrics.Reservoir reservoir36 = null;
        io.dropwizard.metrics.Timer timer37 = new io.dropwizard.metrics.Timer(reservoir36);
        java.lang.String str38 = timer37.toString();
        long long39 = timer37.getCount();
        double double40 = timer37.getMeanRate();
        io.dropwizard.metrics.Timer timer41 = metricRegistry1.register(metricName35, timer37);
        io.dropwizard.metrics.Timer.Context context42 = timer41.time();
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "borg.foobah.one" + "'", str11, "borg.foobah.one");
        org.junit.Assert.assertNotNull(metricName13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(timer17);
        org.junit.Assert.assertNotNull(metricNameMap19);
        org.junit.Assert.assertNotNull(metricNameMap21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(metricName26);
        org.junit.Assert.assertNotNull(metricName28);
        org.junit.Assert.assertNotNull(meter29);
        org.junit.Assert.assertNotNull(metricNameMap31);
        org.junit.Assert.assertNotNull(metricNameMap32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(metricName35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str38, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(timer41);
        org.junit.Assert.assertNotNull(context42);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry1.removeListener(metricRegistryListener2);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry1.getMetrics();
        io.dropwizard.metrics.Histogram histogram6 = metricRegistry1.histogram("-1\n10\n");
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap7 = metricRegistry1.getTimers();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap8 = metricRegistry1.getMeters();
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(histogram6);
        org.junit.Assert.assertNotNull(metricNameMap7);
        org.junit.Assert.assertNotNull(metricNameMap8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Histogram histogram1 = new io.dropwizard.metrics.Histogram(reservoir0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap2 = metricRegistry0.getTimers();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap3 = metricRegistry0.getTimers();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricNameMap3);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder0 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter3 = metricRegistry1.meter("hi!");
        meter3.mark();
        long long5 = meter3.getCount();
        boolean boolean6 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) meter3);
        io.dropwizard.metrics.Meter meter7 = new io.dropwizard.metrics.Meter();
        double double8 = meter7.getOneMinuteRate();
        boolean boolean9 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) meter7);
        meter7.mark();
        org.junit.Assert.assertNotNull(histogramMetricBuilder0);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap3 = metricRegistry2.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap5 = metricRegistry2.getGauges(metricFilter4);
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        io.dropwizard.metrics.MetricName metricName12 = metricName10.resolve("borg");
        io.dropwizard.metrics.Meter meter13 = metricRegistry2.meter(metricName12);
        java.lang.String str14 = metricName12.getKey();
        io.dropwizard.metrics.Timer timer15 = metricRegistry0.timer(metricName12);
        io.dropwizard.metrics.MetricFilter metricFilter16 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap17 = metricRegistry0.getGauges(metricFilter16);
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap18 = metricRegistry0.getGauges();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap19 = metricRegistry0.getHistograms();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(meter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "borg.foobah.one.borg" + "'", str14, "borg.foobah.one.borg");
        org.junit.Assert.assertNotNull(timer15);
        org.junit.Assert.assertNotNull(metricNameMap17);
        org.junit.Assert.assertNotNull(metricNameMap18);
        org.junit.Assert.assertNotNull(metricNameMap19);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener2 = null;
        metricRegistry1.removeListener(metricRegistryListener2);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry1.getMetrics();
        io.dropwizard.metrics.Counter counter6 = metricRegistry1.counter("Meter[mean=31850.68399343876, 1m=0.0, 5m=0.0, 15m=0.0]");
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(counter6);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter2 = metricRegistry0.counter("Default metric registry name is already set.");
        java.lang.String[] strArray6 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName7 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray6);
        io.dropwizard.metrics.MetricName metricName9 = metricName7.resolve("borg");
        io.dropwizard.metrics.Meter meter10 = metricRegistry0.meter(metricName7);
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap12 = metricRegistry11.getHistograms();
        io.dropwizard.metrics.Meter meter14 = metricRegistry11.meter("foobah");
        java.lang.String[] strArray18 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName19 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray18);
        io.dropwizard.metrics.MetricName metricName21 = metricName19.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder22 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram23 = metricRegistry11.getOrAdd(metricName19, histogramMetricBuilder22);
        io.dropwizard.metrics.MetricName metricName25 = metricName19.resolve("borg");
        java.lang.String[] strArray31 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName32 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray31);
        io.dropwizard.metrics.MetricName metricName33 = io.dropwizard.metrics.MetricRegistry.name("borg.foobah.one", strArray31);
        io.dropwizard.metrics.MetricName metricName34 = io.dropwizard.metrics.MetricRegistry.name("two", strArray31);
        io.dropwizard.metrics.MetricName metricName35 = metricName25.tagged(strArray31);
        boolean boolean36 = metricRegistry0.remove(metricName35);
        java.lang.Object obj37 = null;
        boolean boolean38 = metricName35.equals(obj37);
        org.junit.Assert.assertNotNull(counter2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(metricName7);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertNotNull(meter10);
        org.junit.Assert.assertNotNull(metricNameMap12);
        org.junit.Assert.assertNotNull(meter14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(metricName19);
        org.junit.Assert.assertNotNull(metricName21);
        org.junit.Assert.assertNotNull(histogramMetricBuilder22);
        org.junit.Assert.assertNotNull(histogram23);
        org.junit.Assert.assertNotNull(metricName25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(metricName32);
        org.junit.Assert.assertNotNull(metricName33);
        org.junit.Assert.assertNotNull(metricName34);
        org.junit.Assert.assertNotNull(metricName35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap3 = metricRegistry2.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap5 = metricRegistry2.getGauges(metricFilter4);
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        io.dropwizard.metrics.MetricName metricName12 = metricName10.resolve("borg");
        io.dropwizard.metrics.Meter meter13 = metricRegistry2.meter(metricName12);
        java.lang.String str14 = metricName12.getKey();
        io.dropwizard.metrics.Timer timer15 = metricRegistry0.timer(metricName12);
        io.dropwizard.metrics.MetricFilter metricFilter16 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap17 = metricRegistry0.getGauges(metricFilter16);
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap18 = metricRegistry0.getGauges();
        io.dropwizard.metrics.MetricFilter metricFilter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricRegistry0.removeMatching(metricFilter19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(meter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "borg.foobah.one.borg" + "'", str14, "borg.foobah.one.borg");
        org.junit.Assert.assertNotNull(timer15);
        org.junit.Assert.assertNotNull(metricNameMap17);
        org.junit.Assert.assertNotNull(metricNameMap18);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener3 = null;
        metricRegistry2.removeListener(metricRegistryListener3);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap5 = metricRegistry2.getMetrics();
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.setDefault("Meter[mean=17598.817359473444, 1m=0.0, 5m=0.0, 15m=0.0]", metricRegistry2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Default metric registry name is already set.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry2);
        org.junit.Assert.assertNotNull(metricNameMap5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap3 = metricRegistry2.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap5 = metricRegistry2.getGauges(metricFilter4);
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        io.dropwizard.metrics.MetricName metricName12 = metricName10.resolve("borg");
        io.dropwizard.metrics.Meter meter13 = metricRegistry2.meter(metricName12);
        java.lang.String str14 = metricName12.getKey();
        io.dropwizard.metrics.Timer timer15 = metricRegistry0.timer(metricName12);
        io.dropwizard.metrics.MetricFilter metricFilter16 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap17 = metricRegistry0.getGauges(metricFilter16);
        io.dropwizard.metrics.MetricRegistry metricRegistry18 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap19 = metricRegistry18.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter20 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap21 = metricRegistry18.getGauges(metricFilter20);
        java.lang.String[] strArray25 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName26 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray25);
        io.dropwizard.metrics.MetricName metricName28 = metricName26.resolve("borg");
        io.dropwizard.metrics.Meter meter29 = metricRegistry18.meter(metricName28);
        io.dropwizard.metrics.MetricName metricName30 = new io.dropwizard.metrics.MetricName();
        io.dropwizard.metrics.Meter meter31 = new io.dropwizard.metrics.Meter();
        boolean boolean32 = metricName30.equals((java.lang.Object) meter31);
        io.dropwizard.metrics.Counter counter33 = new io.dropwizard.metrics.Counter();
        counter33.dec();
        long long35 = counter33.getCount();
        counter33.inc();
        counter33.inc();
        io.dropwizard.metrics.Counter counter38 = metricRegistry18.register(metricName30, counter33);
        io.dropwizard.metrics.Histogram histogram39 = metricRegistry0.histogram(metricName30);
        io.dropwizard.metrics.MetricRegistry metricRegistry40 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap41 = metricRegistry40.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter42 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap43 = metricRegistry40.getGauges(metricFilter42);
        io.dropwizard.metrics.MetricRegistry metricRegistry44 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap45 = metricRegistry44.getHistograms();
        io.dropwizard.metrics.Meter meter47 = metricRegistry44.meter("foobah");
        java.lang.String[] strArray51 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName52 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray51);
        io.dropwizard.metrics.MetricName metricName54 = metricName52.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder55 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram56 = metricRegistry44.getOrAdd(metricName52, histogramMetricBuilder55);
        io.dropwizard.metrics.Meter meter57 = metricRegistry40.meter(metricName52);
        io.dropwizard.metrics.Counter counter58 = metricRegistry0.counter(metricName52);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(meter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "borg.foobah.one.borg" + "'", str14, "borg.foobah.one.borg");
        org.junit.Assert.assertNotNull(timer15);
        org.junit.Assert.assertNotNull(metricNameMap17);
        org.junit.Assert.assertNotNull(metricNameMap19);
        org.junit.Assert.assertNotNull(metricNameMap21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(metricName26);
        org.junit.Assert.assertNotNull(metricName28);
        org.junit.Assert.assertNotNull(meter29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(counter38);
        org.junit.Assert.assertNotNull(histogram39);
        org.junit.Assert.assertNotNull(metricNameMap41);
        org.junit.Assert.assertNotNull(metricNameMap43);
        org.junit.Assert.assertNotNull(metricNameMap45);
        org.junit.Assert.assertNotNull(meter47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(metricName52);
        org.junit.Assert.assertNotNull(metricName54);
        org.junit.Assert.assertNotNull(histogramMetricBuilder55);
        org.junit.Assert.assertNotNull(histogram56);
        org.junit.Assert.assertNotNull(meter57);
        org.junit.Assert.assertNotNull(counter58);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        io.dropwizard.metrics.Histogram histogram13 = histogramMetricBuilder11.newMetric();
        io.dropwizard.metrics.Histogram histogram14 = histogramMetricBuilder11.newMetric();
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap16 = metricRegistry15.getHistograms();
        io.dropwizard.metrics.Meter meter18 = metricRegistry15.meter("foobah");
        java.lang.String[] strArray22 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName23 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray22);
        io.dropwizard.metrics.MetricName metricName25 = metricName23.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder26 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram27 = metricRegistry15.getOrAdd(metricName23, histogramMetricBuilder26);
        histogram27.update((int) (short) 100);
        long long30 = histogram27.getCount();
        io.dropwizard.metrics.Snapshot snapshot31 = histogram27.getSnapshot();
        boolean boolean32 = histogramMetricBuilder11.isInstance((io.dropwizard.metrics.Metric) histogram27);
        java.lang.String str33 = histogram27.toString();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertNotNull(histogram13);
        org.junit.Assert.assertNotNull(histogram14);
        org.junit.Assert.assertNotNull(metricNameMap16);
        org.junit.Assert.assertNotNull(meter18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(metricName23);
        org.junit.Assert.assertNotNull(metricName25);
        org.junit.Assert.assertNotNull(histogramMetricBuilder26);
        org.junit.Assert.assertNotNull(histogram27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(snapshot31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "100\n" + "'", str33, "100\n");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder0 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter3 = metricRegistry1.meter("hi!");
        meter3.mark();
        long long5 = meter3.getCount();
        boolean boolean6 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) meter3);
        io.dropwizard.metrics.Meter meter7 = new io.dropwizard.metrics.Meter();
        double double8 = meter7.getOneMinuteRate();
        boolean boolean9 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) meter7);
        double double10 = meter7.getFifteenMinuteRate();
        org.junit.Assert.assertNotNull(histogramMetricBuilder0);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        io.dropwizard.metrics.MetricFilter metricFilter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap4 = metricRegistry0.getMeters(metricFilter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(meter2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        java.lang.String str2 = timer1.toString();
        java.lang.String str3 = timer1.toString();
        double double4 = timer1.getMeanRate();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str2, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str3, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricName metricName6 = new io.dropwizard.metrics.MetricName("borg");
        io.dropwizard.metrics.Counter counter7 = metricRegistry0.counter(metricName6);
        io.dropwizard.metrics.MetricRegistry metricRegistry8 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap9 = metricRegistry8.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter10 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap11 = metricRegistry8.getGauges(metricFilter10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap13 = metricRegistry12.getHistograms();
        io.dropwizard.metrics.Meter meter15 = metricRegistry12.meter("foobah");
        java.lang.String[] strArray19 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName20 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray19);
        io.dropwizard.metrics.MetricName metricName22 = metricName20.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder23 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram24 = metricRegistry12.getOrAdd(metricName20, histogramMetricBuilder23);
        io.dropwizard.metrics.Meter meter25 = metricRegistry8.meter(metricName20);
        java.lang.String[] strArray29 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName30 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray29);
        io.dropwizard.metrics.MetricName metricName32 = metricName30.resolve("borg");
        java.lang.String str33 = metricName30.getKey();
        io.dropwizard.metrics.Meter meter34 = metricRegistry8.meter(metricName30);
        java.lang.String str35 = metricName30.getKey();
        io.dropwizard.metrics.MetricName metricName37 = metricName30.resolve(".");
        io.dropwizard.metrics.Timer timer38 = metricRegistry0.timer(metricName37);
        java.util.concurrent.TimeUnit timeUnit40 = null;
        // The following exception was thrown during execution in test generation
        try {
            timer38.update((long) (short) 1, timeUnit40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(counter7);
        org.junit.Assert.assertNotNull(metricNameMap9);
        org.junit.Assert.assertNotNull(metricNameMap11);
        org.junit.Assert.assertNotNull(metricNameMap13);
        org.junit.Assert.assertNotNull(meter15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(metricName20);
        org.junit.Assert.assertNotNull(metricName22);
        org.junit.Assert.assertNotNull(histogramMetricBuilder23);
        org.junit.Assert.assertNotNull(histogram24);
        org.junit.Assert.assertNotNull(meter25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(metricName30);
        org.junit.Assert.assertNotNull(metricName32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "borg.foobah.one" + "'", str33, "borg.foobah.one");
        org.junit.Assert.assertNotNull(meter34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "borg.foobah.one" + "'", str35, "borg.foobah.one");
        org.junit.Assert.assertNotNull(metricName37);
        org.junit.Assert.assertNotNull(timer38);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricName metricName6 = new io.dropwizard.metrics.MetricName("borg");
        io.dropwizard.metrics.Counter counter7 = metricRegistry0.counter(metricName6);
        io.dropwizard.metrics.Timer timer9 = metricRegistry0.timer("borg.foobah.one");
        io.dropwizard.metrics.Timer.Context context10 = timer9.time();
        double double11 = timer9.getFifteenMinuteRate();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(counter7);
        org.junit.Assert.assertNotNull(timer9);
        org.junit.Assert.assertNotNull(context10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("");
        org.junit.Assert.assertNotNull(metricRegistry1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        meter2.mark();
        double double4 = meter2.getFifteenMinuteRate();
        meter2.mark();
        double double6 = meter2.getFiveMinuteRate();
        meter2.mark();
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder0 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap2 = metricRegistry1.getHistograms();
        io.dropwizard.metrics.Meter meter4 = metricRegistry1.meter("foobah");
        java.lang.String[] strArray8 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName9 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray8);
        io.dropwizard.metrics.MetricName metricName11 = metricName9.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder12 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram13 = metricRegistry1.getOrAdd(metricName9, histogramMetricBuilder12);
        boolean boolean14 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) histogram13);
        long long15 = histogram13.getCount();
        org.junit.Assert.assertNotNull(histogramMetricBuilder0);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(meter4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertNotNull(metricName11);
        org.junit.Assert.assertNotNull(histogramMetricBuilder12);
        org.junit.Assert.assertNotNull(histogram13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.Meter meter11 = metricRegistry0.meter(metricName10);
        io.dropwizard.metrics.MetricFilter metricFilter12 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap13 = metricRegistry0.getGauges(metricFilter12);
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricRegistry0.addListener(metricRegistryListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(meter11);
        org.junit.Assert.assertNotNull(metricNameMap13);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        java.lang.String str2 = timer1.toString();
        double double3 = timer1.getOneMinuteRate();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str2, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        java.lang.String str2 = timer1.toString();
        long long3 = timer1.getCount();
        long long4 = timer1.getCount();
        double double5 = timer1.getFifteenMinuteRate();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timer1.update((long) (short) -1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str2, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter2 = metricRegistry0.counter("Default metric registry name is already set.");
        counter2.inc();
        counter2.inc(0L);
        long long6 = counter2.getCount();
        org.junit.Assert.assertNotNull(counter2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap5 = metricRegistry0.getMeters(metricFilter4);
        io.dropwizard.metrics.Counter counter7 = new io.dropwizard.metrics.Counter();
        counter7.inc();
        counter7.dec((long) (short) 10);
        io.dropwizard.metrics.Counter counter11 = metricRegistry0.register("Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]", counter7);
        io.dropwizard.metrics.Histogram histogram13 = metricRegistry0.histogram("hi!");
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(counter11);
        org.junit.Assert.assertNotNull(histogram13);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        histogram12.update((int) (short) 100);
        long long15 = histogram12.getCount();
        histogram12.update((int) (short) 0);
        long long18 = histogram12.getCount();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        io.dropwizard.metrics.MetricName metricName14 = metricName8.resolve("borg");
        java.lang.String str15 = metricName14.getKey();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = metricName14.getTags();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "borg.foobah.one.borg" + "'", str15, "borg.foobah.one.borg");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap5 = metricRegistry0.getMeters(metricFilter4);
        java.util.SortedSet<io.dropwizard.metrics.MetricName> metricNameSet6 = metricRegistry0.getNames();
        io.dropwizard.metrics.Meter meter8 = metricRegistry0.meter("-1\n10\n");
        java.lang.String str9 = meter8.toString();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(metricNameSet6);
        org.junit.Assert.assertNotNull(meter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Meter[mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0]" + "'", str9, "Meter[mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0]");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap5 = metricRegistry4.getHistograms();
        io.dropwizard.metrics.Meter meter7 = metricRegistry4.meter("foobah");
        java.lang.String[] strArray11 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName12 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray11);
        io.dropwizard.metrics.MetricName metricName14 = metricName12.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder15 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram16 = metricRegistry4.getOrAdd(metricName12, histogramMetricBuilder15);
        io.dropwizard.metrics.Meter meter17 = metricRegistry0.meter(metricName12);
        io.dropwizard.metrics.Meter meter19 = metricRegistry0.meter("26");
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(meter7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertNotNull(histogramMetricBuilder15);
        org.junit.Assert.assertNotNull(histogram16);
        org.junit.Assert.assertNotNull(meter17);
        org.junit.Assert.assertNotNull(meter19);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap2 = metricRegistry0.getMetrics();
        java.lang.String[] strArray6 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName7 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray6);
        java.lang.String str8 = metricName7.toString();
        java.lang.String[] strArray9 = null;
        io.dropwizard.metrics.MetricName metricName10 = metricName7.tagged(strArray9);
        io.dropwizard.metrics.Counter counter11 = metricRegistry0.counter(metricName7);
        counter11.inc();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(metricName7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "borg.foobah.one" + "'", str8, "borg.foobah.one");
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(counter11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry0.getMetrics();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap5 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap7 = metricRegistry6.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap8 = metricRegistry6.getTimers();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap9 = metricRegistry6.getMeters();
        io.dropwizard.metrics.MetricRegistry metricRegistry11 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap12 = metricRegistry11.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener13 = null;
        metricRegistry11.removeListener(metricRegistryListener13);
        java.lang.String[] strArray18 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName19 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray18);
        java.lang.String str20 = metricName19.toString();
        java.lang.String[] strArray24 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName25 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray24);
        io.dropwizard.metrics.MetricName metricName27 = metricName25.resolve("borg");
        int int28 = metricName19.compareTo(metricName25);
        io.dropwizard.metrics.Meter meter29 = metricRegistry11.meter(metricName19);
        io.dropwizard.metrics.MetricRegistry metricRegistry30 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap31 = metricRegistry30.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter32 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap33 = metricRegistry30.getGauges(metricFilter32);
        java.lang.String[] strArray37 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName38 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray37);
        io.dropwizard.metrics.MetricName metricName40 = metricName38.resolve("borg");
        io.dropwizard.metrics.Meter meter41 = metricRegistry30.meter(metricName40);
        io.dropwizard.metrics.MetricRegistry metricRegistry42 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap43 = metricRegistry42.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap44 = metricRegistry42.getTimers();
        boolean boolean45 = metricName40.equals((java.lang.Object) metricNameMap44);
        io.dropwizard.metrics.Meter meter46 = metricRegistry11.meter(metricName40);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = metricName40.getTags();
        io.dropwizard.metrics.MetricName metricName48 = new io.dropwizard.metrics.MetricName("Default metric registry name is already set.", strMap47);
        io.dropwizard.metrics.Meter meter49 = metricRegistry6.meter(metricName48);
        boolean boolean50 = metricRegistry0.remove(metricName48);
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(metricNameMap7);
        org.junit.Assert.assertNotNull(metricNameMap8);
        org.junit.Assert.assertNotNull(metricNameMap9);
        org.junit.Assert.assertNotNull(metricNameMap12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(metricName19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "borg.foobah.one" + "'", str20, "borg.foobah.one");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(metricName25);
        org.junit.Assert.assertNotNull(metricName27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(meter29);
        org.junit.Assert.assertNotNull(metricNameMap31);
        org.junit.Assert.assertNotNull(metricNameMap33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(metricName38);
        org.junit.Assert.assertNotNull(metricName40);
        org.junit.Assert.assertNotNull(meter41);
        org.junit.Assert.assertNotNull(metricNameMap43);
        org.junit.Assert.assertNotNull(metricNameMap44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(meter46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(meter49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.setDefault("borg");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Default metric registry name is already set.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.Timer timer3 = metricRegistry0.timer("26");
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap4 = metricRegistry0.getMeters();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(timer3);
        org.junit.Assert.assertNotNull(metricNameMap4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener15 = null;
        metricRegistry14.removeListener(metricRegistryListener15);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap17 = metricRegistry14.getMetrics();
        metricRegistry14.removeAll();
        java.lang.String[] strArray22 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName23 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray22);
        java.lang.String str24 = metricName23.toString();
        java.lang.String[] strArray25 = null;
        io.dropwizard.metrics.MetricName metricName26 = metricName23.tagged(strArray25);
        io.dropwizard.metrics.Reservoir reservoir27 = null;
        io.dropwizard.metrics.Timer timer28 = new io.dropwizard.metrics.Timer(reservoir27);
        double double29 = timer28.getFifteenMinuteRate();
        io.dropwizard.metrics.Timer timer30 = metricRegistry14.register(metricName26, timer28);
        boolean boolean31 = histogramMetricBuilder11.isInstance((io.dropwizard.metrics.Metric) metricRegistry14);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertNotNull(metricRegistry14);
        org.junit.Assert.assertNotNull(metricNameMap17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(metricName23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "borg.foobah.one" + "'", str24, "borg.foobah.one");
        org.junit.Assert.assertNotNull(metricName26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(timer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        double double2 = timer1.getFifteenMinuteRate();
        io.dropwizard.metrics.Timer.Context context3 = timer1.time();
        java.lang.String str4 = timer1.toString();
        long long5 = timer1.getCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(context3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str4, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        io.dropwizard.metrics.Reservoir reservoir0 = null;
        io.dropwizard.metrics.Timer timer1 = new io.dropwizard.metrics.Timer(reservoir0);
        double double2 = timer1.getFiveMinuteRate();
        io.dropwizard.metrics.Timer.Context context3 = timer1.time();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = context3.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(context3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.lang.String[] strArray3 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName4 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray3);
        io.dropwizard.metrics.MetricName metricName6 = metricName4.resolve("borg");
        io.dropwizard.metrics.MetricName metricName8 = metricName6.resolve("borg");
        java.lang.String str9 = metricName8.getKey();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(metricName4);
        org.junit.Assert.assertNotNull(metricName6);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "borg.foobah.one.borg.borg" + "'", str9, "borg.foobah.one.borg.borg");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.Meter meter3 = metricRegistry1.meter(".");
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener6 = null;
        metricRegistry5.removeListener(metricRegistryListener6);
        java.lang.String[] strArray11 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName12 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray11);
        java.lang.String str13 = metricName12.toString();
        boolean boolean14 = metricRegistry5.remove(metricName12);
        io.dropwizard.metrics.Counter counter15 = metricRegistry1.counter(metricName12);
        counter15.inc();
        counter15.dec((long) '4');
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(metricRegistry5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "borg.foobah.one" + "'", str13, "borg.foobah.one");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(counter15);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate(".");
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = io.dropwizard.metrics.SharedMetricRegistries.add("", metricRegistry2);
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        metricRegistry3.removeMatching(metricFilter4);
        org.junit.Assert.assertNotNull(metricRegistry2);
        org.junit.Assert.assertNotNull(metricRegistry3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges();
        io.dropwizard.metrics.Histogram histogram5 = metricRegistry0.histogram("Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        io.dropwizard.metrics.Snapshot snapshot6 = histogram5.getSnapshot();
        io.dropwizard.metrics.Snapshot snapshot7 = histogram5.getSnapshot();
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(histogram5);
        org.junit.Assert.assertNotNull(snapshot6);
        org.junit.Assert.assertNotNull(snapshot7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.Meter meter11 = metricRegistry0.meter(metricName10);
        io.dropwizard.metrics.MetricRegistry metricRegistry12 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter14 = metricRegistry12.counter("Default metric registry name is already set.");
        java.lang.String[] strArray18 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName19 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray18);
        io.dropwizard.metrics.MetricName metricName21 = metricName19.resolve("borg");
        io.dropwizard.metrics.Meter meter22 = metricRegistry12.meter(metricName19);
        int int23 = metricName10.compareTo(metricName19);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = metricName19.getTags();
        io.dropwizard.metrics.MetricName metricName26 = metricName19.resolve("Meter[mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0]");
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(meter11);
        org.junit.Assert.assertNotNull(counter14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(metricName19);
        org.junit.Assert.assertNotNull(metricName21);
        org.junit.Assert.assertNotNull(meter22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(metricName26);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener3 = null;
        metricRegistry2.removeListener(metricRegistryListener3);
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry5 = io.dropwizard.metrics.SharedMetricRegistries.setDefault("Timer.Context[start_time=4391093301783227, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705167632]", metricRegistry2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Default metric registry name is already set.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        io.dropwizard.metrics.MetricName metricName3 = new io.dropwizard.metrics.MetricName();
        io.dropwizard.metrics.Meter meter4 = new io.dropwizard.metrics.Meter();
        boolean boolean5 = metricName3.equals((java.lang.Object) meter4);
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder6 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter9 = metricRegistry7.meter("hi!");
        meter9.mark();
        long long11 = meter9.getCount();
        boolean boolean12 = histogramMetricBuilder6.isInstance((io.dropwizard.metrics.Metric) meter9);
        io.dropwizard.metrics.Meter meter13 = new io.dropwizard.metrics.Meter();
        double double14 = meter13.getOneMinuteRate();
        boolean boolean15 = histogramMetricBuilder6.isInstance((io.dropwizard.metrics.Metric) meter13);
        io.dropwizard.metrics.Histogram histogram16 = metricRegistry0.getOrAdd(metricName3, histogramMetricBuilder6);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap17 = metricRegistry0.getMetrics();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap18 = metricRegistry0.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap19 = metricRegistry0.getTimers();
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(histogramMetricBuilder6);
        org.junit.Assert.assertNotNull(meter9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(histogram16);
        org.junit.Assert.assertNotNull(metricNameMap17);
        org.junit.Assert.assertNotNull(metricNameMap18);
        org.junit.Assert.assertNotNull(metricNameMap19);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap2 = metricRegistry1.getHistograms();
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap4 = metricRegistry3.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter5 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap6 = metricRegistry3.getGauges(metricFilter5);
        java.lang.String[] strArray10 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName11 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray10);
        io.dropwizard.metrics.MetricName metricName13 = metricName11.resolve("borg");
        io.dropwizard.metrics.Meter meter14 = metricRegistry3.meter(metricName13);
        java.lang.String str15 = metricName13.getKey();
        io.dropwizard.metrics.Timer timer16 = metricRegistry1.timer(metricName13);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = io.dropwizard.metrics.SharedMetricRegistries.add("Timer.Context[start_time=4391093301783227, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705167632]", metricRegistry1);
        io.dropwizard.metrics.Counter counter19 = new io.dropwizard.metrics.Counter();
        counter19.dec();
        io.dropwizard.metrics.Counter counter21 = metricRegistry1.register("Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]", counter19);
        io.dropwizard.metrics.MetricFilter metricFilter22 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap23 = metricRegistry1.getHistograms(metricFilter22);
        io.dropwizard.metrics.MetricFilter metricFilter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap25 = metricRegistry1.getTimers(metricFilter24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(metricNameMap6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(metricName11);
        org.junit.Assert.assertNotNull(metricName13);
        org.junit.Assert.assertNotNull(meter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "borg.foobah.one.borg" + "'", str15, "borg.foobah.one.borg");
        org.junit.Assert.assertNotNull(timer16);
        org.junit.Assert.assertNotNull(metricRegistry17);
        org.junit.Assert.assertNotNull(counter21);
        org.junit.Assert.assertNotNull(metricNameMap23);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener4 = null;
        metricRegistry0.removeListener(metricRegistryListener4);
        io.dropwizard.metrics.MetricRegistry metricRegistry7 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener8 = null;
        metricRegistry7.removeListener(metricRegistryListener8);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap10 = metricRegistry7.getMetrics();
        metricRegistry7.removeAll();
        java.lang.String[] strArray15 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName16 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray15);
        java.lang.String str17 = metricName16.toString();
        java.lang.String[] strArray18 = null;
        io.dropwizard.metrics.MetricName metricName19 = metricName16.tagged(strArray18);
        io.dropwizard.metrics.Reservoir reservoir20 = null;
        io.dropwizard.metrics.Timer timer21 = new io.dropwizard.metrics.Timer(reservoir20);
        double double22 = timer21.getFifteenMinuteRate();
        io.dropwizard.metrics.Timer timer23 = metricRegistry7.register(metricName19, timer21);
        io.dropwizard.metrics.MetricRegistry metricRegistry24 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap25 = metricRegistry24.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter26 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap27 = metricRegistry24.getGauges(metricFilter26);
        java.lang.String[] strArray31 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName32 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray31);
        io.dropwizard.metrics.MetricName metricName34 = metricName32.resolve("borg");
        io.dropwizard.metrics.Meter meter35 = metricRegistry24.meter(metricName34);
        io.dropwizard.metrics.MetricRegistry metricRegistry36 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap37 = metricRegistry36.getMetrics();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap38 = metricRegistry36.getTimers();
        boolean boolean39 = metricName34.equals((java.lang.Object) metricNameMap38);
        java.util.Map<java.lang.String, java.lang.String> strMap40 = io.dropwizard.metrics.MetricName.EMPTY_TAGS;
        io.dropwizard.metrics.MetricName metricName41 = metricName34.tagged(strMap40);
        io.dropwizard.metrics.Reservoir reservoir42 = null;
        io.dropwizard.metrics.Timer timer43 = new io.dropwizard.metrics.Timer(reservoir42);
        java.lang.String str44 = timer43.toString();
        long long45 = timer43.getCount();
        double double46 = timer43.getMeanRate();
        io.dropwizard.metrics.Timer timer47 = metricRegistry7.register(metricName41, timer43);
        boolean boolean48 = metricRegistry0.remove(metricName41);
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricRegistry7);
        org.junit.Assert.assertNotNull(metricNameMap10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(metricName16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "borg.foobah.one" + "'", str17, "borg.foobah.one");
        org.junit.Assert.assertNotNull(metricName19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(timer23);
        org.junit.Assert.assertNotNull(metricNameMap25);
        org.junit.Assert.assertNotNull(metricNameMap27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(metricName32);
        org.junit.Assert.assertNotNull(metricName34);
        org.junit.Assert.assertNotNull(meter35);
        org.junit.Assert.assertNotNull(metricNameMap37);
        org.junit.Assert.assertNotNull(metricNameMap38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(metricName41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str44, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(timer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.lang.String[] strArray3 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName4 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray3);
        io.dropwizard.metrics.MetricName metricName6 = metricName4.resolve("borg");
        java.lang.String str7 = metricName4.getKey();
        java.lang.String[] strArray12 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName13 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray12);
        io.dropwizard.metrics.MetricName metricName14 = io.dropwizard.metrics.MetricRegistry.name("one", strArray12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = metricName14.getTags();
        int int16 = metricName4.compareTo(metricName14);
        io.dropwizard.metrics.MetricRegistry metricRegistry17 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap18 = metricRegistry17.getHistograms();
        io.dropwizard.metrics.Meter meter20 = metricRegistry17.meter("foobah");
        java.lang.String[] strArray24 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName25 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray24);
        io.dropwizard.metrics.MetricName metricName27 = metricName25.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder28 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram29 = metricRegistry17.getOrAdd(metricName25, histogramMetricBuilder28);
        io.dropwizard.metrics.MetricName metricName31 = metricName25.resolve("borg");
        java.lang.String[] strArray37 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName38 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray37);
        io.dropwizard.metrics.MetricName metricName39 = io.dropwizard.metrics.MetricRegistry.name("borg.foobah.one", strArray37);
        io.dropwizard.metrics.MetricName metricName40 = io.dropwizard.metrics.MetricRegistry.name("two", strArray37);
        io.dropwizard.metrics.MetricName metricName41 = metricName31.tagged(strArray37);
        int int42 = metricName14.compareTo(metricName31);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(metricName4);
        org.junit.Assert.assertNotNull(metricName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "borg.foobah.one" + "'", str7, "borg.foobah.one");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(metricName13);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-13) + "'", int16 == (-13));
        org.junit.Assert.assertNotNull(metricNameMap18);
        org.junit.Assert.assertNotNull(meter20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(metricName25);
        org.junit.Assert.assertNotNull(metricName27);
        org.junit.Assert.assertNotNull(histogramMetricBuilder28);
        org.junit.Assert.assertNotNull(histogram29);
        org.junit.Assert.assertNotNull(metricName31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(metricName38);
        org.junit.Assert.assertNotNull(metricName39);
        org.junit.Assert.assertNotNull(metricName40);
        org.junit.Assert.assertNotNull(metricName41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 13 + "'", int42 == 13);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        io.dropwizard.metrics.MetricFilter metricFilter13 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Counter> metricNameMap14 = metricRegistry0.getCounters(metricFilter13);
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter17 = metricRegistry15.counter("Default metric registry name is already set.");
        java.lang.String[] strArray21 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName22 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray21);
        io.dropwizard.metrics.MetricName metricName24 = metricName22.resolve("borg");
        io.dropwizard.metrics.Meter meter25 = metricRegistry15.meter(metricName22);
        io.dropwizard.metrics.MetricRegistry metricRegistry26 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap27 = metricRegistry26.getHistograms();
        io.dropwizard.metrics.Meter meter29 = metricRegistry26.meter("foobah");
        java.lang.String[] strArray33 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName34 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray33);
        io.dropwizard.metrics.MetricName metricName36 = metricName34.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder37 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram38 = metricRegistry26.getOrAdd(metricName34, histogramMetricBuilder37);
        io.dropwizard.metrics.Histogram histogram39 = metricRegistry0.getOrAdd(metricName22, histogramMetricBuilder37);
        io.dropwizard.metrics.MetricRegistry metricRegistry40 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap41 = metricRegistry40.getHistograms();
        io.dropwizard.metrics.Meter meter43 = metricRegistry40.meter("foobah");
        java.lang.String[] strArray47 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName48 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray47);
        io.dropwizard.metrics.MetricName metricName50 = metricName48.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder51 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram52 = metricRegistry40.getOrAdd(metricName48, histogramMetricBuilder51);
        io.dropwizard.metrics.Histogram histogram53 = histogramMetricBuilder51.newMetric();
        io.dropwizard.metrics.Histogram histogram54 = histogramMetricBuilder51.newMetric();
        boolean boolean55 = histogramMetricBuilder37.isInstance((io.dropwizard.metrics.Metric) histogram54);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertNotNull(metricNameMap14);
        org.junit.Assert.assertNotNull(counter17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(metricName22);
        org.junit.Assert.assertNotNull(metricName24);
        org.junit.Assert.assertNotNull(meter25);
        org.junit.Assert.assertNotNull(metricNameMap27);
        org.junit.Assert.assertNotNull(meter29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(metricName34);
        org.junit.Assert.assertNotNull(metricName36);
        org.junit.Assert.assertNotNull(histogramMetricBuilder37);
        org.junit.Assert.assertNotNull(histogram38);
        org.junit.Assert.assertNotNull(histogram39);
        org.junit.Assert.assertNotNull(metricNameMap41);
        org.junit.Assert.assertNotNull(meter43);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(metricName48);
        org.junit.Assert.assertNotNull(metricName50);
        org.junit.Assert.assertNotNull(histogramMetricBuilder51);
        org.junit.Assert.assertNotNull(histogram52);
        org.junit.Assert.assertNotNull(histogram53);
        org.junit.Assert.assertNotNull(histogram54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder0 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter3 = metricRegistry1.meter("hi!");
        meter3.mark();
        long long5 = meter3.getCount();
        boolean boolean6 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) meter3);
        io.dropwizard.metrics.Histogram histogram7 = histogramMetricBuilder0.newMetric();
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder8 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.MetricRegistry metricRegistry9 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter11 = metricRegistry9.meter("hi!");
        meter11.mark();
        long long13 = meter11.getCount();
        boolean boolean14 = histogramMetricBuilder8.isInstance((io.dropwizard.metrics.Metric) meter11);
        boolean boolean15 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) meter11);
        io.dropwizard.metrics.Reservoir reservoir16 = null;
        io.dropwizard.metrics.Timer timer17 = new io.dropwizard.metrics.Timer(reservoir16);
        double double18 = timer17.getFiveMinuteRate();
        io.dropwizard.metrics.Timer.Context context19 = timer17.time();
        double double20 = timer17.getFifteenMinuteRate();
        boolean boolean21 = histogramMetricBuilder0.isInstance((io.dropwizard.metrics.Metric) timer17);
        org.junit.Assert.assertNotNull(histogramMetricBuilder0);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(histogram7);
        org.junit.Assert.assertNotNull(histogramMetricBuilder8);
        org.junit.Assert.assertNotNull(meter11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(context19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder11 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram12 = metricRegistry0.getOrAdd(metricName8, histogramMetricBuilder11);
        histogram12.update((long) (byte) -1);
        histogram12.update((long) 10);
        histogram12.update((int) (byte) 10);
        long long19 = histogram12.getCount();
        histogram12.update((int) (short) -1);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(histogramMetricBuilder11);
        org.junit.Assert.assertNotNull(histogram12);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        io.dropwizard.metrics.Meter meter0 = new io.dropwizard.metrics.Meter();
        double double1 = meter0.getOneMinuteRate();
        double double2 = meter0.getOneMinuteRate();
        double double3 = meter0.getFiveMinuteRate();
        double double4 = meter0.getFifteenMinuteRate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        java.lang.String[] strArray7 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName8 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray7);
        io.dropwizard.metrics.MetricName metricName10 = metricName8.resolve("borg");
        io.dropwizard.metrics.Meter meter11 = metricRegistry0.meter(metricName10);
        io.dropwizard.metrics.MetricName metricName12 = new io.dropwizard.metrics.MetricName();
        io.dropwizard.metrics.Meter meter13 = new io.dropwizard.metrics.Meter();
        boolean boolean14 = metricName12.equals((java.lang.Object) meter13);
        io.dropwizard.metrics.Counter counter15 = new io.dropwizard.metrics.Counter();
        counter15.dec();
        long long17 = counter15.getCount();
        counter15.inc();
        counter15.inc();
        io.dropwizard.metrics.Counter counter20 = metricRegistry0.register(metricName12, counter15);
        counter20.dec((long) 'a');
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(metricName8);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(meter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(counter20);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("Timer.Context[start_time=4391094745197059, Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ], 1630705169076]");
        org.junit.Assert.assertNotNull(metricRegistry1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap3 = metricRegistry2.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap5 = metricRegistry2.getGauges(metricFilter4);
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        io.dropwizard.metrics.MetricName metricName12 = metricName10.resolve("borg");
        io.dropwizard.metrics.Meter meter13 = metricRegistry2.meter(metricName12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter16 = metricRegistry14.counter("Default metric registry name is already set.");
        java.lang.String[] strArray20 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName21 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray20);
        io.dropwizard.metrics.MetricName metricName23 = metricName21.resolve("borg");
        io.dropwizard.metrics.Meter meter24 = metricRegistry14.meter(metricName21);
        int int25 = metricName12.compareTo(metricName21);
        io.dropwizard.metrics.MetricName metricName27 = metricName12.resolve("two");
        io.dropwizard.metrics.Counter counter28 = metricRegistry1.counter(metricName27);
        io.dropwizard.metrics.MetricRegistry metricRegistry31 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener32 = null;
        metricRegistry31.removeListener(metricRegistryListener32);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap34 = metricRegistry31.getMetrics();
        metricRegistry31.removeAll();
        java.lang.String[] strArray39 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName40 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray39);
        java.lang.String str41 = metricName40.toString();
        java.lang.String[] strArray45 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName46 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray45);
        io.dropwizard.metrics.MetricName metricName48 = metricName46.resolve("borg");
        int int49 = metricName40.compareTo(metricName46);
        io.dropwizard.metrics.Meter meter50 = metricRegistry31.meter(metricName46);
        io.dropwizard.metrics.Meter meter51 = metricRegistry1.register("-1\n1\n10\n10\n", meter50);
        meter50.mark((long) '#');
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(meter13);
        org.junit.Assert.assertNotNull(counter16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(metricName21);
        org.junit.Assert.assertNotNull(metricName23);
        org.junit.Assert.assertNotNull(meter24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(metricName27);
        org.junit.Assert.assertNotNull(counter28);
        org.junit.Assert.assertNotNull(metricRegistry31);
        org.junit.Assert.assertNotNull(metricNameMap34);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(metricName40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "borg.foobah.one" + "'", str41, "borg.foobah.one");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(metricName46);
        org.junit.Assert.assertNotNull(metricName48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(meter50);
        org.junit.Assert.assertNotNull(meter51);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap2 = metricRegistry1.getHistograms();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap3 = metricRegistry1.getMetrics();
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("borg.foobah.one.borg", metricRegistry1);
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Timer> metricNameMap5 = null; // flaky: metricRegistry4.getTimers();
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricNameMap3);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry4);
// flaky:         org.junit.Assert.assertNotNull(metricNameMap5);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.lang.String[] strArray3 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName4 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray3);
        io.dropwizard.metrics.MetricRegistry metricRegistry5 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap6 = metricRegistry5.getHistograms();
        io.dropwizard.metrics.Meter meter8 = metricRegistry5.meter("foobah");
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap9 = metricRegistry5.getMetrics();
        io.dropwizard.metrics.MetricName metricName11 = new io.dropwizard.metrics.MetricName("borg");
        io.dropwizard.metrics.Counter counter12 = metricRegistry5.counter(metricName11);
        int int13 = metricName4.compareTo(metricName11);
        java.lang.String str14 = metricName4.toString();
        io.dropwizard.metrics.MetricRegistry metricRegistry15 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap16 = metricRegistry15.getHistograms();
        io.dropwizard.metrics.Meter meter18 = metricRegistry15.meter("foobah");
        java.lang.String[] strArray22 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName23 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray22);
        io.dropwizard.metrics.MetricName metricName25 = metricName23.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder26 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram27 = metricRegistry15.getOrAdd(metricName23, histogramMetricBuilder26);
        io.dropwizard.metrics.MetricName metricName29 = metricName23.resolve("borg");
        java.lang.String[] strArray35 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName36 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray35);
        io.dropwizard.metrics.MetricName metricName37 = io.dropwizard.metrics.MetricRegistry.name("borg.foobah.one", strArray35);
        io.dropwizard.metrics.MetricName metricName38 = io.dropwizard.metrics.MetricRegistry.name("two", strArray35);
        io.dropwizard.metrics.MetricName metricName39 = metricName29.tagged(strArray35);
        int int40 = metricName4.compareTo(metricName39);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = metricName39.getTags();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(metricName4);
        org.junit.Assert.assertNotNull(metricNameMap6);
        org.junit.Assert.assertNotNull(meter8);
        org.junit.Assert.assertNotNull(metricNameMap9);
        org.junit.Assert.assertNotNull(counter12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "borg.foobah.one" + "'", str14, "borg.foobah.one");
        org.junit.Assert.assertNotNull(metricNameMap16);
        org.junit.Assert.assertNotNull(meter18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(metricName23);
        org.junit.Assert.assertNotNull(metricName25);
        org.junit.Assert.assertNotNull(histogramMetricBuilder26);
        org.junit.Assert.assertNotNull(histogram27);
        org.junit.Assert.assertNotNull(metricName29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(metricName36);
        org.junit.Assert.assertNotNull(metricName37);
        org.junit.Assert.assertNotNull(metricName38);
        org.junit.Assert.assertNotNull(metricName39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-5) + "'", int40 == (-5));
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Meter meter2 = metricRegistry0.meter("hi!");
        meter2.mark();
        double double4 = meter2.getFiveMinuteRate();
        double double5 = meter2.getMeanRate();
        org.junit.Assert.assertNotNull(meter2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20595.625489146107d + "'", double5 == 20595.625489146107d);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap2 = metricRegistry1.getHistograms();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap3 = metricRegistry1.getMetrics();
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = io.dropwizard.metrics.SharedMetricRegistries.add("borg.foobah.one.borg", metricRegistry1);
        java.lang.String[] strArray8 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName9 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray8);
        java.lang.String str10 = metricName9.toString();
        io.dropwizard.metrics.Meter meter11 = metricRegistry4.meter(metricName9);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricRegistry4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(metricName9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "borg.foobah.one" + "'", str10, "borg.foobah.one");
        org.junit.Assert.assertNotNull(meter11);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap2 = metricRegistry1.getHistograms();
        io.dropwizard.metrics.MetricRegistry metricRegistry3 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap4 = metricRegistry3.getHistograms();
        io.dropwizard.metrics.Meter meter6 = metricRegistry3.meter("foobah");
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap7 = metricRegistry3.getMetrics();
        io.dropwizard.metrics.MetricName metricName9 = new io.dropwizard.metrics.MetricName("borg");
        io.dropwizard.metrics.Counter counter10 = metricRegistry3.counter(metricName9);
        io.dropwizard.metrics.Histogram histogram11 = metricRegistry1.histogram(metricName9);
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.MetricRegistry metricRegistry12 = io.dropwizard.metrics.SharedMetricRegistries.setDefault("Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]", metricRegistry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Default metric registry name is already set.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricNameMap4);
        org.junit.Assert.assertNotNull(meter6);
        org.junit.Assert.assertNotNull(metricNameMap7);
        org.junit.Assert.assertNotNull(counter10);
        org.junit.Assert.assertNotNull(histogram11);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer2 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer3 = metricRegistry0.register("borg", timer2);
        long long4 = timer2.getCount();
        org.junit.Assert.assertNotNull(timer3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap2 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter3 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap4 = metricRegistry0.getMeters(metricFilter3);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap2);
        org.junit.Assert.assertNotNull(metricNameMap4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap5 = metricRegistry4.getHistograms();
        io.dropwizard.metrics.Meter meter7 = metricRegistry4.meter("foobah");
        java.lang.String[] strArray11 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName12 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray11);
        io.dropwizard.metrics.MetricName metricName14 = metricName12.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder15 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram16 = metricRegistry4.getOrAdd(metricName12, histogramMetricBuilder15);
        io.dropwizard.metrics.Meter meter17 = metricRegistry0.meter(metricName12);
        java.lang.String[] strArray23 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName24 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray23);
        io.dropwizard.metrics.MetricName metricName25 = io.dropwizard.metrics.MetricRegistry.name("borg.foobah.one", strArray23);
        io.dropwizard.metrics.MetricName metricName26 = io.dropwizard.metrics.MetricRegistry.name("two", strArray23);
        int int27 = metricName12.compareTo(metricName26);
        io.dropwizard.metrics.MetricName metricName29 = metricName12.resolve("Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(meter7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(metricName14);
        org.junit.Assert.assertNotNull(histogramMetricBuilder15);
        org.junit.Assert.assertNotNull(histogram16);
        org.junit.Assert.assertNotNull(meter17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(metricName24);
        org.junit.Assert.assertNotNull(metricName25);
        org.junit.Assert.assertNotNull(metricName26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-18) + "'", int27 == (-18));
        org.junit.Assert.assertNotNull(metricName29);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry2.getGauges();
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap5 = metricRegistry2.getGauges(metricFilter4);
        io.dropwizard.metrics.MetricRegistry metricRegistry6 = io.dropwizard.metrics.SharedMetricRegistries.add("Meter[mean=31850.68399343876, 1m=0.0, 5m=0.0, 15m=0.0]", metricRegistry2);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap7 = metricRegistry2.getMetrics();
        java.util.SortedSet<io.dropwizard.metrics.MetricName> metricNameSet8 = metricRegistry2.getNames();
        org.junit.Assert.assertNotNull(metricRegistry2);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
// flaky:         org.junit.Assert.assertNotNull(metricRegistry6);
        org.junit.Assert.assertNotNull(metricNameMap7);
        org.junit.Assert.assertNotNull(metricNameSet8);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap1 = metricRegistry0.getHistograms();
        io.dropwizard.metrics.Meter meter3 = metricRegistry0.meter("foobah");
        io.dropwizard.metrics.MetricRegistry metricRegistry4 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer6 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer7 = metricRegistry4.register("borg", timer6);
        metricRegistry0.registerAll((io.dropwizard.metrics.MetricSet) metricRegistry4);
        java.lang.String[] strArray12 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName13 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap15 = metricRegistry14.getHistograms();
        io.dropwizard.metrics.Meter meter17 = metricRegistry14.meter("foobah");
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap18 = metricRegistry14.getMetrics();
        io.dropwizard.metrics.MetricName metricName20 = new io.dropwizard.metrics.MetricName("borg");
        io.dropwizard.metrics.Counter counter21 = metricRegistry14.counter(metricName20);
        int int22 = metricName13.compareTo(metricName20);
        io.dropwizard.metrics.MetricRegistry metricRegistry23 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap24 = metricRegistry23.getHistograms();
        io.dropwizard.metrics.Meter meter26 = metricRegistry23.meter("foobah");
        java.lang.String[] strArray30 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName31 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray30);
        io.dropwizard.metrics.MetricName metricName33 = metricName31.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder34 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram35 = metricRegistry23.getOrAdd(metricName31, histogramMetricBuilder34);
        io.dropwizard.metrics.Histogram histogram36 = histogramMetricBuilder34.newMetric();
        io.dropwizard.metrics.Histogram histogram37 = histogramMetricBuilder34.newMetric();
        io.dropwizard.metrics.Histogram histogram38 = metricRegistry0.getOrAdd(metricName13, histogramMetricBuilder34);
        io.dropwizard.metrics.MetricRegistry metricRegistry39 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap40 = metricRegistry39.getMetrics();
        io.dropwizard.metrics.MetricRegistryListener metricRegistryListener41 = null;
        metricRegistry39.removeListener(metricRegistryListener41);
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap43 = metricRegistry39.getMetrics();
        io.dropwizard.metrics.MetricRegistry metricRegistry44 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap45 = metricRegistry44.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter46 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap47 = metricRegistry44.getGauges(metricFilter46);
        io.dropwizard.metrics.MetricRegistry metricRegistry48 = new io.dropwizard.metrics.MetricRegistry();
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap49 = metricRegistry48.getHistograms();
        io.dropwizard.metrics.Meter meter51 = metricRegistry48.meter("foobah");
        java.lang.String[] strArray55 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName56 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray55);
        io.dropwizard.metrics.MetricName metricName58 = metricName56.resolve("borg");
        io.dropwizard.metrics.MetricRegistry.MetricBuilder<io.dropwizard.metrics.Histogram> histogramMetricBuilder59 = io.dropwizard.metrics.MetricRegistry.MetricBuilder.HISTOGRAMS;
        io.dropwizard.metrics.Histogram histogram60 = metricRegistry48.getOrAdd(metricName56, histogramMetricBuilder59);
        io.dropwizard.metrics.Meter meter61 = metricRegistry44.meter(metricName56);
        io.dropwizard.metrics.MetricFilter metricFilter62 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap63 = metricRegistry44.getHistograms(metricFilter62);
        metricRegistry39.registerAll((io.dropwizard.metrics.MetricSet) metricRegistry44);
        boolean boolean65 = histogramMetricBuilder34.isInstance((io.dropwizard.metrics.Metric) metricRegistry39);
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(meter3);
        org.junit.Assert.assertNotNull(timer7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(metricName13);
        org.junit.Assert.assertNotNull(metricNameMap15);
        org.junit.Assert.assertNotNull(meter17);
        org.junit.Assert.assertNotNull(metricNameMap18);
        org.junit.Assert.assertNotNull(counter21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertNotNull(metricNameMap24);
        org.junit.Assert.assertNotNull(meter26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(metricName31);
        org.junit.Assert.assertNotNull(metricName33);
        org.junit.Assert.assertNotNull(histogramMetricBuilder34);
        org.junit.Assert.assertNotNull(histogram35);
        org.junit.Assert.assertNotNull(histogram36);
        org.junit.Assert.assertNotNull(histogram37);
        org.junit.Assert.assertNotNull(histogram38);
        org.junit.Assert.assertNotNull(metricNameMap40);
        org.junit.Assert.assertNotNull(metricNameMap43);
        org.junit.Assert.assertNotNull(metricNameMap45);
        org.junit.Assert.assertNotNull(metricNameMap47);
        org.junit.Assert.assertNotNull(metricNameMap49);
        org.junit.Assert.assertNotNull(meter51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(metricName56);
        org.junit.Assert.assertNotNull(metricName58);
        org.junit.Assert.assertNotNull(histogramMetricBuilder59);
        org.junit.Assert.assertNotNull(histogram60);
        org.junit.Assert.assertNotNull(meter61);
        org.junit.Assert.assertNotNull(metricNameMap63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap1 = metricRegistry0.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter2 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap3 = metricRegistry0.getGauges(metricFilter2);
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Meter> metricNameMap5 = metricRegistry0.getMeters(metricFilter4);
        io.dropwizard.metrics.Counter counter7 = new io.dropwizard.metrics.Counter();
        counter7.inc();
        counter7.dec((long) (short) 10);
        io.dropwizard.metrics.Counter counter11 = metricRegistry0.register("Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]", counter7);
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Histogram> metricNameMap12 = metricRegistry0.getHistograms();
        org.junit.Assert.assertNotNull(metricNameMap1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(counter11);
        org.junit.Assert.assertNotNull(metricNameMap12);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        io.dropwizard.metrics.MetricRegistry metricRegistry0 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Timer timer2 = new io.dropwizard.metrics.Timer();
        io.dropwizard.metrics.Timer timer3 = metricRegistry0.register("borg", timer2);
        double double4 = timer2.getFiveMinuteRate();
        java.lang.String str5 = timer2.toString();
        org.junit.Assert.assertNotNull(timer3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]" + "'", str5, "Timer[count=0, mean=0.0, 1m=0.0, 5m=0.0, 15m=0.0 ]");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        io.dropwizard.metrics.MetricRegistry metricRegistry1 = io.dropwizard.metrics.SharedMetricRegistries.getOrCreate("borg");
        io.dropwizard.metrics.MetricRegistry metricRegistry2 = new io.dropwizard.metrics.MetricRegistry();
        java.util.Map<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Metric> metricNameMap3 = metricRegistry2.getMetrics();
        io.dropwizard.metrics.MetricFilter metricFilter4 = null;
        java.util.SortedMap<io.dropwizard.metrics.MetricName, io.dropwizard.metrics.Gauge> metricNameMap5 = metricRegistry2.getGauges(metricFilter4);
        java.lang.String[] strArray9 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName10 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray9);
        io.dropwizard.metrics.MetricName metricName12 = metricName10.resolve("borg");
        io.dropwizard.metrics.Meter meter13 = metricRegistry2.meter(metricName12);
        io.dropwizard.metrics.MetricRegistry metricRegistry14 = new io.dropwizard.metrics.MetricRegistry();
        io.dropwizard.metrics.Counter counter16 = metricRegistry14.counter("Default metric registry name is already set.");
        java.lang.String[] strArray20 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName21 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray20);
        io.dropwizard.metrics.MetricName metricName23 = metricName21.resolve("borg");
        io.dropwizard.metrics.Meter meter24 = metricRegistry14.meter(metricName21);
        int int25 = metricName12.compareTo(metricName21);
        io.dropwizard.metrics.MetricName metricName27 = metricName12.resolve("two");
        io.dropwizard.metrics.Counter counter28 = metricRegistry1.counter(metricName27);
        java.lang.String[] strArray32 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName33 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray32);
        java.lang.String str34 = metricName33.toString();
        java.lang.String[] strArray38 = new java.lang.String[] { "foobah", "one" };
        io.dropwizard.metrics.MetricName metricName39 = io.dropwizard.metrics.MetricRegistry.name("borg", strArray38);
        io.dropwizard.metrics.MetricName metricName41 = metricName39.resolve("borg");
        int int42 = metricName33.compareTo(metricName39);
        io.dropwizard.metrics.MetricName metricName44 = metricName39.resolve("Default metric registry name is already set.");
        // The following exception was thrown during execution in test generation
        try {
            io.dropwizard.metrics.Counter counter45 = metricRegistry1.counter(metricName39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: borg.foobah.one is already used for a different type of metric");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRegistry1);
        org.junit.Assert.assertNotNull(metricNameMap3);
        org.junit.Assert.assertNotNull(metricNameMap5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(metricName10);
        org.junit.Assert.assertNotNull(metricName12);
        org.junit.Assert.assertNotNull(meter13);
        org.junit.Assert.assertNotNull(counter16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(metricName21);
        org.junit.Assert.assertNotNull(metricName23);
        org.junit.Assert.assertNotNull(meter24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(metricName27);
        org.junit.Assert.assertNotNull(counter28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(metricName33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "borg.foobah.one" + "'", str34, "borg.foobah.one");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(metricName39);
        org.junit.Assert.assertNotNull(metricName41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(metricName44);
    }
}
