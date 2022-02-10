package org.apache.hadoop.yarn.server.timelineservice.reader;

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
        org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics timelineReaderMetrics0 = org.apache.hadoop.yarn.server.timelineservice.metrics.TimelineReaderMetrics.getInstance();
        org.junit.Assert.assertNotNull(timelineReaderMetrics0);
    }
}

