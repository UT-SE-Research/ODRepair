package com.vmware.admiral.request.kubernetes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup100Case0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test001");
        java.lang.String str0 = com.vmware.xenon.common.Operation.STREAM_WEIGHT_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "x-http2-stream-weight" + "'", str0, "x-http2-stream-weight");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = com.vmware.xenon.common.ServiceDocument.FIELD_NAME_TRANSACTION_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "documentTransactionId" + "'", str0, "documentTransactionId");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.vmware.xenon.common.Operation operation0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation.failServiceNotFound(operation0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.util.List<com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent> compositeComponentList0 = com.vmware.admiral.service.kubernetes.test.MockKubernetesApplicationAdapterService.getProvisionedComponents();
        org.junit.Assert.assertNotNull(compositeComponentList0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str0 = com.vmware.xenon.common.Operation.ACCEPT_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "accept" + "'", str0, "accept");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String str0 = com.vmware.xenon.common.Operation.TRANSACTION_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "x-xenon-tx-phase" + "'", str0, "x-xenon-tx-phase");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_SYNCH_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-synch-ver" + "'", str0, "xn-synch-ver");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.vmware.xenon.common.Service service0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createPatch(service0, "Failed getting composite component.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_SYNCH_TASK_RETRY_COUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "synchTaskRetryCount" + "'", str0, "synchTaskRetryCount");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.vmware.admiral.compute.kubernetes.entities.pods.PodTemplateSpec podTemplateSpec0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.admiral.compute.kubernetes.entities.pods.PodTemplateSpec podTemplateSpec1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.createMetaOrLabelsIfNull(podTemplateSpec0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.vmware.xenon.common.Operation operation0 = null;
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation.fail(operation0, 1, 1, throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = com.vmware.photon.controller.model.resources.ResourceState.FIELD_NAME_DESC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "desc" + "'", str0, "desc");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.vmware.xenon.common.Operation.OperationOption operationOption0 = com.vmware.xenon.common.Operation.OperationOption.RATE_LIMITED;
        org.junit.Assert.assertTrue("'" + operationOption0 + "' != '" + com.vmware.xenon.common.Operation.OperationOption.RATE_LIMITED + "'", operationOption0.equals(com.vmware.xenon.common.Operation.OperationOption.RATE_LIMITED));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.FIELD_NAME_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.String str0 = com.vmware.xenon.common.Operation.MEDIA_TYPE_TEXT_CSS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text/css" + "'", str0, "text/css");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String str0 = com.vmware.xenon.common.Operation.AUTHORIZATION_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "authorization" + "'", str0, "authorization");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_VERSION_CONFLICT_COUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "stateVersionConflictCount" + "'", str0, "stateVersionConflictCount");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_MAINTENANCE_COUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "maintenanceCount" + "'", str0, "maintenanceCount");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.vmware.admiral.compute.content.kubernetes.KubernetesUtil kubernetesUtil0 = new com.vmware.admiral.compute.content.kubernetes.KubernetesUtil();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = null;
        com.vmware.admiral.service.kubernetes.test.MockKubernetesApplicationAdapterService.addDeploymentState(deploymentState0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        int int0 = com.vmware.xenon.common.Service.SYNCH_QUEUE_DEFAULT_LIMIT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.vmware.xenon.common.Service service0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createDelete(service0, "Couldn't retrieve document links of type: %s");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.vmware.admiral.compute.kubernetes.entities.config.KubeConfig kubeConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.extractTokenFromKubeConfig(kubeConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.Status status0 = com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.Status.RETIRED;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.Status.RETIRED + "'", status0.equals(com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.Status.RETIRED));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_CREATED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-created" + "'", str0, "xn-created");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject0 = null;
        java.lang.String str1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.serializeKubernetesEntity(baseKubernetesObject0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "--- null" + "'", str1, "--- null");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String str0 = com.vmware.xenon.common.Operation.TRANSACTION_REFLINK_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "x-xenon-tx-reflink" + "'", str0, "x-xenon-tx-reflink");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.String str0 = com.vmware.xenon.common.Operation.MEDIA_TYPE_APPLICATION_FONT_WOFF2;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/font-woff2" + "'", str0, "application/font-woff2");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String str0 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.REPLICA_SET_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ReplicaSet" + "'", str0, "ReplicaSet");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.vmware.xenon.common.Service service0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createGet(service0, "__containerHostType");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.vmware.xenon.services.common.AuthCredentialsService.AuthCredentialsServiceState authCredentialsServiceState1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.admiral.compute.kubernetes.entities.config.KubeConfig kubeConfig2 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.constructKubeConfig("FAILURE_EXPECTED", authCredentialsServiceState1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String str0 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.REPLICATION_CONTROLLER_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ReplicationController" + "'", str0, "ReplicationController");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.vmware.xenon.common.Service service0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createDelete(service0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        int int0 = com.vmware.xenon.common.Operation.STATUS_CODE_FAILURE_THRESHOLD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 400 + "'", int0 == 400);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        boolean boolean1 = com.vmware.xenon.common.ServiceDocument.isAutoMergeEnabledByDefaultForField("action not supported");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.String str0 = com.vmware.xenon.common.Operation.CONTENT_ENCODING_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "content-encoding" + "'", str0, "content-encoding");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.String str0 = com.vmware.xenon.common.ServiceDocument.FIELD_NAME_UPDATE_TIME_MICROS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "documentUpdateTimeMicros" + "'", str0, "documentUpdateTimeMicros");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str0 = com.vmware.xenon.common.Operation.REQUEST_ID_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "x-request-id" + "'", str0, "x-request-id");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.vmware.xenon.common.Service service0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createDelete(service0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.vmware.xenon.common.ServiceHost serviceHost0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createPatch(serviceHost0, "%s");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet4 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) compositeComponent0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription2, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: description is required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.parseBytes("documentTransactionId");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Invalid number: documentTransactionId");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_QUEUE_FOR_SERVICE_AVAILABILITY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-queue" + "'", str0, "xn-queue");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        boolean boolean1 = com.vmware.xenon.common.ServiceDocument.isBuiltInDocumentFieldWithNullExampleValue("Expected failure request from custom props for resource:  %s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.lang.String str0 = com.vmware.xenon.common.ServiceDocument.FIELD_NAME_SUFFIX_LINKS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Links" + "'", str0, "Links");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        int int0 = com.vmware.xenon.common.Operation.STATUS_CODE_FORBIDDEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 403 + "'", int0 == 403);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation.failServiceNotFound(operation3, 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.lang.String str0 = com.vmware.xenon.common.Operation.MEDIA_TYPE_APPLICATION_X_WWW_FORM_ENCODED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/x-www-form-urlencoded" + "'", str0, "application/x-www-form-urlencoded");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.lang.String str0 = com.vmware.xenon.common.ServiceDocument.FIELD_NAME_OWNER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "documentOwner" + "'", str0, "documentOwner");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.String str0 = com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.DISCOVERED_DESCRIPTION_LINK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/resources/kubernetes-descriptions/discovered" + "'", str0, "/resources/kubernetes-descriptions/discovered");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        double double0 = com.vmware.xenon.common.Service.STAT_VALUE_FALSE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.String str0 = com.vmware.xenon.common.Operation.STREAM_ID_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "x-http2-stream-id" + "'", str0, "x-http2-stream-id");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.parseBytes("%s");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Invalid number: %s");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_CREATE_COUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "createCount" + "'", str0, "createCount");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.String str0 = com.vmware.admiral.compute.container.CompositeDescriptionService.URI_PARAM_IMAGE_LINKS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "descriptionImages" + "'", str0, "descriptionImages");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.vmware.photon.controller.model.resources.ComputeService.ComputeState computeState0 = null;
        boolean boolean1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.isPKSManagedHost(computeState0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_REPLICATED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-rpl" + "'", str0, "xn-rpl");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.vmware.admiral.compute.content.kubernetes.KubernetesTemplate kubernetesTemplate0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.serializeKubernetesTemplate(kubernetesTemplate0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.String str0 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.ENDPOINTS_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Endpoints" + "'", str0, "Endpoints");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_MAINTENANCE_DURATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "maintenanceDuration" + "'", str0, "maintenanceDuration");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        int int0 = com.vmware.xenon.common.Operation.STATUS_CODE_UNAUTHORIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 401 + "'", int0 == 401);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.String str0 = com.vmware.xenon.common.Operation.CR_LF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\r\n" + "'", str0, "\r\n");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        int int0 = com.vmware.xenon.common.Operation.STATUS_CODE_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 408 + "'", int0 == 408);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_MAINTENANCE_COMPLETION_DELAYED_COUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "maintenanceCompletionDelayedCount" + "'", str0, "maintenanceCompletionDelayedCount");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.String str0 = com.vmware.xenon.common.ServiceDocument.FIELD_NAME_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "documentVersion" + "'", str0, "documentVersion");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_VERIFY_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-verify-token" + "'", str0, "xn-verify-token");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.String str0 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.KUBERNETES_API_VERSION_V1;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "v1" + "'", str0, "v1");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.service.kubernetes.test.MockKubernetesApplicationAdapterService.addDeploymentState(deploymentState0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.lang.String str0 = com.vmware.xenon.common.Operation.RETRY_AFTER_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "retry-after" + "'", str0, "retry-after");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.lang.String str0 = com.vmware.admiral.service.test.BaseMockAdapterService.FAILURE_EXPECTED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FAILURE_EXPECTED" + "'", str0, "FAILURE_EXPECTED");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.lang.String str0 = com.vmware.xenon.common.Operation.USER_AGENT_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "user-agent" + "'", str0, "user-agent");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.vmware.xenon.common.ServiceHost serviceHost0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createPost(serviceHost0, "Deployment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_AUTHN_INVALIDATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-authn-invalidate" + "'", str0, "xn-authn-invalidate");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str1 = compositeComponent0.compositeDescriptionLink;
        java.lang.String str2 = compositeComponent0.name;
        java.lang.String str3 = compositeComponent0.documentAuthPrincipalLink;
        java.util.List<java.lang.String> strList4 = compositeComponent0.componentLinks;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_SERVICE_HANDLER_LATENCY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "operationHandlerProcessingLatencyMicros" + "'", str0, "operationHandlerProcessingLatencyMicros");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.lang.String str0 = com.vmware.xenon.common.Operation.REPLICATION_PHASE_COMMIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "commit" + "'", str0, "commit");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.vmware.xenon.common.Operation.SerializedOperation serializedOperation0 = null;
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.create(serializedOperation0, serviceHost1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.vmware.xenon.common.Operation.OperationOption operationOption0 = com.vmware.xenon.common.Operation.OperationOption.REPLICATED_TARGET;
        org.junit.Assert.assertTrue("'" + operationOption0 + "' != '" + com.vmware.xenon.common.Operation.OperationOption.REPLICATED_TARGET + "'", operationOption0.equals(com.vmware.xenon.common.Operation.OperationOption.REPLICATED_TARGET));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.setSelfLink("WordPress_with_MySQL_kubernetes.yaml");
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.ServiceDocument serviceDocument5 = compositeDescriptionService0.setInitialState((java.lang.Object) "documentVersion", (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException; message: java.lang.IllegalStateException: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $");
        } catch (com.google.gson.JsonSyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.lang.String str0 = com.vmware.photon.controller.model.resources.ResourceState.FIELD_NAME_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.lang.String str0 = com.vmware.xenon.common.Operation.MEDIA_TYPE_TEXT_EVENT_STREAM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text/event-stream" + "'", str0, "text/event-stream");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent0.name = "name";
        compositeComponent0.documentUpdateTimeMicros = (byte) 1;
        java.lang.String str5 = compositeComponent0.documentOwner;
        java.util.List<java.lang.String> strList6 = compositeComponent0.tenantLinks;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.String str0 = com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent.CUSTOM_PROPERTY_HOST_LINK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "__hostLink" + "'", str0, "__hostLink");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        boolean boolean6 = operation5.hasResponseHeaders();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation.fail(operation3, (int) ' ', (int) (short) -1, throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.vmware.xenon.common.ServiceHost serviceHost0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createDelete(serviceHost0, "Failed request for resource:  %s");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.lang.String str0 = com.vmware.xenon.common.Operation.CONTEXT_ID_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "x-xenon-ctx-id" + "'", str0, "x-xenon-ctx-id");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_SKIPPED_NOTIFICATIONS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-nt-skipped" + "'", str0, "xn-nt-skipped");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.vmware.xenon.common.Operation.OperationOption operationOption0 = com.vmware.xenon.common.Operation.OperationOption.CONNECTION_SHARING;
        org.junit.Assert.assertTrue("'" + operationOption0 + "' != '" + com.vmware.xenon.common.Operation.OperationOption.CONNECTION_SHARING + "'", operationOption0.equals(com.vmware.xenon.common.Operation.OperationOption.CONNECTION_SHARING));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_DOCUMENT_OWNER_TOGGLE_ON_MAINT_COUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "maintenanceDocumentOwnerToggleOnCount" + "'", str0, "maintenanceDocumentOwnerToggleOnCount");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.vmware.xenon.common.ServiceHost serviceHost0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createPost(serviceHost0, "application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str1 = compositeComponent0.compositeDescriptionLink;
        java.lang.String str2 = compositeComponent0.name;
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent3 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent4 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str5 = compositeComponent4.compositeDescriptionLink;
        compositeComponent3.copyTo((com.vmware.xenon.common.ServiceDocument) compositeComponent4);
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet9 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) compositeComponent0, (com.vmware.xenon.common.ServiceDocument) compositeComponent4, serviceDocumentDescription7, (long) 401);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: description is required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.deserializeKubernetesEntity("Request accepted for resource: %s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Error processing Kubernetes configuration YAML content: while scanning for the next token?found character '%' that cannot start any token. (Do not use % for indentation)? in 'reader', line 1, column 32:?    Request accepted for resource: %s?                                   ^?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.lang.String str0 = com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent.FIELD_NAME_COMPOSITE_DESCRIPTION_LINK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "compositeDescriptionLink" + "'", str0, "compositeDescriptionLink");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.lang.String str0 = com.vmware.photon.controller.model.resources.ResourceState.FIELD_NAME_GROUP_LINKS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "groupLinks" + "'", str0, "groupLinks");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.lang.String str0 = com.vmware.xenon.common.Operation.MEDIA_TYPE_APPLICATION_JAVASCRIPT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/javascript" + "'", str0, "application/javascript");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.setSelfLink("WordPress_with_MySQL_kubernetes.yaml");
        com.vmware.xenon.common.ServiceStats.ServiceStat serviceStat3 = null;
        compositeDescriptionService0.setStat(serviceStat3, (double) 408);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.lang.String str0 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.NAMESPACE_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Namespace" + "'", str0, "Namespace");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.String str0 = com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.DISCOVERED_INSTANCE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "discovered" + "'", str0, "discovered");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.lang.String str0 = com.vmware.xenon.common.Operation.ACCEPT_LANGUAGE_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "accept-language" + "'", str0, "accept-language");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription0 = null;
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str2 = compositeComponent1.compositeDescriptionLink;
        java.lang.String str3 = compositeComponent1.name;
        java.lang.String str4 = compositeComponent1.documentAuthPrincipalLink;
        long long5 = compositeComponent1.documentUpdateTimeMicros;
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent6 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent6.name = "name";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.vmware.xenon.common.ServiceDocument.equals(serviceDocumentDescription0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, (com.vmware.xenon.common.ServiceDocument) compositeComponent6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: description is required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str1 = compositeComponent0.compositeDescriptionLink;
        java.lang.String str2 = compositeComponent0.name;
        java.lang.String str3 = compositeComponent0.documentAuthPrincipalLink;
        long long4 = compositeComponent0.documentUpdateTimeMicros;
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription5 = compositeComponent0.documentDescription;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(serviceDocumentDescription5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.String str0 = com.vmware.xenon.common.ServiceDocument.FIELD_NAME_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "documentDescription" + "'", str0, "documentDescription");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        boolean boolean1 = com.vmware.xenon.common.ServiceDocument.isLink("xn-nt-skipped");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_FROM_MIGRATION_TASK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-from-migration" + "'", str0, "xn-from-migration");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation.failServiceNotFound(operation1, (int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        int int0 = com.vmware.xenon.common.Operation.STATUS_CODE_INTERNAL_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 500 + "'", int0 == 500);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        int int0 = com.vmware.xenon.common.Operation.STATUS_CODE_MOVED_PERM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 301 + "'", int0 == 301);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_SYNCH_OWNER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-synch-owner" + "'", str0, "xn-synch-owner");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent0.name = "name";
        compositeComponent0.documentUpdateTimeMicros = (byte) 1;
        compositeComponent0.name = "v1";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription7 = compositeComponent0.documentDescription;
        org.junit.Assert.assertNull(serviceDocumentDescription7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.vmware.xenon.common.Operation.SerializedOperation serializedOperation0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.vmware.xenon.common.Operation.SerializedOperation.isValid(serializedOperation0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.lang.String str0 = com.vmware.xenon.common.Operation.TX_ABORT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "abort" + "'", str0, "abort");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.getRetriesRemaining();
        java.lang.String str5 = operation1.getContextId();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        boolean boolean1 = com.vmware.xenon.common.ServiceDocument.isBuiltInNonIndexedDocumentField("maintenanceCount");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.vmware.xenon.common.Operation.OperationOption operationOption0 = com.vmware.xenon.common.Operation.OperationOption.REPLICATION_DISABLED;
        org.junit.Assert.assertTrue("'" + operationOption0 + "' != '" + com.vmware.xenon.common.Operation.OperationOption.REPLICATION_DISABLED + "'", operationOption0.equals(com.vmware.xenon.common.Operation.OperationOption.REPLICATION_DISABLED));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.String str0 = com.vmware.xenon.common.Operation.ACCEPT_ENCODING_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "accept-encoding" + "'", str0, "accept-encoding");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        java.net.URI uRI1 = null;
        com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createGet(uRI1);
        operation2.complete();
        com.vmware.xenon.common.Operation operation4 = operation2.forceRemote();
        int int5 = operation2.decrementRetriesRemaining();
        operation2.startEventStream();
        java.lang.String str8 = operation2.getResponseHeaderAsIs("ReplicaSet");
        com.vmware.xenon.common.ServiceDocument serviceDocument9 = compositeDescriptionService0.getState(operation2);
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation11 = com.vmware.xenon.common.Operation.createPost((com.vmware.xenon.common.Service) compositeDescriptionService0, "x-request-id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation2);
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(serviceDocument9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str1 = compositeComponent0.compositeDescriptionLink;
        java.lang.String str2 = compositeComponent0.name;
        long long3 = compositeComponent0.documentUpdateTimeMicros;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.net.URI uRI3 = null;
        com.vmware.xenon.common.Operation operation4 = com.vmware.xenon.common.Operation.createGet(uRI3);
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler5 = null;
        com.vmware.xenon.common.Operation operation6 = operation4.nestCompletion(completionHandler5);
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.DeferredResult<com.vmware.xenon.common.Operation> operationDeferredResult7 = compositeDescriptionService0.sendWithDeferredResult(operation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertNotNull(operation6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription kubernetesDescription0 = new com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription();
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject1 = null;
        kubernetesDescription0.merge(baseKubernetesObject1);
        kubernetesDescription0.creationTimeMicros = 100L;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription kubernetesDescription6 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.setApplicationLabel(kubernetesDescription0, "application/javascript");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.String str0 = com.vmware.xenon.common.Operation.REQUEST_AUTH_TOKEN_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "x-xenon-auth-token" + "'", str0, "x-xenon-auth-token");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.String str0 = com.vmware.admiral.service.common.MultiTenantDocument.TENANTS_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/tenants" + "'", str0, "/tenants");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.lang.String str0 = com.vmware.xenon.common.Operation.HTTP2_SCHEME_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "x-http2-scheme" + "'", str0, "x-http2-scheme");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.decrementRetriesRemaining();
        boolean boolean5 = operation1.isConnectionSharing();
        com.vmware.xenon.common.Operation operation7 = operation1.addPragmaDirective("\r\n");
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(operation7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_STATE_NOT_MODIFIED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-state-not-modified" + "'", str0, "xn-state-not-modified");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        int int0 = com.vmware.xenon.common.Operation.STATUS_CODE_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 404 + "'", int0 == 404);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_REQUEST_OUT_OF_ORDER_COUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "requestOutOfOrderCount" + "'", str0, "requestOutOfOrderCount");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_AUTHENTICATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-authn" + "'", str0, "xn-authn");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent1.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription4 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet6 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription4, (long) (byte) -1);
        deploymentState0.kubernetesSelfLink = "########  Start of request ########";
        long long9 = deploymentState0.documentExpirationTimeMicros;
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState10 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent11 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent11.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription14 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet16 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState10, (com.vmware.xenon.common.ServiceDocument) compositeComponent11, serviceDocumentDescription14, (long) (byte) -1);
        deploymentState0.copyTo((com.vmware.photon.controller.model.resources.ResourceState) deploymentState10);
        deploymentState0.compositeComponentLink = "x-http2-stream-id";
        // The following exception was thrown during execution in test generation
        try {
            deploymentState0.setKubernetesEntityFromJson("location");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException; message: java.lang.IllegalStateException: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $");
        } catch (com.google.gson.JsonSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentRelationshipSet6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(documentRelationshipSet16);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_FORWARDED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-fwd" + "'", str0, "xn-fwd");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.lang.String str0 = com.vmware.admiral.compute.kubernetes.service.BaseKubernetesState.FIELD_NAME_PARENT_LINK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "parentLink" + "'", str0, "parentLink");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        java.security.Principal principal4 = null;
        java.net.URI uRI5 = null;
        com.vmware.xenon.common.Operation operation6 = com.vmware.xenon.common.Operation.createGet(uRI5);
        java.lang.String str7 = operation6.getConnectionTag();
        java.security.Principal principal8 = null;
        javax.security.cert.X509Certificate x509Certificate9 = null;
        javax.security.cert.X509Certificate[] x509CertificateArray10 = new javax.security.cert.X509Certificate[] { x509Certificate9 };
        operation6.setPeerCertificates(principal8, x509CertificateArray10);
        operation3.setPeerCertificates(principal4, x509CertificateArray10);
        java.net.URI uRI13 = null;
        com.vmware.xenon.common.Operation operation14 = com.vmware.xenon.common.Operation.createGet(uRI13);
        operation14.complete();
        com.vmware.xenon.common.Operation operation16 = operation14.forceRemote();
        int int17 = operation14.getRetriesRemaining();
        com.vmware.xenon.common.Operation operation19 = operation14.setReplicationDisabled(true);
        com.vmware.xenon.common.Service.Action action20 = null;
        com.vmware.xenon.common.Operation operation21 = operation19.setAction(action20);
        java.lang.Throwable throwable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation.failForwardedRequest(operation3, operation21, throwable22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(x509CertificateArray10);
        org.junit.Assert.assertNotNull(operation14);
        org.junit.Assert.assertNotNull(operation16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(operation19);
        org.junit.Assert.assertNotNull(operation21);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.vmware.xenon.common.ServiceHost serviceHost0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createOptions(serviceHost0, "requestOutOfOrderCount");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        int int0 = com.vmware.xenon.common.Operation.STATUS_CODE_MOVED_TEMP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 302 + "'", int0 == 302);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.String str0 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.DEPLOYMENT_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Deployment" + "'", str0, "Deployment");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent1.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription4 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet6 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription4, (long) (byte) -1);
        deploymentState0.kubernetesSelfLink = "########  Start of request ########";
        long long9 = deploymentState0.documentExpirationTimeMicros;
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject10 = deploymentState0.getEntityAsBaseKubernetesObject();
        org.junit.Assert.assertNotNull(documentRelationshipSet6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(baseKubernetesObject10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        boolean boolean1 = com.vmware.xenon.common.ServiceDocument.isBuiltInDocumentFieldWithNullExampleValue("xn-synch-owner");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.vmware.xenon.common.Operation.OperationOption operationOption0 = com.vmware.xenon.common.Operation.OperationOption.KEEP_ALIVE;
        org.junit.Assert.assertTrue("'" + operationOption0 + "' != '" + com.vmware.xenon.common.Operation.OperationOption.KEEP_ALIVE + "'", operationOption0.equals(com.vmware.xenon.common.Operation.OperationOption.KEEP_ALIVE));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler9 = null;
        com.vmware.xenon.common.Operation operation10 = operation5.nestCompletionCloneSafe(completionHandler9);
        com.vmware.xenon.common.Operation operation12 = operation5.setConnectionTag("Request accepted for resource: %s");
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
        org.junit.Assert.assertNotNull(operation12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent1.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription4 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet6 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription4, (long) (byte) -1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        deploymentState0.customProperties = strMap7;
        org.junit.Assert.assertNotNull(documentRelationshipSet6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription kubernetesDescription0 = new com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription();
        kubernetesDescription0.name = "application/x-www-form-urlencoded";
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder0 = com.vmware.xenon.common.Operation.AuthorizationContext.Builder.create();
        com.vmware.xenon.common.Claims claims1 = null;
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder2 = builder0.setClaims(claims1);
        java.util.Map<com.vmware.xenon.common.Service.Action, com.vmware.xenon.services.common.QueryTask.Query> actionMap3 = null;
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder4 = builder0.setResourceQueryMap(actionMap3);
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder6 = builder4.setToken("action not supported");
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder8 = builder6.setPropagateToClient(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.String str0 = com.vmware.xenon.common.ServiceDocument.FIELD_NAME_SUFFIX_ADDRESS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Address" + "'", str0, "Address");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.lang.String str0 = com.vmware.xenon.common.Operation.EMPTY_JSON_BODY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "{}" + "'", str0, "{}");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_POST_TO_PUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-post-to-put" + "'", str0, "xn-post-to-put");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.getRetriesRemaining();
        com.vmware.xenon.common.Operation operation6 = operation1.setReplicationDisabled(true);
        com.vmware.xenon.common.Service.Action action7 = null;
        com.vmware.xenon.common.Operation operation8 = operation6.setAction(action7);
        operation6.fail((int) (byte) -1);
        operation6.complete();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.lang.Class<? extends com.vmware.xenon.common.ServiceDocument> wildcardClass3 = compositeDescriptionService0.getStateType();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.decrementRetriesRemaining();
        com.vmware.xenon.common.Operation operation5 = null;
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation.failForwardedRequest(operation1, operation5, throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_PRE_AVAILABLE_OP_COUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "preAvailableReceivedOperationCount" + "'", str0, "preAvailableReceivedOperationCount");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.String str0 = com.vmware.xenon.common.ServiceDocument.FIELD_NAME_UPDATE_ACTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "documentUpdateAction" + "'", str0, "documentUpdateAction");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent1.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription4 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet6 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription4, (long) (byte) -1);
        deploymentState0.kubernetesSelfLink = "########  Start of request ########";
        long long9 = deploymentState0.documentExpirationTimeMicros;
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState10 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent11 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent11.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription14 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet16 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState10, (com.vmware.xenon.common.ServiceDocument) compositeComponent11, serviceDocumentDescription14, (long) (byte) -1);
        deploymentState0.copyTo((com.vmware.photon.controller.model.resources.ResourceState) deploymentState10);
        deploymentState0.compositeComponentLink = "x-http2-stream-id";
        java.lang.String str20 = deploymentState0.compositeComponentLink;
        org.junit.Assert.assertNotNull(documentRelationshipSet6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(documentRelationshipSet16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "x-http2-stream-id" + "'", str20, "x-http2-stream-id");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent1.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription4 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet6 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription4, (long) (byte) -1);
        com.vmware.admiral.compute.kubernetes.entities.deployments.Deployment deployment7 = deploymentState0.deployment;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.admiral.compute.kubernetes.entities.common.ObjectMeta objectMeta8 = deploymentState0.getMetadata();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentRelationshipSet6);
        org.junit.Assert.assertNull(deployment7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.setSelfLink("WordPress_with_MySQL_kubernetes.yaml");
        com.vmware.xenon.common.ServiceHost serviceHost3 = null;
        compositeDescriptionService0.setHost(serviceHost3);
        compositeDescriptionService0.adjustStat("xn-created", (double) 10);
        java.util.function.Supplier<java.lang.String> strSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeDescriptionService0.logSevere(strSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.lang.String str0 = com.vmware.xenon.common.Operation.MEDIA_TYPE_APPLICATION_JSON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/json" + "'", str0, "application/json");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        java.security.Principal principal4 = null;
        java.net.URI uRI5 = null;
        com.vmware.xenon.common.Operation operation6 = com.vmware.xenon.common.Operation.createGet(uRI5);
        java.lang.String str7 = operation6.getConnectionTag();
        java.security.Principal principal8 = null;
        javax.security.cert.X509Certificate x509Certificate9 = null;
        javax.security.cert.X509Certificate[] x509CertificateArray10 = new javax.security.cert.X509Certificate[] { x509Certificate9 };
        operation6.setPeerCertificates(principal8, x509CertificateArray10);
        operation3.setPeerCertificates(principal4, x509CertificateArray10);
        java.net.URI uRI13 = operation3.getReferer();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(x509CertificateArray10);
        org.junit.Assert.assertNull(uRI13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder0 = com.vmware.xenon.common.Operation.AuthorizationContext.Builder.create();
        com.vmware.xenon.common.Claims claims1 = null;
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder2 = builder0.setClaims(claims1);
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder4 = builder0.setToken("application/json");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.lang.String str0 = com.vmware.xenon.common.Operation.REPLICATION_QUORUM_HEADER_VALUE_ALL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "x-xenon-all" + "'", str0, "x-xenon-all");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.getRetriesRemaining();
        com.vmware.xenon.common.Operation operation6 = operation1.setReplicationDisabled(true);
        com.vmware.xenon.common.Service.Action action7 = null;
        com.vmware.xenon.common.Operation operation8 = operation6.setAction(action7);
        boolean boolean9 = operation8.isSynchronize();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescriptionImages compositeDescriptionImages0 = new com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescriptionImages();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = compositeDescriptionImages0.descriptionImages;
        org.junit.Assert.assertNull(strMap1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        java.lang.String str3 = operation1.getConnectionTag();
        java.util.function.Consumer<com.vmware.xenon.common.Operation> operationConsumer4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.nestHeadersReceivedHandler(operationConsumer4);
        java.lang.String str6 = operation1.getTransactionId();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        java.net.URI uRI1 = null;
        com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createGet(uRI1);
        operation2.complete();
        com.vmware.xenon.common.Operation operation4 = operation2.forceRemote();
        int int5 = operation2.decrementRetriesRemaining();
        operation2.startEventStream();
        java.lang.String str8 = operation2.getResponseHeaderAsIs("ReplicaSet");
        com.vmware.xenon.common.ServiceDocument serviceDocument9 = compositeDescriptionService0.getState(operation2);
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation11 = com.vmware.xenon.common.Operation.createOptions((com.vmware.xenon.common.Service) compositeDescriptionService0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation2);
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(serviceDocument9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.lang.String str0 = com.vmware.xenon.common.Operation.REPLICATION_PHASE_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "x-xenon-rpl-phase" + "'", str0, "x-xenon-rpl-phase");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_FAILURE_COUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "failureCount" + "'", str0, "failureCount");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.vmware.xenon.common.Operation.OperationOption operationOption0 = com.vmware.xenon.common.Operation.OperationOption.SOCKET_ACTIVE;
        org.junit.Assert.assertTrue("'" + operationOption0 + "' != '" + com.vmware.xenon.common.Operation.OperationOption.SOCKET_ACTIVE + "'", operationOption0.equals(com.vmware.xenon.common.Operation.OperationOption.SOCKET_ACTIVE));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        boolean boolean1 = com.vmware.xenon.common.ServiceDocument.isLink("xn-state-not-modified");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        long long9 = operation8.getExpirationMicrosUtc();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.vmware.xenon.common.ServiceHost serviceHost0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createOptions(serviceHost0, "abort");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.lang.String str0 = com.vmware.xenon.common.Operation.MEDIA_TYPE_EVERYTHING_WILDCARDS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*/*" + "'", str0, "*/*");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent1.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription4 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet6 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription4, (long) (byte) -1);
        deploymentState0.kubernetesSelfLink = "########  Start of request ########";
        long long9 = deploymentState0.documentExpirationTimeMicros;
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState10 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent11 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent11.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription14 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet16 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState10, (com.vmware.xenon.common.ServiceDocument) compositeComponent11, serviceDocumentDescription14, (long) (byte) -1);
        deploymentState0.copyTo((com.vmware.photon.controller.model.resources.ResourceState) deploymentState10);
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.admiral.compute.kubernetes.entities.common.ObjectMeta objectMeta18 = deploymentState10.getMetadata();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(documentRelationshipSet6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(documentRelationshipSet16);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder0 = com.vmware.xenon.common.Operation.AuthorizationContext.Builder.create();
        com.vmware.xenon.common.Claims claims1 = null;
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder2 = builder0.setClaims(claims1);
        java.util.Map<com.vmware.xenon.common.Service.Action, com.vmware.xenon.services.common.QueryTask.Query> actionMap3 = null;
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder4 = builder0.setResourceQueryMap(actionMap3);
        com.vmware.xenon.common.Claims claims5 = null;
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder6 = builder0.setClaims(claims5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler9 = null;
        com.vmware.xenon.common.Operation operation10 = operation8.nestCompletionCloneSafe(completionHandler9);
        com.vmware.xenon.common.Operation operation12 = operation8.setTransactionId("maintenanceDuration");
        int int13 = operation8.getRetryCount();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
        org.junit.Assert.assertNotNull(operation12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        boolean boolean2 = operation1.hasRequestHeaders();
        com.vmware.xenon.common.Operation.SocketContext socketContext3 = operation1.getSocketContext();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(socketContext3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.vmware.xenon.common.Operation.AuthorizationContext authorizationContext0 = new com.vmware.xenon.common.Operation.AuthorizationContext();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.parseBytes("ResourceLinks null for requestSelfLink:");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Invalid number: ResourceLinks null for requestSelfLink:");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_REQUEST_FAILURE_QUEUE_LIMIT_EXCEEDED_COUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "requestFailureQueueLimitExceededCount" + "'", str0, "requestFailureQueueLimitExceededCount");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.net.URI uRI3 = null;
        com.vmware.xenon.common.Operation operation4 = com.vmware.xenon.common.Operation.createGet(uRI3);
        operation4.complete();
        com.vmware.xenon.common.Operation operation6 = operation4.forceRemote();
        com.vmware.xenon.common.Operation operation8 = operation6.setTransactionId("FAILURE_EXPECTED");
        com.vmware.xenon.common.Operation operation10 = operation8.setRetryCount((int) ' ');
        compositeDescriptionService0.handleDelete(operation8);
        java.util.function.Supplier<java.lang.String> strSupplier12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeDescriptionService0.logSevere(strSupplier12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.vmware.xenon.common.ServiceHost serviceHost0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createDelete(serviceHost0, "WordPress_with_MySQL_kubernetes.yaml");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation operation5 = operation3.setTransactionId("FAILURE_EXPECTED");
        com.vmware.xenon.common.Operation operation7 = operation5.setRetryCount((int) ' ');
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler8 = null;
        com.vmware.xenon.common.Operation operation9 = operation5.nestCompletionCloneSafe(completionHandler8);
        com.vmware.xenon.common.Operation operation11 = operation9.setExpiration((long) 500);
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation7);
        org.junit.Assert.assertNotNull(operation9);
        org.junit.Assert.assertNotNull(operation11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.getRetriesRemaining();
        com.vmware.xenon.common.Operation operation6 = operation1.setReplicationDisabled(true);
        int int7 = operation6.getRetriesRemaining();
        com.vmware.xenon.common.Operation operation10 = operation6.addResponseCookie("maintenanceDuration", "ReplicationController");
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(operation10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.lang.String str0 = com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.FIELD_NAME_PARENT_DESCRIPTION_LINK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "parentDescriptionLink" + "'", str0, "parentDescriptionLink");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.lang.String str0 = com.vmware.xenon.common.Operation.MEDIA_TYPE_APPLICATION_OCTET_STREAM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/octet-stream" + "'", str0, "application/octet-stream");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_AVAILABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "isAvailable" + "'", str0, "isAvailable");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder0 = com.vmware.xenon.common.Operation.AuthorizationContext.Builder.create();
        com.vmware.xenon.common.Claims claims1 = null;
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder2 = builder0.setClaims(claims1);
        com.vmware.xenon.common.Operation.AuthorizationContext authorizationContext3 = builder0.getResult();
        boolean boolean4 = authorizationContext3.isGuestUser();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(authorizationContext3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.lang.String str0 = com.vmware.xenon.common.Operation.REFERER_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "referer" + "'", str0, "referer");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_SYNCH_PEER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-synch-peer" + "'", str0, "xn-synch-peer");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        java.net.URI uRI1 = null;
        com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createGet(uRI1);
        operation2.complete();
        com.vmware.xenon.common.Operation operation4 = operation2.forceRemote();
        int int5 = operation2.decrementRetriesRemaining();
        operation2.startEventStream();
        java.lang.String str8 = operation2.getResponseHeaderAsIs("ReplicaSet");
        com.vmware.xenon.common.ServiceDocument serviceDocument9 = compositeDescriptionService0.getState(operation2);
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription10 = compositeDescriptionService0.getStateDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation2);
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(serviceDocument9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation5 = operation1.addRequestHeader("location", "__hostLink");
        com.vmware.xenon.common.Operation.SerializedOperation serializedOperation6 = com.vmware.xenon.common.Operation.SerializedOperation.create(operation5);
        serializedOperation6.port = 403;
        int int9 = serializedOperation6.port;
        java.util.EnumSet<com.vmware.xenon.common.Operation.OperationOption> operationOptionSet10 = serializedOperation6.options;
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(serializedOperation6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 403 + "'", int9 == 403);
        org.junit.Assert.assertNotNull(operationOptionSet10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.vmware.xenon.common.ServiceHost serviceHost0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createGet(serviceHost0, "x-http2-stream-id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.adjustStat("xn-queue", (double) '#');
        java.net.URI uRI4 = null;
        com.vmware.xenon.common.Operation operation5 = com.vmware.xenon.common.Operation.createGet(uRI4);
        operation5.complete();
        com.vmware.xenon.common.Operation operation7 = operation5.forceRemote();
        compositeDescriptionService0.handleStop(operation7);
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription9 = compositeDescriptionService0.getStateDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler9 = null;
        com.vmware.xenon.common.Operation operation10 = operation5.nestCompletionCloneSafe(completionHandler9);
        java.net.URI uRI11 = null;
        com.vmware.xenon.common.Operation operation12 = com.vmware.xenon.common.Operation.createGet(uRI11);
        operation12.complete();
        com.vmware.xenon.common.Operation operation14 = operation12.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext15 = null;
        com.vmware.xenon.common.Operation operation16 = operation12.setSocketContext(socketContext15);
        com.vmware.xenon.common.Operation operation17 = operation5.transferResponseHeadersFrom(operation12);
        com.vmware.xenon.common.Operation operation18 = operation5.clone();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
        org.junit.Assert.assertNotNull(operation12);
        org.junit.Assert.assertNotNull(operation14);
        org.junit.Assert.assertNotNull(operation16);
        org.junit.Assert.assertNotNull(operation17);
        org.junit.Assert.assertNotNull(operation18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation operation5 = operation3.setTransactionId("FAILURE_EXPECTED");
        com.vmware.xenon.common.Operation operation7 = operation5.setRetryCount((int) ' ');
        java.lang.Object obj8 = operation7.getBodyRaw();
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler9 = operation7.getCompletion();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(completionHandler9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.vmware.xenon.common.ServiceHost serviceHost0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createPost(serviceHost0, "documentUpdateTimeMicros");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.lang.String str0 = com.vmware.xenon.common.Operation.MEDIA_TYPE_TEXT_PLAIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text/plain" + "'", str0, "text/plain");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_INDEX_CHECK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-check-index" + "'", str0, "xn-check-index");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        java.lang.String str1 = deploymentState0.parentLink;
        java.lang.String[] strArray11 = new java.lang.String[] { "name", "Simulated failure", "x-xenon-tx-phase", "operationHandlerProcessingLatencyMicros", "xn-state-not-modified", "########  Start of testRequestLifeCycle ########", "requestOutOfOrderCount", "x-http2-stream-id", "FAILURE_EXPECTED" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        deploymentState0.groupLinks = strSet12;
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState15 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent16 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent16.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription19 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet21 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState15, (com.vmware.xenon.common.ServiceDocument) compositeComponent16, serviceDocumentDescription19, (long) (byte) -1);
        deploymentState15.kubernetesSelfLink = "########  Start of request ########";
        long long24 = deploymentState15.documentExpirationTimeMicros;
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState25 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent26 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent26.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription29 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet31 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState25, (com.vmware.xenon.common.ServiceDocument) compositeComponent26, serviceDocumentDescription29, (long) (byte) -1);
        deploymentState15.copyTo((com.vmware.photon.controller.model.resources.ResourceState) deploymentState25);
        deploymentState0.copyTo((com.vmware.photon.controller.model.resources.ResourceState) deploymentState15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(documentRelationshipSet21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(documentRelationshipSet31);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler9 = null;
        com.vmware.xenon.common.Operation operation10 = operation5.nestCompletionCloneSafe(completionHandler9);
        java.net.URI uRI11 = null;
        com.vmware.xenon.common.Operation operation12 = com.vmware.xenon.common.Operation.createGet(uRI11);
        operation12.complete();
        com.vmware.xenon.common.Operation operation14 = operation12.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext15 = null;
        com.vmware.xenon.common.Operation operation16 = operation12.setSocketContext(socketContext15);
        com.vmware.xenon.common.Operation operation17 = operation5.transferResponseHeadersFrom(operation12);
        boolean boolean18 = operation17.isNotificationDisabled();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
        org.junit.Assert.assertNotNull(operation12);
        org.junit.Assert.assertNotNull(operation14);
        org.junit.Assert.assertNotNull(operation16);
        org.junit.Assert.assertNotNull(operation17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.getRetriesRemaining();
        com.vmware.xenon.common.Operation operation6 = operation1.setReplicationDisabled(true);
        int int7 = operation6.getRetriesRemaining();
        com.vmware.xenon.common.Operation.SocketContext socketContext8 = operation6.getSocketContext();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(socketContext8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.lang.String str0 = com.vmware.xenon.common.Operation.MEDIA_TYPE_TEXT_HTML;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text/html" + "'", str0, "text/html");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation5 = operation1.addRequestHeader("location", "__hostLink");
        com.vmware.xenon.common.Operation.SerializedOperation serializedOperation6 = com.vmware.xenon.common.Operation.SerializedOperation.create(operation5);
        serializedOperation6.id = 0L;
        java.lang.String str9 = serializedOperation6.query;
        java.lang.String str10 = serializedOperation6.userInfo;
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(serializedOperation6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.vmware.admiral.compute.kubernetes.service.BaseKubernetesState baseKubernetesState1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.createKubernetesEntityState("accept-encoding");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState2 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        java.lang.String str3 = deploymentState2.parentLink;
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState4 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent5 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent5.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription8 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet10 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState4, (com.vmware.xenon.common.ServiceDocument) compositeComponent5, serviceDocumentDescription8, (long) (byte) -1);
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent11 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str12 = compositeComponent11.compositeDescriptionLink;
        java.lang.String str13 = compositeComponent11.name;
        java.lang.String str14 = compositeComponent11.documentAuthPrincipalLink;
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription15 = com.vmware.xenon.common.Operation.SerializedOperation.DESCRIPTION;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet17 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) compositeComponent5, (com.vmware.xenon.common.ServiceDocument) compositeComponent11, serviceDocumentDescription15, (long) (short) -1);
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet19 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) baseKubernetesState1, (com.vmware.xenon.common.ServiceDocument) deploymentState2, serviceDocumentDescription15, (long) (byte) 100);
        org.junit.Assert.assertNotNull(baseKubernetesState1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(documentRelationshipSet10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(serviceDocumentDescription15);
        org.junit.Assert.assertNotNull(documentRelationshipSet17);
        org.junit.Assert.assertNotNull(documentRelationshipSet19);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        java.util.function.Consumer<com.vmware.xenon.common.Operation> operationConsumer9 = null;
        operation5.nestCompletion(operationConsumer9);
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder11 = com.vmware.xenon.common.Operation.AuthorizationContext.Builder.create();
        com.vmware.xenon.common.Claims claims12 = null;
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder13 = builder11.setClaims(claims12);
        com.vmware.xenon.common.Operation.AuthorizationContext authorizationContext14 = builder11.getResult();
        com.vmware.xenon.common.Operation operation15 = operation5.setAuthorizationContext(authorizationContext14);
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(authorizationContext14);
        org.junit.Assert.assertNotNull(operation15);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.lang.String str0 = com.vmware.admiral.service.common.MultiTenantDocument.PROJECTS_IDENTIFIER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/projects" + "'", str0, "/projects");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.String str0 = com.vmware.xenon.common.Operation.CONTENT_LENGTH_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "content-length" + "'", str0, "content-length");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent0.name = "name";
        compositeComponent0.documentUpdateTimeMicros = (byte) 1;
        java.lang.String str5 = compositeComponent0.documentOwner;
        long long6 = compositeComponent0.documentVersion;
        com.vmware.admiral.service.kubernetes.test.MockKubernetesApplicationAdapterService.addCompositeComponent(compositeComponent0);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        compositeComponent0.customProperties = strMap8;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.adjustStat("xn-queue", (double) '#');
        java.net.URI uRI4 = null;
        com.vmware.xenon.common.Operation operation5 = com.vmware.xenon.common.Operation.createGet(uRI4);
        operation5.complete();
        com.vmware.xenon.common.Operation operation7 = operation5.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext8 = null;
        com.vmware.xenon.common.Operation operation9 = operation5.setSocketContext(socketContext8);
        com.vmware.xenon.common.Operation operation12 = operation9.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler13 = null;
        com.vmware.xenon.common.Operation operation14 = operation9.nestCompletionCloneSafe(completionHandler13);
        java.net.URI uRI15 = null;
        com.vmware.xenon.common.Operation operation16 = com.vmware.xenon.common.Operation.createGet(uRI15);
        operation16.complete();
        com.vmware.xenon.common.Operation operation18 = operation16.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext19 = null;
        com.vmware.xenon.common.Operation operation20 = operation16.setSocketContext(socketContext19);
        com.vmware.xenon.common.Operation operation21 = operation9.transferResponseHeadersFrom(operation16);
        compositeDescriptionService0.handleNodeGroupMaintenance(operation21);
        com.vmware.xenon.common.Operation operation24 = operation21.removePragmaDirective("Deployment");
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation7);
        org.junit.Assert.assertNotNull(operation9);
        org.junit.Assert.assertNotNull(operation12);
        org.junit.Assert.assertNotNull(operation14);
        org.junit.Assert.assertNotNull(operation16);
        org.junit.Assert.assertNotNull(operation18);
        org.junit.Assert.assertNotNull(operation20);
        org.junit.Assert.assertNotNull(operation21);
        org.junit.Assert.assertNotNull(operation24);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent1.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription4 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet6 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription4, (long) (byte) -1);
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent7 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str8 = compositeComponent7.compositeDescriptionLink;
        java.lang.String str9 = compositeComponent7.name;
        java.lang.String str10 = compositeComponent7.documentAuthPrincipalLink;
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription11 = com.vmware.xenon.common.Operation.SerializedOperation.DESCRIPTION;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet13 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) compositeComponent1, (com.vmware.xenon.common.ServiceDocument) compositeComponent7, serviceDocumentDescription11, (long) (short) -1);
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState14 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        java.util.List<java.lang.String> strList15 = deploymentState14.tenantLinks;
        java.util.List<java.lang.String> strList16 = deploymentState14.tenantLinks;
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState17 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        boolean boolean18 = com.vmware.xenon.common.ServiceDocument.equals(serviceDocumentDescription11, (com.vmware.xenon.common.ServiceDocument) deploymentState14, (com.vmware.xenon.common.ServiceDocument) deploymentState17);
        java.lang.String str19 = deploymentState17.id;
        org.junit.Assert.assertNotNull(documentRelationshipSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(serviceDocumentDescription11);
        org.junit.Assert.assertNotNull(documentRelationshipSet13);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder0 = com.vmware.xenon.common.Operation.AuthorizationContext.Builder.create();
        com.vmware.xenon.common.Claims claims1 = null;
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder2 = builder0.setClaims(claims1);
        com.vmware.xenon.common.Operation.AuthorizationContext.Builder builder4 = builder0.setToken("retry-after");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        int int0 = com.vmware.xenon.common.Operation.STATUS_CODE_NOT_MODIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 304 + "'", int0 == 304);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.vmware.admiral.compute.container.CompositeComponentService compositeComponentService0 = new com.vmware.admiral.compute.container.CompositeComponentService();
        java.lang.Throwable throwable1 = null;
        compositeComponentService0.logSevere(throwable1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_STATE_PERSIST_LATENCY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "statePersistLatencyMicros" + "'", str0, "statePersistLatencyMicros");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createPost(uRI0);
        org.junit.Assert.assertNotNull(operation1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent1.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription4 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet6 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription4, (long) (byte) -1);
        java.lang.Long long7 = deploymentState0.creationTimeMicros;
        org.junit.Assert.assertNotNull(documentRelationshipSet6);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.vmware.xenon.common.Operation.OperationOption operationOption0 = com.vmware.xenon.common.Operation.OperationOption.REPLICATED;
        org.junit.Assert.assertTrue("'" + operationOption0 + "' != '" + com.vmware.xenon.common.Operation.OperationOption.REPLICATED + "'", operationOption0.equals(com.vmware.xenon.common.Operation.OperationOption.REPLICATED));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        boolean boolean1 = com.vmware.xenon.common.ServiceDocument.isBuiltInDocumentField("Request accepted for resource: %s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.lang.String str0 = com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.FIELD_NAME_DESCRIPTION_LINKS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "descriptionLinks" + "'", str0, "descriptionLinks");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation operation5 = operation3.setTransactionId("FAILURE_EXPECTED");
        com.vmware.xenon.common.Operation.OperationOption operationOption6 = com.vmware.xenon.common.Operation.OperationOption.CLONING_DISABLED;
        boolean boolean7 = operation5.hasOption(operationOption6);
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertTrue("'" + operationOption6 + "' != '" + com.vmware.xenon.common.Operation.OperationOption.CLONING_DISABLED + "'", operationOption6.equals(com.vmware.xenon.common.Operation.OperationOption.CLONING_DISABLED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        java.net.URI uRI1 = null;
        com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createGet(uRI1);
        operation2.complete();
        java.lang.String str4 = operation2.getConnectionTag();
        boolean boolean6 = operation2.hasPragmaDirective("content-encoding");
        compositeDescriptionService0.handlePeriodicMaintenance(operation2);
        com.vmware.xenon.common.ServiceHost serviceHost8 = null;
        compositeDescriptionService0.setHost(serviceHost8);
        org.junit.Assert.assertNotNull(operation2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.getRetriesRemaining();
        com.vmware.xenon.common.Operation operation6 = operation1.setReplicationDisabled(true);
        com.vmware.xenon.common.Service.Action action7 = null;
        com.vmware.xenon.common.Operation operation8 = operation6.setAction(action7);
        boolean boolean9 = operation8.isTargetReplicated();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_SYNCH_ALL_VERSIONS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-synch-all-ver" + "'", str0, "xn-synch-all-ver");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription kubernetesDescription0 = new com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription();
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject1 = null;
        kubernetesDescription0.merge(baseKubernetesObject1);
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject3 = null;
        kubernetesDescription0.merge(baseKubernetesObject3);
        kubernetesDescription0.documentUpdateTimeMicros = 500;
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation operation5 = operation3.setTransactionId("FAILURE_EXPECTED");
        com.vmware.xenon.common.Operation operation7 = operation5.setRetryCount((int) ' ');
        com.vmware.xenon.common.Operation.SerializedOperation serializedOperation8 = com.vmware.xenon.common.Operation.SerializedOperation.create(operation5);
        com.vmware.xenon.common.Service.Action action9 = null;
        serializedOperation8.action = action9;
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation7);
        org.junit.Assert.assertNotNull(serializedOperation8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription kubernetesDescription0 = new com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription();
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject1 = null;
        kubernetesDescription0.merge(baseKubernetesObject1);
        kubernetesDescription0.creationTimeMicros = 100L;
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject5 = null;
        kubernetesDescription0.merge(baseKubernetesObject5);
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject7 = null;
        kubernetesDescription0.merge(baseKubernetesObject7);
        kubernetesDescription0.type = "__hostLink";
        java.util.List<java.lang.String> strList11 = kubernetesDescription0.tenantLinks;
        org.junit.Assert.assertNull(strList11);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.vmware.xenon.common.Operation.OperationOption operationOption0 = com.vmware.xenon.common.Operation.OperationOption.REMOTE;
        org.junit.Assert.assertTrue("'" + operationOption0 + "' != '" + com.vmware.xenon.common.Operation.OperationOption.REMOTE + "'", operationOption0.equals(com.vmware.xenon.common.Operation.OperationOption.REMOTE));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.net.URI uRI3 = null;
        com.vmware.xenon.common.Operation operation4 = com.vmware.xenon.common.Operation.createGet(uRI3);
        operation4.complete();
        com.vmware.xenon.common.Operation operation6 = operation4.forceRemote();
        com.vmware.xenon.common.Operation operation8 = operation6.setTransactionId("FAILURE_EXPECTED");
        com.vmware.xenon.common.Operation operation10 = operation8.setRetryCount((int) ' ');
        compositeDescriptionService0.handleDelete(operation8);
        int int12 = operation8.incrementRetryCount();
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            operation8.fail((int) '#', throwable14, (java.lang.Object) 403);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        java.lang.String[] strArray48 = new java.lang.String[] { "parentDescriptionLink", "Failed request for resource:  %s", "descriptionImages", "x-http2-stream-weight", "Failed getting composite component.", "user-agent", "ReplicaSet", "requestFailureQueueLimitExceededCount", "Deployment", "maintenanceDuration", "stateVersionConflictCount", "hi!", "text/css", "xn-verify-token", "Failed request for resource:  %s", "FAILURE_EXPECTED", "accept-encoding", "xn-fwd", "referer", "retry-after", "/resources/kubernetes-descriptions/discovered", "xn-synch-owner", "groupLinks", "retry-after", "accept-language", "########  Start of request ########", "x-http2-stream-weight", "Namespace", "__hostLink", "parentLink", "authorization", "requestOutOfOrderCount", "isAvailable", "user-agent", "WordPress_with_MySQL_kubernetes.yaml", "__hostLink", "parentDescriptionLink", "WordPress_with_MySQL_kubernetes.yaml", "xn-authn", "accept-language", "synchTaskRetryCount", "xn-synch-owner", "xn-synch-owner", "xn-synch-owner", "x-xenon-auth-token", "xn-authn", "x-xenon-all" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        deploymentState0.tenantLinks = strList49;
        com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription kubernetesDescription52 = new com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription();
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject53 = null;
        kubernetesDescription52.merge(baseKubernetesObject53);
        com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription kubernetesDescription55 = new com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription();
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject56 = null;
        kubernetesDescription55.merge(baseKubernetesObject56);
        kubernetesDescription55.creationTimeMicros = 100L;
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject60 = null;
        kubernetesDescription55.merge(baseKubernetesObject60);
        kubernetesDescription52.copyTo((com.vmware.xenon.common.ServiceDocument) kubernetesDescription55);
        java.lang.String str63 = kubernetesDescription52.documentKind;
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState64 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent65 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent65.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription68 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet70 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState64, (com.vmware.xenon.common.ServiceDocument) compositeComponent65, serviceDocumentDescription68, (long) (byte) -1);
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent71 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str72 = compositeComponent71.compositeDescriptionLink;
        java.lang.String str73 = compositeComponent71.name;
        java.lang.String str74 = compositeComponent71.documentAuthPrincipalLink;
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription75 = com.vmware.xenon.common.Operation.SerializedOperation.DESCRIPTION;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet77 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) compositeComponent65, (com.vmware.xenon.common.ServiceDocument) compositeComponent71, serviceDocumentDescription75, (long) (short) -1);
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState78 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        java.util.List<java.lang.String> strList79 = deploymentState78.tenantLinks;
        java.util.List<java.lang.String> strList80 = deploymentState78.tenantLinks;
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState81 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        boolean boolean82 = com.vmware.xenon.common.ServiceDocument.equals(serviceDocumentDescription75, (com.vmware.xenon.common.ServiceDocument) deploymentState78, (com.vmware.xenon.common.ServiceDocument) deploymentState81);
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet84 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) kubernetesDescription52, serviceDocumentDescription75, 10L);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(documentRelationshipSet70);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(serviceDocumentDescription75);
        org.junit.Assert.assertNotNull(documentRelationshipSet77);
        org.junit.Assert.assertNull(strList79);
        org.junit.Assert.assertNull(strList80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(documentRelationshipSet84);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.lang.String str0 = com.vmware.admiral.service.common.MultiTenantDocument.GROUP_IDENTIFIER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/groups" + "'", str0, "/groups");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.lang.String str3 = compositeDescriptionService0.getPeerNodeSelectorPath();
        java.net.URI uRI4 = null;
        com.vmware.xenon.common.Operation operation5 = com.vmware.xenon.common.Operation.createGet(uRI4);
        operation5.complete();
        com.vmware.xenon.common.Operation operation7 = operation5.forceRemote();
        com.vmware.xenon.common.Operation operation9 = operation7.setTransactionId("FAILURE_EXPECTED");
        // The following exception was thrown during execution in test generation
        try {
            compositeDescriptionService0.handleGet(operation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/core/node-selectors/default" + "'", str3, "/core/node-selectors/default");
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation7);
        org.junit.Assert.assertNotNull(operation9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        java.net.URI uRI1 = null;
        com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createGet(uRI1);
        operation2.complete();
        com.vmware.xenon.common.Operation operation4 = operation2.forceRemote();
        int int5 = operation2.decrementRetriesRemaining();
        operation2.startEventStream();
        java.lang.String str8 = operation2.getResponseHeaderAsIs("ReplicaSet");
        com.vmware.xenon.common.ServiceDocument serviceDocument9 = compositeDescriptionService0.getState(operation2);
        java.net.URI uRI10 = null;
        com.vmware.xenon.common.Operation operation11 = com.vmware.xenon.common.Operation.createGet(uRI10);
        operation11.complete();
        com.vmware.xenon.common.Operation operation13 = operation11.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext14 = null;
        com.vmware.xenon.common.Operation operation15 = operation11.setSocketContext(socketContext14);
        com.vmware.xenon.common.Operation operation17 = operation15.setRetryCount(0);
        // The following exception was thrown during execution in test generation
        try {
            compositeDescriptionService0.handlePatch(operation15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation2);
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(serviceDocument9);
        org.junit.Assert.assertNotNull(operation11);
        org.junit.Assert.assertNotNull(operation13);
        org.junit.Assert.assertNotNull(operation15);
        org.junit.Assert.assertNotNull(operation17);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.setSelfLink("WordPress_with_MySQL_kubernetes.yaml");
        com.vmware.xenon.common.ServiceHost serviceHost3 = null;
        compositeDescriptionService0.setHost(serviceHost3);
        compositeDescriptionService0.adjustStat("xn-created", (double) 10);
        com.vmware.xenon.common.Operation operation8 = compositeDescriptionService0.dequeueRequest();
        boolean boolean9 = compositeDescriptionService0.isAvailable();
        java.net.URI uRI10 = null;
        com.vmware.xenon.common.Operation operation11 = com.vmware.xenon.common.Operation.createGet(uRI10);
        operation11.complete();
        com.vmware.xenon.common.Operation operation13 = operation11.forceRemote();
        int int14 = operation11.decrementRetriesRemaining();
        boolean boolean15 = operation11.isConnectionSharing();
        com.vmware.xenon.common.Operation operation17 = operation11.setConnectionSharing(false);
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.ServiceDocument serviceDocument19 = compositeDescriptionService0.setInitialState((java.lang.Object) false, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException; message: java.lang.IllegalStateException: Expected BEGIN_OBJECT but was BOOLEAN at line 1 column 6 path $");
        } catch (com.google.gson.JsonSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(operation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(operation11);
        org.junit.Assert.assertNotNull(operation13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(operation17);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent1.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription4 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet6 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription4, (long) (byte) -1);
        deploymentState0.kubernetesSelfLink = "########  Start of request ########";
        long long9 = deploymentState0.documentExpirationTimeMicros;
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState10 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent11 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent11.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription14 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet16 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState10, (com.vmware.xenon.common.ServiceDocument) compositeComponent11, serviceDocumentDescription14, (long) (byte) -1);
        deploymentState0.copyTo((com.vmware.photon.controller.model.resources.ResourceState) deploymentState10);
        deploymentState0.compositeComponentLink = "x-http2-stream-id";
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject20 = deploymentState0.getEntityAsBaseKubernetesObject();
        com.vmware.admiral.service.kubernetes.test.MockKubernetesApplicationAdapterService.addDeploymentState(deploymentState0);
        org.junit.Assert.assertNotNull(documentRelationshipSet6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(documentRelationshipSet16);
        org.junit.Assert.assertNull(baseKubernetesObject20);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.lang.String str0 = com.vmware.xenon.common.Operation.MEDIA_TYPE_APPLICATION_KRYO_OCTET_STREAM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/kryo-octet-stream" + "'", str0, "application/kryo-octet-stream");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation operation5 = operation3.setTransactionId("FAILURE_EXPECTED");
        com.vmware.xenon.common.Operation operation7 = operation5.setRetryCount((int) ' ');
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler8 = null;
        com.vmware.xenon.common.Operation operation9 = operation5.nestCompletionCloneSafe(completionHandler8);
        java.net.URI uRI10 = null;
        com.vmware.xenon.common.Operation operation11 = com.vmware.xenon.common.Operation.createGet(uRI10);
        operation11.complete();
        com.vmware.xenon.common.Operation operation13 = operation11.forceRemote();
        int int14 = operation11.decrementRetriesRemaining();
        boolean boolean15 = operation11.isConnectionSharing();
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation.failForwardedRequest(operation5, operation11, throwable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation7);
        org.junit.Assert.assertNotNull(operation9);
        org.junit.Assert.assertNotNull(operation11);
        org.junit.Assert.assertNotNull(operation13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.getRetriesRemaining();
        com.vmware.xenon.common.Operation operation6 = operation1.setReplicationDisabled(true);
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService7 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        java.net.URI uRI8 = null;
        com.vmware.xenon.common.Operation operation9 = com.vmware.xenon.common.Operation.createGet(uRI8);
        operation9.complete();
        com.vmware.xenon.common.Operation operation11 = operation9.forceRemote();
        int int12 = operation9.decrementRetriesRemaining();
        operation9.startEventStream();
        java.lang.String str15 = operation9.getResponseHeaderAsIs("ReplicaSet");
        com.vmware.xenon.common.ServiceDocument serviceDocument16 = compositeDescriptionService7.getState(operation9);
        // The following exception was thrown during execution in test generation
        try {
            operation1.sendWith((com.vmware.xenon.common.ServiceRequestSender) compositeDescriptionService7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation9);
        org.junit.Assert.assertNotNull(operation11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(serviceDocument16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation5 = operation1.addRequestHeader("location", "__hostLink");
        com.vmware.xenon.common.Operation.SerializedOperation serializedOperation6 = com.vmware.xenon.common.Operation.SerializedOperation.create(operation5);
        serializedOperation6.port = 403;
        java.lang.String str9 = serializedOperation6.contextId;
        serializedOperation6.transactionId = "Address";
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(serializedOperation6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.net.URI uRI3 = null;
        com.vmware.xenon.common.Operation operation4 = com.vmware.xenon.common.Operation.createGet(uRI3);
        operation4.complete();
        com.vmware.xenon.common.Operation operation6 = operation4.forceRemote();
        compositeDescriptionService0.handlePut(operation4);
        java.lang.Throwable throwable8 = null;
        compositeDescriptionService0.logSevere(throwable8);
        java.net.URI uRI10 = null;
        com.vmware.xenon.common.Operation operation11 = com.vmware.xenon.common.Operation.createGet(uRI10);
        java.lang.String str12 = operation11.getConnectionTag();
        java.security.Principal principal13 = null;
        javax.security.cert.X509Certificate x509Certificate14 = null;
        javax.security.cert.X509Certificate[] x509CertificateArray15 = new javax.security.cert.X509Certificate[] { x509Certificate14 };
        operation11.setPeerCertificates(principal13, x509CertificateArray15);
        com.vmware.xenon.common.Operation operation18 = operation11.removePragmaDirective("x-xenon-tx-reflink");
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.DeferredResult<com.vmware.xenon.common.Operation> operationDeferredResult19 = compositeDescriptionService0.sendWithDeferredResult(operation18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(x509CertificateArray15);
        org.junit.Assert.assertNotNull(operation18);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.lang.String str0 = com.vmware.xenon.common.ServiceDocument.FIELD_NAME_SOURCE_LINK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "documentSourceLink" + "'", str0, "documentSourceLink");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent1.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription4 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet6 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription4, (long) (byte) -1);
        deploymentState0.kubernetesSelfLink = "########  Start of request ########";
        long long9 = deploymentState0.documentExpirationTimeMicros;
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState10 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent11 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent11.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription14 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet16 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState10, (com.vmware.xenon.common.ServiceDocument) compositeComponent11, serviceDocumentDescription14, (long) (byte) -1);
        deploymentState0.copyTo((com.vmware.photon.controller.model.resources.ResourceState) deploymentState10);
        deploymentState0.compositeComponentLink = "x-http2-stream-id";
        java.lang.String str20 = deploymentState0.documentSourceLink;
        java.lang.String[] strArray51 = new java.lang.String[] { "*/*", "hi!", "Address", "__hostLink", "xn-post-to-put", "preAvailableReceivedOperationCount", "Address", "operationHandlerProcessingLatencyMicros", "content-length", "parentLink", "parentDescriptionLink", "maintenanceCount", "application/octet-stream", "The passed collection of links is null", "xn-synch-ver", "Failed request based on compositeComponent resource:  %s", "application/javascript", "documentVersion", "########  Start of testRequestLifeCycle ########", "xn-queue", "x-xenon-tx-phase", "x-xenon-auth-token", "application/javascript", "text/css", "retry-after", "x-http2-stream-weight", "xn-verify-token", "FAILURE_EXPECTED", "", "application/javascript" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        deploymentState0.groupLinks = strSet52;
        java.lang.String str55 = deploymentState0.retrieveCompositeComponentLink();
        org.junit.Assert.assertNotNull(documentRelationshipSet6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(documentRelationshipSet16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "x-http2-stream-id" + "'", str55, "x-http2-stream-id");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.vmware.admiral.compute.kubernetes.entities.deployments.Deployment deployment0 = new com.vmware.admiral.compute.kubernetes.entities.deployments.Deployment();
        java.lang.String str1 = deployment0.kind;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        java.lang.String str2 = operation1.getConnectionTag();
        java.security.Principal principal3 = operation1.getPeerPrincipal();
        com.vmware.xenon.common.Operation operation4 = operation1.forceRemote();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(principal3);
        org.junit.Assert.assertNotNull(operation4);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation5 = operation1.addRequestHeader("location", "__hostLink");
        com.vmware.xenon.common.Operation.SerializedOperation serializedOperation6 = com.vmware.xenon.common.Operation.SerializedOperation.create(operation5);
        serializedOperation6.port = 403;
        java.lang.String str9 = serializedOperation6.contextId;
        com.vmware.xenon.common.ServiceHost serviceHost10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation11 = com.vmware.xenon.common.Operation.create(serializedOperation6, serviceHost10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(serializedOperation6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.lang.String str0 = com.vmware.xenon.common.ServiceDocument.FIELD_NAME_SUFFIX_LINK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Link" + "'", str0, "Link");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.net.URI uRI3 = null;
        com.vmware.xenon.common.Operation operation4 = com.vmware.xenon.common.Operation.createGet(uRI3);
        operation4.complete();
        com.vmware.xenon.common.Operation operation6 = operation4.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext7 = null;
        com.vmware.xenon.common.Operation operation8 = operation4.setSocketContext(socketContext7);
        compositeDescriptionService0.handleStart(operation8);
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation.failServiceNotFound(operation8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.lang.String str0 = com.vmware.xenon.common.ServiceDocument.FIELD_NAME_EPOCH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "documentEpoch" + "'", str0, "documentEpoch");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.lang.String str0 = com.vmware.xenon.common.Operation.TRANSFER_ENCODING_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "transfer-encoding" + "'", str0, "transfer-encoding");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        int int0 = com.vmware.xenon.common.Operation.STATUS_CODE_UNAVAILABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 503 + "'", int0 == 503);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler9 = null;
        com.vmware.xenon.common.Operation operation10 = operation8.nestCompletionCloneSafe(completionHandler9);
        com.vmware.xenon.common.Operation.SerializedOperation serializedOperation11 = com.vmware.xenon.common.Operation.SerializedOperation.create(operation8);
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
        org.junit.Assert.assertNotNull(serializedOperation11);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler9 = null;
        com.vmware.xenon.common.Operation operation10 = operation8.nestCompletionCloneSafe(completionHandler9);
        com.vmware.xenon.common.Operation operation12 = operation8.setTransactionId("maintenanceDuration");
        java.net.URI uRI13 = operation8.getReferer();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
        org.junit.Assert.assertNotNull(operation12);
        org.junit.Assert.assertNull(uRI13);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.setSelfLink("WordPress_with_MySQL_kubernetes.yaml");
        java.util.function.Supplier<java.lang.String> strSupplier3 = null;
        compositeDescriptionService0.logFine(strSupplier3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler9 = null;
        com.vmware.xenon.common.Operation operation10 = operation8.nestCompletionCloneSafe(completionHandler9);
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation.fail(operation10, (int) (byte) -1, 0, throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent1.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription4 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet6 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription4, (long) (byte) -1);
        deploymentState0.descriptionLink = "x-request-id";
        deploymentState0.desc = "\r\n";
        java.lang.Long long11 = deploymentState0.creationTimeMicros;
        org.junit.Assert.assertNotNull(documentRelationshipSet6);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.Status status0 = com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.Status.DRAFT;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.Status.DRAFT + "'", status0.equals(com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.Status.DRAFT));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        java.util.List<java.lang.String> strList1 = deploymentState0.tenantLinks;
        java.lang.String str2 = deploymentState0.compositeComponentLink;
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.setSelfLink("WordPress_with_MySQL_kubernetes.yaml");
        com.vmware.xenon.common.ServiceHost serviceHost3 = null;
        compositeDescriptionService0.setHost(serviceHost3);
        java.net.URI uRI5 = null;
        com.vmware.xenon.common.Operation operation6 = com.vmware.xenon.common.Operation.createGet(uRI5);
        operation6.complete();
        compositeDescriptionService0.handleNodeGroupMaintenance(operation6);
        com.vmware.xenon.common.Operation operation10 = operation6.addPragmaDirective("*/*");
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.net.URI uRI3 = null;
        com.vmware.xenon.common.Operation operation4 = com.vmware.xenon.common.Operation.createGet(uRI3);
        operation4.complete();
        com.vmware.xenon.common.Operation operation6 = operation4.forceRemote();
        compositeDescriptionService0.handlePut(operation4);
        compositeDescriptionService0.setStat("maintenanceDuration", (double) 100);
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertNotNull(operation6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.setSelfLink("WordPress_with_MySQL_kubernetes.yaml");
        com.vmware.xenon.common.ServiceHost serviceHost3 = null;
        compositeDescriptionService0.setHost(serviceHost3);
        java.net.URI uRI5 = null;
        com.vmware.xenon.common.Operation operation6 = com.vmware.xenon.common.Operation.createGet(uRI5);
        operation6.complete();
        compositeDescriptionService0.handleNodeGroupMaintenance(operation6);
        com.vmware.xenon.common.OperationProcessingChain operationProcessingChain9 = compositeDescriptionService0.getOperationProcessingChain();
        java.net.URI uRI10 = null;
        com.vmware.xenon.common.Operation operation11 = com.vmware.xenon.common.Operation.createGet(uRI10);
        operation11.complete();
        com.vmware.xenon.common.Operation operation13 = operation11.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext14 = null;
        com.vmware.xenon.common.Operation operation15 = operation11.setSocketContext(socketContext14);
        com.vmware.xenon.common.Operation operation17 = operation15.setBodyNoCloning((java.lang.Object) "Simulated failure");
        com.vmware.xenon.common.Service.OperationProcessingStage operationProcessingStage18 = null;
        compositeDescriptionService0.handleRequest(operation15, operationProcessingStage18);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNull(operationProcessingChain9);
        org.junit.Assert.assertNotNull(operation11);
        org.junit.Assert.assertNotNull(operation13);
        org.junit.Assert.assertNotNull(operation15);
        org.junit.Assert.assertNotNull(operation17);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation operation5 = operation3.setTransactionId("FAILURE_EXPECTED");
        boolean boolean6 = operation3.isSynchronize();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation.fail(operation3, 500, 400, throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.vmware.photon.controller.model.resources.ComputeService.ComputeState computeState0 = null;
        com.vmware.admiral.compute.kubernetes.entities.services.Service service1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.constructDashboardLink(computeState0, service1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.adjustStat("xn-queue", (double) '#');
        java.net.URI uRI4 = null;
        com.vmware.xenon.common.Operation operation5 = com.vmware.xenon.common.Operation.createGet(uRI4);
        operation5.complete();
        com.vmware.xenon.common.Operation operation7 = operation5.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext8 = null;
        com.vmware.xenon.common.Operation operation9 = operation5.setSocketContext(socketContext8);
        com.vmware.xenon.common.Operation operation12 = operation9.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler13 = null;
        com.vmware.xenon.common.Operation operation14 = operation9.nestCompletionCloneSafe(completionHandler13);
        java.net.URI uRI15 = null;
        com.vmware.xenon.common.Operation operation16 = com.vmware.xenon.common.Operation.createGet(uRI15);
        operation16.complete();
        com.vmware.xenon.common.Operation operation18 = operation16.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext19 = null;
        com.vmware.xenon.common.Operation operation20 = operation16.setSocketContext(socketContext19);
        com.vmware.xenon.common.Operation operation21 = operation9.transferResponseHeadersFrom(operation16);
        compositeDescriptionService0.handleNodeGroupMaintenance(operation21);
        com.vmware.xenon.common.ServiceHost serviceHost23 = compositeDescriptionService0.getHost();
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation7);
        org.junit.Assert.assertNotNull(operation9);
        org.junit.Assert.assertNotNull(operation12);
        org.junit.Assert.assertNotNull(operation14);
        org.junit.Assert.assertNotNull(operation16);
        org.junit.Assert.assertNotNull(operation18);
        org.junit.Assert.assertNotNull(operation20);
        org.junit.Assert.assertNotNull(operation21);
        org.junit.Assert.assertNull(serviceHost23);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription compositeDescription0 = new com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str2 = compositeComponent1.compositeDescriptionLink;
        java.lang.String str3 = compositeComponent1.name;
        java.lang.String str4 = compositeComponent1.documentAuthPrincipalLink;
        compositeComponent1.documentSourceLink = "documentUpdateTimeMicros";
        java.lang.String str7 = compositeComponent1.documentSourceLink;
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState8 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        java.lang.String[] strArray56 = new java.lang.String[] { "parentDescriptionLink", "Failed request for resource:  %s", "descriptionImages", "x-http2-stream-weight", "Failed getting composite component.", "user-agent", "ReplicaSet", "requestFailureQueueLimitExceededCount", "Deployment", "maintenanceDuration", "stateVersionConflictCount", "hi!", "text/css", "xn-verify-token", "Failed request for resource:  %s", "FAILURE_EXPECTED", "accept-encoding", "xn-fwd", "referer", "retry-after", "/resources/kubernetes-descriptions/discovered", "xn-synch-owner", "groupLinks", "retry-after", "accept-language", "########  Start of request ########", "x-http2-stream-weight", "Namespace", "__hostLink", "parentLink", "authorization", "requestOutOfOrderCount", "isAvailable", "user-agent", "WordPress_with_MySQL_kubernetes.yaml", "__hostLink", "parentDescriptionLink", "WordPress_with_MySQL_kubernetes.yaml", "xn-authn", "accept-language", "synchTaskRetryCount", "xn-synch-owner", "xn-synch-owner", "xn-synch-owner", "x-xenon-auth-token", "xn-authn", "x-xenon-all" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        deploymentState8.tenantLinks = strList57;
        compositeComponent1.tenantLinks = strList57;
        compositeDescription0.descriptionLinks = strList57;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "documentUpdateTimeMicros" + "'", str7, "documentUpdateTimeMicros");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        java.net.URI uRI1 = null;
        com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createGet(uRI1);
        operation2.complete();
        com.vmware.xenon.common.Operation operation4 = operation2.forceRemote();
        int int5 = operation2.decrementRetriesRemaining();
        operation2.startEventStream();
        java.lang.String str8 = operation2.getResponseHeaderAsIs("ReplicaSet");
        com.vmware.xenon.common.ServiceDocument serviceDocument9 = compositeDescriptionService0.getState(operation2);
        java.net.URI uRI11 = null;
        com.vmware.xenon.common.Operation operation12 = com.vmware.xenon.common.Operation.createGet(uRI11);
        java.lang.String str13 = operation12.getConnectionTag();
        java.security.Principal principal14 = null;
        javax.security.cert.X509Certificate x509Certificate15 = null;
        javax.security.cert.X509Certificate[] x509CertificateArray16 = new javax.security.cert.X509Certificate[] { x509Certificate15 };
        operation12.setPeerCertificates(principal14, x509CertificateArray16);
        compositeDescriptionService0.logInfo("operationHandlerProcessingLatencyMicros", (java.lang.Object[]) x509CertificateArray16);
        java.lang.String str19 = compositeDescriptionService0.getPeerNodeSelectorPath();
        org.junit.Assert.assertNotNull(operation2);
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(serviceDocument9);
        org.junit.Assert.assertNotNull(operation12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(x509CertificateArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/core/node-selectors/default" + "'", str19, "/core/node-selectors/default");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler9 = null;
        com.vmware.xenon.common.Operation operation10 = operation5.nestCompletionCloneSafe(completionHandler9);
        java.net.URI uRI11 = null;
        com.vmware.xenon.common.Operation operation12 = com.vmware.xenon.common.Operation.createGet(uRI11);
        operation12.complete();
        com.vmware.xenon.common.Operation operation14 = operation12.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext15 = null;
        com.vmware.xenon.common.Operation operation16 = operation12.setSocketContext(socketContext15);
        com.vmware.xenon.common.Operation operation17 = operation5.transferResponseHeadersFrom(operation12);
        java.lang.String str19 = operation5.getRequestHeaderAsIs("accept");
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
        org.junit.Assert.assertNotNull(operation12);
        org.junit.Assert.assertNotNull(operation14);
        org.junit.Assert.assertNotNull(operation16);
        org.junit.Assert.assertNotNull(operation17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.lang.String str0 = com.vmware.xenon.common.Operation.RANGE_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "range" + "'", str0, "range");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.getRetriesRemaining();
        com.vmware.xenon.common.Operation.SocketContext socketContext5 = null;
        com.vmware.xenon.common.Operation operation6 = operation1.setSocketContext(socketContext5);
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(operation6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.lang.String str0 = com.vmware.photon.controller.model.resources.ResourceState.FIELD_NAME_REGION_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "regionId" + "'", str0, "regionId");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService kubernetesDescriptionService0 = new com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.adjustStat("xn-queue", (double) '#');
        com.vmware.xenon.common.ServiceStats.ServiceStat serviceStat4 = null;
        compositeDescriptionService0.setStat(serviceStat4, (double) 302);
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.ServiceDocument serviceDocument7 = compositeDescriptionService0.getDocumentTemplate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.getRetriesRemaining();
        long long5 = operation1.getId();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 152L + "'", long5 == 152L);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.lang.String str0 = com.vmware.xenon.common.Operation.HEADER_FIELD_VALUE_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation7 = operation5.setRetryCount(0);
        boolean boolean8 = operation7.isForwardingDisabled();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.lang.String str1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.buildEntityId("Namespace");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Namespace" + "'", str1, "Namespace");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        java.lang.String str9 = operation5.getTransactionId();
        java.util.function.Consumer<com.vmware.xenon.common.ServerSentEvent> serverSentEventConsumer10 = null;
        com.vmware.xenon.common.Operation operation11 = operation5.setServerSentEventHandler(serverSentEventConsumer10);
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(operation11);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.vmware.admiral.compute.kubernetes.entities.deployments.Deployment deployment0 = new com.vmware.admiral.compute.kubernetes.entities.deployments.Deployment();
        java.lang.String str1 = deployment0.apiVersion;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.net.URI uRI3 = null;
        com.vmware.xenon.common.Operation operation4 = com.vmware.xenon.common.Operation.createGet(uRI3);
        operation4.complete();
        com.vmware.xenon.common.Operation operation6 = operation4.forceRemote();
        compositeDescriptionService0.handlePut(operation4);
        com.vmware.xenon.common.Service service9 = compositeDescriptionService0.getUtilityService("user-agent");
        java.util.function.Supplier<java.lang.String> strSupplier10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeDescriptionService0.logInfo(strSupplier10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(service9);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        java.net.URI uRI1 = null;
        com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createGet(uRI1);
        operation2.complete();
        java.lang.String str4 = operation2.getConnectionTag();
        boolean boolean6 = operation2.hasPragmaDirective("content-encoding");
        compositeDescriptionService0.handlePeriodicMaintenance(operation2);
        boolean boolean8 = operation2.isFailureLoggingDisabled();
        org.junit.Assert.assertNotNull(operation2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.lang.String str0 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.KUBERNETES_LABEL_APP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "app" + "'", str0, "app");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        boolean boolean1 = com.vmware.xenon.common.ServiceDocument.isBuiltInDocumentField("Endpoints");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        java.lang.String str3 = operation1.getConnectionTag();
        java.util.function.Consumer<com.vmware.xenon.common.Operation> operationConsumer4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.nestHeadersReceivedHandler(operationConsumer4);
        boolean boolean6 = operation1.isReplicationDisabled();
        com.vmware.xenon.common.Operation operation8 = operation1.setStatusCode(408);
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(operation8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        java.lang.String str1 = deploymentState0.parentLink;
        java.lang.String[] strArray11 = new java.lang.String[] { "name", "Simulated failure", "x-xenon-tx-phase", "operationHandlerProcessingLatencyMicros", "xn-state-not-modified", "########  Start of testRequestLifeCycle ########", "requestOutOfOrderCount", "x-http2-stream-id", "FAILURE_EXPECTED" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        deploymentState0.groupLinks = strSet12;
        deploymentState0.documentUpdateTimeMicros = 302;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent1.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription4 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet6 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription4, (long) (byte) -1);
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent7 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str8 = compositeComponent7.compositeDescriptionLink;
        java.lang.String str9 = compositeComponent7.name;
        java.lang.String str10 = compositeComponent7.documentAuthPrincipalLink;
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription11 = com.vmware.xenon.common.Operation.SerializedOperation.DESCRIPTION;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet13 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) compositeComponent1, (com.vmware.xenon.common.ServiceDocument) compositeComponent7, serviceDocumentDescription11, (long) (short) -1);
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState14 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        java.util.List<java.lang.String> strList15 = deploymentState14.tenantLinks;
        java.util.List<java.lang.String> strList16 = deploymentState14.tenantLinks;
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState17 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        boolean boolean18 = com.vmware.xenon.common.ServiceDocument.equals(serviceDocumentDescription11, (com.vmware.xenon.common.ServiceDocument) deploymentState14, (com.vmware.xenon.common.ServiceDocument) deploymentState17);
        deploymentState17.kubernetesSelfLink = "desc";
        org.junit.Assert.assertNotNull(documentRelationshipSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(serviceDocumentDescription11);
        org.junit.Assert.assertNotNull(documentRelationshipSet13);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        java.lang.String str1 = deploymentState0.retrieveCompositeComponentLink();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.adjustStat("xn-queue", (double) '#');
        com.vmware.xenon.common.ServiceStats.ServiceStat serviceStat4 = null;
        compositeDescriptionService0.setStat(serviceStat4, (double) 302);
        compositeDescriptionService0.setPeerNodeSelectorPath("text/event-stream");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent1 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent1.name = "name";
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription4 = null;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet6 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) deploymentState0, (com.vmware.xenon.common.ServiceDocument) compositeComponent1, serviceDocumentDescription4, (long) (byte) -1);
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent7 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str8 = compositeComponent7.compositeDescriptionLink;
        java.lang.String str9 = compositeComponent7.name;
        java.lang.String str10 = compositeComponent7.documentAuthPrincipalLink;
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription11 = com.vmware.xenon.common.Operation.SerializedOperation.DESCRIPTION;
        java.util.EnumSet<com.vmware.xenon.common.ServiceDocument.DocumentRelationship> documentRelationshipSet13 = com.vmware.xenon.common.ServiceDocument.compare((com.vmware.xenon.common.ServiceDocument) compositeComponent1, (com.vmware.xenon.common.ServiceDocument) compositeComponent7, serviceDocumentDescription11, (long) (short) -1);
        com.vmware.admiral.service.kubernetes.test.MockKubernetesApplicationAdapterService.addCompositeComponent(compositeComponent1);
        org.junit.Assert.assertNotNull(documentRelationshipSet6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(serviceDocumentDescription11);
        org.junit.Assert.assertNotNull(documentRelationshipSet13);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation5 = operation1.addRequestHeader("location", "__hostLink");
        com.vmware.xenon.common.Operation.SerializedOperation serializedOperation6 = com.vmware.xenon.common.Operation.SerializedOperation.create(operation5);
        java.lang.String str7 = serializedOperation6.userInfo;
        java.net.URI uRI8 = null;
        serializedOperation6.referer = uRI8;
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(serializedOperation6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.decrementRetriesRemaining();
        com.vmware.xenon.common.Operation.failActionNotSupported(operation1);
        com.vmware.xenon.common.Service.Action action6 = operation1.getAction();
        java.util.function.Consumer<com.vmware.xenon.common.Operation> operationConsumer7 = null;
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler8 = null;
        com.vmware.xenon.common.Operation operation9 = operation1.setCompletion(operationConsumer7, completionHandler8);
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + action6 + "' != '" + com.vmware.xenon.common.Service.Action.GET + "'", action6.equals(com.vmware.xenon.common.Service.Action.GET));
        org.junit.Assert.assertNotNull(operation9);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        java.lang.String str0 = com.vmware.xenon.common.Service.STAT_NAME_NODE_GROUP_CHANGE_MAINTENANCE_COUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "maintenanceForNodeGroupChangeCount" + "'", str0, "maintenanceForNodeGroupChangeCount");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.Status status0 = com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.Status.PUBLISHED;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.Status.PUBLISHED + "'", status0.equals(com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription.Status.PUBLISHED));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.vmware.xenon.common.ServiceHost serviceHost0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation2 = com.vmware.xenon.common.Operation.createPatch(serviceHost0, "x-xenon-tx-phase");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState deploymentState0 = new com.vmware.admiral.compute.kubernetes.service.DeploymentService.DeploymentState();
        java.util.List<java.lang.String> strList1 = deploymentState0.tenantLinks;
        java.util.List<java.lang.String> strList2 = deploymentState0.tenantLinks;
        deploymentState0.descriptionLink = "\r\n";
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.setSelfLink("WordPress_with_MySQL_kubernetes.yaml");
        com.vmware.xenon.common.ServiceHost serviceHost3 = null;
        compositeDescriptionService0.setHost(serviceHost3);
        java.util.function.Supplier<java.lang.String> strSupplier5 = null;
        compositeDescriptionService0.logFine(strSupplier5);
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation operation8 = com.vmware.xenon.common.Operation.createOptions((com.vmware.xenon.common.Service) compositeDescriptionService0, "application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        java.lang.String str0 = com.vmware.xenon.common.Operation.TRANSACTION_ID_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "x-xenon-tx-id" + "'", str0, "x-xenon-tx-id");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.getRetriesRemaining();
        com.vmware.xenon.common.Operation operation6 = operation1.setReplicationDisabled(true);
        com.vmware.xenon.common.Service.Action action7 = null;
        com.vmware.xenon.common.Operation operation8 = operation6.setAction(action7);
        operation6.fail((int) (byte) -1);
        java.lang.String str12 = operation6.getRequestHeaderAsIs("--- null");
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.setSelfLink("WordPress_with_MySQL_kubernetes.yaml");
        com.vmware.xenon.common.ServiceHost serviceHost3 = null;
        compositeDescriptionService0.setHost(serviceHost3);
        java.net.URI uRI5 = null;
        com.vmware.xenon.common.Operation operation6 = com.vmware.xenon.common.Operation.createGet(uRI5);
        operation6.complete();
        compositeDescriptionService0.handleNodeGroupMaintenance(operation6);
        compositeDescriptionService0.setCacheClearDelayMicros((long) (byte) 100);
        org.junit.Assert.assertNotNull(operation6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.setSelfLink("WordPress_with_MySQL_kubernetes.yaml");
        com.vmware.xenon.common.ServiceHost serviceHost3 = null;
        compositeDescriptionService0.setHost(serviceHost3);
        compositeDescriptionService0.adjustStat("xn-created", (double) 10);
        java.net.URI uRI8 = null;
        com.vmware.xenon.common.Operation operation9 = com.vmware.xenon.common.Operation.createGet(uRI8);
        operation9.complete();
        com.vmware.xenon.common.Operation operation13 = operation9.addRequestHeader("location", "__hostLink");
        compositeDescriptionService0.handleOptions(operation13);
        java.net.URI uRI15 = null;
        com.vmware.xenon.common.Operation operation16 = com.vmware.xenon.common.Operation.createGet(uRI15);
        operation16.complete();
        java.lang.String str18 = operation16.getConnectionTag();
        java.util.function.Consumer<com.vmware.xenon.common.Operation> operationConsumer19 = null;
        com.vmware.xenon.common.Operation operation20 = operation16.nestHeadersReceivedHandler(operationConsumer19);
        com.vmware.xenon.common.Operation.SocketContext socketContext21 = null;
        com.vmware.xenon.common.Operation operation22 = operation16.setSocketContext(socketContext21);
        compositeDescriptionService0.handlePost(operation22);
        java.net.URI uRI24 = null;
        com.vmware.xenon.common.Operation operation25 = com.vmware.xenon.common.Operation.createGet(uRI24);
        operation25.complete();
        java.lang.String str27 = operation25.getConnectionTag();
        boolean boolean29 = operation25.hasPragmaDirective("content-encoding");
        java.lang.Throwable throwable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.xenon.common.Operation.failForwardedRequest(operation22, operation25, throwable30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(operation9);
        org.junit.Assert.assertNotNull(operation13);
        org.junit.Assert.assertNotNull(operation16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(operation20);
        org.junit.Assert.assertNotNull(operation22);
        org.junit.Assert.assertNotNull(operation25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        java.lang.String str0 = com.vmware.photon.controller.model.resources.ResourceState.FIELD_NAME_TENANT_LINKS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tenantLinks" + "'", str0, "tenantLinks");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.getRetriesRemaining();
        com.vmware.xenon.common.Operation operation6 = operation1.setReplicationDisabled(true);
        int int7 = operation6.getRetriesRemaining();
        java.lang.String str9 = operation6.getRequestHeaderAsIs("maintenanceCount");
        com.vmware.xenon.common.Operation operation11 = operation6.setTransactionId("groupLinks");
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(operation11);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.net.URI uRI3 = null;
        com.vmware.xenon.common.Operation operation4 = com.vmware.xenon.common.Operation.createGet(uRI3);
        operation4.complete();
        com.vmware.xenon.common.Operation operation6 = operation4.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext7 = null;
        com.vmware.xenon.common.Operation operation8 = operation4.setSocketContext(socketContext7);
        compositeDescriptionService0.handleStart(operation8);
        java.util.EnumSet<com.vmware.xenon.common.Service.ServiceOption> serviceOptionSet10 = compositeDescriptionService0.getOptions();
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(serviceOptionSet10);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        java.security.Principal principal4 = null;
        java.net.URI uRI5 = null;
        com.vmware.xenon.common.Operation operation6 = com.vmware.xenon.common.Operation.createGet(uRI5);
        java.lang.String str7 = operation6.getConnectionTag();
        java.security.Principal principal8 = null;
        javax.security.cert.X509Certificate x509Certificate9 = null;
        javax.security.cert.X509Certificate[] x509CertificateArray10 = new javax.security.cert.X509Certificate[] { x509Certificate9 };
        operation6.setPeerCertificates(principal8, x509CertificateArray10);
        operation3.setPeerCertificates(principal4, x509CertificateArray10);
        operation3.complete();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(x509CertificateArray10);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        java.lang.String str3 = operation1.getConnectionTag();
        java.util.function.Consumer<com.vmware.xenon.common.Operation> operationConsumer4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.nestHeadersReceivedHandler(operationConsumer4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = operation5.getRequestHeaders();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        com.vmware.xenon.common.Operation.OperationOption operationOption0 = com.vmware.xenon.common.Operation.OperationOption.FORWARDED;
        org.junit.Assert.assertTrue("'" + operationOption0 + "' != '" + com.vmware.xenon.common.Operation.OperationOption.FORWARDED + "'", operationOption0.equals(com.vmware.xenon.common.Operation.OperationOption.FORWARDED));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.vmware.admiral.compute.kubernetes.service.BaseKubernetesState baseKubernetesState1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.createKubernetesEntityState("accept-encoding");
        java.lang.Long long2 = baseKubernetesState1.creationTimeMicros;
        java.lang.Class<?> wildcardClass3 = baseKubernetesState1.getClass();
        org.junit.Assert.assertNotNull(baseKubernetesState1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.net.URI uRI3 = null;
        com.vmware.xenon.common.Operation operation4 = com.vmware.xenon.common.Operation.createGet(uRI3);
        operation4.complete();
        com.vmware.xenon.common.Operation operation6 = operation4.forceRemote();
        com.vmware.xenon.common.Operation operation8 = operation6.setTransactionId("FAILURE_EXPECTED");
        com.vmware.xenon.common.Operation operation10 = operation8.setRetryCount((int) ' ');
        compositeDescriptionService0.handleDelete(operation8);
        int int12 = operation8.incrementRetryCount();
        com.vmware.xenon.common.Operation operation14 = operation8.setKeepAlive(false);
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertNotNull(operation14);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        boolean boolean1 = com.vmware.xenon.common.ServiceDocument.isBuiltInSignatureExcludedDocumentField("xn-synch-ver");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        com.vmware.admiral.compute.container.CompositeComponentService compositeComponentService0 = new com.vmware.admiral.compute.container.CompositeComponentService();
        java.util.EnumSet<com.vmware.xenon.common.Service.ServiceOption> serviceOptionSet1 = compositeComponentService0.getOptions();
        org.junit.Assert.assertNotNull(serviceOptionSet1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.lang.String str0 = com.vmware.xenon.common.Operation.TX_COMMIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "commit" + "'", str0, "commit");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = null;
        com.vmware.admiral.service.kubernetes.test.MockKubernetesApplicationAdapterService.addCompositeComponent(compositeComponent0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation operation5 = operation3.setTransactionId("FAILURE_EXPECTED");
        com.vmware.xenon.common.Operation operation7 = operation5.setRetryCount((int) ' ');
        com.vmware.xenon.common.Operation.SerializedOperation serializedOperation8 = com.vmware.xenon.common.Operation.SerializedOperation.create(operation5);
        java.net.URI uRI9 = null;
        com.vmware.xenon.common.Operation operation10 = com.vmware.xenon.common.Operation.createGet(uRI9);
        java.lang.String str11 = operation10.getTransactionId();
        com.vmware.xenon.common.Operation operation12 = operation5.transferResponseHeadersFrom(operation10);
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation7);
        org.junit.Assert.assertNotNull(serializedOperation8);
        org.junit.Assert.assertNotNull(operation10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(operation12);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        com.vmware.xenon.common.ServiceDocumentDescription serviceDocumentDescription0 = com.vmware.xenon.common.Operation.SerializedOperation.buildDescription();
        org.junit.Assert.assertNotNull(serviceDocumentDescription0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription compositeDescription0 = new com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription();
        compositeDescription0.parentDescriptionLink = "x-xenon-tx-reflink";
        compositeDescription0.lastPublished = (-1L);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        // The following exception was thrown during execution in test generation
        try {
            com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.deserializeKubernetesEntity("name");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Error processing Kubernetes configuration YAML content: Cannot construct instance of `com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject` (although at least one Creator exists): no String-argument constructor/factory method to deserialize from String value ('name')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str1 = compositeComponent0.compositeDescriptionLink;
        com.vmware.admiral.service.kubernetes.test.MockKubernetesApplicationAdapterService.addCompositeComponent(compositeComponent0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        java.lang.String str0 = com.vmware.xenon.common.Operation.TX_ENSURE_COMMIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ensure-commit" + "'", str0, "ensure-commit");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        com.vmware.xenon.common.Operation.SerializedOperation serializedOperation0 = new com.vmware.xenon.common.Operation.SerializedOperation();
        serializedOperation0.port = (short) 100;
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.decrementRetriesRemaining();
        com.vmware.xenon.common.Operation.failActionNotSupported(operation1);
        com.vmware.xenon.common.Service.Action action6 = operation1.getAction();
        boolean boolean7 = operation1.isWithinTransaction();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + action6 + "' != '" + com.vmware.xenon.common.Service.Action.GET + "'", action6.equals(com.vmware.xenon.common.Service.Action.GET));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation7 = operation5.setRetryCount(0);
        boolean boolean8 = operation5.isSynchronize();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        int int0 = com.vmware.xenon.common.Operation.STATUS_CODE_BAD_METHOD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 405 + "'", int0 == 405);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription kubernetesDescription0 = new com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription();
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject1 = null;
        kubernetesDescription0.merge(baseKubernetesObject1);
        kubernetesDescription0.creationTimeMicros = 100L;
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject5 = null;
        kubernetesDescription0.merge(baseKubernetesObject5);
        java.lang.String str7 = kubernetesDescription0.type;
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription compositeDescription0 = new com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription();
        compositeDescription0.parentDescriptionLink = "x-xenon-tx-reflink";
        compositeDescription0.name = "*/*";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = compositeDescription0.customProperties;
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.lang.String str3 = compositeDescriptionService0.getPeerNodeSelectorPath();
        java.util.EnumSet<com.vmware.xenon.common.Service.ServiceOption> serviceOptionSet4 = compositeDescriptionService0.getOptions();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/core/node-selectors/default" + "'", str3, "/core/node-selectors/default");
        org.junit.Assert.assertNotNull(serviceOptionSet4);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        int int0 = com.vmware.xenon.common.Operation.STATUS_CODE_ACCEPTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 202 + "'", int0 == 202);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createPatch(uRI0);
        org.junit.Assert.assertNotNull(operation1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        java.util.function.Consumer<com.vmware.xenon.common.Operation> operationConsumer9 = null;
        operation5.nestCompletion(operationConsumer9);
        boolean boolean11 = operation5.isKeepAlive();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        java.lang.String str0 = com.vmware.xenon.common.Operation.SET_COOKIE_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "set-cookie" + "'", str0, "set-cookie");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler9 = null;
        com.vmware.xenon.common.Operation operation10 = operation8.nestCompletionCloneSafe(completionHandler9);
        com.vmware.xenon.common.Operation operation12 = operation8.setTransactionId("maintenanceDuration");
        com.vmware.xenon.common.Operation operation14 = operation12.setExpiration(10L);
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
        org.junit.Assert.assertNotNull(operation12);
        org.junit.Assert.assertNotNull(operation14);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.decrementRetriesRemaining();
        com.vmware.xenon.common.Operation.failActionNotSupported(operation1);
        operation1.fail((int) (byte) -1);
        java.net.URI uRI8 = operation1.getReferer();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(uRI8);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription kubernetesDescription0 = new com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription();
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject1 = null;
        kubernetesDescription0.merge(baseKubernetesObject1);
        com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription kubernetesDescription3 = new com.vmware.admiral.compute.kubernetes.service.KubernetesDescriptionService.KubernetesDescription();
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject4 = null;
        kubernetesDescription3.merge(baseKubernetesObject4);
        kubernetesDescription3.creationTimeMicros = 100L;
        com.vmware.admiral.compute.kubernetes.entities.common.BaseKubernetesObject baseKubernetesObject8 = null;
        kubernetesDescription3.merge(baseKubernetesObject8);
        kubernetesDescription0.copyTo((com.vmware.xenon.common.ServiceDocument) kubernetesDescription3);
        java.lang.String str11 = kubernetesDescription3.apiVersion;
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.getRetriesRemaining();
        com.vmware.xenon.common.Operation operation6 = operation1.setReplicationDisabled(true);
        int int7 = operation6.getRetriesRemaining();
        java.lang.String str9 = operation6.getRequestHeaderAsIs("maintenanceCount");
        com.vmware.xenon.common.Operation operation11 = operation6.setReplicationDisabled(false);
        java.lang.String str12 = operation11.getRefererAsString();
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(operation11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str1 = compositeComponent0.compositeDescriptionLink;
        java.lang.String str2 = compositeComponent0.name;
        compositeComponent0.documentSourceLink = "xn-synch-ver";
        long long5 = compositeComponent0.created;
        compositeComponent0.name = "/core/node-selectors/default";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext4 = null;
        com.vmware.xenon.common.Operation operation5 = operation1.setSocketContext(socketContext4);
        com.vmware.xenon.common.Operation operation8 = operation5.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler9 = null;
        com.vmware.xenon.common.Operation operation10 = operation8.nestCompletionCloneSafe(completionHandler9);
        com.vmware.xenon.common.Operation operation12 = operation8.setTransactionId("maintenanceDuration");
        java.net.URI uRI13 = null;
        com.vmware.xenon.common.Operation operation14 = com.vmware.xenon.common.Operation.createGet(uRI13);
        operation14.complete();
        com.vmware.xenon.common.Operation operation16 = operation14.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext17 = null;
        com.vmware.xenon.common.Operation operation18 = operation14.setSocketContext(socketContext17);
        com.vmware.xenon.common.Operation operation21 = operation18.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler22 = null;
        com.vmware.xenon.common.Operation operation23 = operation18.nestCompletionCloneSafe(completionHandler22);
        java.net.URI uRI24 = null;
        com.vmware.xenon.common.Operation operation25 = com.vmware.xenon.common.Operation.createGet(uRI24);
        operation25.complete();
        com.vmware.xenon.common.Operation operation27 = operation25.forceRemote();
        int int28 = operation25.getRetriesRemaining();
        com.vmware.xenon.common.Operation operation30 = operation25.setReplicationDisabled(true);
        com.vmware.xenon.common.Operation operation31 = operation23.transferRefererFrom(operation25);
        com.vmware.xenon.common.Operation operation32 = operation8.transferRequestHeadersToResponseHeadersFrom(operation25);
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
        org.junit.Assert.assertNotNull(operation12);
        org.junit.Assert.assertNotNull(operation14);
        org.junit.Assert.assertNotNull(operation16);
        org.junit.Assert.assertNotNull(operation18);
        org.junit.Assert.assertNotNull(operation21);
        org.junit.Assert.assertNotNull(operation23);
        org.junit.Assert.assertNotNull(operation25);
        org.junit.Assert.assertNotNull(operation27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(operation30);
        org.junit.Assert.assertNotNull(operation31);
        org.junit.Assert.assertNotNull(operation32);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation3 = operation1.forceRemote();
        int int4 = operation1.getRetriesRemaining();
        com.vmware.xenon.common.Operation operation6 = operation1.setReplicationDisabled(true);
        com.vmware.xenon.common.Service.Action action7 = null;
        com.vmware.xenon.common.Operation operation8 = operation6.setAction(action7);
        java.lang.String str10 = operation6.getAndRemoveRequestHeaderAsIs("desc");
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.net.URI uRI3 = null;
        com.vmware.xenon.common.Operation operation4 = com.vmware.xenon.common.Operation.createGet(uRI3);
        operation4.complete();
        com.vmware.xenon.common.Operation operation6 = operation4.forceRemote();
        com.vmware.xenon.common.Operation operation8 = operation6.setTransactionId("FAILURE_EXPECTED");
        com.vmware.xenon.common.Operation operation10 = operation8.setRetryCount((int) ' ');
        compositeDescriptionService0.handleDelete(operation8);
        com.vmware.xenon.common.ServiceHost serviceHost12 = compositeDescriptionService0.getHost();
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation10);
        org.junit.Assert.assertNull(serviceHost12);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost1 = null;
        compositeDescriptionService0.setHost(serviceHost1);
        java.net.URI uRI3 = null;
        com.vmware.xenon.common.Operation operation4 = com.vmware.xenon.common.Operation.createGet(uRI3);
        operation4.complete();
        com.vmware.xenon.common.Operation operation6 = operation4.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext7 = null;
        com.vmware.xenon.common.Operation operation8 = operation4.setSocketContext(socketContext7);
        com.vmware.xenon.common.Operation operation11 = operation8.addRequestHeader("content-encoding", "x-request-id");
        com.vmware.xenon.common.Operation.CompletionHandler completionHandler12 = null;
        com.vmware.xenon.common.Operation operation13 = operation8.nestCompletionCloneSafe(completionHandler12);
        java.net.URI uRI14 = null;
        com.vmware.xenon.common.Operation operation15 = com.vmware.xenon.common.Operation.createGet(uRI14);
        operation15.complete();
        com.vmware.xenon.common.Operation operation17 = operation15.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext18 = null;
        com.vmware.xenon.common.Operation operation19 = operation15.setSocketContext(socketContext18);
        com.vmware.xenon.common.Operation operation20 = operation8.transferResponseHeadersFrom(operation15);
        boolean boolean21 = operation15.isConnectionSharing();
        compositeDescriptionService0.handlePeriodicMaintenance(operation15);
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNotNull(operation8);
        org.junit.Assert.assertNotNull(operation11);
        org.junit.Assert.assertNotNull(operation13);
        org.junit.Assert.assertNotNull(operation15);
        org.junit.Assert.assertNotNull(operation17);
        org.junit.Assert.assertNotNull(operation19);
        org.junit.Assert.assertNotNull(operation20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        java.lang.String str0 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.POD_TEMPLATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PodTemplate" + "'", str0, "PodTemplate");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        java.util.function.Consumer<com.vmware.xenon.common.Operation> operationConsumer3 = null;
        com.vmware.xenon.common.Operation operation4 = operation1.setHeadersReceivedHandler(operationConsumer3);
        com.vmware.xenon.common.Operation operation6 = operation1.addPragmaDirective("xn-synch-peer");
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation4);
        org.junit.Assert.assertNotNull(operation6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.setSelfLink("WordPress_with_MySQL_kubernetes.yaml");
        com.vmware.xenon.common.ServiceHost serviceHost3 = null;
        compositeDescriptionService0.setHost(serviceHost3);
        java.net.URI uRI5 = null;
        com.vmware.xenon.common.Operation operation6 = com.vmware.xenon.common.Operation.createGet(uRI5);
        operation6.complete();
        compositeDescriptionService0.handleNodeGroupMaintenance(operation6);
        com.vmware.xenon.common.OperationProcessingChain operationProcessingChain9 = compositeDescriptionService0.getOperationProcessingChain();
        java.net.URI uRI10 = null;
        com.vmware.xenon.common.Operation operation11 = com.vmware.xenon.common.Operation.createGet(uRI10);
        operation11.complete();
        com.vmware.xenon.common.Operation operation13 = operation11.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext14 = null;
        com.vmware.xenon.common.Operation operation15 = operation11.setSocketContext(socketContext14);
        compositeDescriptionService0.handleNodeGroupMaintenance(operation15);
        org.junit.Assert.assertNotNull(operation6);
        org.junit.Assert.assertNull(operationProcessingChain9);
        org.junit.Assert.assertNotNull(operation11);
        org.junit.Assert.assertNotNull(operation13);
        org.junit.Assert.assertNotNull(operation15);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        com.vmware.admiral.compute.kubernetes.entities.deployments.Deployment deployment0 = new com.vmware.admiral.compute.kubernetes.entities.deployments.Deployment();
        com.vmware.admiral.compute.kubernetes.entities.common.ObjectMeta objectMeta1 = deployment0.metadata;
        deployment0.apiVersion = "x-http2-scheme";
        org.junit.Assert.assertNull(objectMeta1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.lang.String str0 = com.vmware.xenon.common.Operation.CONTENT_TYPE_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "content-type" + "'", str0, "content-type");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = com.vmware.admiral.compute.content.kubernetes.KubernetesUtil.parseBytes("operationHandlerProcessingLatencyMicros");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Invalid number: operationHandlerProcessingLatencyMicros");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        java.lang.String str0 = com.vmware.xenon.common.Operation.PRAGMA_DIRECTIVE_NO_FORWARDING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xn-no-fwd" + "'", str0, "xn-no-fwd");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        boolean boolean1 = com.vmware.xenon.common.ServiceDocument.isBuiltInDocumentFieldWithNullExampleValue("operationHandlerProcessingLatencyMicros");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str1 = compositeComponent0.compositeDescriptionLink;
        java.lang.String str2 = compositeComponent0.name;
        compositeComponent0.documentSourceLink = "xn-synch-ver";
        long long5 = compositeComponent0.created;
        compositeComponent0.created = '#';
        compositeComponent0.name = "documentTransactionId";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        java.net.URI uRI0 = null;
        com.vmware.xenon.common.Operation operation1 = com.vmware.xenon.common.Operation.createGet(uRI0);
        operation1.complete();
        com.vmware.xenon.common.Operation operation5 = operation1.addRequestHeader("location", "__hostLink");
        com.vmware.xenon.common.Operation.SerializedOperation serializedOperation6 = com.vmware.xenon.common.Operation.SerializedOperation.create(operation5);
        serializedOperation6.port = 403;
        int int9 = serializedOperation6.port;
        java.lang.String str10 = serializedOperation6.userInfo;
        org.junit.Assert.assertNotNull(operation1);
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(serializedOperation6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 403 + "'", int9 == 403);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        java.lang.String str1 = compositeComponent0.compositeDescriptionLink;
        java.lang.String str2 = compositeComponent0.name;
        java.lang.String str3 = compositeComponent0.compositeDescriptionLink;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService0 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        compositeDescriptionService0.adjustStat("xn-queue", (double) '#');
        java.net.URI uRI4 = null;
        com.vmware.xenon.common.Operation operation5 = com.vmware.xenon.common.Operation.createGet(uRI4);
        operation5.complete();
        com.vmware.xenon.common.Operation operation7 = operation5.forceRemote();
        compositeDescriptionService0.handleStop(operation7);
        com.vmware.admiral.compute.container.CompositeDescriptionService compositeDescriptionService9 = new com.vmware.admiral.compute.container.CompositeDescriptionService();
        com.vmware.xenon.common.ServiceHost serviceHost10 = null;
        compositeDescriptionService9.setHost(serviceHost10);
        java.net.URI uRI12 = null;
        com.vmware.xenon.common.Operation operation13 = com.vmware.xenon.common.Operation.createGet(uRI12);
        operation13.complete();
        com.vmware.xenon.common.Operation operation15 = operation13.forceRemote();
        com.vmware.xenon.common.Operation.SocketContext socketContext16 = null;
        com.vmware.xenon.common.Operation operation17 = operation13.setSocketContext(socketContext16);
        compositeDescriptionService9.handleStart(operation17);
        compositeDescriptionService0.handleStop(operation17);
        java.lang.String str20 = compositeDescriptionService0.getSelfLink();
        org.junit.Assert.assertNotNull(operation5);
        org.junit.Assert.assertNotNull(operation7);
        org.junit.Assert.assertNotNull(operation13);
        org.junit.Assert.assertNotNull(operation15);
        org.junit.Assert.assertNotNull(operation17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription compositeDescription0 = new com.vmware.admiral.compute.container.CompositeDescriptionService.CompositeDescription();
        java.lang.String str1 = compositeDescription0.name;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        java.lang.String str0 = com.vmware.admiral.service.common.MultiTenantDocument.USERS_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/users" + "'", str0, "/users");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent compositeComponent0 = new com.vmware.admiral.compute.container.CompositeComponentService.CompositeComponent();
        compositeComponent0.name = "name";
        compositeComponent0.documentUpdateTimeMicros = (byte) 1;
        java.lang.String str5 = compositeComponent0.documentOwner;
        long long6 = compositeComponent0.documentVersion;
        com.vmware.admiral.service.kubernetes.test.MockKubernetesApplicationAdapterService.addCompositeComponent(compositeComponent0);
        java.net.URI uRI8 = null;
        com.vmware.xenon.common.Operation operation9 = com.vmware.xenon.common.Operation.createGet(uRI8);
        operation9.complete();
        com.vmware.xenon.common.Operation operation13 = operation9.addRequestHeader("location", "__hostLink");
        com.vmware.xenon.common.Operation.SerializedOperation serializedOperation14 = com.vmware.xenon.common.Operation.SerializedOperation.create(operation13);
        serializedOperation14.port = 403;
        int int17 = serializedOperation14.port;
        compositeComponent0.copyTo((com.vmware.xenon.common.ServiceDocument) serializedOperation14);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(operation9);
        org.junit.Assert.assertNotNull(operation13);
        org.junit.Assert.assertNotNull(serializedOperation14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 403 + "'", int17 == 403);
    }
}
