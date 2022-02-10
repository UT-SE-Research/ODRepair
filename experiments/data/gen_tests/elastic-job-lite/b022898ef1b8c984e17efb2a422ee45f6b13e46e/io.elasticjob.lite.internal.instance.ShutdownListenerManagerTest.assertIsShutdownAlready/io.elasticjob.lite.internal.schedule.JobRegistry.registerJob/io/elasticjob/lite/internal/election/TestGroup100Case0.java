package io.elasticjob.lite.internal.election;

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
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        io.elasticjob.lite.internal.schedule.JobScheduleController jobScheduleController2 = null;
        io.elasticjob.lite.reg.base.CoordinatorRegistryCenter coordinatorRegistryCenter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobRegistry0.registerJob("hi!", jobScheduleController2, coordinatorRegistryCenter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test2");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        io.elasticjob.lite.internal.schedule.JobScheduleController jobScheduleController2 = null;
        io.elasticjob.lite.reg.base.CoordinatorRegistryCenter coordinatorRegistryCenter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobRegistry0.registerJob("127.0.0.1", jobScheduleController2, coordinatorRegistryCenter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test3");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        io.elasticjob.lite.internal.schedule.JobScheduleController jobScheduleController2 = null;
        io.elasticjob.lite.reg.base.CoordinatorRegistryCenter coordinatorRegistryCenter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobRegistry0.registerJob("test_job", jobScheduleController2, coordinatorRegistryCenter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test4");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        io.elasticjob.lite.internal.schedule.JobScheduleController jobScheduleController2 = null;
        io.elasticjob.lite.reg.base.CoordinatorRegistryCenter coordinatorRegistryCenter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobRegistry0.registerJob("", jobScheduleController2, coordinatorRegistryCenter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jobRegistry0);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test5");
        io.elasticjob.lite.internal.schedule.JobRegistry jobRegistry0 = io.elasticjob.lite.internal.schedule.JobRegistry.getInstance();
        io.elasticjob.lite.internal.schedule.JobScheduleController jobScheduleController2 = null;
        io.elasticjob.lite.reg.base.CoordinatorRegistryCenter coordinatorRegistryCenter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jobRegistry0.registerJob("127.0.0.1@-@0", jobScheduleController2, coordinatorRegistryCenter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jobRegistry0);
    }
}

