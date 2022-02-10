package io.jboot.test.cache.caffeine;

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
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehredis");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehcache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehcache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caffeine");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caffeine");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caredis");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("j2cache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("j2cache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caffeine");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("j2cache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("caredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
        org.junit.Assert.assertNotNull(jbootCache18);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("caredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehcache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache20 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
        org.junit.Assert.assertNotNull(jbootCache18);
        org.junit.Assert.assertNotNull(jbootCache20);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache20 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache22 = jbootCacheManager0.getCache("none");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
        org.junit.Assert.assertNotNull(jbootCache18);
        org.junit.Assert.assertNotNull(jbootCache20);
        org.junit.Assert.assertNotNull(jbootCache22);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehcache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("none");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
        org.junit.Assert.assertNotNull(jbootCache18);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
        org.junit.Assert.assertNotNull(jbootCache18);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("j2cache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("caffeine");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache20 = jbootCacheManager0.getCache("ehredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
        org.junit.Assert.assertNotNull(jbootCache18);
        org.junit.Assert.assertNotNull(jbootCache20);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("caffeine");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
        org.junit.Assert.assertNotNull(jbootCache18);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
        org.junit.Assert.assertNotNull(jbootCache18);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache20 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache22 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache24 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache26 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
        org.junit.Assert.assertNotNull(jbootCache18);
        org.junit.Assert.assertNotNull(jbootCache20);
        org.junit.Assert.assertNotNull(jbootCache22);
        org.junit.Assert.assertNotNull(jbootCache24);
        org.junit.Assert.assertNotNull(jbootCache26);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache20 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
        org.junit.Assert.assertNotNull(jbootCache18);
        org.junit.Assert.assertNotNull(jbootCache20);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
        org.junit.Assert.assertNotNull(jbootCache18);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("caredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("none");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("caredis");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache20 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
        org.junit.Assert.assertNotNull(jbootCache18);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("redis");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("redis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehredis");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type must not be null or blank.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caredis");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("ehcache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
        org.junit.Assert.assertNotNull(jbootCache16);
        org.junit.Assert.assertNotNull(jbootCache18);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
        org.junit.Assert.assertNotNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootCache12);
        org.junit.Assert.assertNotNull(jbootCache14);
    }
}

