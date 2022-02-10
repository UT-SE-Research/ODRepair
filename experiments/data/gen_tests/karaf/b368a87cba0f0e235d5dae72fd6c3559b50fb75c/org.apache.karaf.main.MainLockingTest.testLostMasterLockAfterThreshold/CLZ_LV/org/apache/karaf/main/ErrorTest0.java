package org.apache.karaf.main;

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
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        java.lang.String[] strArray3 = main2.getArgs();
        org.apache.karaf.main.ConfigProperties configProperties4 = main2.getConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        main2.setStartLevel((int) (byte) 100);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        java.lang.String[] strArray1 = new java.lang.String[] { "and startlevel:" };
        org.apache.karaf.main.Main main2 = new org.apache.karaf.main.Main(strArray1);
        org.apache.karaf.main.Main main3 = new org.apache.karaf.main.Main(strArray1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        main3.setStartLevel((int) (short) 10);
    }
}

