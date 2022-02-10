package org.apache.hadoop.mapreduce.v2.app;

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
        org.apache.hadoop.util.ExitUtil.ExitException exitException0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.util.ExitUtil.terminate(exitException0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test2");
        boolean boolean0 = org.apache.hadoop.util.ExitUtil.terminateCalled();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test3");
        org.apache.hadoop.util.ExitUtil.ExitException exitException0 = org.apache.hadoop.util.ExitUtil.getFirstExitException();
        org.junit.Assert.assertNull(exitException0);
    }
}

