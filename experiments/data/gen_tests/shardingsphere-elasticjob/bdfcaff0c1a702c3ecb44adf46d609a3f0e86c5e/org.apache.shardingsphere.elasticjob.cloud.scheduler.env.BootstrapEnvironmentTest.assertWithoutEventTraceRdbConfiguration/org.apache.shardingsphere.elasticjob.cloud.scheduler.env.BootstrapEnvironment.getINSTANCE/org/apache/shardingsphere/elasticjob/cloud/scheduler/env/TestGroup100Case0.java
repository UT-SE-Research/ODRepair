package org.apache.shardingsphere.elasticjob.cloud.scheduler.env;

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
        org.apache.shardingsphere.elasticjob.cloud.scheduler.env.BootstrapEnvironment bootstrapEnvironment0 = org.apache.shardingsphere.elasticjob.cloud.scheduler.env.BootstrapEnvironment.getINSTANCE();
        org.junit.Assert.assertNotNull(bootstrapEnvironment0);
    }
}

