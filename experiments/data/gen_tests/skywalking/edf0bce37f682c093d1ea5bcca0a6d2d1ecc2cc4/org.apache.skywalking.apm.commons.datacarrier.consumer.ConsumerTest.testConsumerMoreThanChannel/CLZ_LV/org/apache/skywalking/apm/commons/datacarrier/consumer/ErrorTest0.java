package org.apache.skywalking.apm.commons.datacarrier.consumer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("data", false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        int[] intArray1 = null;
        int[] intArray6 = new int[] { (byte) 1, (short) -1, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("consumer", intArray1, intArray6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("consumerThreads", (double) 10.0f, (double) 'a', (double) 'a');
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("consumer", (double) (-1.0f), (double) (byte) -1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue(false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", objArray1, objArray4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        boolean[] booleanArray5 = new boolean[] { true, false, false, false };
        boolean[] booleanArray12 = new boolean[] { true, false, true, false, false, false };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("driver", booleanArray5, booleanArray12);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", byteArray6, byteArray12);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("", false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        int[] intArray3 = new int[] { (byte) -1, 100 };
        int[] intArray8 = new int[] { (short) 100, (short) 10, 'a', (-1) };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        int[] intArray3 = new int[] { 100, (byte) 1, (short) 10 };
        int[] intArray7 = new int[] { '#', (-1), 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) 100);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("data", (java.lang.Object) "hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        long[] longArray3 = new long[] { 0L, (byte) 0, 0 };
        long[] longArray8 = new long[] { '#', 10, '\000', 10L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1), 0.0d, (double) (byte) -1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        double[] doubleArray3 = new double[] { 'a', 1.0d, (byte) 1 };
        double[] doubleArray5 = new double[] { 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray5, (double) (byte) 100);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("driver", (double) (byte) 1, (-1.0d), (double) 100.0f);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100.0d, (double) (byte) 100, 1.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        long[] longArray4 = new long[] { (-1L), (short) 0, '\000', ' ' };
        long[] longArray8 = new long[] { 100, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 0.0f, (double) (-1.0f));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        char[] charArray1 = new char[] {};
        char[] charArray4 = new char[] { '4', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("consumerThreads", charArray1, charArray4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 'a');
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 100.0d, (java.lang.Object) '#');
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap3 = org.mockito.ArgumentMatchers.anyMap();
        org.junit.Assert.assertNotNull((java.lang.Object) serializableMap3);
        org.mockito.MockingDetails mockingDetails6 = org.mockito.Mockito.mockingDetails((java.lang.Object) true);
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, (byte) 1, 1, serializableMap3, mockingDetails6 };
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray9, objArray10);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals(objArray7, objArray9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        float[] floatArray4 = new float[] { 1L, (short) 1, (byte) -1, 1L };
        float[] floatArray6 = new float[] { 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, (float) '\000');
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        int[] intArray4 = new int[] { (short) 100, 10, (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 'a', (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("data", intArray4, intArray9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        byte[] byteArray0 = null;
        byte[] byteArray1 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("data", (float) 1L, (float) (short) 1, (float) (byte) 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("data", (double) ' ', 0.0d, (double) 1.0f);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        long[] longArray5 = new long[] { '#', (-1), 1L, (short) 10 };
        long[] longArray11 = new long[] { 100, 0L, 100L, '\000', '\000' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("consumerThreads", longArray5, longArray11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 10.0d, (java.lang.Object) false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse(true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        short[] shortArray1 = new short[] { (byte) 1 };
        short[] shortArray7 = new short[] { (short) 1, (short) 10, (byte) -1, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("consumerThreads", (java.lang.Object) sampleConsumer1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.Object[] objArray0 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray2, objArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, objArray3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        char[] charArray5 = new char[] { '4', '#', '\000', 'a' };
        char[] charArray12 = new char[] { '#', '4', '\000', 'a', ' ', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", charArray5, charArray12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("consumerThreads", byteArray5, byteArray8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        double[] doubleArray1 = null;
        double[] doubleArray7 = new double[] { (byte) 1, (short) 100, (-1.0f), 1, 0.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray1, doubleArray7, (double) (byte) 10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("consumerThreads", (double) (short) 100, (double) (-1.0f), (double) 0L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        boolean[] booleanArray1 = new boolean[] {};
        boolean[] booleanArray2 = new boolean[] {};
        org.junit.Assert.assertArrayEquals("data", booleanArray1, booleanArray2);
        boolean[] booleanArray6 = new boolean[] { false, true };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(booleanArray2, booleanArray6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), 0.0d, (double) 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        short[] shortArray3 = new short[] { (byte) 100, (byte) 0, (short) 10 };
        short[] shortArray5 = new short[] { (short) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) (short) 10, (double) (byte) 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.skywalking.apm.commons.datacarrier.consumer.IConsumer<java.lang.Object> objIConsumer3 = null;
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object> objConsumerThread5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object>("driver", objIConsumer3, (long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("driver", (java.lang.Object) 100, (java.lang.Object) "driver");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, 0L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        long[] longArray3 = new long[] { '\000', (byte) 0 };
        long[] longArray6 = new long[] { (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("consumer", longArray3, longArray6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("", obj1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        long[] longArray0 = new long[] {};
        long[] longArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (short) 100);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) 10L, (float) (-1));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        long[] longArray3 = new long[] { (byte) 100, 100, 1 };
        long[] longArray7 = new long[] { (byte) 100, 0, 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        float[] floatArray4 = new float[] { 0.0f, (short) -1, 0, 0 };
        float[] floatArray6 = new float[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, 0.0f);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("data", byteArray6, byteArray12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        double[] doubleArray3 = new double[] { (byte) 10, 100.0d, (-1.0f) };
        double[] doubleArray6 = new double[] { (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) (byte) 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        short[] shortArray2 = new short[] { (short) 1, (short) 0 };
        short[] shortArray9 = new short[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer0 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer0.onExit();
        sampleConsumer0.i = ' ';
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer4 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int5 = sampleConsumer4.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer6 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer6.nothingToConsume();
        sampleConsumer6.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray9 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList10 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList10, sampleDataArray9);
        java.lang.Throwable throwable12 = null;
        sampleConsumer6.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList10, throwable12);
        sampleConsumer4.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList10);
        sampleConsumer0.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) sampleDataList10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) 'a');
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, 100L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout2 = org.mockito.Mockito.timeout((long) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 'a', (java.lang.Object) (short) 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        short[] shortArray1 = new short[] {};
        short[] shortArray5 = new short[] { (short) 100, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("consumer", shortArray1, shortArray5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        long[] longArray6 = new long[] { (byte) 1, 5, (-1), (short) -1, (-1), 10L };
        long[] longArray11 = new long[] { 0, (-1L), (-1), 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("consumer", byteArray3, byteArray5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int2 = sampleConsumer1.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer3 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer3.nothingToConsume();
        sampleConsumer3.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray6 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList7 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList7, sampleDataArray6);
        java.lang.Throwable throwable9 = null;
        sampleConsumer3.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList7, throwable9);
        sampleConsumer1.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList7);
        java.util.Set<org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object>> objConsumerThreadSet12 = org.mockito.ArgumentMatchers.anySet();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("driver", (java.lang.Object) sampleConsumer1, (java.lang.Object) objConsumerThreadSet12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray1 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.concurrent.LinkedBlockingQueue<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataQueue2 = new java.util.concurrent.LinkedBlockingQueue<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataQueue2, sampleDataArray1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.BUFFER = sampleDataQueue2;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) sampleDataQueue2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.util.Set<org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerThread<java.lang.Object>> objConsumerThreadSet0 = org.mockito.ArgumentMatchers.anySet();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) objConsumerThreadSet0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        boolean[] booleanArray2 = new boolean[] { false, true };
        boolean[] booleanArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(booleanArray2, booleanArray3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        long[] longArray0 = new long[] {};
        long[] longArray4 = new long[] { 10, 1L, 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray2, objArray3);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder5 = org.mockito.Mockito.mockitoSession();
        java.lang.String[] strArray11 = new java.lang.String[] { "consumer", "hi!", "hi!", "hi!", "consumerThreads" };
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder12 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder5, strArray11);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("data", objArray2, (java.lang.Object[]) strArray11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("data", byteArray7, byteArray9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        int[] intArray1 = new int[] {};
        int[] intArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("driver", intArray1, intArray2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        float[] floatArray6 = new float[] { 0, 1, (-1L), 5, '\000' };
        float[] floatArray10 = new float[] { 1, (short) 10, '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("consumer", floatArray6, floatArray10, (float) 5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        double[] doubleArray3 = new double[] { (-1.0f), 100, 'a' };
        double[] doubleArray7 = new double[] { 10.0d, 1.0d, 0.0d };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray7, (double) '\000');
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        int[] intArray2 = new int[] { '#' };
        int[] intArray7 = new int[] { 5, 0, (byte) 100, 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", intArray2, intArray7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("consumerThreads", (long) '#', (long) (byte) 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true };
        boolean[] booleanArray7 = new boolean[] {};
        boolean[] booleanArray8 = new boolean[] {};
        org.junit.Assert.assertArrayEquals("data", booleanArray7, booleanArray8);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("driver", booleanArray5, booleanArray8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        char[] charArray5 = new char[] { '4', 'a', '#', 'a', ' ' };
        char[] charArray7 = new char[] { ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("data", true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        short[] shortArray0 = new short[] {};
        short[] shortArray2 = new short[] { (short) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        short[] shortArray2 = new short[] { (byte) 0 };
        short[] shortArray3 = new short[] {};
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", shortArray2, shortArray3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer1.nothingToConsume();
        sampleConsumer1.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray4 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList5 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList5, sampleDataArray4);
        java.lang.Throwable throwable7 = null;
        sampleConsumer1.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList5, throwable7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("", (java.lang.Object) throwable7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("consumer");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("hi!", true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("driver", byteArray6, byteArray13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("data");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("driver");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        short[] shortArray5 = new short[] { (short) 0, (byte) 100, (byte) 0, (short) -1, (byte) 100 };
        short[] shortArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.verification.VerificationMode verificationMode1 = org.mockito.Mockito.calls(5);
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay3 = org.mockito.Mockito.after((long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 5, (java.lang.Object) (byte) 100);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        int[] intArray5 = new int[] { (short) 10, (-1), 'a', (short) 100 };
        int[] intArray7 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("consumerThreads", intArray5, intArray7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (short) 1, (double) (short) 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        char[] charArray3 = new char[] { '\000', ' ' };
        char[] charArray10 = new char[] { '#', ' ', '\000', ' ', 'a', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("data", charArray3, charArray10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) 10.0f);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        char[] charArray5 = new char[] { ' ', 'a', ' ', '\000', '4' };
        char[] charArray12 = new char[] { '#', ' ', '\000', ' ', '4', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.skywalking.apm.commons.datacarrier.buffer.BufferStrategy bufferStrategy5 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapDataCarrier6 = new org.apache.skywalking.apm.commons.datacarrier.DataCarrier<java.util.Map<java.io.Serializable, java.lang.CharSequence>>("driver", "hi!", (int) 'a', (int) (byte) 10, bufferStrategy5);
        java.util.Map<java.io.Serializable, java.lang.CharSequence> serializableMap7 = org.mockito.ArgumentMatchers.anyMap();
        boolean boolean8 = serializableMapDataCarrier6.produce(serializableMap7);
        serializableMapDataCarrier6.shutdownConsumers();
        org.apache.skywalking.apm.commons.datacarrier.partition.IDataPartitioner<java.util.Map<java.io.Serializable, java.lang.CharSequence>> serializableMapIDataPartitioner10 = null;
        org.apache.skywalking.apm.commons.datacarrier.DataCarrier dataCarrier11 = serializableMapDataCarrier6.setPartitioner(serializableMapIDataPartitioner10);
        boolean[] booleanArray14 = new boolean[] {};
        boolean[] booleanArray15 = new boolean[] {};
        org.junit.Assert.assertArrayEquals("data", booleanArray14, booleanArray15);
        boolean[] booleanArray17 = new boolean[] {};
        org.junit.Assert.assertArrayEquals("data", booleanArray15, booleanArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) dataCarrier11, (java.lang.Object) booleanArray15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) '4');
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer1.onExit();
        sampleConsumer1.nothingToConsume();
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest5.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest5);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_8 = consumerTest5.new SampleConsumer2();
        sampleConsumer2_8.i = (byte) 0;
        sampleConsumer2_8.onExit();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("consumerThreads", (java.lang.Object) sampleConsumer1, (java.lang.Object) sampleConsumer2_8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        double[] doubleArray6 = new double[] { (byte) -1, 100L, 100, 0L, (byte) -1 };
        double[] doubleArray13 = new double[] { '#', (byte) 100, '4', 5, '4', 100.0f };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray13, 10.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        double[] doubleArray6 = new double[] { 100.0f, 1.0f, 0L, (-1.0d), (byte) 100, (byte) -1 };
        double[] doubleArray12 = new double[] { 0.0f, (byte) 1, 0.0d, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray12, (double) 100.0f);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray2, byteArray8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest2 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        org.junit.Assert.assertNotNull("driver", (java.lang.Object) consumerTest2);
        consumerTest2.testConsumerMoreThanChannel();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) consumerTest2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        double[] doubleArray4 = new double[] { (-1), ' ', 1, (short) 0 };
        double[] doubleArray6 = new double[] { (-1L) };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray6, (double) '#');
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        short[] shortArray5 = new short[] { (short) 0, (short) 0, (short) 0, (short) 100 };
        short[] shortArray10 = new short[] { (short) 1, (byte) 100, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("consumerThreads", shortArray5, shortArray10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        int int2 = sampleConsumer1.i;
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer3 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer3.nothingToConsume();
        sampleConsumer3.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray6 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList7 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList7, sampleDataArray6);
        java.lang.Throwable throwable9 = null;
        sampleConsumer3.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList7, throwable9);
        sampleConsumer1.consume((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (byte) 0, (java.lang.Object) sampleConsumer1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder2 = org.mockito.Mockito.mockitoSession();
        java.lang.String[] strArray8 = new java.lang.String[] { "consumer", "hi!", "hi!", "hi!", "consumerThreads" };
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder9 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder2, strArray8);
        java.lang.Comparable<java.lang.String> strComparable10 = org.mockito.ArgumentMatchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray8);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray13, objArray14);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray17, objArray18);
        org.junit.Assert.assertEquals("", objArray14, objArray18);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("driver", (java.lang.Object[]) strArray8, objArray14);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("consumerThreads");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        double[] doubleArray3 = new double[] { (-1), 100.0f, (-1.0f) };
        double[] doubleArray6 = new double[] { (short) -1, (-1.0f) };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray6, (double) (short) -1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest consumerTest1 = new org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest();
        consumerTest1.testConsumerLessThanChannel();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) consumerTest1);
        org.apache.skywalking.apm.commons.datacarrier.consumer.ConsumerTest.SampleConsumer2 sampleConsumer2_4 = consumerTest1.new SampleConsumer2();
        org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer sampleConsumer5 = new org.apache.skywalking.apm.commons.datacarrier.consumer.SampleConsumer();
        sampleConsumer5.nothingToConsume();
        sampleConsumer5.onExit();
        org.apache.skywalking.apm.commons.datacarrier.SampleData[] sampleDataArray8 = new org.apache.skywalking.apm.commons.datacarrier.SampleData[] {};
        java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData> sampleDataList9 = new java.util.ArrayList<org.apache.skywalking.apm.commons.datacarrier.SampleData>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, sampleDataArray8);
        java.lang.Throwable throwable11 = null;
        sampleConsumer5.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable11);
        java.lang.Throwable throwable13 = null;
        sampleConsumer2_4.onError((java.util.List<org.apache.skywalking.apm.commons.datacarrier.SampleData>) sampleDataList9, throwable13);
        sampleConsumer2_4.i = 'a';
        sampleConsumer2_4.init();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) sampleConsumer2_4, (java.lang.Object) 1L);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 100.0d, (double) (short) 10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 100L, 0.0d, (double) (byte) 100);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        long[] longArray2 = new long[] { (-1), (short) 10 };
        long[] longArray8 = new long[] { (short) 100, (byte) 1, (short) 100, 5, 5 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) 10L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray3, objArray4);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray7, objArray8);
        org.junit.Assert.assertEquals("", objArray4, objArray8);
        java.lang.Object[] objArray11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("consumer", objArray8, objArray11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("consumer", (-1.0d), 100.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("driver", (java.lang.Object) 10.0f, (java.lang.Object) (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray3, objArray4);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("data", objArray7, objArray8);
        org.junit.Assert.assertEquals("", objArray4, objArray8);
        java.lang.Object[] objArray11 = org.mockito.Mockito.ignoreStubs(objArray4);
        java.lang.Object[] objArray12 = org.mockito.Mockito.ignoreStubs(objArray4);
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder14 = org.mockito.Mockito.mockitoSession();
        java.lang.String[] strArray20 = new java.lang.String[] { "consumer", "hi!", "hi!", "hi!", "consumerThreads" };
        org.mockito.session.MockitoSessionBuilder mockitoSessionBuilder21 = org.mockito.ArgumentMatchers.refEq(mockitoSessionBuilder14, strArray20);
        java.lang.Comparable<java.lang.String> strComparable22 = org.mockito.ArgumentMatchers.refEq((java.lang.Comparable<java.lang.String>) "hi!", strArray20);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", objArray4, (java.lang.Object[]) strArray20);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, 100L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("data", (double) '#', 1.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        int[] intArray0 = null;
        int[] intArray5 = new int[] { '\000', 100, (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray5);
    }
}

