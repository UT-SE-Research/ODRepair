package org.apache.hadoop.mapred;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.hadoop.mapred.TestTaskProgressReporter testTaskProgressReporter0 = new org.apache.hadoop.mapred.TestTaskProgressReporter();
        // during test generation this statement threw an exception of type org.opentest4j.AssertionFailedError in error
        testTaskProgressReporter0.testTaskProgress();
    }
}

