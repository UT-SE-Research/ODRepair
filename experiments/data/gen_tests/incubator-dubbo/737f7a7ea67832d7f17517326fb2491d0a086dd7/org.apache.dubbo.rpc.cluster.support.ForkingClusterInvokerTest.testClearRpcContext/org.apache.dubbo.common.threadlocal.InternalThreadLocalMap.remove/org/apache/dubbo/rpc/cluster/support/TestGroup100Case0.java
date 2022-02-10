package org.apache.dubbo.rpc.cluster.support;

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
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.remove();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test2");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.get();
        org.junit.Assert.assertNotNull(internalThreadLocalMap0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test3");
        org.apache.dubbo.common.threadlocal.InternalThreadLocalMap internalThreadLocalMap0 = org.apache.dubbo.common.threadlocal.InternalThreadLocalMap.getIfSet();
        org.junit.Assert.assertNotNull(internalThreadLocalMap0);
    }
}

