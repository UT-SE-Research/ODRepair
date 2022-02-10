package com.alibaba.csp.sentinel;

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
        com.alibaba.csp.sentinel.context.Context context2 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.context.Context context4 = com.alibaba.csp.sentinel.context.ContextUtil.enter("hi!");
        com.alibaba.csp.sentinel.node.Node node5 = context4.getLastNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.alibaba.csp.sentinel.context.Context context6 = context2.setCurNode(node5);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.alibaba.csp.sentinel.context.Context context1 = com.alibaba.csp.sentinel.context.ContextUtil.enter("test-context-");
        com.alibaba.csp.sentinel.context.Context context4 = com.alibaba.csp.sentinel.context.ContextUtil.enter("SentinelBlockException", "Context{name='', entranceNode=null, curEntry=null, origin='', async=false}");
        com.alibaba.csp.sentinel.node.DefaultNode defaultNode5 = context4.getEntranceNode();
        com.alibaba.csp.sentinel.context.Context context7 = new com.alibaba.csp.sentinel.context.Context(defaultNode5, "test-context-");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.alibaba.csp.sentinel.context.Context context8 = context1.setCurNode((com.alibaba.csp.sentinel.node.Node) defaultNode5);
    }
}

