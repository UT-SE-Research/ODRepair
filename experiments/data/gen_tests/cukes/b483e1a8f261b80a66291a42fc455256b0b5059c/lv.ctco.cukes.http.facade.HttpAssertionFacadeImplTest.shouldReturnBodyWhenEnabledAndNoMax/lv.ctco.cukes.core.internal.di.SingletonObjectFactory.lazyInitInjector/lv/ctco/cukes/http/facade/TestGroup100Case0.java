package lv.ctco.cukes.http.facade;

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
        lv.ctco.cukes.core.internal.di.SingletonObjectFactory singletonObjectFactory0 = lv.ctco.cukes.core.internal.di.SingletonObjectFactory.instance();
        com.google.inject.Module module1 = null;
        // The following exception was thrown during execution in test generation
        try {
            singletonObjectFactory0.addModule(module1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(singletonObjectFactory0);
    }
}

