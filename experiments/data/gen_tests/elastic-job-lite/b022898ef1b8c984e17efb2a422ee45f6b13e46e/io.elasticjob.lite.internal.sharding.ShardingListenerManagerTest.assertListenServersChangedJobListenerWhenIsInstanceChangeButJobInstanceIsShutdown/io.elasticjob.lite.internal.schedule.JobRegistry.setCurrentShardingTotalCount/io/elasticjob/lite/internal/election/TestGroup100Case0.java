package io.elasticjob.lite.internal.election;

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
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 1);
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (-1));
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (-1));
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '4');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (-1));
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (-1));
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (-1));
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) '4');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '#');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (-1));
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (-1));
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("", (-1));
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("", (-1));
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) '4');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 1);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("hi!", 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("", (-1));
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("", 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (-1));
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (-1));
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) '#');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("hi!", 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (-1));
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (-1));
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 1);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 10);
        jobRegistry0.setCurrentShardingTotalCount("", 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) '#');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", 10);
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '4');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (short) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("", 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 10);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) 'a');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) 'a');
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) 10);
        jobRegistry0.setCurrentShardingTotalCount("test_job", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (short) -1);
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 10);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (byte) -1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) ' ');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        jobRegistry0.setCurrentShardingTotalCount("", 10);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (-1));
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", (int) '4');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) '#');
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("hi!", 100);
        jobRegistry0.setCurrentShardingTotalCount("test_job", (int) (short) 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '#');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("hi!", (int) (byte) 1);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1@-@0", 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (short) 0);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) ' ');
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        jobRegistry0.setCurrentShardingTotalCount("", 0);
        jobRegistry0.setCurrentShardingTotalCount("", 1);
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", 100);
        jobRegistry0.setCurrentShardingTotalCount("127.0.0.1", (int) (byte) 0);
        jobRegistry0.setCurrentShardingTotalCount("", (int) '4');
        jobRegistry0.setCurrentShardingTotalCount("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jobRegistry0);
    }
}

