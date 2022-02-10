package com.vmware.admiral.request.kubernetes;

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
        java.util.List<com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState> deploymentStateList0 = com.vmware.admiral.service.kubernetes.test.MockKubernetesApplicationAdapterService.getCreatedDeploymentStates();
        org.junit.Assert.assertNotNull(deploymentStateList0);
    }
}

