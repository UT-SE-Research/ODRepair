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
        org.apache.hadoop.util.ExitUtil.resetFirstExitException();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test2");
        org.apache.hadoop.util.ExitUtil.ExitException exitException0 = org.apache.hadoop.util.ExitUtil.getFirstExitException();
        org.junit.Assert.assertNull(exitException0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test3");
        boolean boolean0 = org.apache.hadoop.util.ExitUtil.terminateCalled();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }
}

