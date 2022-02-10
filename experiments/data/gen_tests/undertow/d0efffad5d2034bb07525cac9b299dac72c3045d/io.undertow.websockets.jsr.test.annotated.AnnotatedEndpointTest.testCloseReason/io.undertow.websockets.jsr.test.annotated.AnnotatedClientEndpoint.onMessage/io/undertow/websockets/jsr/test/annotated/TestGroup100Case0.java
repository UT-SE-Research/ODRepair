package io.undertow.websockets.jsr.test.annotated;

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
        java.lang.String str0 = io.undertow.websockets.jsr.test.annotated.AnnotatedClientEndpoint.message();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test2");
        io.undertow.websockets.jsr.test.annotated.AnnotatedClientEndpoint.reset();
    }
}

