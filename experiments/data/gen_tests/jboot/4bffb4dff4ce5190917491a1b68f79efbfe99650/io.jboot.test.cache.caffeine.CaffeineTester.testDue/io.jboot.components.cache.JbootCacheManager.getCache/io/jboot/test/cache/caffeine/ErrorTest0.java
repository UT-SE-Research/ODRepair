package io.jboot.test.cache.caffeine;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache22 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache22 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache20 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache24 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache20 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache20 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache20 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache22 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache24 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("key");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache22 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache24 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache22 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache22 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache20 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache22 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache18 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("caffeine");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache16 = jbootCacheManager0.getCache("hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("redis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("redis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("value:");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("ehredis");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("none");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache10 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache12 = jbootCacheManager0.getCache("ehredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache14 = jbootCacheManager0.getCache("value~~~~~~~");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("jboot.cache.type");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caffeine");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("cachename");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("ehcache");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("none");
        io.jboot.components.cache.JbootCache jbootCache6 = jbootCacheManager0.getCache("j2cache");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache8 = jbootCacheManager0.getCache("value~~~~~~~");
    }
}

