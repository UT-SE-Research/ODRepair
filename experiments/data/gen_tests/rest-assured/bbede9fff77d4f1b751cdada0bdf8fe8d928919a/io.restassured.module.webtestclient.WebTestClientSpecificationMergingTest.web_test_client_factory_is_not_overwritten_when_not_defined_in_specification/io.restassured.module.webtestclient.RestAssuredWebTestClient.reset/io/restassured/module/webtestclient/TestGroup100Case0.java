package io.restassured.module.webtestclient;

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
        io.restassured.module.webtestclient.specification.WebTestClientRequestSpecification webTestClientRequestSpecification0 = io.restassured.module.webtestclient.RestAssuredWebTestClient.given();
        org.junit.Assert.assertNotNull(webTestClientRequestSpecification0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test2");
        io.restassured.module.webtestclient.RestAssuredWebTestClient.reset();
    }
}

