package org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet;

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
        org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests cloudFoundryMvcWebEndpointIntegrationTests0 = new org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryMvcWebEndpointIntegrationTests();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        cloudFoundryMvcWebEndpointIntegrationTests0.linksToOtherEndpointsWithRestrictedAccess();
    }
}

