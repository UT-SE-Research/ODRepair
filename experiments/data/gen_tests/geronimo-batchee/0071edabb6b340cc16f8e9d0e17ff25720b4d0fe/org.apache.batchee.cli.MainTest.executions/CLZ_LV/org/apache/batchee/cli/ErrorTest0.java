package org.apache.batchee.cli;

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
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager.setServicesManagerLocator((org.apache.batchee.container.services.ServicesManagerLocator) singletonLocator0);
        org.apache.batchee.container.services.ServicesManager servicesManager2 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager3 = singletonLocator0.find();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        servicesManager3.close();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.batchee.container.services.ServicesManager servicesManager0 = org.apache.batchee.container.services.ServicesManager.find();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        servicesManager0.close();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.batchee.container.services.locator.SingletonLocator singletonLocator0 = new org.apache.batchee.container.services.locator.SingletonLocator();
        org.apache.batchee.container.services.ServicesManager servicesManager1 = singletonLocator0.find();
        org.apache.batchee.container.services.ServicesManager servicesManager2 = singletonLocator0.find();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        servicesManager2.close();
    }
}

