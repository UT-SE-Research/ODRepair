package org.apache.hadoop.yarn.server.timelineservice.reader;

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
        org.apache.hadoop.metrics2.util.Quantile[] quantileArray0 = org.apache.hadoop.metrics2.lib.MutableQuantiles.quantiles;
        org.junit.Assert.assertNotNull(quantileArray0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        javax.management.ObjectName objectName0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeMBeanName(objectName0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        boolean boolean0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.inMiniClusterMode();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setMiniClusterMode(true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("Web server failed to start");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.destroy();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem.Callback callback4 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsSystem0.register(callback4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = metricsSystem0.register("", "", "container_1_1");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String str2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.sourceName("container_2_2", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "container_2_2" + "'", str2, "container_2_2");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable6 = metricsSystem2.register("id_1", "", (java.io.Serializable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        int int6 = mutableQuantiles5.getInterval();
        int int7 = mutableQuantiles5.getInterval();
        boolean boolean8 = mutableQuantiles5.changed();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.shutdown();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator6 = mutableQuantiles5.getEstimator();
        mutableQuantiles5.add((long) (short) 0);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(quantileEstimator6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        mutableQuantiles1.stop();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator6 = mutableQuantiles5.getEstimator();
        mutableQuantiles5.stop();
        org.junit.Assert.assertNotNull(quantileEstimator6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("", "Entity with id_3 should have been present in response.");
        java.lang.String str3 = metricsInfo2.description();
        org.junit.Assert.assertNotNull(metricsInfo2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Entity with id_3 should have been present in response." + "'", str3, "Entity with id_3 should have been present in response.");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.sourceName("Entities id_1, id_2, id_3 and id_4 should have been present in response", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Entities id_1, id_2, id_3 and id_4 should have been present in response" + "'", str2, "Entities id_1, id_2, id_3 and id_4 should have been present in response");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("container_1_1");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.String str2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.sourceName("yarn.timeline-service.reader.webapp.address", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yarn.timeline-service.reader.webapp.address" + "'", str2, "yarn.timeline-service.reader.webapp.address");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("Entity with container_2_1 should have been present in response.");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = metricsSystem2.register("container_1_1", "TimelineService", (java.lang.Comparable<java.lang.String>) "Entities id_1, id_2, id_3 and id_4 should have been present in response");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = metricsSystem0.register("app-attempt-2", "Entities id_1, id_2, id_3 and id_4 should have been present in response", (java.lang.CharSequence) "Timeline Reader API");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        boolean boolean6 = metricsSystem0.shutdown();
        org.apache.hadoop.metrics2.lib.Interns interns7 = new org.apache.hadoop.metrics2.lib.Interns();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.lib.Interns interns8 = metricsSystem0.register(interns7);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.newMBeanName("TimelineService");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: javax.management.MalformedObjectNameException: Key properties cannot be empty");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder3 = null;
        mutableQuantiles2.snapshot(metricsRecordBuilder3, false);
        int int6 = mutableQuantiles2.getInterval();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("hi!", "TimelineService", "Entity with id_1 should have been present in response.");
        org.junit.Assert.assertNotNull(metricsTag3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem3 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.publishMetricsNow();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator6 = mutableQuantiles5.getEstimator();
        mutableQuantiles5.add((long) (short) 0);
        boolean boolean9 = mutableQuantiles5.changed();
        boolean boolean10 = mutableQuantiles5.changed();
        mutableQuantiles5.add((long) (byte) 10);
        org.junit.Assert.assertNotNull(quantileEstimator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.initialize("");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles9 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator10 = mutableQuantiles9.getEstimator();
        mutableQuantiles9.add((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.lib.MutableMetric mutableMetric13 = metricsSystem1.register("Entity with container_2_1 should have been present in response.", "id_4", (org.apache.hadoop.metrics2.lib.MutableMetric) mutableQuantiles9);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem1);
        org.junit.Assert.assertNotNull(quantileEstimator10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator6 = mutableQuantiles5.getEstimator();
        mutableQuantiles5.add((long) (short) 0);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(quantileEstimator6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("app-attempt-2", "Entity with app-attempt-2 should have been present in response.");
        org.junit.Assert.assertNotNull(metricsInfo2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("Entity with container_2_2 should have been present in response.", "Incorrect response from timeline reader. Status=", "Incorrect response from timeline reader. Status=", "yarn.timeline-service.fs-writer.root-dir", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("Entity with container_2_2 should have been present in response.", "Entity with id_1 should have been present in response.", "id_2");
        org.junit.Assert.assertNotNull(metricsTag3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.startMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem6 = metricsSystem0.init("Entities id_1, id_2, id_3 and id_4 should have been present in response");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem defaultMetricsSystem9 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.INSTANCE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum<org.apache.hadoop.metrics2.lib.DefaultMetricsSystem> defaultMetricsSystemEnum10 = metricsSystem6.register("Entity with id_3 should have been present in response.", "TimelineService", (java.lang.Enum<org.apache.hadoop.metrics2.lib.DefaultMetricsSystem>) defaultMetricsSystem9);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem6);
        org.junit.Assert.assertTrue("'" + defaultMetricsSystem9 + "' != '" + org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.INSTANCE + "'", defaultMetricsSystem9.equals(org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.INSTANCE));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.startMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSource metricsSource6 = metricsSystem0.getSource("Web server failed to start");
        java.io.Serializable serializable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable8 = metricsSystem0.register(serializable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: source");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNull(metricsSource6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem3 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = metricsSystem3.register("Entity with container_2_1 should have been present in response.");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem3 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.start();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("yarn.timeline-service.enabled");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = metricsSystem0.init("Entities with id_1 and id_4 should have been present in response based on entity created time.");
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.newMBeanName("Incorrect response from timeline reader. Status=");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: javax.management.MalformedObjectNameException: Key properties cannot be empty");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.newMBeanName("Web server failed to start");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: javax.management.MalformedObjectNameException: Key properties cannot be empty");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("Entity with id_1 should have been present in response.", "Entities with id_1 and id_2 should have been present in response.", "container_2_1");
        org.junit.Assert.assertNotNull(metricsTag3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        timelineReaderMetrics0.addGetEntitiesLatency(0L, true);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        mutableQuantiles2.stop();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("Entity with id_4 should not have been present in response.", "Entity with container_2_2 should have been present in response.", "TimelineService");
        java.lang.String str4 = metricsTag3.description();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Entity with container_2_2 should have been present in response." + "'", str4, "Entity with container_2_2 should have been present in response.");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.initialize("Entity with id_1 should have been present in response.");
        org.junit.Assert.assertNotNull(metricsSystem1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.stop();
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics5 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        java.lang.Class<?> wildcardClass6 = timelineReaderMetrics5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type7 = metricsSystem0.register("Entity with container_1_1 should have been present in response.", "Entities id_1, id_2, id_3 and id_4 should have been present in response", (java.lang.reflect.Type) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(timelineReaderMetrics5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem3 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = metricsSystem0.register((java.lang.Object) "app-attempt-1");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.lang.String str2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.sourceName("container_1_1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "container_1_1" + "'", str2, "container_1_1");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem.Callback callback7 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsSystem0.register(callback7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.start();
        metricsSystem0.start();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String str2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.sourceName("Entity with container_1_1 should have been present in response.", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Entity with container_1_1 should have been present in response." + "'", str2, "Entity with container_1_1 should have been present in response.");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("Entity with id_4 should not have been present in response.", "Entity with container_2_2 should have been present in response.", "TimelineService");
        java.lang.String str4 = metricsTag3.name();
        org.apache.hadoop.metrics2.MetricsTag metricsTag6 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "yarn.timeline-service.fs-writer.root-dir");
        java.lang.String str7 = metricsTag3.name();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Entity with id_4 should not have been present in response." + "'", str4, "Entity with id_4 should not have been present in response.");
        org.junit.Assert.assertNotNull(metricsTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entity with id_4 should not have been present in response." + "'", str7, "Entity with id_4 should not have been present in response.");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("TimelineReaderMetrics", "container_2_1", "yarn.timeline-service.enabled", "Incorrect response from timeline reader. Status=", (int) (byte) 10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("yarn.timeline-service.reader.webapp.address", "");
        org.apache.hadoop.metrics2.MetricsTag metricsTag4 = org.apache.hadoop.metrics2.lib.Interns.tag(metricsInfo2, "Entity with app-attempt-2 should have been present in response.");
        org.junit.Assert.assertNotNull(metricsInfo2);
        org.junit.Assert.assertNotNull(metricsTag4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.newMBeanName("id_1");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: javax.management.MalformedObjectNameException: Key properties cannot be empty");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem7 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.publishMetricsNow();
        metricsSystem0.stop();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(metricsSystem7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        int int2 = mutableQuantiles1.getInterval();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder3 = null;
        mutableQuantiles1.snapshot(metricsRecordBuilder3, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("Entities with id_1 and id_4 should have been present in response based on entity created time.", "yarn.timeline-service.fs-writer.root-dir", "TimelineReaderMetrics");
        org.junit.Assert.assertNotNull(metricsTag3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.initialize("id_1");
        org.apache.hadoop.metrics2.MetricsSystem.Callback callback2 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsSystem1.register(callback2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("yarn.timeline-service.reader.webapp.address");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        mutableQuantiles4.stop();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder3 = null;
        mutableQuantiles2.snapshot(metricsRecordBuilder3, false);
        java.lang.Class<?> wildcardClass6 = mutableQuantiles2.getClass();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("Entities with id_1 and id_4 should have been present in response based on entity created time.", "container_2_1", "Entity with id_3 should have been present in response.", "Web server failed to start", 10);
        mutableQuantiles5.add(0L);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("yarn.timeline-service.reader.webapp.address", "Entity with container_2_1 should have been present in response.", "Entity with id_4 should have been present in response.", "id_2", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        timelineReaderMetrics0.addGetEntitiesLatency((long) ' ', false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.startMetricsMBeans();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable6 = metricsSystem0.register((java.io.Serializable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.initialize("container_1_1");
        metricsSystem1.stop();
        org.junit.Assert.assertNotNull(metricsSystem1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        boolean boolean6 = metricsSystem0.shutdown();
        java.lang.Enum<org.apache.hadoop.metrics2.lib.DefaultMetricsSystem> defaultMetricsSystemEnum7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Enum<org.apache.hadoop.metrics2.lib.DefaultMetricsSystem> defaultMetricsSystemEnum8 = metricsSystem0.register(defaultMetricsSystemEnum7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: source");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("UID");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem3 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles9 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles15 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator16 = mutableQuantiles15.getEstimator();
        mutableQuantiles15.add((long) (short) 0);
        mutableQuantiles15.stop();
        int int20 = mutableQuantiles15.getInterval();
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator21 = mutableQuantiles15.getEstimator();
        mutableQuantiles9.setEstimator(quantileEstimator21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator23 = metricsSystem3.register(quantileEstimator21);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem3);
        org.junit.Assert.assertNotNull(quantileEstimator16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(quantileEstimator21);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = metricsSystem0.init("Entity with container_1_1 should have been present in response.");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem7 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem7.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem9 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem7);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem10 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem7);
        java.lang.Class<?> wildcardClass11 = metricsSystem7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement12 = metricsSystem4.register("yarn.timeline-service.fs-writer.root-dir", "Incorrect response from timeline reader. Status=", (java.lang.reflect.AnnotatedElement) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertNotNull(metricsSystem7);
        org.junit.Assert.assertNotNull(metricsSystem9);
        org.junit.Assert.assertNotNull(metricsSystem10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        int int6 = mutableQuantiles5.getInterval();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.String str2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.sourceName("id_2", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "id_2" + "'", str2, "id_2");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.unregisterSource("Entity with id_1 should have been present in response.");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles13 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator14 = mutableQuantiles13.getEstimator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator15 = metricsSystem0.register(quantileEstimator14);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(quantileEstimator14);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem3 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.startMetricsMBeans();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.newMBeanName("Entities id_1, id_2, id_3 and id_4 should have been present in response");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: javax.management.MalformedObjectNameException: Key properties cannot be empty");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("Entity with id_4 should not have been present in response.", "Entity with container_2_2 should have been present in response.", "TimelineService");
        java.lang.String str4 = metricsTag3.name();
        java.lang.String str5 = metricsTag3.description();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Entity with id_4 should not have been present in response." + "'", str4, "Entity with id_4 should not have been present in response.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Entity with container_2_2 should have been present in response." + "'", str5, "Entity with container_2_2 should have been present in response.");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.unregisterSource("Entity with id_1 should have been present in response.");
        metricsSystem0.start();
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics9 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        java.lang.Class<?> wildcardClass10 = timelineReaderMetrics9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement11 = metricsSystem0.register((java.lang.reflect.AnnotatedElement) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(timelineReaderMetrics9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("Entity with container_1_1 should have been present in response.", "yarn.timeline-service.reader.class");
        org.junit.Assert.assertNotNull(metricsInfo2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSource metricsSource4 = metricsSystem0.getSource("Entity with app-attempt-2 should have been present in response.");
        metricsSystem0.stopMetricsMBeans();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNull(metricsSource4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.unregisterSource("Entity with id_1 should have been present in response.");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem defaultMetricsSystem8 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.INSTANCE;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.lib.DefaultMetricsSystem defaultMetricsSystem9 = metricsSystem0.register(defaultMetricsSystem8);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + defaultMetricsSystem8 + "' != '" + org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.INSTANCE + "'", defaultMetricsSystem8.equals(org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.INSTANCE));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator6 = mutableQuantiles5.getEstimator();
        mutableQuantiles5.add((long) '#');
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(quantileEstimator6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.stop();
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics5 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics5.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles9 = timelineReaderMetrics5.getGetEntityTypesFailureLatency();
        java.lang.Class<?> wildcardClass10 = timelineReaderMetrics5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type11 = metricsSystem0.register((java.lang.reflect.Type) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(timelineReaderMetrics5);
        org.junit.Assert.assertNotNull(mutableQuantiles9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles2.snapshot(metricsRecordBuilder3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("Entity with app-attempt-2 should have been present in response.");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("container_2_2", "app-attempt-1", "container_2_2");
        java.lang.String str4 = metricsTag3.name();
        org.apache.hadoop.metrics2.MetricsTag metricsTag6 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "Entity with id_3 should have been present in response.");
        org.apache.hadoop.metrics2.MetricsTag metricsTag8 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "Entity with id_1 should have been present in response.");
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "container_2_2" + "'", str4, "container_2_2");
        org.junit.Assert.assertNotNull(metricsTag6);
        org.junit.Assert.assertNotNull(metricsTag8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.start();
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem defaultMetricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.INSTANCE;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.lib.DefaultMetricsSystem defaultMetricsSystem5 = metricsSystem0.register(defaultMetricsSystem4);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertTrue("'" + defaultMetricsSystem4 + "' != '" + org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.INSTANCE + "'", defaultMetricsSystem4.equals(org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.INSTANCE));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem3 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem3.stop();
        org.apache.hadoop.metrics2.MetricsSystem.Callback callback5 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsSystem3.register(callback5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency(0L, false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles8 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntitiesLatency((long) (short) 10, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("app-attempt-1", "TimelineReaderMetrics");
        org.junit.Assert.assertNotNull(metricsInfo2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        int int2 = mutableQuantiles1.getInterval();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder3 = null;
        mutableQuantiles1.snapshot(metricsRecordBuilder3);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles1.snapshot(metricsRecordBuilder5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.stop();
        org.apache.hadoop.metrics2.MetricsSystem.Callback callback5 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsSystem0.register(callback5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("id_2", "id_1", "yarn.resourcemanager.cluster-id");
        org.junit.Assert.assertNotNull(metricsTag3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.lang.String str2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.sourceName("TimelineService", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TimelineService" + "'", str2, "TimelineService");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator6 = mutableQuantiles5.getEstimator();
        mutableQuantiles5.add((long) (short) 0);
        mutableQuantiles5.stop();
        int int10 = mutableQuantiles5.getInterval();
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator11 = mutableQuantiles5.getEstimator();
        mutableQuantiles5.stop();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(quantileEstimator6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(quantileEstimator11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        mutableQuantiles1.add((long) (byte) -1);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder4 = null;
        mutableQuantiles1.snapshot(metricsRecordBuilder4, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem7 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem7.stop();
        metricsSystem7.stopMetricsMBeans();
        metricsSystem7.publishMetricsNow();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(metricsSystem7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("container_2_2", "app-attempt-1", "container_2_2");
        java.lang.String str4 = metricsTag3.name();
        org.apache.hadoop.metrics2.MetricsTag metricsTag6 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "Entity with id_3 should have been present in response.");
        java.lang.String str7 = metricsTag3.description();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "container_2_2" + "'", str4, "container_2_2");
        org.junit.Assert.assertNotNull(metricsTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "app-attempt-1" + "'", str7, "app-attempt-1");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("Entity with app-attempt-2 should have been present in response.", "id_3");
        org.junit.Assert.assertNotNull(metricsInfo2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntitiesLatency(0L, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles9 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator10 = mutableQuantiles9.getEstimator();
        mutableQuantiles9.add((long) (short) 0);
        mutableQuantiles9.stop();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles19 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator20 = mutableQuantiles19.getEstimator();
        mutableQuantiles9.setEstimator(quantileEstimator20);
        mutableQuantiles3.setEstimator(quantileEstimator20);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(quantileEstimator10);
        org.junit.Assert.assertNotNull(quantileEstimator20);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = metricsSystem0.init("Entity with container_1_1 should have been present in response.");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem6 = metricsSystem0.init("");
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertNotNull(metricsSystem6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("Entity with id_4 should not have been present in response.", "Entity with container_2_2 should have been present in response.", "TimelineService");
        java.lang.String str4 = metricsTag3.name();
        org.apache.hadoop.metrics2.MetricsTag metricsTag6 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "yarn.timeline-service.fs-writer.root-dir");
        org.apache.hadoop.metrics2.MetricsTag metricsTag8 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "UID should be present");
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Entity with id_4 should not have been present in response." + "'", str4, "Entity with id_4 should not have been present in response.");
        org.junit.Assert.assertNotNull(metricsTag6);
        org.junit.Assert.assertNotNull(metricsTag8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.stop();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = metricsSystem0.init("Entity with container_2_2 should have been present in response.");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem5 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem5.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem7 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem5);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem8 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem5);
        java.lang.Class<?> wildcardClass9 = metricsSystem5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement10 = metricsSystem4.register((java.lang.reflect.AnnotatedElement) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertNotNull(metricsSystem5);
        org.junit.Assert.assertNotNull(metricsSystem7);
        org.junit.Assert.assertNotNull(metricsSystem8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        mutableQuantiles3.stop();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator5 = mutableQuantiles4.getEstimator();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(quantileEstimator5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("Entity with container_1_1 should have been present in response.", "id_1");
        org.junit.Assert.assertNotNull(metricsInfo2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("Entity with app-attempt-2 should have been present in response.", "Entity with app-attempt-2 should have been present in response.");
        org.junit.Assert.assertNotNull(metricsInfo2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("container_2_2", "app-attempt-1", "container_2_2");
        java.lang.String str4 = metricsTag3.name();
        java.lang.String str5 = metricsTag3.name();
        java.lang.String str6 = metricsTag3.name();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "container_2_2" + "'", str4, "container_2_2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "container_2_2" + "'", str5, "container_2_2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "container_2_2" + "'", str6, "container_2_2");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("", "yarn.timeline-service.reader.webapp.address");
        java.lang.String str3 = metricsInfo2.name();
        org.junit.Assert.assertNotNull(metricsInfo2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        int int6 = mutableQuantiles5.getInterval();
        mutableQuantiles5.stop();
        boolean boolean8 = mutableQuantiles5.changed();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics4 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = timelineReaderMetrics4.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles6 = timelineReaderMetrics4.getGetEntityTypesSuccessLatency();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics7 = metricsSystem0.register(timelineReaderMetrics4);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(timelineReaderMetrics4);
        org.junit.Assert.assertNotNull(mutableQuantiles5);
        org.junit.Assert.assertNotNull(mutableQuantiles6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.stop();
        metricsSystem0.stop();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        metricsSystem0.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem6 = metricsSystem0.init("UID");
        metricsSystem6.stopMetricsMBeans();
        metricsSystem6.unregisterSource("id_3");
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("UID", "container_2_1", "UID");
        java.lang.Class<?> wildcardClass4 = metricsTag3.getClass();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("yarn.timeline-service.fs-writer.root-dir", "Web server failed to start", "target");
        java.lang.String str4 = metricsTag3.description();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Web server failed to start" + "'", str4, "Web server failed to start");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("TimelineService", "hi!", "Web server failed to start");
        org.junit.Assert.assertNotNull(metricsTag3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("", "Entity with id_3 should have been present in response.");
        java.lang.String str3 = metricsInfo2.name();
        org.junit.Assert.assertNotNull(metricsInfo2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.start();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        int int6 = mutableQuantiles5.getInterval();
        mutableQuantiles5.stop();
        mutableQuantiles5.stop();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        int int6 = mutableQuantiles5.getInterval();
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator7 = mutableQuantiles5.getEstimator();
        java.lang.Class<?> wildcardClass8 = quantileEstimator7.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(quantileEstimator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("app-attempt-2", "Incorrect response from timeline reader. Status=", "cluster1", "id_4", 10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator6 = mutableQuantiles5.getEstimator();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles12 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator13 = mutableQuantiles12.getEstimator();
        mutableQuantiles12.add((long) (short) 0);
        mutableQuantiles12.stop();
        int int17 = mutableQuantiles12.getInterval();
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator18 = mutableQuantiles12.getEstimator();
        mutableQuantiles5.setEstimator(quantileEstimator18);
        mutableQuantiles5.stop();
        org.junit.Assert.assertNotNull(quantileEstimator6);
        org.junit.Assert.assertNotNull(quantileEstimator13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(quantileEstimator18);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem.Callback callback7 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsSystem0.register(callback7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("Incorrect response from timeline reader. Status=", "yarn.resourcemanager.cluster-id", "UID");
        org.junit.Assert.assertNotNull(metricsTag3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("UID", "Metrics for TimelineReader", "Incorrect response from timeline reader. Status=");
        org.junit.Assert.assertNotNull(metricsTag3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        timelineReaderMetrics0.addGetEntitiesLatency((long) (short) 0, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator6 = mutableQuantiles5.getEstimator();
        mutableQuantiles5.add((long) (short) 0);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles14 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator15 = mutableQuantiles14.getEstimator();
        mutableQuantiles14.add((long) (short) 0);
        mutableQuantiles14.stop();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles24 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator25 = mutableQuantiles24.getEstimator();
        mutableQuantiles14.setEstimator(quantileEstimator25);
        mutableQuantiles5.setEstimator(quantileEstimator25);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder28 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(quantileEstimator6);
        org.junit.Assert.assertNotNull(quantileEstimator15);
        org.junit.Assert.assertNotNull(quantileEstimator25);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency(0L, false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles8 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        int int9 = mutableQuantiles8.getInterval();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSystem.Callback callback5 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsSystem4.register(callback5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles11 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator12 = mutableQuantiles11.getEstimator();
        mutableQuantiles11.add((long) (short) 0);
        mutableQuantiles11.stop();
        int int16 = mutableQuantiles11.getInterval();
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator17 = mutableQuantiles11.getEstimator();
        mutableQuantiles5.setEstimator(quantileEstimator17);
        java.lang.Class<?> wildcardClass19 = mutableQuantiles5.getClass();
        org.junit.Assert.assertNotNull(quantileEstimator12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(quantileEstimator17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("Entities with id_1 and id_2 should have been present in response.", "app", "app-attempt-1");
        org.junit.Assert.assertNotNull(metricsTag3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("app", "", "TimelineService", "container_2_1", (int) (byte) 100);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder3 = null;
        mutableQuantiles2.snapshot(metricsRecordBuilder3);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder5 = null;
        mutableQuantiles2.snapshot(metricsRecordBuilder5);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("Entities id_1, id_2, id_3 and id_4 should have been present in response", "Entity with id_4 should not have been present in response.");
        org.junit.Assert.assertNotNull(metricsInfo2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem2.currentConfig();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.stop();
        boolean boolean5 = metricsSystem0.shutdown();
        org.apache.hadoop.metrics2.MetricsSource metricsSource7 = metricsSystem0.getSource("");
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(metricsSource7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem2.unregisterSource("Web server failed to start");
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.unregisterSource("localhost:0");
        boolean boolean3 = metricsSystem0.shutdown();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("container_2_2", "app-attempt-1", "container_2_2");
        java.lang.String str4 = metricsTag3.name();
        org.apache.hadoop.metrics2.MetricsTag metricsTag6 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "id_4");
        org.apache.hadoop.metrics2.MetricsTag metricsTag8 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag6, "Entity with container_2_1 should have been present in response.");
        org.apache.hadoop.metrics2.MetricsTag metricsTag10 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag8, "Incorrect response from timeline reader. Status=");
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "container_2_2" + "'", str4, "container_2_2");
        org.junit.Assert.assertNotNull(metricsTag6);
        org.junit.Assert.assertNotNull(metricsTag8);
        org.junit.Assert.assertNotNull(metricsTag10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("container_2_2", "app-attempt-1", "container_2_2");
        java.lang.String str4 = metricsTag3.name();
        org.apache.hadoop.metrics2.MetricsTag metricsTag6 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "id_4");
        java.lang.String str7 = metricsTag3.name();
        java.lang.String str8 = metricsTag3.description();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "container_2_2" + "'", str4, "container_2_2");
        org.junit.Assert.assertNotNull(metricsTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "container_2_2" + "'", str7, "container_2_2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "app-attempt-1" + "'", str8, "app-attempt-1");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.start();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem6 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo9 = org.apache.hadoop.metrics2.lib.Interns.info("Entity with id_3 should have been present in response.", "Incorrect response from timeline reader. Status=");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.MetricsInfo metricsInfo10 = metricsSystem0.register(metricsInfo9);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertNotNull(metricsSystem6);
        org.junit.Assert.assertNotNull(metricsInfo9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        metricsSystem0.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem6 = metricsSystem0.init("UID");
        metricsSystem6.stopMetricsMBeans();
        java.lang.String str8 = metricsSystem6.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem11 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem11.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem13 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem11);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem14 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem11);
        java.lang.Class<?> wildcardClass15 = metricsSystem11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = metricsSystem6.register("", "yarn.timeline-service.reader.class", wildcardClass15);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(metricsSystem11);
        org.junit.Assert.assertNotNull(metricsSystem13);
        org.junit.Assert.assertNotNull(metricsSystem14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntitiesLatency((long) (byte) 0, true);
        timelineReaderMetrics0.addGetEntitiesLatency((long) 10, true);
        java.lang.Class<?> wildcardClass9 = timelineReaderMetrics0.getClass();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.unregisterSource("Entity with id_1 should have been present in response.");
        metricsSystem0.start();
        java.lang.String str9 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSource metricsSource11 = metricsSystem0.getSource("UID should be present");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem13 = metricsSystem0.init("container_1_1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence15 = metricsSystem13.register((java.lang.CharSequence) "yarn.timeline-service.reader.webapp.address");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(metricsSource11);
        org.junit.Assert.assertNotNull(metricsSystem13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("container_2_2");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency(0L, false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles8 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntitiesLatency((long) 1, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.newMBeanName("Entity with container_2_2 should have been present in response.");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: javax.management.MalformedObjectNameException: Key properties cannot be empty");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem7 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem7.stop();
        metricsSystem7.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSource metricsSource11 = metricsSystem7.getSource("yarn.timeline-service.version");
        java.lang.String str12 = metricsSystem7.currentConfig();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(metricsSystem7);
        org.junit.Assert.assertNull(metricsSource11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.unregisterSource("Entity with id_1 should have been present in response.");
        metricsSystem0.start();
        java.lang.String str9 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSource metricsSource11 = metricsSystem0.getSource("UID should be present");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem13 = metricsSystem0.init("container_1_1");
        metricsSystem13.publishMetricsNow();
        boolean boolean15 = metricsSystem13.shutdown();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(metricsSource11);
        org.junit.Assert.assertNotNull(metricsSystem13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("", "yarn.timeline-service.version", "Entity with id_4 should have been present in response.");
        java.lang.String str4 = metricsTag3.description();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yarn.timeline-service.version" + "'", str4, "yarn.timeline-service.version");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("target", "container_2_1", "yarn.timeline-service.enabled");
        org.junit.Assert.assertNotNull(metricsTag3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = metricsSystem0.init("Entity with container_1_1 should have been present in response.");
        metricsSystem4.stop();
        metricsSystem4.stopMetricsMBeans();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem4);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("TimelineReaderMetrics", "UID should be present");
        java.lang.String str3 = metricsInfo2.name();
        java.lang.String str4 = metricsInfo2.description();
        org.junit.Assert.assertNotNull(metricsInfo2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TimelineReaderMetrics" + "'", str3, "TimelineReaderMetrics");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UID should be present" + "'", str4, "UID should be present");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.initialize("UID should be present");
        org.junit.Assert.assertNotNull(metricsSystem1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("id_1", "id_3", "yarn.timeline-service.reader.class", "Entity with id_3 should have been present in response.", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.unregisterSource("Entity with id_1 should have been present in response.");
        metricsSystem0.start();
        java.lang.String str9 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSource metricsSource11 = metricsSystem0.getSource("UID should be present");
        boolean boolean12 = metricsSystem0.shutdown();
        org.apache.hadoop.metrics2.MetricsSystem.Callback callback13 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsSystem0.register(callback13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(metricsSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) '#', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles8 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("localhost:0", "Incorrect response from timeline reader. Status=", "Incorrect response from timeline reader. Status=");
        org.junit.Assert.assertNotNull(metricsTag3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("yarn.timeline-service.reader.webapp.address", "");
        java.lang.String str3 = metricsInfo2.name();
        java.lang.Class<?> wildcardClass4 = metricsInfo2.getClass();
        org.junit.Assert.assertNotNull(metricsInfo2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yarn.timeline-service.reader.webapp.address" + "'", str3, "yarn.timeline-service.reader.webapp.address");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.lang.String str2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.sourceName("Entities id_1, id_2, id_3 and id_4 should have been present in response", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Entities id_1, id_2, id_3 and id_4 should have been present in response" + "'", str2, "Entities id_1, id_2, id_3 and id_4 should have been present in response");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.unregisterSource("app");
        org.junit.Assert.assertNotNull(metricsSystem0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        mutableQuantiles2.add(1L);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder5 = null;
        mutableQuantiles2.snapshot(metricsRecordBuilder5, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.String str2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.sourceName("UID", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UID" + "'", str2, "UID");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        mutableQuantiles3.add((long) 97);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency((-1L), true);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles6 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem8 = metricsSystem0.init("yarn.timeline-service.enabled");
        boolean boolean9 = metricsSystem8.shutdown();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(metricsSystem8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("yarn.resourcemanager.cluster-id", "app-attempt-2", "Entity with app-attempt-2 should have been present in response.");
        java.lang.String str4 = metricsTag3.name();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yarn.resourcemanager.cluster-id" + "'", str4, "yarn.resourcemanager.cluster-id");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        mutableQuantiles1.add((long) (byte) 100);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder3 = null;
        mutableQuantiles2.snapshot(metricsRecordBuilder3);
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator5 = mutableQuantiles2.getEstimator();
        int int6 = mutableQuantiles2.getInterval();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(quantileEstimator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.startMetricsMBeans();
        metricsSystem0.unregisterSource("yarn.timeline-service.version");
        metricsSystem0.stop();
        metricsSystem0.publishMetricsNow();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        boolean boolean6 = metricsSystem0.shutdown();
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo9 = org.apache.hadoop.metrics2.lib.Interns.info("yarn.timeline-service.reader.webapp.address", "");
        java.lang.String str10 = metricsInfo9.name();
        java.lang.String str11 = metricsInfo9.name();
        java.lang.Class<?> wildcardClass12 = metricsInfo9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type13 = metricsSystem0.register((java.lang.reflect.Type) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(metricsInfo9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "yarn.timeline-service.reader.webapp.address" + "'", str10, "yarn.timeline-service.reader.webapp.address");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "yarn.timeline-service.reader.webapp.address" + "'", str11, "yarn.timeline-service.reader.webapp.address");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency(0L, false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles8 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles9 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        mutableQuantiles9.add((long) 'a');
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles8);
        org.junit.Assert.assertNotNull(mutableQuantiles9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder3 = null;
        mutableQuantiles2.snapshot(metricsRecordBuilder3);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.stop();
        org.apache.hadoop.metrics2.MetricsSystem.Callback callback7 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsSystem0.register(callback7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("Entity with container_1_1 should have been present in response.", "UID should be present", "app-attempt-2");
        org.junit.Assert.assertNotNull(metricsTag3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem3 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.start();
        metricsSystem0.start();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder3 = null;
        mutableQuantiles2.snapshot(metricsRecordBuilder3, false);
        mutableQuantiles2.stop();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.lang.String str2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.sourceName("yarn.timeline-service.fs-writer.root-dir", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yarn.timeline-service.fs-writer.root-dir" + "'", str2, "yarn.timeline-service.fs-writer.root-dir");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.startMetricsMBeans();
        metricsSystem0.stop();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("container_2_1");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem7 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.publishMetricsNow();
        metricsSystem0.publishMetricsNow();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(metricsSystem7);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("", "Entity with id_3 should have been present in response.");
        org.apache.hadoop.metrics2.MetricsTag metricsTag4 = org.apache.hadoop.metrics2.lib.Interns.tag(metricsInfo2, "Entity with id_3 should have been present in response.");
        java.lang.Class<?> wildcardClass5 = metricsInfo2.getClass();
        org.junit.Assert.assertNotNull(metricsInfo2);
        org.junit.Assert.assertNotNull(metricsTag4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem8 = metricsSystem0.init("yarn.timeline-service.enabled");
        metricsSystem8.startMetricsMBeans();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(metricsSystem8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setMiniClusterMode(false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.newMBeanName("app-attempt-2");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: javax.management.MalformedObjectNameException: Key properties cannot be empty");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.startMetricsMBeans();
        metricsSystem0.unregisterSource("yarn.timeline-service.version");
        metricsSystem0.stop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = metricsSystem0.register("Entity with container_2_2 should have been present in response.");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        mutableQuantiles1.add((long) 100);
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics4 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics4.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles8 = timelineReaderMetrics4.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles9 = timelineReaderMetrics4.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles10 = timelineReaderMetrics4.getGetEntityTypesFailureLatency();
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics11 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles12 = timelineReaderMetrics11.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles13 = timelineReaderMetrics11.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles19 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        int int20 = mutableQuantiles19.getInterval();
        mutableQuantiles19.stop();
        mutableQuantiles19.stop();
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator23 = mutableQuantiles19.getEstimator();
        mutableQuantiles13.setEstimator(quantileEstimator23);
        mutableQuantiles10.setEstimator(quantileEstimator23);
        mutableQuantiles1.setEstimator(quantileEstimator23);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(timelineReaderMetrics4);
        org.junit.Assert.assertNotNull(mutableQuantiles8);
        org.junit.Assert.assertNotNull(mutableQuantiles9);
        org.junit.Assert.assertNotNull(mutableQuantiles10);
        org.junit.Assert.assertNotNull(timelineReaderMetrics11);
        org.junit.Assert.assertNotNull(mutableQuantiles12);
        org.junit.Assert.assertNotNull(mutableQuantiles13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(quantileEstimator23);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("", "yarn.timeline-service.version", "Entity with id_4 should have been present in response.");
        java.lang.Class<?> wildcardClass4 = metricsTag3.getClass();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        metricsSystem0.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem6 = metricsSystem0.init("UID");
        metricsSystem6.stopMetricsMBeans();
        metricsSystem6.stop();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable12 = metricsSystem6.register("Entity with id_3 should have been present in response.", "app-attempt-1", (java.io.Serializable) "cluster1");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = metricsSystem0.init("Entity with container_1_1 should have been present in response.");
        org.apache.hadoop.metrics2.lib.Interns interns5 = new org.apache.hadoop.metrics2.lib.Interns();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.lib.Interns interns6 = metricsSystem0.register(interns5);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem4);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("Metrics for TimelineReader", "Entity with id_4 should have been present in response.");
        org.junit.Assert.assertNotNull(metricsInfo2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder5 = null;
        mutableQuantiles4.snapshot(metricsRecordBuilder5, false);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder8 = null;
        mutableQuantiles4.snapshot(metricsRecordBuilder8, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("", "yarn.timeline-service.version");
        org.junit.Assert.assertNotNull(metricsInfo2);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.String str2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.sourceName("cluster1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cluster1" + "'", str2, "cluster1");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder5 = null;
        mutableQuantiles4.snapshot(metricsRecordBuilder5, false);
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics8 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics8.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles12 = timelineReaderMetrics8.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles13 = timelineReaderMetrics8.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles14 = timelineReaderMetrics8.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles20 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        int int21 = mutableQuantiles20.getInterval();
        mutableQuantiles20.stop();
        mutableQuantiles20.stop();
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator24 = mutableQuantiles20.getEstimator();
        mutableQuantiles14.setEstimator(quantileEstimator24);
        mutableQuantiles4.setEstimator(quantileEstimator24);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(timelineReaderMetrics8);
        org.junit.Assert.assertNotNull(mutableQuantiles12);
        org.junit.Assert.assertNotNull(mutableQuantiles13);
        org.junit.Assert.assertNotNull(mutableQuantiles14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(quantileEstimator24);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency(0L, false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles8 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles9 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles10 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        boolean boolean11 = mutableQuantiles10.changed();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles8);
        org.junit.Assert.assertNotNull(mutableQuantiles9);
        org.junit.Assert.assertNotNull(mutableQuantiles10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.newMBeanName("yarn.timeline-service.reader.webapp.address");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: javax.management.MalformedObjectNameException: Key properties cannot be empty");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        mutableQuantiles3.add((long) 'a');
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency(0L, false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles8 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles9 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        timelineReaderMetrics0.addGetEntitiesLatency((long) (byte) 10, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles8);
        org.junit.Assert.assertNotNull(mutableQuantiles9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        timelineReaderMetrics0.addGetEntitiesLatency((long) (-1), false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        timelineReaderMetrics0.addGetEntitiesLatency((long) (short) 10, true);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("yarn.timeline-service.reader.webapp.address", "cluster1", "UID");
        org.apache.hadoop.metrics2.MetricsTag metricsTag5 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "Entity with container_2_1 should have been present in response.");
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertNotNull(metricsTag5);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        boolean boolean4 = mutableQuantiles3.changed();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency(0L, false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles8 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        mutableQuantiles8.add((long) (-1));
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder11 = null;
        mutableQuantiles8.snapshot(metricsRecordBuilder11);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator6 = mutableQuantiles5.getEstimator();
        mutableQuantiles5.add((long) (short) 0);
        mutableQuantiles5.stop();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles15 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator16 = mutableQuantiles15.getEstimator();
        mutableQuantiles5.setEstimator(quantileEstimator16);
        int int18 = mutableQuantiles5.getInterval();
        mutableQuantiles5.add((long) 97);
        org.junit.Assert.assertNotNull(quantileEstimator6);
        org.junit.Assert.assertNotNull(quantileEstimator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency(0L, false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles8 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles9 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles10 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles11 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles8);
        org.junit.Assert.assertNotNull(mutableQuantiles9);
        org.junit.Assert.assertNotNull(mutableQuantiles10);
        org.junit.Assert.assertNotNull(mutableQuantiles11);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.lang.String str2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.sourceName("id_1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "id_1" + "'", str2, "id_1");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("yarn.resourcemanager.cluster-id");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder6 = null;
        mutableQuantiles5.snapshot(metricsRecordBuilder6);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder8 = null;
        mutableQuantiles5.snapshot(metricsRecordBuilder8);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem7 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(metricsSystem7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        mutableQuantiles4.add((long) (byte) -1);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder7 = null;
        mutableQuantiles4.snapshot(metricsRecordBuilder7, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.startMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem6 = metricsSystem0.init("Entities id_1, id_2, id_3 and id_4 should have been present in response");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem8 = metricsSystem6.init("TimelineReaderMetrics");
        org.apache.hadoop.metrics2.MetricsSystem.Callback callback9 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsSystem6.register(callback9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem6);
        org.junit.Assert.assertNotNull(metricsSystem8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.start();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem6 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem6.publishMetricsNow();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertNotNull(metricsSystem6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("yarn.timeline-service.version", "cluster1");
        org.junit.Assert.assertNotNull(metricsInfo2);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.stopMetricsMBeans();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = metricsSystem0.register("", "UID", "TimelineReaderMetrics");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        timelineReaderMetrics0.addGetEntitiesLatency((long) (short) 100, true);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = metricsSystem0.init("Entity with container_1_1 should have been present in response.");
        boolean boolean5 = metricsSystem0.shutdown();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("container_2_2", "app-attempt-1", "container_2_2");
        java.lang.String str4 = metricsTag3.name();
        org.apache.hadoop.metrics2.MetricsTag metricsTag6 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "Entity with id_3 should have been present in response.");
        org.apache.hadoop.metrics2.MetricsTag metricsTag8 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "container_2_2");
        java.lang.String str9 = metricsTag8.description();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "container_2_2" + "'", str4, "container_2_2");
        org.junit.Assert.assertNotNull(metricsTag6);
        org.junit.Assert.assertNotNull(metricsTag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "app-attempt-1" + "'", str9, "app-attempt-1");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles6 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        timelineReaderMetrics0.addGetEntitiesLatency((long) 97, true);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles5);
        org.junit.Assert.assertNotNull(mutableQuantiles6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("Entities with id_1 and id_2 should have been present in response.", "TimelineService");
        org.junit.Assert.assertNotNull(metricsInfo2);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator6 = mutableQuantiles5.getEstimator();
        mutableQuantiles5.add((long) (short) 0);
        mutableQuantiles5.stop();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles15 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator16 = mutableQuantiles15.getEstimator();
        mutableQuantiles5.setEstimator(quantileEstimator16);
        int int18 = mutableQuantiles5.getInterval();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles24 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator25 = mutableQuantiles24.getEstimator();
        mutableQuantiles5.setEstimator(quantileEstimator25);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(quantileEstimator6);
        org.junit.Assert.assertNotNull(quantileEstimator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(quantileEstimator25);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        mutableQuantiles1.add((long) 100);
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics4 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = timelineReaderMetrics4.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles6 = timelineReaderMetrics4.getGetEntityTypesSuccessLatency();
        timelineReaderMetrics4.addGetEntityTypesLatency((-1L), true);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles10 = timelineReaderMetrics4.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles16 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator17 = mutableQuantiles16.getEstimator();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles23 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator24 = mutableQuantiles23.getEstimator();
        mutableQuantiles23.add((long) (short) 0);
        mutableQuantiles23.stop();
        int int28 = mutableQuantiles23.getInterval();
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator29 = mutableQuantiles23.getEstimator();
        mutableQuantiles16.setEstimator(quantileEstimator29);
        mutableQuantiles10.setEstimator(quantileEstimator29);
        mutableQuantiles1.setEstimator(quantileEstimator29);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(timelineReaderMetrics4);
        org.junit.Assert.assertNotNull(mutableQuantiles5);
        org.junit.Assert.assertNotNull(mutableQuantiles6);
        org.junit.Assert.assertNotNull(mutableQuantiles10);
        org.junit.Assert.assertNotNull(quantileEstimator17);
        org.junit.Assert.assertNotNull(quantileEstimator24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(quantileEstimator29);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = metricsSystem0.init("TimelineService");
        metricsSystem0.startMetricsMBeans();
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem defaultMetricsSystem6 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.INSTANCE;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.lib.DefaultMetricsSystem defaultMetricsSystem7 = metricsSystem0.register(defaultMetricsSystem6);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertTrue("'" + defaultMetricsSystem6 + "' != '" + org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.INSTANCE + "'", defaultMetricsSystem6.equals(org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.INSTANCE));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.stop();
        metricsSystem0.unregisterSource("id_4");
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency((-1L), true);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles6 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles12 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator13 = mutableQuantiles12.getEstimator();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles19 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator20 = mutableQuantiles19.getEstimator();
        mutableQuantiles19.add((long) (short) 0);
        mutableQuantiles19.stop();
        int int24 = mutableQuantiles19.getInterval();
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator25 = mutableQuantiles19.getEstimator();
        mutableQuantiles12.setEstimator(quantileEstimator25);
        mutableQuantiles6.setEstimator(quantileEstimator25);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles33 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator34 = mutableQuantiles33.getEstimator();
        mutableQuantiles6.setEstimator(quantileEstimator34);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles6);
        org.junit.Assert.assertNotNull(quantileEstimator13);
        org.junit.Assert.assertNotNull(quantileEstimator20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(quantileEstimator25);
        org.junit.Assert.assertNotNull(quantileEstimator34);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.initialize("id_1");
        metricsSystem1.unregisterSource("app-attempt-1");
        org.junit.Assert.assertNotNull(metricsSystem1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("Entities with id_1 and id_4 should have been present in response based on entity created time.", "container_2_1", "Entity with id_3 should have been present in response.", "Web server failed to start", 10);
        boolean boolean6 = mutableQuantiles5.changed();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        metricsSystem0.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem6 = metricsSystem0.init("UID");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem9 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem9.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem11 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem9);
        java.lang.String str12 = metricsSystem9.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem13 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem9);
        java.lang.String str14 = metricsSystem9.currentConfig();
        metricsSystem9.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem16 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem9);
        metricsSystem16.stop();
        metricsSystem16.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem19 = metricsSystem0.register("Web server failed to start", "", metricsSystem16);
        boolean boolean20 = metricsSystem16.shutdown();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem6);
        org.junit.Assert.assertNotNull(metricsSystem9);
        org.junit.Assert.assertNotNull(metricsSystem11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(metricsSystem13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(metricsSystem16);
        org.junit.Assert.assertNotNull(metricsSystem19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("UID", "container_2_1", "UID");
        java.lang.String str4 = metricsTag3.description();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "container_2_1" + "'", str4, "container_2_1");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("id_3", "container_1_1", "Entity with app-attempt-2 should have been present in response.", "localhost:0", (int) '4');
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem4.startMetricsMBeans();
        metricsSystem4.start();
        java.lang.String str7 = metricsSystem4.currentConfig();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.unregisterSource("Entity with id_1 should have been present in response.");
        metricsSystem0.start();
        java.lang.String str9 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSource metricsSource11 = metricsSystem0.getSource("UID should be present");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem13 = metricsSystem0.init("container_1_1");
        org.apache.hadoop.metrics2.MetricsSource metricsSource15 = metricsSystem13.getSource("yarn.timeline-service.enabled");
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(metricsSource11);
        org.junit.Assert.assertNotNull(metricsSystem13);
        org.junit.Assert.assertNull(metricsSource15);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator6 = mutableQuantiles5.getEstimator();
        mutableQuantiles5.add((long) (short) 0);
        mutableQuantiles5.stop();
        int int10 = mutableQuantiles5.getInterval();
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator11 = mutableQuantiles5.getEstimator();
        mutableQuantiles5.stop();
        mutableQuantiles5.stop();
        int int14 = mutableQuantiles5.getInterval();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(quantileEstimator6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(quantileEstimator11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        metricsSystem0.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem7 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem7.stopMetricsMBeans();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.metrics2.MetricsSystemMXBean metricsSystemMXBean9 = metricsSystem0.register("id_2", "id_1", (org.apache.hadoop.metrics2.MetricsSystemMXBean) metricsSystem7);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: Metrics source id_2 already exists!");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.initialize("id_2");
        org.junit.Assert.assertNotNull(metricsSystem1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.stop();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem3 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.unregisterSource("Entity with id_1 should have been present in response.");
        metricsSystem0.start();
        metricsSystem0.stop();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSource metricsSource4 = metricsSystem0.getSource("Entity with app-attempt-2 should have been present in response.");
        metricsSystem0.unregisterSource("Entity with container_1_1 should have been present in response.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = metricsSystem0.register((java.lang.Comparable<java.lang.String>) "Entity with container_1_1 should have been present in response.");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNull(metricsSource4);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("yarn.timeline-service.fs-writer.root-dir");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) '#', false);
        timelineReaderMetrics0.addGetEntitiesLatency((long) 97, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency((-1L), true);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles6 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        mutableQuantiles6.add((-1L));
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("Entity with id_1 should have been present in response.");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("container_2_2", "app-attempt-1", "container_2_2");
        java.lang.String str4 = metricsTag3.description();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "app-attempt-1" + "'", str4, "app-attempt-1");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        mutableQuantiles1.add((long) 100);
        mutableQuantiles1.add((long) (byte) 0);
        boolean boolean6 = mutableQuantiles1.changed();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.startMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem6 = metricsSystem0.init("Entities id_1, id_2, id_3 and id_4 should have been present in response");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem8 = metricsSystem6.init("TimelineReaderMetrics");
        metricsSystem6.unregisterSource("id_2");
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem6);
        org.junit.Assert.assertNotNull(metricsSystem8);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("Entity with id_4 should not have been present in response.", "Entity with container_2_2 should have been present in response.", "TimelineService");
        java.lang.String str4 = metricsTag3.name();
        org.apache.hadoop.metrics2.MetricsTag metricsTag6 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "yarn.timeline-service.fs-writer.root-dir");
        java.lang.String str7 = metricsTag3.description();
        java.lang.String str8 = metricsTag3.name();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Entity with id_4 should not have been present in response." + "'", str4, "Entity with id_4 should not have been present in response.");
        org.junit.Assert.assertNotNull(metricsTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entity with container_2_2 should have been present in response." + "'", str7, "Entity with container_2_2 should have been present in response.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Entity with id_4 should not have been present in response." + "'", str8, "Entity with id_4 should not have been present in response.");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("container_2_2", "app-attempt-1", "container_2_2");
        java.lang.String str4 = metricsTag3.name();
        org.apache.hadoop.metrics2.MetricsTag metricsTag6 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "Entity with id_3 should have been present in response.");
        java.lang.String str7 = metricsTag6.description();
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "container_2_2" + "'", str4, "container_2_2");
        org.junit.Assert.assertNotNull(metricsTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "app-attempt-1" + "'", str7, "app-attempt-1");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        boolean boolean6 = metricsSystem0.shutdown();
        metricsSystem0.publishMetricsNow();
        boolean boolean8 = metricsSystem0.shutdown();
        metricsSystem0.start();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("target");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem3 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem5 = metricsSystem3.init("");
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem3);
        org.junit.Assert.assertNotNull(metricsSystem5);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("Entities with id_1 and id_4 should have been present in response based on entity created time.", "container_2_1", "Entity with id_3 should have been present in response.", "Web server failed to start", 10);
        mutableQuantiles5.add(0L);
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator8 = mutableQuantiles5.getEstimator();
        org.junit.Assert.assertNotNull(quantileEstimator8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.startMetricsMBeans();
        org.junit.Assert.assertNotNull(metricsSystem0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem3 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stopMetricsMBeans();
        java.lang.String str5 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem6 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(metricsSystem6);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.stop();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.startMetricsMBeans();
        metricsSystem0.stop();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("Entity with id_4 should have been present in response.");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.initialize("yarn.timeline-service.enabled");
        org.apache.hadoop.metrics2.MetricsSource metricsSource3 = metricsSystem1.getSource("Entities with id_1 and id_2 should have been present in response.");
        org.junit.Assert.assertNotNull(metricsSystem1);
        org.junit.Assert.assertNull(metricsSource3);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.newMBeanName("container_2_1");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: javax.management.MalformedObjectNameException: Key properties cannot be empty");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        mutableQuantiles1.add((long) 100);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder4 = null;
        mutableQuantiles1.snapshot(metricsRecordBuilder4);
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics6 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles7 = timelineReaderMetrics6.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles8 = timelineReaderMetrics6.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles14 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator15 = mutableQuantiles14.getEstimator();
        mutableQuantiles14.add((long) (short) 0);
        mutableQuantiles14.stop();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles24 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator25 = mutableQuantiles24.getEstimator();
        mutableQuantiles14.setEstimator(quantileEstimator25);
        mutableQuantiles8.setEstimator(quantileEstimator25);
        mutableQuantiles1.setEstimator(quantileEstimator25);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(timelineReaderMetrics6);
        org.junit.Assert.assertNotNull(mutableQuantiles7);
        org.junit.Assert.assertNotNull(mutableQuantiles8);
        org.junit.Assert.assertNotNull(quantileEstimator15);
        org.junit.Assert.assertNotNull(quantileEstimator25);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles5);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.newMBeanName("UID should be present");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: javax.management.MalformedObjectNameException: Key properties cannot be empty");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency(0L, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles5);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("Entity with id_1 should have been present in response.", "yarn.timeline-service.version", "localhost:0", "target", (int) 'a');
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem4.stop();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.apache.hadoop.metrics2.MetricsTag metricsTag3 = org.apache.hadoop.metrics2.lib.Interns.tag("Entity with id_4 should not have been present in response.", "Entity with container_2_2 should have been present in response.", "TimelineService");
        java.lang.String str4 = metricsTag3.name();
        org.apache.hadoop.metrics2.MetricsTag metricsTag6 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "yarn.timeline-service.fs-writer.root-dir");
        java.lang.String str7 = metricsTag3.description();
        org.apache.hadoop.metrics2.MetricsTag metricsTag9 = org.apache.hadoop.metrics2.lib.Interns.tag((org.apache.hadoop.metrics2.MetricsInfo) metricsTag3, "target");
        org.junit.Assert.assertNotNull(metricsTag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Entity with id_4 should not have been present in response." + "'", str4, "Entity with id_4 should not have been present in response.");
        org.junit.Assert.assertNotNull(metricsTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Entity with container_2_2 should have been present in response." + "'", str7, "Entity with container_2_2 should have been present in response.");
        org.junit.Assert.assertNotNull(metricsTag9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.stop();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem.Callback callback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsSystem0.register(callback6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder5 = null;
        mutableQuantiles4.snapshot(metricsRecordBuilder5);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder7 = null;
        mutableQuantiles4.snapshot(metricsRecordBuilder7);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder9 = null;
        mutableQuantiles4.snapshot(metricsRecordBuilder9, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSource metricsSource5 = metricsSystem0.getSource("yarn.timeline-service.reader.webapp.address");
        metricsSystem0.startMetricsMBeans();
        metricsSystem0.startMetricsMBeans();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(metricsSource5);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles3 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles6 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 10, false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles10 = timelineReaderMetrics0.getGetEntityTypesSuccessLatency();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
        org.junit.Assert.assertNotNull(mutableQuantiles3);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles5);
        org.junit.Assert.assertNotNull(mutableQuantiles6);
        org.junit.Assert.assertNotNull(mutableQuantiles10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("Entities with id_1 and id_2 should have been present in response.");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        // The following exception was thrown during execution in test generation
        try {
            javax.management.ObjectName objectName1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.newMBeanName("Entity with id_1 should have been present in response.");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: javax.management.MalformedObjectNameException: Key properties cannot be empty");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) (byte) 0, false);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.apache.hadoop.metrics2.MetricsInfo metricsInfo2 = org.apache.hadoop.metrics2.lib.Interns.info("yarn.timeline-service.reader.webapp.address", "");
        java.lang.String str3 = metricsInfo2.name();
        java.lang.String str4 = metricsInfo2.name();
        java.lang.String str5 = metricsInfo2.name();
        org.junit.Assert.assertNotNull(metricsInfo2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yarn.timeline-service.reader.webapp.address" + "'", str3, "yarn.timeline-service.reader.webapp.address");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yarn.timeline-service.reader.webapp.address" + "'", str4, "yarn.timeline-service.reader.webapp.address");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "yarn.timeline-service.reader.webapp.address" + "'", str5, "yarn.timeline-service.reader.webapp.address");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics2 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics2.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles6 = timelineReaderMetrics2.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles7 = timelineReaderMetrics2.getGetEntitiesSuccessLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles8 = timelineReaderMetrics2.getGetEntityTypesFailureLatency();
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics9 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles10 = timelineReaderMetrics9.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles11 = timelineReaderMetrics9.getGetEntitiesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles17 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("container_2_2", "", "TimelineReaderMetrics", "", (int) 'a');
        int int18 = mutableQuantiles17.getInterval();
        mutableQuantiles17.stop();
        mutableQuantiles17.stop();
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator21 = mutableQuantiles17.getEstimator();
        mutableQuantiles11.setEstimator(quantileEstimator21);
        mutableQuantiles8.setEstimator(quantileEstimator21);
        mutableQuantiles1.setEstimator(quantileEstimator21);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(timelineReaderMetrics2);
        org.junit.Assert.assertNotNull(mutableQuantiles6);
        org.junit.Assert.assertNotNull(mutableQuantiles7);
        org.junit.Assert.assertNotNull(mutableQuantiles8);
        org.junit.Assert.assertNotNull(timelineReaderMetrics9);
        org.junit.Assert.assertNotNull(mutableQuantiles10);
        org.junit.Assert.assertNotNull(mutableQuantiles11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(quantileEstimator21);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder2 = null;
        mutableQuantiles1.snapshot(metricsRecordBuilder2, false);
        int int5 = mutableQuantiles1.getInterval();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.startMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem6 = metricsSystem0.init("Entities id_1, id_2, id_3 and id_4 should have been present in response");
        org.apache.hadoop.metrics2.MetricsSource metricsSource8 = metricsSystem6.getSource("app-attempt-1");
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSystem6);
        org.junit.Assert.assertNull(metricsSource8);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem1 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.initialize("yarn.timeline-service.reader.webapp.address");
        org.junit.Assert.assertNotNull(metricsSystem1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.lang.String str2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.sourceName("Entity with app-attempt-2 should have been present in response.", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Entity with app-attempt-2 should have been present in response." + "'", str2, "Entity with app-attempt-2 should have been present in response.");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        timelineReaderMetrics0.addGetEntitiesLatency((long) (short) 0, false);
        timelineReaderMetrics0.addGetEntityTypesLatency(10L, false);
        timelineReaderMetrics0.addGetEntityTypesLatency((-1L), true);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.unregisterSource("Entity with id_1 should have been present in response.");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem9 = metricsSystem0.init("id_3");
        metricsSystem0.stopMetricsMBeans();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(metricsSystem9);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("Entity with container_2_1 should have been present in response.", "", "app-attempt-2", "target", (int) '#');
        boolean boolean6 = mutableQuantiles5.changed();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles1 = timelineReaderMetrics0.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles2 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        timelineReaderMetrics0.addGetEntityTypesLatency(1L, true);
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles1);
        org.junit.Assert.assertNotNull(mutableQuantiles2);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem7 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem7.start();
        java.lang.String str9 = metricsSystem7.currentConfig();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(metricsSystem7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.publishMetricsNow();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem7 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.startMetricsMBeans();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(metricsSystem7);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        java.lang.String str2 = metricsSystem0.currentConfig();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem4 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str5 = metricsSystem0.currentConfig();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem8 = metricsSystem0.init("yarn.timeline-service.enabled");
        org.apache.hadoop.metrics2.MetricsSystem.Callback callback9 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsSystem0.register(callback9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(metricsSystem4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(metricsSystem8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.stop();
        metricsSystem0.stopMetricsMBeans();
        metricsSystem0.startMetricsMBeans();
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics7 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles8 = timelineReaderMetrics7.getGetEntityTypesFailureLatency();
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles9 = timelineReaderMetrics7.getGetEntitiesSuccessLatency();
        timelineReaderMetrics7.addGetEntityTypesLatency((long) (-1), true);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles13 = timelineReaderMetrics7.getGetEntitiesFailureLatency();
        boolean boolean14 = mutableQuantiles13.changed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = metricsSystem0.register((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.metrics2.MetricsException; message: No valid @Metric annotation found.");
        } catch (org.apache.hadoop.metrics2.MetricsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(timelineReaderMetrics7);
        org.junit.Assert.assertNotNull(mutableQuantiles8);
        org.junit.Assert.assertNotNull(mutableQuantiles9);
        org.junit.Assert.assertNotNull(mutableQuantiles13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        timelineReaderMetrics0.addGetEntityTypesLatency((long) 'a', false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles4 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        timelineReaderMetrics0.addGetEntitiesLatency((long) (short) 0, false);
        timelineReaderMetrics0.addGetEntityTypesLatency(10L, false);
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles11 = timelineReaderMetrics0.getGetEntitiesFailureLatency();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
        org.junit.Assert.assertNotNull(mutableQuantiles4);
        org.junit.Assert.assertNotNull(mutableQuantiles11);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("app-attempt-1");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        metricsSystem0.stop();
        metricsSystem0.startMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSource metricsSource6 = metricsSystem0.getSource("Web server failed to start");
        metricsSystem0.stop();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertNotNull(metricsSource6);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem0 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.instance();
        metricsSystem0.stopMetricsMBeans();
        org.apache.hadoop.metrics2.MetricsSystem metricsSystem2 = org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.setInstance(metricsSystem0);
        java.lang.String str3 = metricsSystem0.currentConfig();
        metricsSystem0.startMetricsMBeans();
        org.junit.Assert.assertNotNull(metricsSystem0);
        org.junit.Assert.assertNotNull(metricsSystem2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        org.apache.hadoop.metrics2.lib.DefaultMetricsSystem.removeSourceName("localhost:0");
    }
}

