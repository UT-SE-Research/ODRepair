package com.vmware.admiral.request.kubernetes;

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
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long1 = compositeDescriptionService0.getMaintenanceIntervalMicros();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long1 = compositeDescriptionService0.getCacheClearDelayMicros();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.setSelfLink("WordPress_with_MySQL_kubernetes.yaml");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription3 = compositeDescriptionService0.getStateDescription();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState> deploymentStateClass1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.getStateTypeFromSelfLink("maintenanceCount");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription kubernetesDescription0 = new com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription kubernetesDescription2 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.mapApplicationAffix(kubernetesDescription0, "ReplicaSet");
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService kubernetesDescriptionService0 = new com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.vmware.xenon.common.ServiceDocument serviceDocument1 = kubernetesDescriptionService0.getDocumentTemplate();
    }
}

