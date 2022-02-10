package io.jboot.test.cache.caffeine;

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
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("type must not be null or blank.");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int5 = jbootEhredisCacheImpl0.getTtl("", (java.lang.Object) 1L);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        jbootEhcacheImpl3.removeAll("value~~~~~~~");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        net.sf.ehcache.Cache cache7 = jbootEhcacheImpl3.getOrAddCache("");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("jboot_ehredis_channel");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl0 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl();
        io.jboot.components.cache.JbootCacheManager jbootCacheManager2 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager2.getCache("caredis");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        jbootEhcacheImpl0.setTtl("", (java.lang.Object) "caredis", 100);
    }
}

