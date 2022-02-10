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
        org.junit.Assert.assertNotNull(jobRegistry0);
    }
}

