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
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable5 = jbootEhredisCacheImpl0.get("ehredis", (java.lang.Object) "jboot.cache.type", iDataLoader3, 0);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhcacheImpl1.put("", (java.lang.Object) 0, (java.lang.Object) "redis", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.put("", (java.lang.Object) (byte) 1, (java.lang.Object) 10.0d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        net.sf.ehcache.Ehcache ehcache1 = null;
        net.sf.ehcache.Element element2 = null;
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.notifyElementExpired(ehcache1, element2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int4 = jbootEhcacheImpl1.getTtl("redis", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.put("value~~~~~~~", (java.lang.Object) 1.0f, (java.lang.Object) "redis");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str0 = io.jboot.components.cache.JbootCacheConfig.TYPE_REDIS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "redis" + "'", str0, "redis");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.refresh("ehredis", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.removeAll("none");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.put("j2cache", (java.lang.Object) (short) 0, obj3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.put("j2cache", (java.lang.Object) 100.0f, obj3, 0);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhcacheImpl1.put("", (java.lang.Object) 'a', (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.removeAll("value~~~~~~~");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = io.jboot.components.cache.JbootCacheConfig.TYPE_CAREDIS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "caredis" + "'", str0, "caredis");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.String str0 = io.jboot.components.cache.JbootCacheConfig.TYPE_CAFFEINE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "caffeine" + "'", str0, "caffeine");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jbootEhredisCacheImpl0.get("caffeine", (java.lang.Object) (byte) 100, iDataLoader6);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl1.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list4 = jbootEhredisCacheImpl2.getNames();
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str0 = io.jboot.components.cache.JbootCacheConfig.TYPE_NONE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "none" + "'", str0, "none");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        net.sf.ehcache.CacheManager cacheManager3 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl4 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager3);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl5 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl4.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl5);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = jbootEhcacheImpl1.get("value~~~~~~~", (java.lang.Object) jbootEhredisCacheImpl5, iDataLoader7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.setTtl("ehcache", (java.lang.Object) 1.0f, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.removeAll("ehcache");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.remove("hi!", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig5 = new io.jboot.components.cache.JbootCacheConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int6 = jbootEhredisCacheImpl0.getTtl("cachename", (java.lang.Object) jbootCacheConfig5);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.refresh("type must not be null or blank.", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jbootRedisCacheImpl0.get("value", (java.lang.Object) "j2cache", iDataLoader3, 100);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = jbootCaredisCacheImpl0.get("caredis", (java.lang.Object) 1, iDataLoader3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list2 = jbootEhcacheImpl1.getNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl3 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl3.getRedisCacheImpl();
        jbootEhredisCacheImpl3.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl6 = jbootEhredisCacheImpl3.getEhcacheImpl();
        jbootEhcacheImpl6.removeAll("value~~~~~~~");
        java.util.List list10 = jbootEhcacheImpl6.getKeys("value~~~~~~~");
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.put("value~~~~~~~", (java.lang.Object) (byte) 10, (java.lang.Object) "value~~~~~~~");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl6);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list2 = jbootCaredisCacheImpl0.getKeys("value~~~~~~~");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int6 = jbootEhredisCacheImpl0.getTtl("ehcache", (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.put("j2cache", (java.lang.Object) "j2cache", (java.lang.Object) "ehredis");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.remove("caffeine", (java.lang.Object) "value~~~~~~~");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = jbootEhredisCacheImpl0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: null");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.removeAll("");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig4 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str5 = jbootCacheConfig4.getAopCacheType();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.refresh("value", (java.lang.Object) str5);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "caffeine" + "'", str5, "caffeine");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable4 = jbootEhcacheImpl1.get("cachename", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.remove("hi!", obj6);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = jbootRedisCacheImpl0.get("", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig4 = new io.jboot.components.cache.JbootCacheConfig();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.onMessage("caffeine", (java.lang.Object) jbootCacheConfig4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: io.jboot.components.cache.JbootCacheConfig cannot be cast to io.jboot.components.cache.ehredis.JbootEhredisMessage");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        jbootEhcacheImpl5.removeAll("value~~~~~~~");
        java.util.List list9 = jbootEhcacheImpl5.getKeys("value~~~~~~~");
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.setTtl("type must not be null or blank.", (java.lang.Object) list9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.put("j2cache", (java.lang.Object) "none", (java.lang.Object) "key");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl4.remove("j2cache", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection6 = jbootCaredisCacheImpl0.get("cachename", (java.lang.Object) '4', iDataLoader4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list2 = j2cacheImpl0.getKeys("value");
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.refresh("value");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache2 = null;
        net.sf.ehcache.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.notifyElementExpired(ehcache2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl4.setTtl("type must not be null or blank.", (java.lang.Object) false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl3 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl3.getRedisCacheImpl();
        jbootEhredisCacheImpl3.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl6 = jbootEhredisCacheImpl3.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl7 = jbootEhredisCacheImpl3.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis8 = jbootRedisCacheImpl7.getRedis();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.refresh("value:", (java.lang.Object) jbootRedisCacheImpl7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.redis.JbootRedisCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl7);
        org.junit.Assert.assertNotNull(jbootRedis8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        net.sf.ehcache.Ehcache ehcache1 = null;
        jbootEhredisCacheImpl0.notifyRemoveAll(ehcache1);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl4 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl5 = jbootEhredisCacheImpl4.getRedisCacheImpl();
        jbootEhredisCacheImpl4.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = jbootEhredisCacheImpl4.getEhcacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection10 = jbootEhredisCacheImpl0.get("ehredis", (java.lang.Object) jbootEhredisCacheImpl4, iDataLoader8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl5);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl7 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl8 = jbootEhredisCacheImpl7.getRedisCacheImpl();
        jbootEhredisCacheImpl7.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl10 = jbootEhredisCacheImpl7.getEhcacheImpl();
        java.lang.Integer int13 = jbootEhcacheImpl10.getTtl("value:", (java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl4.put("ehredis", (java.lang.Object) 0, (java.lang.Object) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl8);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl10);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl9 = jbootEhredisCacheImpl0.get("cachename", (java.lang.Object) 1.0d, iDataLoader7, 10);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int3 = jbootRedisCacheImpl0.getTtl("ehredis", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl0.remove("jboot.cache.type", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl6 = jbootEhredisCacheImpl0.get("value", (java.lang.Object) 100.0d, iDataLoader4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.setTtl("ehcache", (java.lang.Object) 1.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig2 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str3 = jbootCacheConfig2.getAopCacheType();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable5 = noneCacheImpl0.get("type must not be null or blank.", (java.lang.Object) jbootCacheConfig2, iDataLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "caffeine" + "'", str3, "caffeine");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.String str0 = io.jboot.components.cache.JbootCacheConfig.TYPE_J2CACHE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "j2cache" + "'", str0, "j2cache");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.lang.String str0 = io.jboot.components.cache.caredis.JbootCaredisCacheImpl.DEFAULT_NOTIFY_CHANNEL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "jboot_caredis_channel" + "'", str0, "jboot_caredis_channel");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.removeAll("value~~~~~~~");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl1.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl2);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl5 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl5.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhcacheImpl1.put("value~~~~~~~", (java.lang.Object) jbootEhredisCacheImpl5, (java.lang.Object) "cachename");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl11 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl12 = jbootEhredisCacheImpl11.getRedisCacheImpl();
        jbootEhredisCacheImpl11.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl14 = jbootEhredisCacheImpl11.getEhcacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.put("ehredis", (java.lang.Object) 100, (java.lang.Object) jbootEhcacheImpl14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl12);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list3 = jbootRedisCacheImpl1.getKeys("");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl5 = jbootCaredisCacheImpl0.get("caffeine", (java.lang.Object) (short) 1, iDataLoader4);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list3 = jbootEhcacheImpl1.getKeys("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list2 = jbootCaredisCacheImpl0.getNames();
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhcacheImpl1.setTtl("jboot.cache.type", (java.lang.Object) "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.remove("value", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.setTtl("j2cache", (java.lang.Object) 1.0f, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.refresh("value:");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list1 = j2cacheImpl0.getNames();
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl1.removeAll("type must not be null or blank.");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhcacheImpl1.removeAll("key");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl3 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl3.getRedisCacheImpl();
        jbootEhredisCacheImpl3.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl6 = jbootEhredisCacheImpl3.getEhcacheImpl();
        jbootEhcacheImpl6.removeAll("value~~~~~~~");
        java.util.List list10 = jbootEhcacheImpl6.getKeys("value~~~~~~~");
        java.util.List list12 = jbootEhcacheImpl6.getKeys("ehredis");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = jbootCaredisCacheImpl0.get("jboot.cache.type", (java.lang.Object) "ehredis");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl6);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.removeAll("");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl5 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        caffeineCacheImpl0.put("", (java.lang.Object) noneCacheImpl5, (java.lang.Object) jbootEhcacheImpl7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = jbootEhcacheImpl7.getNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.lang.String str0 = io.jboot.components.cache.ehredis.JbootEhredisCacheImpl.DEFAULT_NOTIFY_CHANNEL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "jboot_ehredis_channel" + "'", str0, "jboot_ehredis_channel");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.removeAll("key");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl3 = jbootRedisCacheImpl0.get("jboot.cache.type", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list2 = jbootRedisCacheImpl0.getKeys("none");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        net.sf.ehcache.CacheManager cacheManager5 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl6 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager5);
        net.sf.ehcache.CacheManager cacheManager7 = jbootEhcacheImpl6.getCacheManager();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = jbootEhredisCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl6, iDataLoader8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNull(cacheManager7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list3 = jbootCaredisCacheImpl0.getKeys("redis");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        jbootEhredisCacheImpl0.notifyElementPut(ehcache5, element6);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl9 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl11 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl12 = jbootEhredisCacheImpl11.getRedisCacheImpl();
        jbootEhredisCacheImpl11.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl14 = jbootEhredisCacheImpl11.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache15 = noneCacheImpl9.get("key", (java.lang.Object) jbootEhcacheImpl14);
        jbootEhcacheImpl14.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl14.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        net.sf.ehcache.event.CacheEventListener cacheEventListener25 = jbootEhcacheImpl14.getCacheEventListener();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.setTtl("key", (java.lang.Object) cacheEventListener25, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.ehredis.JbootEhredisCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl12);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl14);
        org.junit.Assert.assertNull(jbootCache15);
        org.junit.Assert.assertNotNull(cacheEventListener25);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        java.util.List list7 = noneCacheImpl0.getNames();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl9 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl10 = jbootEhredisCacheImpl9.getRedisCacheImpl();
        jbootEhredisCacheImpl9.dispose();
        net.sf.ehcache.Ehcache ehcache12 = null;
        net.sf.ehcache.Element element13 = null;
        jbootEhredisCacheImpl9.notifyElementEvicted(ehcache12, element13);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCacheBase jbootCacheBase17 = noneCacheImpl0.get("", (java.lang.Object) element13, iDataLoader15, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        jbootEhredisCacheImpl0.notifyElementPut(ehcache5, element6);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = jbootEhredisCacheImpl0.get("jboot_caredis_channel", (java.lang.Object) 10, iDataLoader10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl4 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl5 = jbootEhredisCacheImpl4.getRedisCacheImpl();
        jbootEhredisCacheImpl4.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = jbootEhredisCacheImpl4.getEhcacheImpl();
        jbootEhcacheImpl7.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager10 = jbootEhcacheImpl7.getCacheManager();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl2.setTtl("jboot_caredis_channel", (java.lang.Object) cacheManager10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl5);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl7);
        org.junit.Assert.assertNotNull(cacheManager10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable iterable4 = jbootCaredisCacheImpl0.get("value", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl1.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl2);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl5 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl5.getRedisCacheImpl();
        jbootEhredisCacheImpl5.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl8 = jbootEhredisCacheImpl5.getEhcacheImpl();
        jbootEhcacheImpl8.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager11 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl12 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager11);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl13 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl12.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl13);
        jbootEhcacheImpl8.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl13);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhcacheImpl1.setTtl("cachename", (java.lang.Object) jbootEhcacheImpl8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list3 = jbootCaredisCacheImpl0.getKeys("hi!");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl3 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl3.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis5 = jbootRedisCacheImpl4.getRedis();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.refresh("", (java.lang.Object) jbootRedisCacheImpl4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.redis.JbootRedisCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootRedis5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl2 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int5 = caffeineCacheImpl2.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl7 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager8 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl9 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager8);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl10 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl9.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl10);
        caffeineCacheImpl2.put("", (java.lang.Object) noneCacheImpl7, (java.lang.Object) jbootEhcacheImpl9);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl14 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list16 = caffeineCacheImpl14.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase17 = noneCacheImpl7.get("cachename", (java.lang.Object) list16);
        io.jboot.components.cache.JbootCacheManager jbootCacheManager19 = io.jboot.components.cache.JbootCacheManager.me();
        java.lang.String str20 = noneCacheImpl7.get("j2cache", (java.lang.Object) jbootCacheManager19);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl22 = jbootRedisCacheImpl0.get("value", (java.lang.Object) str20, iDataLoader21);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNull(jbootCacheBase17);
        org.junit.Assert.assertNotNull(jbootCacheManager19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list3 = jbootCaredisCacheImpl0.getKeys("type must not be null or blank.");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        jbootEhredisCacheImpl0.notifyElementPut(ehcache5, element6);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl9 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig11 = new io.jboot.components.cache.JbootCacheConfig();
        jbootCacheConfig11.setAopCacheType("cachename");
        caffeineCacheImpl9.setTtl("key", (java.lang.Object) "cachename", (int) '#');
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.ehcache.event.CacheEventListener cacheEventListener18 = jbootEhredisCacheImpl0.get("caredis", (java.lang.Object) "key", iDataLoader16, (-1));
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = j2cacheImpl0.getNames();
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl13 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl15 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl16 = jbootEhredisCacheImpl15.getRedisCacheImpl();
        jbootEhredisCacheImpl15.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl18 = jbootEhredisCacheImpl15.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache19 = noneCacheImpl13.get("key", (java.lang.Object) jbootEhcacheImpl18);
        jbootEhcacheImpl18.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl18.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int29 = j2cacheImpl0.getTtl("value", (java.lang.Object) jbootEhcacheImpl18);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootException; message: getTtl not support in j2cache");
        } catch (io.jboot.exception.JbootException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl16);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl18);
        org.junit.Assert.assertNull(jbootCache19);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl6 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int9 = caffeineCacheImpl6.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl11 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager12 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager12);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl13.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl14);
        caffeineCacheImpl6.put("", (java.lang.Object) noneCacheImpl11, (java.lang.Object) jbootEhcacheImpl13);
        caffeineCacheImpl0.put("jboot_ehredis_channel", (java.lang.Object) false, (java.lang.Object) noneCacheImpl11, (int) (byte) -1);
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig20 = new io.jboot.components.cache.JbootCacheConfig();
        int int21 = jbootCacheConfig20.getAopCacheLiveSeconds();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = caffeineCacheImpl0.get("j2cache", (java.lang.Object) int21, iDataLoader22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        jbootEhcacheImpl3.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        jbootEhcacheImpl3.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl12 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int15 = caffeineCacheImpl12.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl17 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager18 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl19 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager18);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl20 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl19.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl20);
        caffeineCacheImpl12.put("", (java.lang.Object) noneCacheImpl17, (java.lang.Object) jbootEhcacheImpl19);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl24 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list26 = caffeineCacheImpl24.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase27 = noneCacheImpl17.get("cachename", (java.lang.Object) list26);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl8.setTtl("j2cache", (java.lang.Object) noneCacheImpl17, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.none.NoneCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(list26);
        org.junit.Assert.assertNull(jbootCacheBase27);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl1.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl2);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl5 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl5.getRedisCacheImpl();
        jbootEhredisCacheImpl5.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl8 = jbootEhredisCacheImpl5.getEhcacheImpl();
        jbootEhcacheImpl8.removeAll("value~~~~~~~");
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl2.put("hi!", (java.lang.Object) jbootEhcacheImpl8, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.ehcache.JbootEhcacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl13 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhredisCacheImpl13.dispose();
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.put("", (java.lang.Object) jbootEhredisCacheImpl13, (java.lang.Object) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        jbootRedisCacheImpl0.refresh("redis");
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCacheManager jbootCacheManager6 = jbootRedisCacheImpl0.get("key", (java.lang.Object) '4', iDataLoader5);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl4 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl1.put("caredis", (java.lang.Object) "redis", (java.lang.Object) jbootEhredisCacheImpl4);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl6 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int9 = caffeineCacheImpl6.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl11 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager12 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager12);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl13.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl14);
        caffeineCacheImpl6.put("", (java.lang.Object) noneCacheImpl11, (java.lang.Object) jbootEhcacheImpl13);
        caffeineCacheImpl0.put("jboot_ehredis_channel", (java.lang.Object) false, (java.lang.Object) noneCacheImpl11, (int) (byte) -1);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl21 = noneCacheImpl11.get("none", (java.lang.Object) "jboot_ehredis_channel");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(noneCacheImpl21);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl1.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl2);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhcacheImpl1.removeAll("caffeine");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl3 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl5 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl5.getRedisCacheImpl();
        jbootEhredisCacheImpl5.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl8 = jbootEhredisCacheImpl5.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache9 = noneCacheImpl3.get("key", (java.lang.Object) jbootEhcacheImpl8);
        jbootEhcacheImpl8.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl8.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list20 = jbootEhcacheImpl8.getKeys("caredis");
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.put("j2cache", (java.lang.Object) "value:", (java.lang.Object) jbootEhcacheImpl8, (-1));
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl8);
        org.junit.Assert.assertNull(jbootCache9);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig3 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str4 = jbootCacheConfig3.getAopCacheType();
        jbootCacheConfig3.setAopCacheLiveSeconds((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.remove("value~~~~~~~", (java.lang.Object) jbootCacheConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.JbootCacheConfig does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "caffeine" + "'", str4, "caffeine");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        io.jboot.components.cache.JbootCacheManager jbootCacheManager3 = io.jboot.components.cache.JbootCacheManager.me();
        // The following exception was thrown during execution in test generation
        try {
            com.jfinal.plugin.activerecord.cache.ICache iCache4 = jbootEhcacheImpl1.get("jboot_ehredis_channel", (java.lang.Object) jbootCacheManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list2 = jbootRedisCacheImpl0.getKeys("cachename");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list1 = caffeineCacheImpl0.getNames();
        java.lang.Object obj3 = null;
        caffeineCacheImpl0.refresh("key", obj3);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type8 = caffeineCacheImpl0.get("jboot_caredis_channel", (java.lang.Object) "ehredis", iDataLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl5 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list7 = caffeineCacheImpl5.getKeys("");
        caffeineCacheImpl5.refresh("cachename");
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.onMessage("hi!", (java.lang.Object) "cachename");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to io.jboot.components.cache.ehredis.JbootEhredisMessage");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNull(list7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl7 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int10 = caffeineCacheImpl7.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl12 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager13 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl14 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager13);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl15 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl14.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl15);
        caffeineCacheImpl7.put("", (java.lang.Object) noneCacheImpl12, (java.lang.Object) jbootEhcacheImpl14);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl19 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list21 = caffeineCacheImpl19.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase22 = noneCacheImpl12.get("cachename", (java.lang.Object) list21);
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl4.put("jboot_ehredis_channel", (java.lang.Object) "caffeine", (java.lang.Object) noneCacheImpl12, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(list21);
        org.junit.Assert.assertNull(jbootCacheBase22);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        jbootEhcacheImpl5.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl5.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        net.sf.ehcache.event.CacheEventListener cacheEventListener16 = jbootEhcacheImpl5.getCacheEventListener();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence20 = jbootEhcacheImpl5.get("ehcache", (java.lang.Object) "caffeine", iDataLoader19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNotNull(cacheEventListener16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl5 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        caffeineCacheImpl0.put("", (java.lang.Object) noneCacheImpl5, (java.lang.Object) jbootEhcacheImpl7);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl12 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list14 = caffeineCacheImpl12.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase15 = noneCacheImpl5.get("cachename", (java.lang.Object) list14);
        io.jboot.components.cache.JbootCacheManager jbootCacheManager17 = io.jboot.components.cache.JbootCacheManager.me();
        java.lang.String str18 = noneCacheImpl5.get("j2cache", (java.lang.Object) jbootCacheManager17);
        io.jboot.components.cache.JbootCache jbootCache20 = jbootCacheManager17.getCache("none");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache22 = jbootCacheManager17.getCache("key");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(jbootCacheBase15);
        org.junit.Assert.assertNotNull(jbootCacheManager17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(jbootCache20);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl4 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int7 = caffeineCacheImpl4.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl10 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int13 = caffeineCacheImpl10.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl15 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager16 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl17 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager16);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl18 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl17.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl18);
        caffeineCacheImpl10.put("", (java.lang.Object) noneCacheImpl15, (java.lang.Object) jbootEhcacheImpl17);
        caffeineCacheImpl4.put("jboot_ehredis_channel", (java.lang.Object) false, (java.lang.Object) noneCacheImpl15, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type23 = jbootEhredisCacheImpl0.get("", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis2 = jbootRedisCacheImpl1.getRedis();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl1.removeAll("none");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedis2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl2 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootCaredisCacheImpl2.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootCaredisCacheImpl2.getRedisCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jbootRedisCacheImpl0.get("redis", (java.lang.Object) jbootRedisCacheImpl4, iDataLoader5, 100);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis2 = jbootRedisCacheImpl1.getRedis();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl4 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list5 = caffeineCacheImpl4.getNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jbootRedisCacheImpl1.get("ehredis", (java.lang.Object) caffeineCacheImpl4);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedis2);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl3.removeAll("ehcache");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis5 = jbootRedisCacheImpl4.getRedis();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl4.remove("cachename", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootRedis5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list3 = jbootCaredisCacheImpl0.getKeys("value~~~~~~~");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        net.sf.ehcache.CacheManager cacheManager3 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl4 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager3);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl5 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl4.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl5);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.put("value:", (java.lang.Object) jbootEhredisCacheImpl5, obj7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.ehredis.JbootEhredisCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        net.sf.ehcache.Ehcache ehcache1 = null;
        jbootEhredisCacheImpl0.notifyRemoveAll(ehcache1);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.setTtl("jboot_caredis_channel", (java.lang.Object) "redis", (int) '#');
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis5 = jbootRedisCacheImpl4.getRedis();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl4.removeAll("redis");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootRedis5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl4.removeAll("j2cache");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCache jbootCache7 = jbootCaredisCacheImpl0.get("j2cache", (java.lang.Object) 100.0f, iDataLoader6);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration11 = noneCacheImpl0.get("type must not be null or blank.", (java.lang.Object) 10L, iDataLoader9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        jbootEhcacheImpl3.removeAll("value~~~~~~~");
        java.util.List list7 = jbootEhcacheImpl3.getKeys("value~~~~~~~");
        java.util.List list9 = jbootEhcacheImpl3.getKeys("ehredis");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl11 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl13 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl14 = jbootEhredisCacheImpl13.getRedisCacheImpl();
        jbootEhredisCacheImpl13.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl16 = jbootEhredisCacheImpl13.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache17 = noneCacheImpl11.get("key", (java.lang.Object) jbootEhcacheImpl16);
        java.util.List list18 = noneCacheImpl11.getNames();
        noneCacheImpl11.removeAll("ehredis");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl22 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl23 = jbootEhredisCacheImpl22.getRedisCacheImpl();
        jbootEhredisCacheImpl22.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl25 = jbootEhredisCacheImpl22.getEhcacheImpl();
        java.lang.Integer int28 = jbootEhcacheImpl25.getTtl("value:", (java.lang.Object) (short) -1);
        noneCacheImpl11.put("cachename", (java.lang.Object) "value:", (java.lang.Object) 10.0d, 10);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type34 = jbootEhcacheImpl3.get("jboot_caredis_channel", (java.lang.Object) 10.0d, iDataLoader32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl14);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl16);
        org.junit.Assert.assertNull(jbootCache17);
        org.junit.Assert.assertNull(list18);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl23);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl25);
        org.junit.Assert.assertNull(int28);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        net.sf.ehcache.Ehcache ehcache3 = null;
        net.sf.ehcache.Element element4 = null;
        jbootEhredisCacheImpl0.notifyElementRemoved(ehcache3, element4);
        jbootEhredisCacheImpl0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.removeAll("cachename");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = jbootEhredisCacheImpl0.getNames();
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl13 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl14 = jbootEhredisCacheImpl13.getRedisCacheImpl();
        jbootEhredisCacheImpl13.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl16 = jbootEhredisCacheImpl13.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl17 = jbootEhredisCacheImpl13.getRedisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl18 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.put("jboot_ehredis_channel", (java.lang.Object) jbootRedisCacheImpl17, (java.lang.Object) caffeineCacheImpl18);
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl14);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl16);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl17);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        j2cacheImpl0.refresh("jboot_caredis_channel", (java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.removeAll("type must not be null or blank.");
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        jbootEhcacheImpl3.removeAll("value~~~~~~~");
        java.util.List list7 = jbootEhcacheImpl3.getKeys("value~~~~~~~");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl9 = new io.jboot.components.cache.none.NoneCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.ehcache.CacheManager cacheManager11 = jbootEhcacheImpl3.get("caffeine", (java.lang.Object) noneCacheImpl9, iDataLoader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl5 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        caffeineCacheImpl0.put("", (java.lang.Object) noneCacheImpl5, (java.lang.Object) jbootEhcacheImpl7);
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl12 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl15 = jbootEhredisCacheImpl14.getRedisCacheImpl();
        jbootEhredisCacheImpl14.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl17 = jbootEhredisCacheImpl14.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl18 = jbootEhredisCacheImpl14.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis19 = jbootRedisCacheImpl18.getRedis();
        j2cacheImpl12.refresh("key", (java.lang.Object) jbootRedisCacheImpl18);
        j2cacheImpl12.refresh("ehredis");
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence24 = caffeineCacheImpl0.get("ehcache", (java.lang.Object) "ehredis", iDataLoader23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl15);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl17);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl18);
        org.junit.Assert.assertNotNull(jbootRedis19);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl5 = new io.jboot.components.cache.none.NoneCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.refresh("value", (java.lang.Object) noneCacheImpl5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.none.NoneCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.CacheManager cacheManager4 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager4);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl6 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl5.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl6);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable9 = jbootRedisCacheImpl2.get("", (java.lang.Object) jbootEhredisCacheImpl6, iDataLoader8);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis2 = jbootRedisCacheImpl1.getRedis();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int5 = jbootRedisCacheImpl1.getTtl("jboot_ehredis_channel", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedis2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        jbootEhredisCacheImpl0.notifyElementPut(ehcache5, element6);
        net.sf.ehcache.Ehcache ehcache8 = null;
        net.sf.ehcache.Element element9 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted(ehcache8, element9);
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig12 = new io.jboot.components.cache.JbootCacheConfig();
        // The following exception was thrown during execution in test generation
        try {
            net.sf.ehcache.event.CacheEventListener cacheEventListener13 = jbootEhredisCacheImpl0.get("caffeine", (java.lang.Object) jbootCacheConfig12);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        jbootEhredisCacheImpl0.notifyElementPut(ehcache5, element6);
        net.sf.ehcache.Ehcache ehcache8 = null;
        net.sf.ehcache.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.notifyElementExpired(ehcache8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl5 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl5.getRedisCacheImpl();
        jbootEhredisCacheImpl5.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl8 = jbootEhredisCacheImpl5.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl5.getRedisCacheImpl();
        jbootEhredisCacheImpl5.dispose();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable iterable12 = jbootRedisCacheImpl3.get("value", (java.lang.Object) jbootEhredisCacheImpl5, iDataLoader11);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl8);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list1 = caffeineCacheImpl0.getNames();
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl3 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl5 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl5.getRedisCacheImpl();
        jbootEhredisCacheImpl5.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl8 = jbootEhredisCacheImpl5.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl5.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis10 = jbootRedisCacheImpl9.getRedis();
        j2cacheImpl3.refresh("key", (java.lang.Object) jbootRedisCacheImpl9);
        caffeineCacheImpl0.setTtl("caffeine", (java.lang.Object) j2cacheImpl3, (int) (short) 10);
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig15 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str16 = jbootCacheConfig15.getAopCacheType();
        jbootCacheConfig15.setAopCacheLiveSeconds((int) ' ');
        jbootCacheConfig15.setAopCacheType("value~~~~~~~");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int21 = j2cacheImpl3.getTtl("key", (java.lang.Object) jbootCacheConfig15);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootException; message: getTtl not support in j2cache");
        } catch (io.jboot.exception.JbootException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl8);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootRedis10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "caffeine" + "'", str16, "caffeine");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.String str0 = io.jboot.components.cache.JbootCacheConfig.TYPE_EHCACHE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ehcache" + "'", str0, "ehcache");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = jbootEhredisCacheImpl0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: null");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache2 = null;
        net.sf.ehcache.Element element3 = null;
        jbootEhredisCacheImpl0.notifyElementUpdated(ehcache2, element3);
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl7 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl9 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl10 = jbootEhredisCacheImpl9.getRedisCacheImpl();
        jbootEhredisCacheImpl9.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl12 = jbootEhredisCacheImpl9.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache13 = noneCacheImpl7.get("key", (java.lang.Object) jbootEhcacheImpl12);
        jbootEhcacheImpl12.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl12.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list24 = jbootEhcacheImpl12.getKeys("caredis");
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.put("jboot_caredis_channel", (java.lang.Object) list24, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl10);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl12);
        org.junit.Assert.assertNull(jbootCache13);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache2 = null;
        net.sf.ehcache.Element element3 = null;
        jbootEhredisCacheImpl0.notifyElementUpdated(ehcache2, element3);
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted(ehcache5, element6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = jbootEhredisCacheImpl0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: null");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int4 = jbootCaredisCacheImpl0.getTtl("value~~~~~~~", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.removeAll("jboot.cache.type");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        jbootEhcacheImpl3.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager6 = jbootEhcacheImpl3.getCacheManager();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        java.util.List list8 = jbootEhcacheImpl7.getNames();
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(cacheManager6);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl1.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl2);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl6 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list7 = caffeineCacheImpl6.getNames();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhcacheImpl1.put("hi!", (java.lang.Object) "jboot_caredis_channel", (java.lang.Object) caffeineCacheImpl6, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl2 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int5 = caffeineCacheImpl2.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl7 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager8 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl9 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager8);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl10 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl9.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl10);
        caffeineCacheImpl2.put("", (java.lang.Object) noneCacheImpl7, (java.lang.Object) jbootEhcacheImpl9);
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl0.put("caredis", (java.lang.Object) "", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list2 = jbootCaredisCacheImpl0.getNames();
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list2 = j2cacheImpl0.getKeys("key");
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl3 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list4 = caffeineCacheImpl3.getNames();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.put("jboot.cache.type", (java.lang.Object) ' ', (java.lang.Object) list4);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.removeAll("caffeine");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig13 = new io.jboot.components.cache.JbootCacheConfig();
        int int14 = jbootCacheConfig13.getAopCacheLiveSeconds();
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.setTtl("j2cache", (java.lang.Object) int14, (int) 'a');
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootException; message: setTtl not support in j2cache");
        } catch (io.jboot.exception.JbootException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig2 = new io.jboot.components.cache.JbootCacheConfig();
        jbootCacheConfig2.setAopCacheType("cachename");
        caffeineCacheImpl0.setTtl("key", (java.lang.Object) "cachename", (int) '#');
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl10 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        java.lang.Class<?> wildcardClass11 = jbootEhredisCacheImpl8.getClass();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration14 = caffeineCacheImpl0.get("jboot_caredis_channel", (java.lang.Object) jbootEhredisCacheImpl8, iDataLoader12, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl2 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int5 = caffeineCacheImpl2.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl7 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager8 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl9 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager8);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl10 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl9.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl10);
        caffeineCacheImpl2.put("", (java.lang.Object) noneCacheImpl7, (java.lang.Object) jbootEhcacheImpl9);
        java.util.List list13 = caffeineCacheImpl2.getNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement14 = jbootCaredisCacheImpl0.get("ehredis", (java.lang.Object) caffeineCacheImpl2);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        jbootEhcacheImpl5.setTtl("type must not be null or blank.", (java.lang.Object) 10.0f, (int) (byte) 0);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        net.sf.ehcache.Ehcache ehcache1 = null;
        jbootEhredisCacheImpl0.notifyRemoveAll(ehcache1);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl4 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl5 = jbootEhredisCacheImpl4.getRedisCacheImpl();
        jbootEhredisCacheImpl4.dispose();
        net.sf.ehcache.Ehcache ehcache7 = null;
        net.sf.ehcache.Element element8 = null;
        jbootEhredisCacheImpl4.notifyElementRemoved(ehcache7, element8);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.refresh("value:", (java.lang.Object) jbootEhredisCacheImpl4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.ehredis.JbootEhredisCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        j2cacheImpl0.refresh("j2cache", (java.lang.Object) jbootEhredisCacheImpl2);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.ehcache.Cache cache13 = jbootEhredisCacheImpl2.get("value~~~~~~~", (java.lang.Object) "type must not be null or blank.", iDataLoader11, 1);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl6 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int9 = caffeineCacheImpl6.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl11 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager12 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager12);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl13.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl14);
        caffeineCacheImpl6.put("", (java.lang.Object) noneCacheImpl11, (java.lang.Object) jbootEhcacheImpl13);
        caffeineCacheImpl0.put("jboot_ehredis_channel", (java.lang.Object) false, (java.lang.Object) noneCacheImpl11, (int) (byte) -1);
        java.util.List list20 = noneCacheImpl11.getKeys("none");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl22 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl23 = jbootEhredisCacheImpl22.getRedisCacheImpl();
        jbootEhredisCacheImpl22.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl25 = jbootEhredisCacheImpl22.getEhcacheImpl();
        java.util.List list26 = jbootEhcacheImpl25.getNames();
        net.sf.ehcache.Cache cache28 = jbootEhcacheImpl25.getOrAddCache("value");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl29 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl30 = jbootEhredisCacheImpl29.getRedisCacheImpl();
        jbootEhredisCacheImpl29.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl32 = jbootEhredisCacheImpl29.getEhcacheImpl();
        java.lang.Class<?> wildcardClass33 = jbootEhredisCacheImpl29.getClass();
        noneCacheImpl11.put("jboot_caredis_channel", (java.lang.Object) "value", (java.lang.Object) jbootEhredisCacheImpl29, (int) (byte) 10);
        java.util.List list36 = noneCacheImpl11.getNames();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(list20);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl23);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(cache28);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl30);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(list36);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        jbootEhcacheImpl5.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl5.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list17 = jbootEhcacheImpl5.getKeys("caredis");
        net.sf.ehcache.CacheManager cacheManager18 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl19 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager18);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl20 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl19.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl20);
        jbootEhcacheImpl5.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl20);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl24 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl25 = jbootEhredisCacheImpl24.getRedisCacheImpl();
        jbootEhredisCacheImpl24.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl27 = jbootEhredisCacheImpl24.getEhcacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl20.onMessage("ehredis", (java.lang.Object) jbootEhredisCacheImpl24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: io.jboot.components.cache.ehredis.JbootEhredisCacheImpl cannot be cast to io.jboot.components.cache.ehredis.JbootEhredisMessage");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl25);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl27);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        java.lang.Object obj2 = null;
        noneCacheImpl0.setTtl("value:", obj2, (int) '#');
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl6 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl7 = jbootCaredisCacheImpl6.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl8 = jbootCaredisCacheImpl6.getRedisCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.ehcache.terracotta.InternalEhcache internalEhcache11 = noneCacheImpl0.get("jboot_ehredis_channel", (java.lang.Object) jbootCaredisCacheImpl6, iDataLoader9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig3 = new io.jboot.components.cache.JbootCacheConfig();
        int int4 = jbootCacheConfig3.getAopCacheLiveSeconds();
        java.lang.String str5 = jbootCacheConfig3.getType();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.refresh("jboot.cache.type", (java.lang.Object) jbootCacheConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.JbootCacheConfig does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "caffeine" + "'", str5, "caffeine");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        java.lang.Integer int6 = jbootEhcacheImpl3.getTtl("value:", (java.lang.Object) (short) -1);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        jbootEhredisCacheImpl8.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl11 = jbootEhredisCacheImpl8.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl12 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache13 = null;
        net.sf.ehcache.Element element14 = null;
        jbootEhredisCacheImpl8.notifyElementPut(ehcache13, element14);
        net.sf.ehcache.Ehcache ehcache16 = null;
        net.sf.ehcache.Element element17 = null;
        jbootEhredisCacheImpl8.notifyElementEvicted(ehcache16, element17);
        jbootEhcacheImpl3.setTtl("jboot.cache.type", (java.lang.Object) element17, 1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl11);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl12);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl3 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int6 = caffeineCacheImpl3.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl3.removeAll("j2cache");
        java.util.List list9 = caffeineCacheImpl3.getNames();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.onMessage("caffeine", (java.lang.Object) list9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.ArrayList cannot be cast to io.jboot.components.cache.ehredis.JbootEhredisMessage");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl8 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list9 = caffeineCacheImpl8.getNames();
        java.lang.Object obj11 = null;
        caffeineCacheImpl8.refresh("key", obj11);
        noneCacheImpl0.setTtl("value:", (java.lang.Object) caffeineCacheImpl8, (int) '#');
        java.util.List list15 = caffeineCacheImpl8.getNames();
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl8 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl10 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl11 = jbootEhredisCacheImpl10.getRedisCacheImpl();
        jbootEhredisCacheImpl10.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = jbootEhredisCacheImpl10.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache14 = noneCacheImpl8.get("key", (java.lang.Object) jbootEhcacheImpl13);
        jbootEhcacheImpl13.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl13.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        net.sf.ehcache.event.CacheEventListener cacheEventListener24 = jbootEhcacheImpl13.getCacheEventListener();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable26 = noneCacheImpl0.get("hi!", (java.lang.Object) jbootEhcacheImpl13, iDataLoader25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl11);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl13);
        org.junit.Assert.assertNull(jbootCache14);
        org.junit.Assert.assertNotNull(cacheEventListener24);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        jbootEhredisCacheImpl8.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl11 = jbootEhredisCacheImpl8.getEhcacheImpl();
        java.lang.Class<?> wildcardClass12 = jbootEhredisCacheImpl8.getClass();
        noneCacheImpl0.setTtl("key", (java.lang.Object) wildcardClass12, (int) (byte) -1);
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig16 = new io.jboot.components.cache.JbootCacheConfig();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = noneCacheImpl0.get("value~~~~~~~", (java.lang.Object) jbootCacheConfig16, iDataLoader17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration13 = j2cacheImpl0.get("none", (java.lang.Object) '#', iDataLoader11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis2 = jbootRedisCacheImpl1.getRedis();
        io.jboot.support.redis.JbootRedis jbootRedis3 = jbootRedisCacheImpl1.getRedis();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl5 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl5.getRedisCacheImpl();
        jbootEhredisCacheImpl5.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl8 = jbootEhredisCacheImpl5.getEhcacheImpl();
        java.util.List list9 = jbootEhcacheImpl8.getNames();
        net.sf.ehcache.Cache cache11 = jbootEhcacheImpl8.getOrAddCache("value");
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl1.put("caredis", (java.lang.Object) jbootEhcacheImpl8, (java.lang.Object) true, (-1));
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedis2);
        org.junit.Assert.assertNotNull(jbootRedis3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(cache11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.setTtl("value~~~~~~~", (java.lang.Object) (-1.0d), (int) ' ');
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootException; message: setTtl not support in j2cache");
        } catch (io.jboot.exception.JbootException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        j2cacheImpl0.refresh("jboot_caredis_channel", (java.lang.Object) "");
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type19 = j2cacheImpl0.get("ehcache", (java.lang.Object) ' ', iDataLoader17, (int) '4');
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis2 = jbootRedisCacheImpl1.getRedis();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list4 = jbootRedisCacheImpl1.getKeys("type must not be null or blank.");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedis2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl6 = jbootEhredisCacheImpl0.get("ehredis", (java.lang.Object) "caredis", iDataLoader5);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        j2cacheImpl0.refresh("jboot_caredis_channel", (java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.removeAll("value~~~~~~~");
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig3 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str4 = jbootCacheConfig3.getAopCacheType();
        jbootCacheConfig3.setAopCacheLiveSeconds((int) ' ');
        jbootCacheConfig3.setType("cachename");
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.put("caredis", (java.lang.Object) jbootCacheConfig3, (java.lang.Object) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.JbootCacheConfig does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "caffeine" + "'", str4, "caffeine");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl6 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int9 = caffeineCacheImpl6.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl11 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager12 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager12);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl13.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl14);
        caffeineCacheImpl6.put("", (java.lang.Object) noneCacheImpl11, (java.lang.Object) jbootEhcacheImpl13);
        caffeineCacheImpl0.put("jboot_ehredis_channel", (java.lang.Object) false, (java.lang.Object) noneCacheImpl11, (int) (byte) -1);
        java.lang.Integer int21 = noneCacheImpl11.getTtl("ehredis", (java.lang.Object) "redis");
        noneCacheImpl11.removeAll("ehredis");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl25 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list26 = caffeineCacheImpl25.getNames();
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl28 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl30 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl31 = jbootEhredisCacheImpl30.getRedisCacheImpl();
        jbootEhredisCacheImpl30.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl33 = jbootEhredisCacheImpl30.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl34 = jbootEhredisCacheImpl30.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis35 = jbootRedisCacheImpl34.getRedis();
        j2cacheImpl28.refresh("key", (java.lang.Object) jbootRedisCacheImpl34);
        caffeineCacheImpl25.setTtl("caffeine", (java.lang.Object) j2cacheImpl28, (int) (short) 10);
        java.lang.Object obj40 = null;
        java.lang.Integer int41 = caffeineCacheImpl25.getTtl("key", obj40);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader42 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl44 = noneCacheImpl11.get("", (java.lang.Object) caffeineCacheImpl25, iDataLoader42, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl31);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl33);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl34);
        org.junit.Assert.assertNotNull(jbootRedis35);
        org.junit.Assert.assertNull(int41);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl5 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        caffeineCacheImpl0.put("", (java.lang.Object) noneCacheImpl5, (java.lang.Object) jbootEhcacheImpl7);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl12 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list14 = caffeineCacheImpl12.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase15 = noneCacheImpl5.get("cachename", (java.lang.Object) list14);
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl18 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl();
        noneCacheImpl5.put("j2cache", (java.lang.Object) 1.0d, (java.lang.Object) jbootEhcacheImpl18);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(jbootCacheBase15);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        net.sf.ehcache.Ehcache ehcache1 = null;
        jbootEhredisCacheImpl0.notifyRemoveAll(ehcache1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int5 = jbootEhredisCacheImpl0.getTtl("jboot_ehredis_channel", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        j2cacheImpl0.refresh("j2cache", (java.lang.Object) jbootEhredisCacheImpl2);
        io.jboot.components.cache.JbootCacheManager jbootCacheManager10 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache11 = jbootCacheManager10.getCache();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl2.put("jboot_ehredis_channel", (java.lang.Object) jbootCache11, (java.lang.Object) 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.caffeine.CaffeineCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootCacheManager10);
        org.junit.Assert.assertNotNull(jbootCache11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        j2cacheImpl0.refresh("jboot_caredis_channel", (java.lang.Object) "");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl16 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list17 = caffeineCacheImpl16.getNames();
        java.lang.Object obj19 = null;
        caffeineCacheImpl16.refresh("key", obj19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int21 = j2cacheImpl0.getTtl("key", obj19);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootException; message: getTtl not support in j2cache");
        } catch (io.jboot.exception.JbootException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig0 = new io.jboot.components.cache.JbootCacheConfig();
        int int1 = jbootCacheConfig0.getAopCacheLiveSeconds();
        java.lang.String str2 = jbootCacheConfig0.getType();
        java.lang.String str3 = jbootCacheConfig0.getType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "caffeine" + "'", str2, "caffeine");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "caffeine" + "'", str3, "caffeine");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list1 = caffeineCacheImpl0.getNames();
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl3 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl5 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl5.getRedisCacheImpl();
        jbootEhredisCacheImpl5.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl8 = jbootEhredisCacheImpl5.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl5.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis10 = jbootRedisCacheImpl9.getRedis();
        j2cacheImpl3.refresh("key", (java.lang.Object) jbootRedisCacheImpl9);
        caffeineCacheImpl0.setTtl("caffeine", (java.lang.Object) j2cacheImpl3, (int) (short) 10);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl15 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl16 = jbootEhredisCacheImpl15.getRedisCacheImpl();
        jbootEhredisCacheImpl15.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl18 = jbootEhredisCacheImpl15.getEhcacheImpl();
        jbootEhcacheImpl18.removeAll("value~~~~~~~");
        java.util.List list22 = jbootEhcacheImpl18.getKeys("value~~~~~~~");
        java.util.List list24 = jbootEhcacheImpl18.getKeys("ehredis");
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl3.setTtl("none", (java.lang.Object) jbootEhcacheImpl18, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootException; message: setTtl not support in j2cache");
        } catch (io.jboot.exception.JbootException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl8);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootRedis10);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl16);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl18);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        net.sf.ehcache.CacheManager cacheManager2 = jbootEhcacheImpl1.getCacheManager();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list3 = jbootEhcacheImpl1.getNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(cacheManager2);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("value:");
        caffeineCacheImpl0.removeAll("redis");
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl6 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int9 = caffeineCacheImpl6.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl11 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager12 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager12);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl13.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl14);
        caffeineCacheImpl6.put("", (java.lang.Object) noneCacheImpl11, (java.lang.Object) jbootEhcacheImpl13);
        caffeineCacheImpl0.put("jboot_ehredis_channel", (java.lang.Object) false, (java.lang.Object) noneCacheImpl11, (int) (byte) -1);
        java.util.List list20 = noneCacheImpl11.getKeys("none");
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader23 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.support.redis.JbootRedis jbootRedis24 = noneCacheImpl11.get("ehredis", (java.lang.Object) true, iDataLoader23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(list20);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl13 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl14 = jbootCaredisCacheImpl13.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl15 = jbootCaredisCacheImpl13.getRedisCacheImpl();
        j2cacheImpl0.refresh("none", (java.lang.Object) jbootRedisCacheImpl15);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl18 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl19 = jbootEhredisCacheImpl18.getRedisCacheImpl();
        jbootEhredisCacheImpl18.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl21 = jbootEhredisCacheImpl18.getEhcacheImpl();
        jbootEhcacheImpl21.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager24 = jbootEhcacheImpl21.getCacheManager();
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.remove("type must not be null or blank.", (java.lang.Object) jbootEhcacheImpl21);
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl14);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl15);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl19);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl21);
        org.junit.Assert.assertNotNull(cacheManager24);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl2 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl4 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl5 = jbootEhredisCacheImpl4.getRedisCacheImpl();
        jbootEhredisCacheImpl4.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = jbootEhredisCacheImpl4.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache8 = noneCacheImpl2.get("key", (java.lang.Object) jbootEhcacheImpl7);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl10 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl11 = jbootEhredisCacheImpl10.getRedisCacheImpl();
        jbootEhredisCacheImpl10.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = jbootEhredisCacheImpl10.getEhcacheImpl();
        java.lang.Class<?> wildcardClass14 = jbootEhredisCacheImpl10.getClass();
        noneCacheImpl2.setTtl("key", (java.lang.Object) wildcardClass14, (int) (byte) -1);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl18 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl20 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl21 = jbootEhredisCacheImpl20.getRedisCacheImpl();
        jbootEhredisCacheImpl20.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl23 = jbootEhredisCacheImpl20.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache24 = noneCacheImpl18.get("key", (java.lang.Object) jbootEhcacheImpl23);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl26 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list27 = caffeineCacheImpl26.getNames();
        java.lang.Object obj29 = null;
        caffeineCacheImpl26.refresh("key", obj29);
        noneCacheImpl18.setTtl("value:", (java.lang.Object) caffeineCacheImpl26, (int) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl34 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl36 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl37 = jbootEhredisCacheImpl36.getRedisCacheImpl();
        jbootEhredisCacheImpl36.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl39 = jbootEhredisCacheImpl36.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache40 = noneCacheImpl34.get("key", (java.lang.Object) jbootEhcacheImpl39);
        jbootEhcacheImpl39.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl39.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list51 = jbootEhcacheImpl39.getKeys("caredis");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig53 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str54 = jbootCacheConfig53.getAopCacheType();
        jbootEhcacheImpl39.put("hi!", (java.lang.Object) str54, (java.lang.Object) "cachename", (int) ' ');
        noneCacheImpl18.refresh("j2cache", (java.lang.Object) jbootEhcacheImpl39);
        noneCacheImpl2.refresh("value:", (java.lang.Object) jbootEhcacheImpl39);
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.setTtl("caredis", (java.lang.Object) noneCacheImpl2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.none.NoneCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl5);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl7);
        org.junit.Assert.assertNull(jbootCache8);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl11);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl21);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl23);
        org.junit.Assert.assertNull(jbootCache24);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl37);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl39);
        org.junit.Assert.assertNull(jbootCache40);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "caffeine" + "'", str54, "caffeine");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl7 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        caffeineCacheImpl0.put("caffeine", (java.lang.Object) jbootCaredisCacheImpl7, (java.lang.Object) jbootEhredisCacheImpl8, (int) (byte) 10);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl12 = new io.jboot.components.cache.none.NoneCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl8.refresh("value:", (java.lang.Object) noneCacheImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.none.NoneCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list1 = caffeineCacheImpl0.getNames();
        java.lang.Object obj3 = null;
        caffeineCacheImpl0.refresh("key", obj3);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl6 = new io.jboot.components.cache.none.NoneCacheImpl();
        java.lang.Integer int7 = caffeineCacheImpl0.getTtl("ehcache", (java.lang.Object) noneCacheImpl6);
        net.sf.ehcache.store.StoreListener storeListener10 = caffeineCacheImpl0.get("hi!", (java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(storeListener10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        jbootEhcacheImpl5.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl5.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list17 = jbootEhcacheImpl5.getKeys("caredis");
        net.sf.ehcache.CacheManager cacheManager18 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl19 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager18);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl20 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl19.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl20);
        jbootEhcacheImpl5.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int25 = jbootEhredisCacheImpl20.getTtl("", (java.lang.Object) "key");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl5 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        caffeineCacheImpl0.put("", (java.lang.Object) noneCacheImpl5, (java.lang.Object) jbootEhcacheImpl7);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl12 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list14 = caffeineCacheImpl12.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase15 = noneCacheImpl5.get("cachename", (java.lang.Object) list14);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl18 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl19 = jbootEhredisCacheImpl18.getRedisCacheImpl();
        jbootEhredisCacheImpl18.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl21 = jbootEhredisCacheImpl18.getEhcacheImpl();
        jbootEhcacheImpl21.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager24 = jbootEhcacheImpl21.getCacheManager();
        noneCacheImpl5.put("hi!", (java.lang.Object) "value", (java.lang.Object) jbootEhcacheImpl21);
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig27 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str28 = jbootCacheConfig27.getAopCacheType();
        jbootCacheConfig27.setAopCacheLiveSeconds((int) ' ');
        jbootCacheConfig27.setType("");
        net.sf.ehcache.Ehcache ehcache33 = jbootEhcacheImpl21.get("hi!", (java.lang.Object) jbootCacheConfig27);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(jbootCacheBase15);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl19);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl21);
        org.junit.Assert.assertNotNull(cacheManager24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "caffeine" + "'", str28, "caffeine");
        org.junit.Assert.assertNull(ehcache33);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl7 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        caffeineCacheImpl0.put("caffeine", (java.lang.Object) jbootCaredisCacheImpl7, (java.lang.Object) jbootEhredisCacheImpl8, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl7.removeAll("redis");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.refresh("redis");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        net.sf.ehcache.CacheManager cacheManager2 = jbootEhcacheImpl1.getCacheManager();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl4 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl5 = jbootEhredisCacheImpl4.getRedisCacheImpl();
        jbootEhredisCacheImpl4.dispose();
        net.sf.ehcache.Ehcache ehcache7 = null;
        net.sf.ehcache.Element element8 = null;
        jbootEhredisCacheImpl4.notifyElementEvicted(ehcache7, element8);
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl10 = jbootEhredisCacheImpl4.getRedisCacheImpl();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl11 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl13 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl14 = jbootEhredisCacheImpl13.getRedisCacheImpl();
        jbootEhredisCacheImpl13.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl16 = jbootEhredisCacheImpl13.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache17 = noneCacheImpl11.get("key", (java.lang.Object) jbootEhcacheImpl16);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl19 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl20 = jbootEhredisCacheImpl19.getRedisCacheImpl();
        jbootEhredisCacheImpl19.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl22 = jbootEhredisCacheImpl19.getEhcacheImpl();
        java.lang.Class<?> wildcardClass23 = jbootEhredisCacheImpl19.getClass();
        noneCacheImpl11.setTtl("key", (java.lang.Object) wildcardClass23, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhcacheImpl1.put("", (java.lang.Object) jbootEhredisCacheImpl4, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(cacheManager2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl10);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl14);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl16);
        org.junit.Assert.assertNull(jbootCache17);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl20);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        java.util.List list7 = noneCacheImpl0.getNames();
        noneCacheImpl0.removeAll("ehredis");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl11 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list12 = caffeineCacheImpl11.getNames();
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl14 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl16 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl17 = jbootEhredisCacheImpl16.getRedisCacheImpl();
        jbootEhredisCacheImpl16.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl19 = jbootEhredisCacheImpl16.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl20 = jbootEhredisCacheImpl16.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis21 = jbootRedisCacheImpl20.getRedis();
        j2cacheImpl14.refresh("key", (java.lang.Object) jbootRedisCacheImpl20);
        caffeineCacheImpl11.setTtl("caffeine", (java.lang.Object) j2cacheImpl14, (int) (short) 10);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl26 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl27 = jbootEhredisCacheImpl26.getRedisCacheImpl();
        jbootEhredisCacheImpl26.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl29 = jbootEhredisCacheImpl26.getEhcacheImpl();
        jbootEhcacheImpl29.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager32 = jbootEhcacheImpl29.getCacheManager();
        caffeineCacheImpl11.setTtl("", (java.lang.Object) cacheManager32, (int) (byte) 0);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl35 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl36 = jbootCaredisCacheImpl35.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl37 = jbootCaredisCacheImpl35.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl38 = jbootCaredisCacheImpl35.getRedisCacheImpl();
        noneCacheImpl0.put("key", (java.lang.Object) (byte) 0, (java.lang.Object) jbootRedisCacheImpl38);
        java.lang.Class<?> wildcardClass40 = jbootRedisCacheImpl38.getClass();
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl17);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl19);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl20);
        org.junit.Assert.assertNotNull(jbootRedis21);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl27);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl29);
        org.junit.Assert.assertNotNull(cacheManager32);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl36);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl37);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl38);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl4 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list6 = caffeineCacheImpl4.getKeys("");
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.setTtl("caffeine", (java.lang.Object) "", 0);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNull(list6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig3 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str4 = jbootCacheConfig3.getAopCacheType();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.refresh("type must not be null or blank.", (java.lang.Object) jbootCacheConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.JbootCacheConfig does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "caffeine" + "'", str4, "caffeine");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager0 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache2 = jbootCacheManager0.getCache("caredis");
        io.jboot.components.cache.JbootCache jbootCache4 = jbootCacheManager0.getCache("j2cache");
        org.junit.Assert.assertNotNull(jbootCacheManager0);
        org.junit.Assert.assertNotNull(jbootCache2);
        org.junit.Assert.assertNotNull(jbootCache4);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list5 = jbootRedisCacheImpl3.getKeys("j2cache");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache2 = null;
        net.sf.ehcache.Element element3 = null;
        jbootEhredisCacheImpl0.notifyElementUpdated(ehcache2, element3);
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted(ehcache5, element6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = jbootEhredisCacheImpl0.getKeys("value:");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl7 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        caffeineCacheImpl0.put("caffeine", (java.lang.Object) jbootCaredisCacheImpl7, (java.lang.Object) jbootEhredisCacheImpl8, (int) (byte) 10);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootEhredisCacheImpl12.getRedisCacheImpl();
        jbootEhredisCacheImpl12.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl15 = jbootEhredisCacheImpl12.getEhcacheImpl();
        jbootEhcacheImpl15.removeAll("value~~~~~~~");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl19 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl20 = jbootEhredisCacheImpl19.getRedisCacheImpl();
        jbootEhredisCacheImpl19.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl22 = jbootEhredisCacheImpl19.getEhcacheImpl();
        jbootEhcacheImpl22.removeAll("value~~~~~~~");
        java.util.List list26 = jbootEhcacheImpl22.getKeys("value~~~~~~~");
        java.util.List list28 = jbootEhcacheImpl22.getKeys("ehredis");
        java.io.Serializable serializable29 = jbootEhcacheImpl15.get("type must not be null or blank.", (java.lang.Object) "ehredis");
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl7.refresh("value~~~~~~~", (java.lang.Object) serializable29);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl15);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl20);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl22);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNull(serializable29);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        jbootEhredisCacheImpl0.notifyElementPut(ehcache5, element6);
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl8 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl10 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl11 = jbootCaredisCacheImpl10.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootEhredisCacheImpl12.getRedisCacheImpl();
        jbootEhredisCacheImpl12.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl15 = jbootEhredisCacheImpl12.getEhcacheImpl();
        java.util.List list16 = jbootEhcacheImpl15.getNames();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl8.put("jboot_caredis_channel", (java.lang.Object) jbootCaredisCacheImpl10, (java.lang.Object) list16, (int) '4');
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl8);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl11);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl5 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        caffeineCacheImpl0.put("", (java.lang.Object) noneCacheImpl5, (java.lang.Object) jbootEhcacheImpl7);
        java.util.List list12 = caffeineCacheImpl0.getKeys("");
        java.util.List list14 = caffeineCacheImpl0.getKeys("value:");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl16 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl18 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl19 = jbootEhredisCacheImpl18.getRedisCacheImpl();
        jbootEhredisCacheImpl18.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl21 = jbootEhredisCacheImpl18.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache22 = noneCacheImpl16.get("key", (java.lang.Object) jbootEhcacheImpl21);
        jbootEhcacheImpl21.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl21.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        net.sf.ehcache.event.CacheEventListener cacheEventListener32 = jbootEhcacheImpl21.getCacheEventListener();
        java.util.EventListener eventListener33 = caffeineCacheImpl0.get("redis", (java.lang.Object) jbootEhcacheImpl21);
        jbootEhcacheImpl21.removeAll("ehcache");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl19);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl21);
        org.junit.Assert.assertNull(jbootCache22);
        org.junit.Assert.assertNotNull(cacheEventListener32);
        org.junit.Assert.assertNull(eventListener33);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig10 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str11 = jbootCacheConfig10.getAopCacheType();
        jbootCacheConfig10.setAopCacheLiveSeconds((int) ' ');
        jbootCacheConfig10.setType("cachename");
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCacheBase jbootCacheBase18 = j2cacheImpl0.get("value", (java.lang.Object) jbootCacheConfig10, iDataLoader16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "caffeine" + "'", str11, "caffeine");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl2 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl4 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl5 = jbootEhredisCacheImpl4.getRedisCacheImpl();
        jbootEhredisCacheImpl4.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = jbootEhredisCacheImpl4.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache8 = noneCacheImpl2.get("key", (java.lang.Object) jbootEhcacheImpl7);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl11 = jbootCaredisCacheImpl0.get("value", (java.lang.Object) jbootCache8, iDataLoader9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl5);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl7);
        org.junit.Assert.assertNull(jbootCache8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list4 = jbootCaredisCacheImpl0.getKeys("j2cache");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache2 = null;
        net.sf.ehcache.Element element3 = null;
        jbootEhredisCacheImpl0.notifyElementUpdated(ehcache2, element3);
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl6 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        jbootEhredisCacheImpl8.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl11 = jbootEhredisCacheImpl8.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl12 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis13 = jbootRedisCacheImpl12.getRedis();
        j2cacheImpl6.refresh("key", (java.lang.Object) jbootRedisCacheImpl12);
        j2cacheImpl6.refresh("ehredis");
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.remove("value~~~~~~~", (java.lang.Object) "ehredis");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl11);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl12);
        org.junit.Assert.assertNotNull(jbootRedis13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        net.sf.ehcache.Ehcache ehcache3 = null;
        net.sf.ehcache.Element element4 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted(ehcache3, element4);
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        jbootEhredisCacheImpl8.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl11 = jbootEhredisCacheImpl8.getEhcacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl6.remove("value", (java.lang.Object) jbootEhcacheImpl11);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl11);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl13 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl14 = jbootCaredisCacheImpl13.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl15 = jbootCaredisCacheImpl13.getRedisCacheImpl();
        j2cacheImpl0.refresh("none", (java.lang.Object) jbootRedisCacheImpl15);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl18 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl19 = jbootEhredisCacheImpl18.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl20 = jbootEhredisCacheImpl18.getRedisCacheImpl();
        java.lang.Class<?> wildcardClass21 = jbootEhredisCacheImpl18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl15.put("cachename", (java.lang.Object) jbootEhredisCacheImpl18, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl14);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl15);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl19);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = jbootRedisCacheImpl4.getKeys("caredis");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list2 = caffeineCacheImpl0.getKeys("");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl4 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl5 = jbootCaredisCacheImpl4.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis6 = jbootRedisCacheImpl5.getRedis();
        java.lang.Integer int7 = caffeineCacheImpl0.getTtl("jboot_ehredis_channel", (java.lang.Object) jbootRedisCacheImpl5);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl9 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl10 = jbootCaredisCacheImpl9.getCaffeineCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl5.remove("redis", (java.lang.Object) jbootCaredisCacheImpl9);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedis6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(caffeineCacheImpl10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list1 = caffeineCacheImpl0.getNames();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl3 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int6 = caffeineCacheImpl3.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl8 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager9 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl10 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager9);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl11 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl10.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl11);
        caffeineCacheImpl3.put("", (java.lang.Object) noneCacheImpl8, (java.lang.Object) jbootEhcacheImpl10);
        java.util.List list14 = caffeineCacheImpl3.getNames();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCacheConfig jbootCacheConfig16 = caffeineCacheImpl0.get("caredis", (java.lang.Object) list14, iDataLoader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl4 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int7 = caffeineCacheImpl4.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl10 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int13 = caffeineCacheImpl10.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl15 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager16 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl17 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager16);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl18 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl17.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl18);
        caffeineCacheImpl10.put("", (java.lang.Object) noneCacheImpl15, (java.lang.Object) jbootEhcacheImpl17);
        caffeineCacheImpl4.put("jboot_ehredis_channel", (java.lang.Object) false, (java.lang.Object) noneCacheImpl15, (int) (byte) -1);
        java.util.List list24 = noneCacheImpl15.getKeys("none");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl26 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl27 = jbootEhredisCacheImpl26.getRedisCacheImpl();
        jbootEhredisCacheImpl26.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl29 = jbootEhredisCacheImpl26.getEhcacheImpl();
        java.util.List list30 = jbootEhcacheImpl29.getNames();
        net.sf.ehcache.Cache cache32 = jbootEhcacheImpl29.getOrAddCache("value");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl33 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl34 = jbootEhredisCacheImpl33.getRedisCacheImpl();
        jbootEhredisCacheImpl33.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl36 = jbootEhredisCacheImpl33.getEhcacheImpl();
        java.lang.Class<?> wildcardClass37 = jbootEhredisCacheImpl33.getClass();
        noneCacheImpl15.put("jboot_caredis_channel", (java.lang.Object) "value", (java.lang.Object) jbootEhredisCacheImpl33, (int) (byte) 10);
        java.util.List list40 = noneCacheImpl15.getNames();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.put("j2cache", (java.lang.Object) 10L, (java.lang.Object) noneCacheImpl15);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(list24);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl27);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(cache32);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl34);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(list40);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        j2cacheImpl0.refresh("j2cache", (java.lang.Object) jbootEhredisCacheImpl2);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl10 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl11 = jbootEhredisCacheImpl10.getRedisCacheImpl();
        jbootEhredisCacheImpl10.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = jbootEhredisCacheImpl10.getEhcacheImpl();
        jbootEhcacheImpl13.removeAll("value~~~~~~~");
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl18 = j2cacheImpl0.get("ehcache", (java.lang.Object) "value~~~~~~~", iDataLoader16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl11);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl13);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis2 = jbootRedisCacheImpl1.getRedis();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list4 = jbootRedisCacheImpl1.getKeys("value~~~~~~~");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedis2);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.refresh("redis");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.removeAll("value~~~~~~~");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl13 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int16 = caffeineCacheImpl13.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl18 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager19 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl20 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager19);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl21 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl20.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl21);
        caffeineCacheImpl13.put("", (java.lang.Object) noneCacheImpl18, (java.lang.Object) jbootEhcacheImpl20);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl25 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list27 = caffeineCacheImpl25.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase28 = noneCacheImpl18.get("cachename", (java.lang.Object) list27);
        io.jboot.components.cache.JbootCacheManager jbootCacheManager30 = io.jboot.components.cache.JbootCacheManager.me();
        java.lang.String str31 = noneCacheImpl18.get("j2cache", (java.lang.Object) jbootCacheManager30);
        io.jboot.components.cache.JbootCache jbootCache33 = jbootCacheManager30.getCache("none");
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl34 = j2cacheImpl0.get("value:", (java.lang.Object) jbootCache33);
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(list27);
        org.junit.Assert.assertNull(jbootCacheBase28);
        org.junit.Assert.assertNotNull(jbootCacheManager30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(jbootCache33);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache2 = null;
        net.sf.ehcache.Element element3 = null;
        jbootEhredisCacheImpl0.notifyElementUpdated(ehcache2, element3);
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted(ehcache5, element6);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl9 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl11 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl12 = jbootEhredisCacheImpl11.getRedisCacheImpl();
        jbootEhredisCacheImpl11.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl14 = jbootEhredisCacheImpl11.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache15 = noneCacheImpl9.get("key", (java.lang.Object) jbootEhcacheImpl14);
        java.util.List list16 = noneCacheImpl9.getNames();
        noneCacheImpl9.removeAll("ehredis");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl20 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list21 = caffeineCacheImpl20.getNames();
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl23 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl25 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl26 = jbootEhredisCacheImpl25.getRedisCacheImpl();
        jbootEhredisCacheImpl25.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl28 = jbootEhredisCacheImpl25.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl29 = jbootEhredisCacheImpl25.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis30 = jbootRedisCacheImpl29.getRedis();
        j2cacheImpl23.refresh("key", (java.lang.Object) jbootRedisCacheImpl29);
        caffeineCacheImpl20.setTtl("caffeine", (java.lang.Object) j2cacheImpl23, (int) (short) 10);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl35 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl36 = jbootEhredisCacheImpl35.getRedisCacheImpl();
        jbootEhredisCacheImpl35.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl38 = jbootEhredisCacheImpl35.getEhcacheImpl();
        jbootEhcacheImpl38.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager41 = jbootEhcacheImpl38.getCacheManager();
        caffeineCacheImpl20.setTtl("", (java.lang.Object) cacheManager41, (int) (byte) 0);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl44 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl45 = jbootCaredisCacheImpl44.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl46 = jbootCaredisCacheImpl44.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl47 = jbootCaredisCacheImpl44.getRedisCacheImpl();
        noneCacheImpl9.put("key", (java.lang.Object) (byte) 0, (java.lang.Object) jbootRedisCacheImpl47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = jbootEhredisCacheImpl0.get("", (java.lang.Object) "key");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl12);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl14);
        org.junit.Assert.assertNull(jbootCache15);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl26);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl28);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl29);
        org.junit.Assert.assertNotNull(jbootRedis30);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl36);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl38);
        org.junit.Assert.assertNotNull(cacheManager41);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl45);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl46);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl47);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list2 = caffeineCacheImpl0.getKeys("");
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.ehcache.terracotta.InternalEhcache internalEhcache6 = caffeineCacheImpl0.get("cachename", (java.lang.Object) "key", iDataLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list2);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl6 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int9 = caffeineCacheImpl6.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl11 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager12 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager12);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl13.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl14);
        caffeineCacheImpl6.put("", (java.lang.Object) noneCacheImpl11, (java.lang.Object) jbootEhcacheImpl13);
        caffeineCacheImpl0.put("jboot_ehredis_channel", (java.lang.Object) false, (java.lang.Object) noneCacheImpl11, (int) (byte) -1);
        java.lang.Integer int21 = noneCacheImpl11.getTtl("ehredis", (java.lang.Object) "redis");
        noneCacheImpl11.removeAll("ehredis");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl25 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl27 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl28 = jbootEhredisCacheImpl27.getRedisCacheImpl();
        jbootEhredisCacheImpl27.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl30 = jbootEhredisCacheImpl27.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache31 = noneCacheImpl25.get("key", (java.lang.Object) jbootEhcacheImpl30);
        java.util.List list32 = noneCacheImpl25.getNames();
        noneCacheImpl25.removeAll("ehredis");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl36 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl37 = jbootEhredisCacheImpl36.getRedisCacheImpl();
        jbootEhredisCacheImpl36.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl39 = jbootEhredisCacheImpl36.getEhcacheImpl();
        java.lang.Integer int42 = jbootEhcacheImpl39.getTtl("value:", (java.lang.Object) (short) -1);
        noneCacheImpl25.put("cachename", (java.lang.Object) "value:", (java.lang.Object) 10.0d, 10);
        noneCacheImpl11.setTtl("value", (java.lang.Object) "cachename", 0);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl28);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl30);
        org.junit.Assert.assertNull(jbootCache31);
        org.junit.Assert.assertNull(list32);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl37);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl39);
        org.junit.Assert.assertNull(int42);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl3 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list4 = caffeineCacheImpl3.getNames();
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl6 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        jbootEhredisCacheImpl8.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl11 = jbootEhredisCacheImpl8.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl12 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis13 = jbootRedisCacheImpl12.getRedis();
        j2cacheImpl6.refresh("key", (java.lang.Object) jbootRedisCacheImpl12);
        caffeineCacheImpl3.setTtl("caffeine", (java.lang.Object) j2cacheImpl6, (int) (short) 10);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl18 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl19 = jbootEhredisCacheImpl18.getRedisCacheImpl();
        jbootEhredisCacheImpl18.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl21 = jbootEhredisCacheImpl18.getEhcacheImpl();
        jbootEhcacheImpl21.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager24 = jbootEhcacheImpl21.getCacheManager();
        caffeineCacheImpl3.setTtl("", (java.lang.Object) cacheManager24, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.setTtl("j2cache", (java.lang.Object) caffeineCacheImpl3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.caffeine.CaffeineCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl11);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl12);
        org.junit.Assert.assertNotNull(jbootRedis13);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl19);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl21);
        org.junit.Assert.assertNotNull(cacheManager24);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        jbootEhcacheImpl3.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        jbootEhcacheImpl3.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl8.setTtl("jboot_ehredis_channel", (java.lang.Object) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        jbootEhcacheImpl3.removeAll("value~~~~~~~");
        java.util.List list7 = jbootEhcacheImpl3.getKeys("value~~~~~~~");
        java.util.List list9 = jbootEhcacheImpl3.getKeys("ehredis");
        net.sf.ehcache.Cache cache11 = jbootEhcacheImpl3.getOrAddCache("caredis");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl13 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl14 = jbootEhredisCacheImpl13.getRedisCacheImpl();
        jbootEhredisCacheImpl13.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl16 = jbootEhredisCacheImpl13.getEhcacheImpl();
        java.lang.Integer int19 = jbootEhcacheImpl16.getTtl("value:", (java.lang.Object) (short) -1);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl20 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl22 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl23 = jbootEhredisCacheImpl22.getRedisCacheImpl();
        jbootEhredisCacheImpl22.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl25 = jbootEhredisCacheImpl22.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache26 = noneCacheImpl20.get("key", (java.lang.Object) jbootEhcacheImpl25);
        java.util.List list27 = noneCacheImpl20.getNames();
        noneCacheImpl20.removeAll("ehredis");
        java.util.List list30 = noneCacheImpl20.getNames();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl32 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl33 = jbootEhredisCacheImpl32.getRedisCacheImpl();
        jbootEhredisCacheImpl32.dispose();
        noneCacheImpl20.setTtl("", (java.lang.Object) jbootEhredisCacheImpl32, 0);
        java.util.List list38 = noneCacheImpl20.getKeys("jboot.cache.type");
        jbootEhcacheImpl3.put("key", (java.lang.Object) "value:", (java.lang.Object) list38);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(cache11);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl14);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl16);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl23);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl25);
        org.junit.Assert.assertNull(jbootCache26);
        org.junit.Assert.assertNull(list27);
        org.junit.Assert.assertNull(list30);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl33);
        org.junit.Assert.assertNull(list38);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl3 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl3.getRedisCacheImpl();
        jbootEhredisCacheImpl3.dispose();
        net.sf.ehcache.Ehcache ehcache6 = null;
        net.sf.ehcache.Element element7 = null;
        jbootEhredisCacheImpl3.notifyElementRemoved(ehcache6, element7);
        jbootEhredisCacheImpl3.dispose();
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl10 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl11 = jbootCaredisCacheImpl10.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl12 = jbootCaredisCacheImpl10.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootCaredisCacheImpl10.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl1.put("jboot_ehredis_channel", (java.lang.Object) jbootEhredisCacheImpl3, (java.lang.Object) jbootRedisCacheImpl13, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl11);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl12);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list2 = caffeineCacheImpl0.getKeys("");
        caffeineCacheImpl0.refresh("cachename");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl6 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        jbootEhredisCacheImpl8.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl11 = jbootEhredisCacheImpl8.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache12 = noneCacheImpl6.get("key", (java.lang.Object) jbootEhcacheImpl11);
        java.util.List list13 = noneCacheImpl6.getNames();
        noneCacheImpl6.removeAll("ehredis");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl16 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        caffeineCacheImpl0.put("j2cache", (java.lang.Object) "ehredis", (java.lang.Object) jbootRedisCacheImpl16);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl19 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int22 = caffeineCacheImpl19.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl24 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager25 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl26 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager25);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl27 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl26.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl27);
        caffeineCacheImpl19.put("", (java.lang.Object) noneCacheImpl24, (java.lang.Object) jbootEhcacheImpl26);
        java.util.List list30 = caffeineCacheImpl19.getNames();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass33 = jbootRedisCacheImpl16.get("ehcache", (java.lang.Object) list30, iDataLoader31, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(list2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl11);
        org.junit.Assert.assertNull(jbootCache12);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        java.util.List list7 = noneCacheImpl0.getNames();
        noneCacheImpl0.removeAll("ehredis");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl11 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list12 = caffeineCacheImpl11.getNames();
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl14 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl16 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl17 = jbootEhredisCacheImpl16.getRedisCacheImpl();
        jbootEhredisCacheImpl16.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl19 = jbootEhredisCacheImpl16.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl20 = jbootEhredisCacheImpl16.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis21 = jbootRedisCacheImpl20.getRedis();
        j2cacheImpl14.refresh("key", (java.lang.Object) jbootRedisCacheImpl20);
        caffeineCacheImpl11.setTtl("caffeine", (java.lang.Object) j2cacheImpl14, (int) (short) 10);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl26 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl27 = jbootEhredisCacheImpl26.getRedisCacheImpl();
        jbootEhredisCacheImpl26.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl29 = jbootEhredisCacheImpl26.getEhcacheImpl();
        jbootEhcacheImpl29.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager32 = jbootEhcacheImpl29.getCacheManager();
        caffeineCacheImpl11.setTtl("", (java.lang.Object) cacheManager32, (int) (byte) 0);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl35 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl36 = jbootCaredisCacheImpl35.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl37 = jbootCaredisCacheImpl35.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl38 = jbootCaredisCacheImpl35.getRedisCacheImpl();
        noneCacheImpl0.put("key", (java.lang.Object) (byte) 0, (java.lang.Object) jbootRedisCacheImpl38);
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl38.removeAll("type must not be null or blank.");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl17);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl19);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl20);
        org.junit.Assert.assertNotNull(jbootRedis21);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl27);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl29);
        org.junit.Assert.assertNotNull(cacheManager32);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl36);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl37);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl38);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list1 = jbootCaredisCacheImpl0.getNames();
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig0 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str1 = jbootCacheConfig0.getAopCacheType();
        jbootCacheConfig0.setAopCacheLiveSeconds((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "caffeine" + "'", str1, "caffeine");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        net.sf.ehcache.Ehcache ehcache1 = null;
        jbootEhredisCacheImpl0.notifyRemoveAll(ehcache1);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl4 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl6 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl7 = jbootEhredisCacheImpl6.getRedisCacheImpl();
        jbootEhredisCacheImpl6.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl9 = jbootEhredisCacheImpl6.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache10 = noneCacheImpl4.get("key", (java.lang.Object) jbootEhcacheImpl9);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootEhredisCacheImpl12.getRedisCacheImpl();
        jbootEhredisCacheImpl12.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl15 = jbootEhredisCacheImpl12.getEhcacheImpl();
        jbootEhcacheImpl15.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager18 = jbootEhcacheImpl15.getCacheManager();
        noneCacheImpl4.remove("j2cache", (java.lang.Object) cacheManager18);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.setTtl("value:", (java.lang.Object) "j2cache", (int) '#');
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl7);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl9);
        org.junit.Assert.assertNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl15);
        org.junit.Assert.assertNotNull(cacheManager18);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl7 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        caffeineCacheImpl0.put("caffeine", (java.lang.Object) jbootCaredisCacheImpl7, (java.lang.Object) jbootEhredisCacheImpl8, (int) (byte) 10);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl12 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list14 = caffeineCacheImpl12.getKeys("");
        caffeineCacheImpl12.removeAll("cachename");
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl8.refresh("jboot.cache.type", (java.lang.Object) caffeineCacheImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.caffeine.CaffeineCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(list14);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl13 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl14 = jbootCaredisCacheImpl13.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl15 = jbootCaredisCacheImpl13.getRedisCacheImpl();
        j2cacheImpl0.refresh("none", (java.lang.Object) jbootRedisCacheImpl15);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl18 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl19 = jbootEhredisCacheImpl18.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl20 = jbootEhredisCacheImpl18.getRedisCacheImpl();
        java.lang.Class<?> wildcardClass21 = jbootEhredisCacheImpl18.getClass();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl22 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl23 = jbootEhredisCacheImpl22.getRedisCacheImpl();
        jbootEhredisCacheImpl22.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl25 = jbootEhredisCacheImpl22.getEhcacheImpl();
        jbootEhcacheImpl25.removeAll("value~~~~~~~");
        java.util.List list29 = jbootEhcacheImpl25.getKeys("value~~~~~~~");
        java.util.List list31 = jbootEhcacheImpl25.getKeys("ehredis");
        net.sf.ehcache.Cache cache33 = jbootEhcacheImpl25.getOrAddCache("caredis");
        java.util.List list35 = jbootEhcacheImpl25.getKeys("value:");
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.put("jboot.cache.type", (java.lang.Object) jbootEhredisCacheImpl18, (java.lang.Object) list35);
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl14);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl15);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl19);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl23);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl25);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(cache33);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        net.sf.ehcache.Ehcache ehcache1 = null;
        jbootEhredisCacheImpl0.notifyRemoveAll(ehcache1);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl4 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl6 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl7 = jbootEhredisCacheImpl6.getRedisCacheImpl();
        jbootEhredisCacheImpl6.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl9 = jbootEhredisCacheImpl6.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache10 = noneCacheImpl4.get("key", (java.lang.Object) jbootEhcacheImpl9);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootEhredisCacheImpl12.getRedisCacheImpl();
        jbootEhredisCacheImpl12.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl15 = jbootEhredisCacheImpl12.getEhcacheImpl();
        java.lang.Class<?> wildcardClass16 = jbootEhredisCacheImpl12.getClass();
        noneCacheImpl4.setTtl("key", (java.lang.Object) wildcardClass16, (int) (byte) -1);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl20 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl22 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl23 = jbootEhredisCacheImpl22.getRedisCacheImpl();
        jbootEhredisCacheImpl22.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl25 = jbootEhredisCacheImpl22.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache26 = noneCacheImpl20.get("key", (java.lang.Object) jbootEhcacheImpl25);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl28 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list29 = caffeineCacheImpl28.getNames();
        java.lang.Object obj31 = null;
        caffeineCacheImpl28.refresh("key", obj31);
        noneCacheImpl20.setTtl("value:", (java.lang.Object) caffeineCacheImpl28, (int) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl36 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl38 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl39 = jbootEhredisCacheImpl38.getRedisCacheImpl();
        jbootEhredisCacheImpl38.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl41 = jbootEhredisCacheImpl38.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache42 = noneCacheImpl36.get("key", (java.lang.Object) jbootEhcacheImpl41);
        jbootEhcacheImpl41.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl41.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list53 = jbootEhcacheImpl41.getKeys("caredis");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig55 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str56 = jbootCacheConfig55.getAopCacheType();
        jbootEhcacheImpl41.put("hi!", (java.lang.Object) str56, (java.lang.Object) "cachename", (int) ' ');
        noneCacheImpl20.refresh("j2cache", (java.lang.Object) jbootEhcacheImpl41);
        noneCacheImpl4.refresh("value:", (java.lang.Object) jbootEhcacheImpl41);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.onMessage("value", (java.lang.Object) jbootEhcacheImpl41);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: io.jboot.components.cache.ehcache.JbootEhcacheImpl cannot be cast to io.jboot.components.cache.ehredis.JbootEhredisMessage");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl7);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl9);
        org.junit.Assert.assertNull(jbootCache10);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl23);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl25);
        org.junit.Assert.assertNull(jbootCache26);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl39);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl41);
        org.junit.Assert.assertNull(jbootCache42);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "caffeine" + "'", str56, "caffeine");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl5 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        caffeineCacheImpl0.put("", (java.lang.Object) noneCacheImpl5, (java.lang.Object) jbootEhcacheImpl7);
        java.util.List list12 = caffeineCacheImpl0.getKeys("");
        java.lang.Object obj14 = null;
        caffeineCacheImpl0.setTtl("jboot_ehredis_channel", obj14, (int) (byte) -1);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl5 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        caffeineCacheImpl0.put("", (java.lang.Object) noneCacheImpl5, (java.lang.Object) jbootEhcacheImpl7);
        java.util.List list11 = caffeineCacheImpl0.getNames();
        java.lang.Object obj13 = null;
        caffeineCacheImpl0.setTtl("hi!", obj13, (-1));
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl2 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list3 = caffeineCacheImpl2.getNames();
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.setTtl("value:", (java.lang.Object) caffeineCacheImpl2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootException; message: setTtl not support in j2cache");
        } catch (io.jboot.exception.JbootException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        jbootEhcacheImpl3.removeAll("value~~~~~~~");
        java.util.List list7 = jbootEhcacheImpl3.getKeys("value~~~~~~~");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl9 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl10 = jbootCaredisCacheImpl9.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis11 = jbootRedisCacheImpl10.getRedis();
        net.sf.ehcache.event.CacheEventListener cacheEventListener12 = jbootEhcacheImpl3.get("cachename", (java.lang.Object) jbootRedis11);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl10);
        org.junit.Assert.assertNotNull(jbootRedis11);
        org.junit.Assert.assertNull(cacheEventListener12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        java.lang.Integer int6 = jbootEhcacheImpl3.getTtl("value:", (java.lang.Object) (short) -1);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl8 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int11 = caffeineCacheImpl8.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl14 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int17 = caffeineCacheImpl14.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl19 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager20 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl21 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager20);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl22 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl21.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl22);
        caffeineCacheImpl14.put("", (java.lang.Object) noneCacheImpl19, (java.lang.Object) jbootEhcacheImpl21);
        caffeineCacheImpl8.put("jboot_ehredis_channel", (java.lang.Object) false, (java.lang.Object) noneCacheImpl19, (int) (byte) -1);
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl27 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl29 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl30 = jbootEhredisCacheImpl29.getRedisCacheImpl();
        jbootEhredisCacheImpl29.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl32 = jbootEhredisCacheImpl29.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl33 = jbootEhredisCacheImpl29.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis34 = jbootRedisCacheImpl33.getRedis();
        j2cacheImpl27.refresh("key", (java.lang.Object) jbootRedisCacheImpl33);
        j2cacheImpl27.refresh("ehredis");
        jbootEhcacheImpl3.put("none", (java.lang.Object) "jboot_ehredis_channel", (java.lang.Object) j2cacheImpl27);
        j2cacheImpl27.refresh("ehredis");
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl30);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl32);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl33);
        org.junit.Assert.assertNotNull(jbootRedis34);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = j2cacheImpl0.getNames();
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl7 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        caffeineCacheImpl0.put("caffeine", (java.lang.Object) jbootCaredisCacheImpl7, (java.lang.Object) jbootEhredisCacheImpl8, (int) (byte) 10);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhredisCacheImpl12.dispose();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl15 = jbootEhredisCacheImpl14.getRedisCacheImpl();
        jbootEhredisCacheImpl14.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl17 = jbootEhredisCacheImpl14.getEhcacheImpl();
        jbootEhcacheImpl17.removeAll("value~~~~~~~");
        java.util.List list21 = jbootEhcacheImpl17.getKeys("value~~~~~~~");
        java.util.List list23 = jbootEhcacheImpl17.getKeys("ehredis");
        net.sf.ehcache.Cache cache25 = jbootEhcacheImpl17.getOrAddCache("caredis");
        net.sf.ehcache.Element element26 = null;
        jbootEhredisCacheImpl12.notifyElementEvicted((net.sf.ehcache.Ehcache) cache25, element26);
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl28 = jbootEhredisCacheImpl8.get("key", (java.lang.Object) element26);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl15);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl17);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(cache25);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl8 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list9 = caffeineCacheImpl8.getNames();
        java.lang.Object obj11 = null;
        caffeineCacheImpl8.refresh("key", obj11);
        noneCacheImpl0.setTtl("value:", (java.lang.Object) caffeineCacheImpl8, (int) '#');
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl16 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl17 = jbootEhredisCacheImpl16.getRedisCacheImpl();
        jbootEhredisCacheImpl16.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl19 = jbootEhredisCacheImpl16.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl20 = jbootEhredisCacheImpl16.getRedisCacheImpl();
        caffeineCacheImpl8.setTtl("", (java.lang.Object) jbootRedisCacheImpl20, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list23 = jbootRedisCacheImpl20.getNames();
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl17);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl19);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl20);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl4 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl6 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl7 = jbootEhredisCacheImpl6.getRedisCacheImpl();
        jbootEhredisCacheImpl6.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl9 = jbootEhredisCacheImpl6.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache10 = noneCacheImpl4.get("key", (java.lang.Object) jbootEhcacheImpl9);
        jbootEhcacheImpl9.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl9.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        net.sf.ehcache.event.CacheEventListener cacheEventListener20 = jbootEhcacheImpl9.getCacheEventListener();
        java.lang.Object obj21 = null;
        jbootRedisCacheImpl2.put("jboot.cache.type", (java.lang.Object) jbootEhcacheImpl9, obj21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list24 = jbootEhcacheImpl9.getKeys("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl7);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl9);
        org.junit.Assert.assertNull(jbootCache10);
        org.junit.Assert.assertNotNull(cacheEventListener20);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl4 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list5 = caffeineCacheImpl4.getNames();
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl7 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl9 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl10 = jbootEhredisCacheImpl9.getRedisCacheImpl();
        jbootEhredisCacheImpl9.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl12 = jbootEhredisCacheImpl9.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootEhredisCacheImpl9.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis14 = jbootRedisCacheImpl13.getRedis();
        j2cacheImpl7.refresh("key", (java.lang.Object) jbootRedisCacheImpl13);
        caffeineCacheImpl4.setTtl("caffeine", (java.lang.Object) j2cacheImpl7, (int) (short) 10);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl19 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl20 = jbootEhredisCacheImpl19.getRedisCacheImpl();
        jbootEhredisCacheImpl19.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl22 = jbootEhredisCacheImpl19.getEhcacheImpl();
        jbootEhcacheImpl22.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager25 = jbootEhcacheImpl22.getCacheManager();
        caffeineCacheImpl4.setTtl("", (java.lang.Object) cacheManager25, (int) (byte) 0);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl28 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl29 = jbootCaredisCacheImpl28.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.put("", (java.lang.Object) caffeineCacheImpl4, (java.lang.Object) jbootRedisCacheImpl29, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.caffeine.CaffeineCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl10);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl12);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
        org.junit.Assert.assertNotNull(jbootRedis14);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl20);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl22);
        org.junit.Assert.assertNotNull(cacheManager25);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl29);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl3 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl3.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        jbootEhredisCacheImpl3.notifyElementUpdated(ehcache5, element6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        net.sf.ehcache.Ehcache ehcache9 = null;
        jbootEhredisCacheImpl8.notifyRemoveAll(ehcache9);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl11 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl12 = jbootEhredisCacheImpl11.getRedisCacheImpl();
        jbootEhredisCacheImpl11.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl14 = jbootEhredisCacheImpl11.getEhcacheImpl();
        jbootEhcacheImpl14.removeAll("value~~~~~~~");
        java.util.List list18 = jbootEhcacheImpl14.getKeys("value~~~~~~~");
        java.util.List list20 = jbootEhcacheImpl14.getKeys("ehredis");
        net.sf.ehcache.Cache cache22 = jbootEhcacheImpl14.getOrAddCache("caredis");
        net.sf.ehcache.Element element23 = null;
        jbootEhredisCacheImpl8.notifyElementPut((net.sf.ehcache.Ehcache) cache22, element23);
        net.sf.ehcache.Element element25 = null;
        jbootEhredisCacheImpl3.notifyElementUpdated((net.sf.ehcache.Ehcache) cache22, element25);
        net.sf.ehcache.CacheManager cacheManager27 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl28 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager27);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl29 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl28.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl29);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhcacheImpl1.put("none", (java.lang.Object) jbootEhredisCacheImpl3, (java.lang.Object) jbootEhredisCacheImpl29, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl12);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl14);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(cache22);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl2 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int5 = caffeineCacheImpl2.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl7 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager8 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl9 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager8);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl10 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl9.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl10);
        caffeineCacheImpl2.put("", (java.lang.Object) noneCacheImpl7, (java.lang.Object) jbootEhcacheImpl9);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl14 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list16 = caffeineCacheImpl14.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase17 = noneCacheImpl7.get("cachename", (java.lang.Object) list16);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl19 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl21 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl22 = jbootEhredisCacheImpl21.getRedisCacheImpl();
        jbootEhredisCacheImpl21.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl24 = jbootEhredisCacheImpl21.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache25 = noneCacheImpl19.get("key", (java.lang.Object) jbootEhcacheImpl24);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl27 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl28 = jbootEhredisCacheImpl27.getRedisCacheImpl();
        jbootEhredisCacheImpl27.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl30 = jbootEhredisCacheImpl27.getEhcacheImpl();
        java.lang.Class<?> wildcardClass31 = jbootEhredisCacheImpl27.getClass();
        noneCacheImpl19.setTtl("key", (java.lang.Object) wildcardClass31, (int) (byte) -1);
        noneCacheImpl7.setTtl("ehcache", (java.lang.Object) "key", (int) (short) -1);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl37 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl38 = jbootEhredisCacheImpl37.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache39 = null;
        net.sf.ehcache.Element element40 = null;
        jbootEhredisCacheImpl37.notifyElementUpdated(ehcache39, element40);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl42 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        net.sf.ehcache.Ehcache ehcache43 = null;
        jbootEhredisCacheImpl42.notifyRemoveAll(ehcache43);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl45 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl46 = jbootEhredisCacheImpl45.getRedisCacheImpl();
        jbootEhredisCacheImpl45.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl48 = jbootEhredisCacheImpl45.getEhcacheImpl();
        jbootEhcacheImpl48.removeAll("value~~~~~~~");
        java.util.List list52 = jbootEhcacheImpl48.getKeys("value~~~~~~~");
        java.util.List list54 = jbootEhcacheImpl48.getKeys("ehredis");
        net.sf.ehcache.Cache cache56 = jbootEhcacheImpl48.getOrAddCache("caredis");
        net.sf.ehcache.Element element57 = null;
        jbootEhredisCacheImpl42.notifyElementPut((net.sf.ehcache.Ehcache) cache56, element57);
        net.sf.ehcache.Element element59 = null;
        jbootEhredisCacheImpl37.notifyElementUpdated((net.sf.ehcache.Ehcache) cache56, element59);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl61 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl63 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl64 = jbootEhredisCacheImpl63.getRedisCacheImpl();
        jbootEhredisCacheImpl63.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl66 = jbootEhredisCacheImpl63.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache67 = noneCacheImpl61.get("key", (java.lang.Object) jbootEhcacheImpl66);
        java.util.List list68 = noneCacheImpl61.getNames();
        noneCacheImpl7.put("jboot_caredis_channel", (java.lang.Object) jbootEhredisCacheImpl37, (java.lang.Object) list68);
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.setTtl("redis", (java.lang.Object) noneCacheImpl7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootException; message: setTtl not support in j2cache");
        } catch (io.jboot.exception.JbootException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNull(jbootCacheBase17);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl22);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl24);
        org.junit.Assert.assertNull(jbootCache25);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl28);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl38);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl46);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl48);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(cache56);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl64);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl66);
        org.junit.Assert.assertNull(jbootCache67);
        org.junit.Assert.assertNull(list68);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        java.util.List list6 = caffeineCacheImpl0.getNames();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        jbootEhredisCacheImpl8.dispose();
        net.sf.ehcache.Ehcache ehcache11 = null;
        net.sf.ehcache.Element element12 = null;
        jbootEhredisCacheImpl8.notifyElementEvicted(ehcache11, element12);
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl14 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        java.lang.Integer int15 = caffeineCacheImpl0.getTtl("type must not be null or blank.", (java.lang.Object) jbootRedisCacheImpl14);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl17 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl18 = jbootEhredisCacheImpl17.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int19 = jbootRedisCacheImpl14.getTtl("caffeine", (java.lang.Object) jbootRedisCacheImpl18);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl18);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        java.util.List list7 = noneCacheImpl0.getNames();
        noneCacheImpl0.removeAll("ehredis");
        java.util.List list10 = noneCacheImpl0.getNames();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootEhredisCacheImpl12.getRedisCacheImpl();
        jbootEhredisCacheImpl12.dispose();
        noneCacheImpl0.setTtl("", (java.lang.Object) jbootEhredisCacheImpl12, 0);
        java.lang.Object obj18 = null;
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl19 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list21 = caffeineCacheImpl19.getKeys("");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl23 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl24 = jbootCaredisCacheImpl23.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis25 = jbootRedisCacheImpl24.getRedis();
        java.lang.Integer int26 = caffeineCacheImpl19.getTtl("jboot_ehredis_channel", (java.lang.Object) jbootRedisCacheImpl24);
        noneCacheImpl0.put("value", obj18, (java.lang.Object) caffeineCacheImpl19);
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl29 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader30 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.ehcache.Ehcache ehcache31 = caffeineCacheImpl19.get("hi!", (java.lang.Object) j2cacheImpl29, iDataLoader30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
        org.junit.Assert.assertNull(list21);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl24);
        org.junit.Assert.assertNotNull(jbootRedis25);
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        jbootRedisCacheImpl0.refresh("key");
        io.jboot.components.cache.JbootCacheManager jbootCacheManager4 = io.jboot.components.cache.JbootCacheManager.me();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl0.remove("jboot_ehredis_channel", (java.lang.Object) jbootCacheManager4);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootCacheManager4);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("ehredis");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = j2cacheImpl0.getKeys("");
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig0 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str1 = jbootCacheConfig0.getAopCacheType();
        jbootCacheConfig0.setAopCacheLiveSeconds((int) ' ');
        jbootCacheConfig0.setAopCacheLiveSeconds((int) (short) 100);
        java.lang.String str6 = jbootCacheConfig0.getAopCacheType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "caffeine" + "'", str1, "caffeine");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "caffeine" + "'", str6, "caffeine");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl7 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        caffeineCacheImpl0.put("caffeine", (java.lang.Object) jbootCaredisCacheImpl7, (java.lang.Object) jbootEhredisCacheImpl8, (int) (byte) 10);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhredisCacheImpl12.dispose();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl15 = jbootEhredisCacheImpl14.getRedisCacheImpl();
        jbootEhredisCacheImpl14.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl17 = jbootEhredisCacheImpl14.getEhcacheImpl();
        jbootEhcacheImpl17.removeAll("value~~~~~~~");
        java.util.List list21 = jbootEhcacheImpl17.getKeys("value~~~~~~~");
        java.util.List list23 = jbootEhcacheImpl17.getKeys("ehredis");
        net.sf.ehcache.Cache cache25 = jbootEhcacheImpl17.getOrAddCache("caredis");
        net.sf.ehcache.Element element26 = null;
        jbootEhredisCacheImpl12.notifyElementEvicted((net.sf.ehcache.Ehcache) cache25, element26);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl8.remove("j2cache", (java.lang.Object) cache25);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class net.sf.ehcache.Cache does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl15);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl17);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(cache25);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list3 = jbootEhredisCacheImpl0.getNames();
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl13 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl14 = jbootCaredisCacheImpl13.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl15 = jbootCaredisCacheImpl13.getRedisCacheImpl();
        j2cacheImpl0.refresh("none", (java.lang.Object) jbootRedisCacheImpl15);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl18 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl19 = jbootCaredisCacheImpl18.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl20 = jbootCaredisCacheImpl18.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl21 = jbootCaredisCacheImpl18.getRedisCacheImpl();
        j2cacheImpl0.refresh("value:", (java.lang.Object) jbootRedisCacheImpl21);
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.removeAll("value");
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl14);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl15);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl19);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl20);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl21);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        net.sf.ehcache.CacheManager cacheManager0 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl1 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager0);
        net.sf.ehcache.CacheManager cacheManager2 = jbootEhcacheImpl1.getCacheManager();
        // The following exception was thrown during execution in test generation
        try {
            net.sf.ehcache.Cache cache4 = jbootEhcacheImpl1.getOrAddCache("caffeine");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(cacheManager2);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = j2cacheImpl0.getKeys("ehcache");
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl7 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        caffeineCacheImpl0.put("caffeine", (java.lang.Object) jbootCaredisCacheImpl7, (java.lang.Object) jbootEhredisCacheImpl8, (int) (byte) 10);
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl7.put("key", obj12, (java.lang.Object) false, (int) '4');
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        net.sf.ehcache.Ehcache ehcache3 = null;
        net.sf.ehcache.Element element4 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted(ehcache3, element4);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl6 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl7 = jbootEhredisCacheImpl6.getRedisCacheImpl();
        jbootEhredisCacheImpl6.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl9 = jbootEhredisCacheImpl6.getEhcacheImpl();
        java.util.List list10 = jbootEhcacheImpl9.getNames();
        net.sf.ehcache.Cache cache12 = jbootEhcacheImpl9.getOrAddCache("value");
        net.sf.ehcache.Element element13 = null;
        jbootEhredisCacheImpl0.notifyElementRemoved((net.sf.ehcache.Ehcache) cache12, element13);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl7);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(cache12);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        jbootEhredisCacheImpl0.notifyElementPut(ehcache5, element6);
        net.sf.ehcache.Ehcache ehcache8 = null;
        net.sf.ehcache.Element element9 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted(ehcache8, element9);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootEhredisCacheImpl12.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl14 = jbootEhredisCacheImpl12.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int15 = jbootEhredisCacheImpl0.getTtl("value", (java.lang.Object) jbootEhredisCacheImpl12);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl14);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.removeAll("value");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl8 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list9 = caffeineCacheImpl8.getNames();
        java.lang.Object obj11 = null;
        caffeineCacheImpl8.refresh("key", obj11);
        noneCacheImpl0.setTtl("value:", (java.lang.Object) caffeineCacheImpl8, (int) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl16 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl18 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl19 = jbootEhredisCacheImpl18.getRedisCacheImpl();
        jbootEhredisCacheImpl18.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl21 = jbootEhredisCacheImpl18.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache22 = noneCacheImpl16.get("key", (java.lang.Object) jbootEhcacheImpl21);
        jbootEhcacheImpl21.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl21.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list33 = jbootEhcacheImpl21.getKeys("caredis");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig35 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str36 = jbootCacheConfig35.getAopCacheType();
        jbootEhcacheImpl21.put("hi!", (java.lang.Object) str36, (java.lang.Object) "cachename", (int) ' ');
        noneCacheImpl0.refresh("j2cache", (java.lang.Object) jbootEhcacheImpl21);
        noneCacheImpl0.put("jboot_ehredis_channel", (java.lang.Object) 100, (java.lang.Object) "jboot.cache.type");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl46 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl48 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl49 = jbootEhredisCacheImpl48.getRedisCacheImpl();
        jbootEhredisCacheImpl48.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl51 = jbootEhredisCacheImpl48.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache52 = noneCacheImpl46.get("key", (java.lang.Object) jbootEhcacheImpl51);
        java.util.List list53 = noneCacheImpl46.getNames();
        noneCacheImpl46.removeAll("ehredis");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl57 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl58 = jbootEhredisCacheImpl57.getRedisCacheImpl();
        jbootEhredisCacheImpl57.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl60 = jbootEhredisCacheImpl57.getEhcacheImpl();
        java.lang.Integer int63 = jbootEhcacheImpl60.getTtl("value:", (java.lang.Object) (short) -1);
        noneCacheImpl46.put("cachename", (java.lang.Object) "value:", (java.lang.Object) 10.0d, 10);
        java.lang.Integer int67 = noneCacheImpl0.getTtl("jboot_caredis_channel", (java.lang.Object) "cachename");
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl19);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl21);
        org.junit.Assert.assertNull(jbootCache22);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "caffeine" + "'", str36, "caffeine");
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl49);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl51);
        org.junit.Assert.assertNull(jbootCache52);
        org.junit.Assert.assertNull(list53);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl58);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl60);
        org.junit.Assert.assertNull(int63);
        org.junit.Assert.assertNull(int67);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        jbootEhcacheImpl5.removeAll("value~~~~~~~");
        java.util.List list9 = jbootEhcacheImpl5.getKeys("value~~~~~~~");
        java.util.List list11 = jbootEhcacheImpl5.getKeys("ehredis");
        net.sf.ehcache.Cache cache13 = jbootEhcacheImpl5.getOrAddCache("caredis");
        net.sf.ehcache.Element element14 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted((net.sf.ehcache.Ehcache) cache13, element14);
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl16 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl18 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl19 = jbootEhredisCacheImpl18.getRedisCacheImpl();
        jbootEhredisCacheImpl18.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl21 = jbootEhredisCacheImpl18.getEhcacheImpl();
        java.lang.Integer int24 = jbootEhcacheImpl21.getTtl("value:", (java.lang.Object) (short) -1);
        net.sf.ehcache.Cache cache26 = jbootEhcacheImpl21.getOrAddCache("caredis");
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl16.setTtl("caredis", (java.lang.Object) "caredis", (int) ' ');
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(cache13);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl16);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl19);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl21);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(cache26);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("ehredis");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = j2cacheImpl0.getNames();
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.refresh("type must not be null or blank.", (java.lang.Object) "caffeine");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl5 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        caffeineCacheImpl0.put("", (java.lang.Object) noneCacheImpl5, (java.lang.Object) jbootEhcacheImpl7);
        java.util.List list11 = caffeineCacheImpl0.getNames();
        java.util.List list12 = caffeineCacheImpl0.getNames();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        jbootEhcacheImpl5.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl5.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list17 = jbootEhcacheImpl5.getKeys("caredis");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig19 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str20 = jbootCacheConfig19.getAopCacheType();
        jbootEhcacheImpl5.put("hi!", (java.lang.Object) str20, (java.lang.Object) "cachename", (int) ' ');
        java.util.List list25 = jbootEhcacheImpl5.getKeys("value~~~~~~~");
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "caffeine" + "'", str20, "caffeine");
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl3 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl5 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list6 = caffeineCacheImpl5.getNames();
        java.lang.Object obj8 = null;
        caffeineCacheImpl5.refresh("key", obj8);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl11 = new io.jboot.components.cache.none.NoneCacheImpl();
        java.lang.Integer int12 = caffeineCacheImpl5.getTtl("ehcache", (java.lang.Object) noneCacheImpl11);
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.setTtl("j2cache", (java.lang.Object) noneCacheImpl11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.none.NoneCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(caffeineCacheImpl3);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl3 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        java.util.List list4 = caffeineCacheImpl3.getNames();
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(caffeineCacheImpl3);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list1 = caffeineCacheImpl0.getNames();
        java.lang.Object obj3 = null;
        caffeineCacheImpl0.refresh("key", obj3);
        java.util.List list6 = caffeineCacheImpl0.getKeys("");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(list6);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl3 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl5 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl5.getRedisCacheImpl();
        jbootEhredisCacheImpl5.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl8 = jbootEhredisCacheImpl5.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache9 = noneCacheImpl3.get("key", (java.lang.Object) jbootEhcacheImpl8);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl11 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list12 = caffeineCacheImpl11.getNames();
        java.lang.Object obj14 = null;
        caffeineCacheImpl11.refresh("key", obj14);
        noneCacheImpl3.setTtl("value:", (java.lang.Object) caffeineCacheImpl11, (int) '#');
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl19 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl20 = jbootEhredisCacheImpl19.getRedisCacheImpl();
        jbootEhredisCacheImpl19.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl22 = jbootEhredisCacheImpl19.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl23 = jbootEhredisCacheImpl19.getRedisCacheImpl();
        caffeineCacheImpl11.setTtl("", (java.lang.Object) jbootRedisCacheImpl23, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.remove("type must not be null or blank.", (java.lang.Object) caffeineCacheImpl11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.caffeine.CaffeineCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl8);
        org.junit.Assert.assertNull(jbootCache9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl20);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl22);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl23);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl6 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int9 = caffeineCacheImpl6.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl11 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager12 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager12);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl13.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl14);
        caffeineCacheImpl6.put("", (java.lang.Object) noneCacheImpl11, (java.lang.Object) jbootEhcacheImpl13);
        caffeineCacheImpl0.put("jboot_ehredis_channel", (java.lang.Object) false, (java.lang.Object) noneCacheImpl11, (int) (byte) -1);
        java.lang.Integer int21 = noneCacheImpl11.getTtl("ehredis", (java.lang.Object) "redis");
        noneCacheImpl11.removeAll("ehredis");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl25 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list26 = caffeineCacheImpl25.getNames();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl28 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int31 = caffeineCacheImpl28.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl33 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager34 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl35 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager34);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl36 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl35.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl36);
        caffeineCacheImpl28.put("", (java.lang.Object) noneCacheImpl33, (java.lang.Object) jbootEhcacheImpl35);
        caffeineCacheImpl25.refresh("ehcache", (java.lang.Object) noneCacheImpl33);
        java.lang.Integer int40 = noneCacheImpl11.getTtl("ehredis", (java.lang.Object) caffeineCacheImpl25);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNull(int40);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl0 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl3 = jbootEhcacheImpl0.get("type must not be null or blank.", (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNull(jbootEhredisCacheImpl3);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        java.util.List list7 = noneCacheImpl0.getNames();
        noneCacheImpl0.removeAll("ehredis");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl11 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl12 = jbootEhredisCacheImpl11.getRedisCacheImpl();
        jbootEhredisCacheImpl11.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl14 = jbootEhredisCacheImpl11.getEhcacheImpl();
        java.lang.Integer int17 = jbootEhcacheImpl14.getTtl("value:", (java.lang.Object) (short) -1);
        noneCacheImpl0.put("cachename", (java.lang.Object) "value:", (java.lang.Object) 10.0d, 10);
        java.util.List list22 = noneCacheImpl0.getKeys("none");
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl12);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl14);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(list22);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        java.util.List list6 = jbootEhcacheImpl5.getNames();
        net.sf.ehcache.Cache cache8 = jbootEhcacheImpl5.getOrAddCache("value");
        net.sf.ehcache.Element element9 = null;
        jbootEhredisCacheImpl0.notifyElementExpired((net.sf.ehcache.Ehcache) cache8, element9);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootEhredisCacheImpl12.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl14 = jbootEhredisCacheImpl12.getRedisCacheImpl();
        java.lang.Class<?> wildcardClass15 = jbootEhredisCacheImpl12.getClass();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = jbootEhredisCacheImpl0.get("caredis", (java.lang.Object) jbootEhredisCacheImpl12, iDataLoader16);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(cache8);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        jbootRedisCacheImpl0.refresh("key");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list4 = jbootRedisCacheImpl0.getKeys("caredis");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl4 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int7 = caffeineCacheImpl4.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl9 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager10 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl11 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager10);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl11.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl12);
        caffeineCacheImpl4.put("", (java.lang.Object) noneCacheImpl9, (java.lang.Object) jbootEhcacheImpl11);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl16 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list18 = caffeineCacheImpl16.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase19 = noneCacheImpl9.get("cachename", (java.lang.Object) list18);
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.refresh("", (java.lang.Object) "cachename");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(list18);
        org.junit.Assert.assertNull(jbootCacheBase19);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list1 = jbootRedisCacheImpl0.getNames();
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl8 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list9 = caffeineCacheImpl8.getNames();
        java.lang.Object obj11 = null;
        caffeineCacheImpl8.refresh("key", obj11);
        noneCacheImpl0.setTtl("value:", (java.lang.Object) caffeineCacheImpl8, (int) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl16 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl18 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl19 = jbootEhredisCacheImpl18.getRedisCacheImpl();
        jbootEhredisCacheImpl18.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl21 = jbootEhredisCacheImpl18.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache22 = noneCacheImpl16.get("key", (java.lang.Object) jbootEhcacheImpl21);
        jbootEhcacheImpl21.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl21.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list33 = jbootEhcacheImpl21.getKeys("caredis");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig35 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str36 = jbootCacheConfig35.getAopCacheType();
        jbootEhcacheImpl21.put("hi!", (java.lang.Object) str36, (java.lang.Object) "cachename", (int) ' ');
        noneCacheImpl0.refresh("j2cache", (java.lang.Object) jbootEhcacheImpl21);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl42 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl44 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl45 = jbootEhredisCacheImpl44.getRedisCacheImpl();
        jbootEhredisCacheImpl44.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl47 = jbootEhredisCacheImpl44.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache48 = noneCacheImpl42.get("key", (java.lang.Object) jbootEhcacheImpl47);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl50 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list51 = caffeineCacheImpl50.getNames();
        java.lang.Object obj53 = null;
        caffeineCacheImpl50.refresh("key", obj53);
        noneCacheImpl42.setTtl("value:", (java.lang.Object) caffeineCacheImpl50, (int) '#');
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl58 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl59 = jbootEhredisCacheImpl58.getRedisCacheImpl();
        jbootEhredisCacheImpl58.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl61 = jbootEhredisCacheImpl58.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl62 = jbootEhredisCacheImpl58.getRedisCacheImpl();
        caffeineCacheImpl50.setTtl("", (java.lang.Object) jbootRedisCacheImpl62, (int) (byte) 100);
        jbootEhcacheImpl21.setTtl("value~~~~~~~", (java.lang.Object) "", 100);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl19);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl21);
        org.junit.Assert.assertNull(jbootCache22);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "caffeine" + "'", str36, "caffeine");
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl45);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl47);
        org.junit.Assert.assertNull(jbootCache48);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl59);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl61);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl62);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        jbootEhredisCacheImpl0.notifyElementPut(ehcache5, element6);
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl8 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl10 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootEhredisCacheImpl12.getRedisCacheImpl();
        jbootEhredisCacheImpl12.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl15 = jbootEhredisCacheImpl12.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache16 = noneCacheImpl10.get("key", (java.lang.Object) jbootEhcacheImpl15);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl18 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list19 = caffeineCacheImpl18.getNames();
        java.lang.Object obj21 = null;
        caffeineCacheImpl18.refresh("key", obj21);
        noneCacheImpl10.setTtl("value:", (java.lang.Object) caffeineCacheImpl18, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int25 = jbootEhredisCacheImpl0.getTtl("cachename", (java.lang.Object) "value:");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl8);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl15);
        org.junit.Assert.assertNull(jbootCache16);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl7 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        caffeineCacheImpl0.put("caffeine", (java.lang.Object) jbootCaredisCacheImpl7, (java.lang.Object) jbootEhredisCacheImpl8, (int) (byte) 10);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl12 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootCaredisCacheImpl12.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis14 = jbootRedisCacheImpl13.getRedis();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl7.remove("ehcache", (java.lang.Object) jbootRedisCacheImpl13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.redis.JbootRedisCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
        org.junit.Assert.assertNotNull(jbootRedis14);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("ehredis");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl12 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl15 = jbootEhredisCacheImpl14.getRedisCacheImpl();
        jbootEhredisCacheImpl14.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl17 = jbootEhredisCacheImpl14.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache18 = noneCacheImpl12.get("key", (java.lang.Object) jbootEhcacheImpl17);
        java.util.List list19 = noneCacheImpl12.getNames();
        noneCacheImpl12.removeAll("ehredis");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl23 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list24 = caffeineCacheImpl23.getNames();
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl26 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl28 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl29 = jbootEhredisCacheImpl28.getRedisCacheImpl();
        jbootEhredisCacheImpl28.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl31 = jbootEhredisCacheImpl28.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl32 = jbootEhredisCacheImpl28.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis33 = jbootRedisCacheImpl32.getRedis();
        j2cacheImpl26.refresh("key", (java.lang.Object) jbootRedisCacheImpl32);
        caffeineCacheImpl23.setTtl("caffeine", (java.lang.Object) j2cacheImpl26, (int) (short) 10);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl38 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl39 = jbootEhredisCacheImpl38.getRedisCacheImpl();
        jbootEhredisCacheImpl38.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl41 = jbootEhredisCacheImpl38.getEhcacheImpl();
        jbootEhcacheImpl41.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager44 = jbootEhcacheImpl41.getCacheManager();
        caffeineCacheImpl23.setTtl("", (java.lang.Object) cacheManager44, (int) (byte) 0);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl47 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl48 = jbootCaredisCacheImpl47.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl49 = jbootCaredisCacheImpl47.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl50 = jbootCaredisCacheImpl47.getRedisCacheImpl();
        noneCacheImpl12.put("key", (java.lang.Object) (byte) 0, (java.lang.Object) jbootRedisCacheImpl50);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader52 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.jfinal.plugin.activerecord.cache.ICache iCache53 = j2cacheImpl0.get("value~~~~~~~", (java.lang.Object) noneCacheImpl12, iDataLoader52);
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl15);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl17);
        org.junit.Assert.assertNull(jbootCache18);
        org.junit.Assert.assertNull(list19);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl29);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl31);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl32);
        org.junit.Assert.assertNotNull(jbootRedis33);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl39);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl41);
        org.junit.Assert.assertNotNull(cacheManager44);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl48);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl49);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl50);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        jbootEhcacheImpl3.removeAll("value~~~~~~~");
        java.util.List list7 = jbootEhcacheImpl3.getKeys("value~~~~~~~");
        java.util.List list9 = jbootEhcacheImpl3.getKeys("ehredis");
        net.sf.ehcache.Cache cache11 = jbootEhcacheImpl3.getOrAddCache("caredis");
        java.util.List list13 = jbootEhcacheImpl3.getKeys("value:");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl15 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl16 = jbootEhredisCacheImpl15.getRedisCacheImpl();
        jbootEhredisCacheImpl15.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl18 = jbootEhredisCacheImpl15.getEhcacheImpl();
        jbootEhcacheImpl18.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager21 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl22 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager21);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl23 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl22.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl23);
        jbootEhcacheImpl18.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl23);
        java.lang.Iterable iterable26 = jbootEhcacheImpl3.get("none", (java.lang.Object) jbootEhcacheImpl18);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(cache11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl16);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl18);
        org.junit.Assert.assertNull(iterable26);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl5 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int8 = caffeineCacheImpl5.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl11 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int14 = caffeineCacheImpl11.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl16 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager17 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl18 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager17);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl19 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl18.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl19);
        caffeineCacheImpl11.put("", (java.lang.Object) noneCacheImpl16, (java.lang.Object) jbootEhcacheImpl18);
        caffeineCacheImpl5.put("jboot_ehredis_channel", (java.lang.Object) false, (java.lang.Object) noneCacheImpl16, (int) (byte) -1);
        java.util.List list25 = noneCacheImpl16.getKeys("none");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl27 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl28 = jbootEhredisCacheImpl27.getRedisCacheImpl();
        jbootEhredisCacheImpl27.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl30 = jbootEhredisCacheImpl27.getEhcacheImpl();
        java.util.List list31 = jbootEhcacheImpl30.getNames();
        net.sf.ehcache.Cache cache33 = jbootEhcacheImpl30.getOrAddCache("value");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl34 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl35 = jbootEhredisCacheImpl34.getRedisCacheImpl();
        jbootEhredisCacheImpl34.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl37 = jbootEhredisCacheImpl34.getEhcacheImpl();
        java.lang.Class<?> wildcardClass38 = jbootEhredisCacheImpl34.getClass();
        noneCacheImpl16.put("jboot_caredis_channel", (java.lang.Object) "value", (java.lang.Object) jbootEhredisCacheImpl34, (int) (byte) 10);
        java.util.List list41 = noneCacheImpl16.getNames();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.refresh("", (java.lang.Object) noneCacheImpl16);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.none.NoneCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(list25);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl28);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(cache33);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl35);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(list41);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.refresh("");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        java.lang.Object obj2 = null;
        noneCacheImpl0.setTtl("value:", obj2, (int) '#');
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl6 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl7 = jbootEhredisCacheImpl6.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache8 = null;
        net.sf.ehcache.Element element9 = null;
        jbootEhredisCacheImpl6.notifyElementUpdated(ehcache8, element9);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl11 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        net.sf.ehcache.Ehcache ehcache12 = null;
        jbootEhredisCacheImpl11.notifyRemoveAll(ehcache12);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl15 = jbootEhredisCacheImpl14.getRedisCacheImpl();
        jbootEhredisCacheImpl14.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl17 = jbootEhredisCacheImpl14.getEhcacheImpl();
        jbootEhcacheImpl17.removeAll("value~~~~~~~");
        java.util.List list21 = jbootEhcacheImpl17.getKeys("value~~~~~~~");
        java.util.List list23 = jbootEhcacheImpl17.getKeys("ehredis");
        net.sf.ehcache.Cache cache25 = jbootEhcacheImpl17.getOrAddCache("caredis");
        net.sf.ehcache.Element element26 = null;
        jbootEhredisCacheImpl11.notifyElementPut((net.sf.ehcache.Ehcache) cache25, element26);
        net.sf.ehcache.Element element28 = null;
        jbootEhredisCacheImpl6.notifyElementUpdated((net.sf.ehcache.Ehcache) cache25, element28);
        java.lang.Object obj30 = noneCacheImpl0.get("type must not be null or blank.", (java.lang.Object) element28);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl15);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl17);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(cache25);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl3 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list4 = caffeineCacheImpl3.getNames();
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl6 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        jbootEhredisCacheImpl8.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl11 = jbootEhredisCacheImpl8.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl12 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis13 = jbootRedisCacheImpl12.getRedis();
        j2cacheImpl6.refresh("key", (java.lang.Object) jbootRedisCacheImpl12);
        caffeineCacheImpl3.setTtl("caffeine", (java.lang.Object) j2cacheImpl6, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCacheConfig jbootCacheConfig17 = jbootCaredisCacheImpl0.get("caffeine", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl11);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl12);
        org.junit.Assert.assertNotNull(jbootRedis13);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl5 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        caffeineCacheImpl0.put("", (java.lang.Object) noneCacheImpl5, (java.lang.Object) jbootEhcacheImpl7);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl12 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list14 = caffeineCacheImpl12.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase15 = noneCacheImpl5.get("cachename", (java.lang.Object) list14);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl17 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl18 = jbootEhredisCacheImpl17.getRedisCacheImpl();
        jbootEhredisCacheImpl17.dispose();
        net.sf.ehcache.Ehcache ehcache20 = null;
        net.sf.ehcache.Element element21 = null;
        jbootEhredisCacheImpl17.notifyElementRemoved(ehcache20, element21);
        jbootEhredisCacheImpl17.dispose();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection26 = noneCacheImpl5.get("key", (java.lang.Object) jbootEhredisCacheImpl17, iDataLoader24, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(jbootCacheBase15);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl18);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        net.sf.ehcache.Ehcache ehcache3 = null;
        net.sf.ehcache.Element element4 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted(ehcache3, element4);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.removeAll("ehredis");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        jbootEhcacheImpl5.removeAll("value~~~~~~~");
        java.util.List list9 = jbootEhcacheImpl5.getKeys("value~~~~~~~");
        java.util.List list11 = jbootEhcacheImpl5.getKeys("ehredis");
        net.sf.ehcache.Cache cache13 = jbootEhcacheImpl5.getOrAddCache("caredis");
        net.sf.ehcache.Element element14 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted((net.sf.ehcache.Ehcache) cache13, element14);
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl16 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.refresh("jboot_caredis_channel");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(cache13);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl16);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl4 = new io.jboot.components.cache.none.NoneCacheImpl();
        java.lang.Object obj6 = null;
        noneCacheImpl4.setTtl("value:", obj6, (int) '#');
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl10 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl11 = jbootEhredisCacheImpl10.getRedisCacheImpl();
        jbootEhredisCacheImpl10.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = jbootEhredisCacheImpl10.getEhcacheImpl();
        jbootEhcacheImpl13.removeAll("value~~~~~~~");
        java.util.List list17 = jbootEhcacheImpl13.getKeys("value~~~~~~~");
        java.util.List list19 = jbootEhcacheImpl13.getKeys("ehredis");
        noneCacheImpl4.remove("type must not be null or blank.", (java.lang.Object) jbootEhcacheImpl13);
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl2.setTtl("none", (java.lang.Object) noneCacheImpl4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl11);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        j2cacheImpl0.refresh("jboot_caredis_channel", (java.lang.Object) "");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl16 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl17 = jbootEhredisCacheImpl16.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis18 = jbootRedisCacheImpl17.getRedis();
        io.jboot.support.redis.JbootRedis jbootRedis19 = jbootRedisCacheImpl17.getRedis();
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.setTtl("value~~~~~~~", (java.lang.Object) jbootRedis19, 0);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootException; message: setTtl not support in j2cache");
        } catch (io.jboot.exception.JbootException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl17);
        org.junit.Assert.assertNotNull(jbootRedis18);
        org.junit.Assert.assertNotNull(jbootRedis19);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        jbootEhredisCacheImpl0.notifyElementPut(ehcache5, element6);
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl8 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = jbootRedisCacheImpl8.getNames();
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl2 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl4 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl5 = jbootEhredisCacheImpl4.getRedisCacheImpl();
        jbootEhredisCacheImpl4.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = jbootEhredisCacheImpl4.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl8 = jbootEhredisCacheImpl4.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis9 = jbootRedisCacheImpl8.getRedis();
        j2cacheImpl2.refresh("key", (java.lang.Object) jbootRedisCacheImpl8);
        j2cacheImpl2.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl15 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl16 = jbootCaredisCacheImpl15.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl17 = jbootCaredisCacheImpl15.getRedisCacheImpl();
        j2cacheImpl2.refresh("none", (java.lang.Object) jbootRedisCacheImpl17);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl20 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl22 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl23 = jbootEhredisCacheImpl22.getRedisCacheImpl();
        jbootEhredisCacheImpl22.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl25 = jbootEhredisCacheImpl22.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache26 = noneCacheImpl20.get("key", (java.lang.Object) jbootEhcacheImpl25);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl28 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list29 = caffeineCacheImpl28.getNames();
        java.lang.Object obj31 = null;
        caffeineCacheImpl28.refresh("key", obj31);
        noneCacheImpl20.setTtl("value:", (java.lang.Object) caffeineCacheImpl28, (int) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl36 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl38 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl39 = jbootEhredisCacheImpl38.getRedisCacheImpl();
        jbootEhredisCacheImpl38.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl41 = jbootEhredisCacheImpl38.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache42 = noneCacheImpl36.get("key", (java.lang.Object) jbootEhcacheImpl41);
        jbootEhcacheImpl41.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl41.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list53 = jbootEhcacheImpl41.getKeys("caredis");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig55 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str56 = jbootCacheConfig55.getAopCacheType();
        jbootEhcacheImpl41.put("hi!", (java.lang.Object) str56, (java.lang.Object) "cachename", (int) ' ');
        noneCacheImpl20.refresh("j2cache", (java.lang.Object) jbootEhcacheImpl41);
        jbootRedisCacheImpl17.refresh("j2cache", (java.lang.Object) noneCacheImpl20);
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl0.onMessage("jboot.cache.type", (java.lang.Object) "j2cache");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to io.jboot.components.cache.caredis.JbootCaredisMessage");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl5);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl8);
        org.junit.Assert.assertNotNull(jbootRedis9);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl16);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl17);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl23);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl25);
        org.junit.Assert.assertNull(jbootCache26);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl39);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl41);
        org.junit.Assert.assertNull(jbootCache42);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "caffeine" + "'", str56, "caffeine");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        java.lang.Object obj2 = null;
        noneCacheImpl0.setTtl("value:", obj2, (int) '#');
        noneCacheImpl0.removeAll("ehredis");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        java.util.List list7 = noneCacheImpl0.getNames();
        noneCacheImpl0.removeAll("ehredis");
        java.util.List list10 = noneCacheImpl0.getNames();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl12 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl15 = jbootEhredisCacheImpl14.getRedisCacheImpl();
        jbootEhredisCacheImpl14.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl17 = jbootEhredisCacheImpl14.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache18 = noneCacheImpl12.get("key", (java.lang.Object) jbootEhcacheImpl17);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl20 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list21 = caffeineCacheImpl20.getNames();
        java.lang.Object obj23 = null;
        caffeineCacheImpl20.refresh("key", obj23);
        noneCacheImpl12.setTtl("value:", (java.lang.Object) caffeineCacheImpl20, (int) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl28 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl30 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl31 = jbootEhredisCacheImpl30.getRedisCacheImpl();
        jbootEhredisCacheImpl30.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl33 = jbootEhredisCacheImpl30.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache34 = noneCacheImpl28.get("key", (java.lang.Object) jbootEhcacheImpl33);
        jbootEhcacheImpl33.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl33.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list45 = jbootEhcacheImpl33.getKeys("caredis");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig47 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str48 = jbootCacheConfig47.getAopCacheType();
        jbootEhcacheImpl33.put("hi!", (java.lang.Object) str48, (java.lang.Object) "cachename", (int) ' ');
        noneCacheImpl12.refresh("j2cache", (java.lang.Object) jbootEhcacheImpl33);
        noneCacheImpl12.put("jboot_ehredis_channel", (java.lang.Object) 100, (java.lang.Object) "jboot.cache.type");
        net.sf.ehcache.event.CacheEventListener cacheEventListener57 = noneCacheImpl0.get("ehcache", (java.lang.Object) 100);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl15);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl17);
        org.junit.Assert.assertNull(jbootCache18);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl31);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl33);
        org.junit.Assert.assertNull(jbootCache34);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "caffeine" + "'", str48, "caffeine");
        org.junit.Assert.assertNull(cacheEventListener57);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl6 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        jbootEhredisCacheImpl8.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl11 = jbootEhredisCacheImpl8.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache12 = noneCacheImpl6.get("key", (java.lang.Object) jbootEhcacheImpl11);
        jbootEhcacheImpl11.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.remove("type must not be null or blank.", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl11);
        org.junit.Assert.assertNull(jbootCache12);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        jbootEhredisCacheImpl8.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl11 = jbootEhredisCacheImpl8.getEhcacheImpl();
        java.lang.Class<?> wildcardClass12 = jbootEhredisCacheImpl8.getClass();
        noneCacheImpl0.setTtl("key", (java.lang.Object) wildcardClass12, (int) (byte) -1);
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig16 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str17 = jbootCacheConfig16.getAopCacheType();
        jbootCacheConfig16.setAopCacheLiveSeconds((int) ' ');
        jbootCacheConfig16.setAopCacheLiveSeconds((int) (short) 100);
        noneCacheImpl0.refresh("", (java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "caffeine" + "'", str17, "caffeine");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl7 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        caffeineCacheImpl0.put("caffeine", (java.lang.Object) jbootCaredisCacheImpl7, (java.lang.Object) jbootEhredisCacheImpl8, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = jbootCaredisCacheImpl7.getKeys("caredis");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        j2cacheImpl0.refresh("j2cache", (java.lang.Object) jbootEhredisCacheImpl2);
        jbootEhredisCacheImpl2.dispose();
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl2.refresh("caffeine");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl7 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        caffeineCacheImpl0.put("caffeine", (java.lang.Object) jbootCaredisCacheImpl7, (java.lang.Object) jbootEhredisCacheImpl8, (int) (byte) 10);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootEhredisCacheImpl12.getRedisCacheImpl();
        jbootEhredisCacheImpl12.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl15 = jbootEhredisCacheImpl12.getEhcacheImpl();
        jbootEhcacheImpl15.removeAll("value~~~~~~~");
        java.util.List list19 = jbootEhcacheImpl15.getKeys("value~~~~~~~");
        java.util.List list21 = jbootEhcacheImpl15.getKeys("ehredis");
        // The following exception was thrown during execution in test generation
        try {
            jbootCaredisCacheImpl7.setTtl("j2cache", (java.lang.Object) jbootEhcacheImpl15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.ehcache.JbootEhcacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl15);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl13 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl14 = jbootCaredisCacheImpl13.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl15 = jbootCaredisCacheImpl13.getRedisCacheImpl();
        j2cacheImpl0.refresh("none", (java.lang.Object) jbootRedisCacheImpl15);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl18 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl19 = jbootCaredisCacheImpl18.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl20 = jbootCaredisCacheImpl18.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl21 = jbootCaredisCacheImpl18.getRedisCacheImpl();
        j2cacheImpl0.refresh("value:", (java.lang.Object) jbootRedisCacheImpl21);
        net.sf.ehcache.CacheManager cacheManager24 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl25 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager24);
        net.sf.ehcache.event.CacheEventListener cacheEventListener26 = jbootEhcacheImpl25.getCacheEventListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int27 = jbootRedisCacheImpl21.getTtl("caredis", (java.lang.Object) cacheEventListener26);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl14);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl15);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl19);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl20);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl21);
        org.junit.Assert.assertNull(cacheEventListener26);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        net.sf.ehcache.Ehcache ehcache3 = null;
        net.sf.ehcache.Element element4 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted(ehcache3, element4);
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl7 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        net.sf.ehcache.Ehcache ehcache8 = null;
        jbootEhredisCacheImpl7.notifyRemoveAll(ehcache8);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl10 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl11 = jbootEhredisCacheImpl10.getRedisCacheImpl();
        jbootEhredisCacheImpl10.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = jbootEhredisCacheImpl10.getEhcacheImpl();
        jbootEhcacheImpl13.removeAll("value~~~~~~~");
        java.util.List list17 = jbootEhcacheImpl13.getKeys("value~~~~~~~");
        java.util.List list19 = jbootEhcacheImpl13.getKeys("ehredis");
        net.sf.ehcache.Cache cache21 = jbootEhcacheImpl13.getOrAddCache("caredis");
        net.sf.ehcache.Element element22 = null;
        jbootEhredisCacheImpl7.notifyElementPut((net.sf.ehcache.Ehcache) cache21, element22);
        net.sf.ehcache.Element element24 = null;
        jbootEhredisCacheImpl0.notifyElementExpired((net.sf.ehcache.Ehcache) cache21, element24);
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl26 = jbootEhredisCacheImpl0.getEhcacheImpl();
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl11);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(cache21);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl26);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl2 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int5 = caffeineCacheImpl2.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl7 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager8 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl9 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager8);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl10 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl9.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl10);
        caffeineCacheImpl2.put("", (java.lang.Object) noneCacheImpl7, (java.lang.Object) jbootEhcacheImpl9);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl14 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list16 = caffeineCacheImpl14.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase17 = noneCacheImpl7.get("cachename", (java.lang.Object) list16);
        io.jboot.components.cache.JbootCacheManager jbootCacheManager19 = io.jboot.components.cache.JbootCacheManager.me();
        java.lang.String str20 = noneCacheImpl7.get("j2cache", (java.lang.Object) jbootCacheManager19);
        io.jboot.components.cache.JbootCache jbootCache22 = jbootCacheManager19.getCache("ehredis");
        java.lang.Cloneable cloneable23 = noneCacheImpl0.get("type must not be null or blank.", (java.lang.Object) jbootCache22);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(list16);
        org.junit.Assert.assertNull(jbootCacheBase17);
        org.junit.Assert.assertNotNull(jbootCacheManager19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(jbootCache22);
        org.junit.Assert.assertNull(cloneable23);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl5 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        caffeineCacheImpl0.put("", (java.lang.Object) noneCacheImpl5, (java.lang.Object) jbootEhcacheImpl7);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl12 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list14 = caffeineCacheImpl12.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase15 = noneCacheImpl5.get("cachename", (java.lang.Object) list14);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl17 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl19 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl20 = jbootEhredisCacheImpl19.getRedisCacheImpl();
        jbootEhredisCacheImpl19.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl22 = jbootEhredisCacheImpl19.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache23 = noneCacheImpl17.get("key", (java.lang.Object) jbootEhcacheImpl22);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl25 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl26 = jbootEhredisCacheImpl25.getRedisCacheImpl();
        jbootEhredisCacheImpl25.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl28 = jbootEhredisCacheImpl25.getEhcacheImpl();
        java.lang.Class<?> wildcardClass29 = jbootEhredisCacheImpl25.getClass();
        noneCacheImpl17.setTtl("key", (java.lang.Object) wildcardClass29, (int) (byte) -1);
        noneCacheImpl5.setTtl("ehcache", (java.lang.Object) "key", (int) (short) -1);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl35 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl36 = jbootEhredisCacheImpl35.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache37 = null;
        net.sf.ehcache.Element element38 = null;
        jbootEhredisCacheImpl35.notifyElementUpdated(ehcache37, element38);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl40 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        net.sf.ehcache.Ehcache ehcache41 = null;
        jbootEhredisCacheImpl40.notifyRemoveAll(ehcache41);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl43 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl44 = jbootEhredisCacheImpl43.getRedisCacheImpl();
        jbootEhredisCacheImpl43.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl46 = jbootEhredisCacheImpl43.getEhcacheImpl();
        jbootEhcacheImpl46.removeAll("value~~~~~~~");
        java.util.List list50 = jbootEhcacheImpl46.getKeys("value~~~~~~~");
        java.util.List list52 = jbootEhcacheImpl46.getKeys("ehredis");
        net.sf.ehcache.Cache cache54 = jbootEhcacheImpl46.getOrAddCache("caredis");
        net.sf.ehcache.Element element55 = null;
        jbootEhredisCacheImpl40.notifyElementPut((net.sf.ehcache.Ehcache) cache54, element55);
        net.sf.ehcache.Element element57 = null;
        jbootEhredisCacheImpl35.notifyElementUpdated((net.sf.ehcache.Ehcache) cache54, element57);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl59 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl61 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl62 = jbootEhredisCacheImpl61.getRedisCacheImpl();
        jbootEhredisCacheImpl61.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl64 = jbootEhredisCacheImpl61.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache65 = noneCacheImpl59.get("key", (java.lang.Object) jbootEhcacheImpl64);
        java.util.List list66 = noneCacheImpl59.getNames();
        noneCacheImpl5.put("jboot_caredis_channel", (java.lang.Object) jbootEhredisCacheImpl35, (java.lang.Object) list66);
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl69 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl71 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl72 = jbootEhredisCacheImpl71.getRedisCacheImpl();
        jbootEhredisCacheImpl71.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl74 = jbootEhredisCacheImpl71.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl75 = jbootEhredisCacheImpl71.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis76 = jbootRedisCacheImpl75.getRedis();
        j2cacheImpl69.refresh("key", (java.lang.Object) jbootRedisCacheImpl75);
        j2cacheImpl69.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl82 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl83 = jbootCaredisCacheImpl82.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl84 = jbootCaredisCacheImpl82.getRedisCacheImpl();
        j2cacheImpl69.refresh("none", (java.lang.Object) jbootRedisCacheImpl84);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl87 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list89 = caffeineCacheImpl87.getKeys("");
        caffeineCacheImpl87.removeAll("cachename");
        jbootRedisCacheImpl84.refresh("jboot_caredis_channel", (java.lang.Object) caffeineCacheImpl87);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader93 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl94 = noneCacheImpl5.get("hi!", (java.lang.Object) jbootRedisCacheImpl84, iDataLoader93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(jbootCacheBase15);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl20);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl22);
        org.junit.Assert.assertNull(jbootCache23);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl26);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl36);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl44);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl46);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(cache54);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl62);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl64);
        org.junit.Assert.assertNull(jbootCache65);
        org.junit.Assert.assertNull(list66);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl72);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl74);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl75);
        org.junit.Assert.assertNotNull(jbootRedis76);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl83);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl84);
        org.junit.Assert.assertNull(list89);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl0 = new io.jboot.components.cache.redis.JbootRedisCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl0.removeAll("j2cache");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl4 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl5 = jbootEhredisCacheImpl4.getRedisCacheImpl();
        jbootEhredisCacheImpl4.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = jbootEhredisCacheImpl4.getEhcacheImpl();
        jbootEhcacheImpl7.removeAll("value~~~~~~~");
        java.util.List list11 = jbootEhcacheImpl7.getKeys("value~~~~~~~");
        java.util.List list13 = jbootEhcacheImpl7.getKeys("ehredis");
        net.sf.ehcache.Cache cache15 = jbootEhcacheImpl7.getOrAddCache("caredis");
        net.sf.ehcache.Element element16 = null;
        jbootEhredisCacheImpl2.notifyElementEvicted((net.sf.ehcache.Ehcache) cache15, element16);
        net.sf.ehcache.Element element18 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted((net.sf.ehcache.Ehcache) cache15, element18);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl5);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl7);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(cache15);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl1 = jbootCaredisCacheImpl0.getCaffeineCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig4 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str5 = jbootCacheConfig4.getAopCacheType();
        jbootCacheConfig4.setAopCacheLiveSeconds((int) ' ');
        jbootCacheConfig4.setAopCacheLiveSeconds((int) (short) 100);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl11 = jbootRedisCacheImpl2.get("ehcache", (java.lang.Object) (short) 100, iDataLoader10);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(caffeineCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "caffeine" + "'", str5, "caffeine");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache2 = null;
        net.sf.ehcache.Element element3 = null;
        jbootEhredisCacheImpl0.notifyElementUpdated(ehcache2, element3);
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl6 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        jbootEhredisCacheImpl8.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl11 = jbootEhredisCacheImpl8.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl12 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis13 = jbootRedisCacheImpl12.getRedis();
        j2cacheImpl6.refresh("key", (java.lang.Object) jbootRedisCacheImpl12);
        j2cacheImpl6.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl19 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl20 = jbootCaredisCacheImpl19.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl21 = jbootCaredisCacheImpl19.getRedisCacheImpl();
        j2cacheImpl6.refresh("none", (java.lang.Object) jbootRedisCacheImpl21);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader23 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl24 = jbootEhredisCacheImpl0.get("jboot.cache.type", (java.lang.Object) j2cacheImpl6, iDataLoader23);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl11);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl12);
        org.junit.Assert.assertNotNull(jbootRedis13);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl20);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl21);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list1 = caffeineCacheImpl0.getNames();
        java.lang.Object obj3 = null;
        caffeineCacheImpl0.refresh("key", obj3);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl6 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        io.jboot.components.cache.JbootCacheManager jbootCacheManager7 = io.jboot.components.cache.JbootCacheManager.me();
        caffeineCacheImpl0.put("jboot_caredis_channel", (java.lang.Object) caffeineCacheImpl6, (java.lang.Object) jbootCacheManager7);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl10 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl11 = jbootEhredisCacheImpl10.getRedisCacheImpl();
        jbootEhredisCacheImpl10.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = jbootEhredisCacheImpl10.getEhcacheImpl();
        java.lang.Integer int16 = jbootEhcacheImpl13.getTtl("value:", (java.lang.Object) (short) -1);
        net.sf.ehcache.Cache cache18 = jbootEhcacheImpl13.getOrAddCache("caredis");
        java.lang.Integer int19 = caffeineCacheImpl6.getTtl("value", (java.lang.Object) "caredis");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(jbootCacheManager7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl11);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl13);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(cache18);
        org.junit.Assert.assertNull(int19);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache2 = null;
        net.sf.ehcache.Element element3 = null;
        jbootEhredisCacheImpl0.notifyElementUpdated(ehcache2, element3);
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl7 = new io.jboot.components.cache.none.NoneCacheImpl();
        // The following exception was thrown during execution in test generation
        try {
            io.jboot.components.cache.JbootCacheBase jbootCacheBase8 = jbootEhredisCacheImpl0.get("", (java.lang.Object) noneCacheImpl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis2 = jbootRedisCacheImpl1.getRedis();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list4 = jbootRedisCacheImpl1.getKeys("ehcache");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedis2);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl7 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        caffeineCacheImpl0.put("caffeine", (java.lang.Object) jbootCaredisCacheImpl7, (java.lang.Object) jbootEhredisCacheImpl8, (int) (byte) 10);
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl11 = jbootCaredisCacheImpl7.getRedisCacheImpl();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl11);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        io.jboot.components.cache.j2cache.J2cacheImpl j2cacheImpl0 = new io.jboot.components.cache.j2cache.J2cacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl6 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis7 = jbootRedisCacheImpl6.getRedis();
        j2cacheImpl0.refresh("key", (java.lang.Object) jbootRedisCacheImpl6);
        j2cacheImpl0.refresh("jboot_ehredis_channel", (java.lang.Object) (byte) 100);
        j2cacheImpl0.refresh("jboot_caredis_channel", (java.lang.Object) "");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig16 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str17 = jbootCacheConfig16.getAopCacheType();
        jbootCacheConfig16.setAopCacheLiveSeconds((int) ' ');
        java.lang.String str20 = jbootCacheConfig16.getType();
        // The following exception was thrown during execution in test generation
        try {
            j2cacheImpl0.remove("value~~~~~~~", (java.lang.Object) str20);
            org.junit.Assert.fail("Expected exception of type redis.clients.jedis.exceptions.JedisConnectionException; message: Could not get a resource from the pool");
        } catch (redis.clients.jedis.exceptions.JedisConnectionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl6);
        org.junit.Assert.assertNotNull(jbootRedis7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "caffeine" + "'", str17, "caffeine");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "caffeine" + "'", str20, "caffeine");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        java.util.List list7 = noneCacheImpl0.getNames();
        noneCacheImpl0.removeAll("ehredis");
        java.util.List list10 = noneCacheImpl0.getNames();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootEhredisCacheImpl12.getRedisCacheImpl();
        jbootEhredisCacheImpl12.dispose();
        noneCacheImpl0.setTtl("", (java.lang.Object) jbootEhredisCacheImpl12, 0);
        java.lang.Object obj18 = null;
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl19 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list21 = caffeineCacheImpl19.getKeys("");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl23 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl24 = jbootCaredisCacheImpl23.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis25 = jbootRedisCacheImpl24.getRedis();
        java.lang.Integer int26 = caffeineCacheImpl19.getTtl("jboot_ehredis_channel", (java.lang.Object) jbootRedisCacheImpl24);
        noneCacheImpl0.put("value", obj18, (java.lang.Object) caffeineCacheImpl19);
        java.util.List list29 = caffeineCacheImpl19.getKeys("");
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNull(list10);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
        org.junit.Assert.assertNull(list21);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl24);
        org.junit.Assert.assertNotNull(jbootRedis25);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNull(list29);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        java.util.List list4 = jbootEhcacheImpl3.getNames();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl6 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl7 = jbootEhredisCacheImpl6.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl8 = jbootEhredisCacheImpl6.getRedisCacheImpl();
        java.lang.Class<?> wildcardClass9 = jbootEhredisCacheImpl6.getClass();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl10 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int13 = caffeineCacheImpl10.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl15 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager16 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl17 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager16);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl18 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl17.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl18);
        caffeineCacheImpl10.put("", (java.lang.Object) noneCacheImpl15, (java.lang.Object) jbootEhcacheImpl17);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl22 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list24 = caffeineCacheImpl22.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase25 = noneCacheImpl15.get("cachename", (java.lang.Object) list24);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl27 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl29 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl30 = jbootEhredisCacheImpl29.getRedisCacheImpl();
        jbootEhredisCacheImpl29.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl32 = jbootEhredisCacheImpl29.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache33 = noneCacheImpl27.get("key", (java.lang.Object) jbootEhcacheImpl32);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl35 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl36 = jbootEhredisCacheImpl35.getRedisCacheImpl();
        jbootEhredisCacheImpl35.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl38 = jbootEhredisCacheImpl35.getEhcacheImpl();
        java.lang.Class<?> wildcardClass39 = jbootEhredisCacheImpl35.getClass();
        noneCacheImpl27.setTtl("key", (java.lang.Object) wildcardClass39, (int) (byte) -1);
        noneCacheImpl15.setTtl("ehcache", (java.lang.Object) "key", (int) (short) -1);
        jbootEhcacheImpl3.put("type must not be null or blank.", (java.lang.Object) jbootEhredisCacheImpl6, (java.lang.Object) (short) -1);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl46 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl48 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl49 = jbootEhredisCacheImpl48.getRedisCacheImpl();
        jbootEhredisCacheImpl48.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl51 = jbootEhredisCacheImpl48.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache52 = noneCacheImpl46.get("key", (java.lang.Object) jbootEhcacheImpl51);
        java.util.List list53 = noneCacheImpl46.getNames();
        noneCacheImpl46.removeAll("ehredis");
        java.util.List list56 = noneCacheImpl46.getNames();
        java.util.List list58 = noneCacheImpl46.getKeys("type must not be null or blank.");
        java.lang.Integer int59 = jbootEhcacheImpl3.getTtl("ehcache", (java.lang.Object) noneCacheImpl46);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(list24);
        org.junit.Assert.assertNull(jbootCacheBase25);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl30);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl32);
        org.junit.Assert.assertNull(jbootCache33);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl36);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl49);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl51);
        org.junit.Assert.assertNull(jbootCache52);
        org.junit.Assert.assertNull(list53);
        org.junit.Assert.assertNull(list56);
        org.junit.Assert.assertNull(list58);
        org.junit.Assert.assertNull(int59);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl3 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl3.getRedisCacheImpl();
        jbootEhredisCacheImpl3.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl6 = jbootEhredisCacheImpl3.getEhcacheImpl();
        java.lang.Integer int9 = jbootEhcacheImpl6.getTtl("value:", (java.lang.Object) (short) -1);
        net.sf.ehcache.Cache cache11 = jbootEhcacheImpl6.getOrAddCache("caredis");
        net.sf.ehcache.Element element12 = null;
        jbootEhredisCacheImpl0.notifyElementPut((net.sf.ehcache.Ehcache) cache11, element12);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl15 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl17 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl18 = jbootEhredisCacheImpl17.getRedisCacheImpl();
        jbootEhredisCacheImpl17.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl20 = jbootEhredisCacheImpl17.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache21 = noneCacheImpl15.get("key", (java.lang.Object) jbootEhcacheImpl20);
        jbootEhcacheImpl20.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl20.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        net.sf.ehcache.Cache cache32 = jbootEhcacheImpl20.getOrAddCache("none");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration genericDeclaration33 = jbootEhredisCacheImpl0.get("caredis", (java.lang.Object) "none");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl6);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(cache11);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl18);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl20);
        org.junit.Assert.assertNull(jbootCache21);
        org.junit.Assert.assertNotNull(cache32);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jbootCaredisCacheImpl0.get("key", (java.lang.Object) "value~~~~~~~", iDataLoader3, (int) '4');
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl10 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl11 = jbootEhredisCacheImpl10.getRedisCacheImpl();
        jbootEhredisCacheImpl10.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = jbootEhredisCacheImpl10.getEhcacheImpl();
        java.util.List list14 = jbootEhcacheImpl13.getNames();
        net.sf.ehcache.Cache cache16 = jbootEhcacheImpl13.getOrAddCache("value");
        net.sf.ehcache.Element element17 = null;
        jbootEhredisCacheImpl8.notifyElementExpired((net.sf.ehcache.Ehcache) cache16, element17);
        java.lang.Integer int19 = noneCacheImpl0.getTtl("value~~~~~~~", (java.lang.Object) element17);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl11);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(cache16);
        org.junit.Assert.assertNull(int19);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        java.lang.Object obj2 = null;
        noneCacheImpl0.setTtl("value:", obj2, (int) '#');
        noneCacheImpl0.removeAll("jboot_caredis_channel");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        net.sf.ehcache.Ehcache ehcache2 = null;
        net.sf.ehcache.Element element3 = null;
        jbootEhredisCacheImpl0.notifyElementUpdated(ehcache2, element3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = jbootEhredisCacheImpl0.getKeys("jboot.cache.type");
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl3 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl3.getRedisCacheImpl();
        jbootEhredisCacheImpl3.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl6 = jbootEhredisCacheImpl3.getEhcacheImpl();
        java.lang.Integer int9 = jbootEhcacheImpl6.getTtl("value:", (java.lang.Object) (short) -1);
        net.sf.ehcache.Cache cache11 = jbootEhcacheImpl6.getOrAddCache("caredis");
        net.sf.ehcache.Element element12 = null;
        jbootEhredisCacheImpl0.notifyElementPut((net.sf.ehcache.Ehcache) cache11, element12);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        net.sf.ehcache.Ehcache ehcache15 = null;
        jbootEhredisCacheImpl14.notifyRemoveAll(ehcache15);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl17 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl18 = jbootEhredisCacheImpl17.getRedisCacheImpl();
        jbootEhredisCacheImpl17.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl20 = jbootEhredisCacheImpl17.getEhcacheImpl();
        jbootEhcacheImpl20.removeAll("value~~~~~~~");
        java.util.List list24 = jbootEhcacheImpl20.getKeys("value~~~~~~~");
        java.util.List list26 = jbootEhcacheImpl20.getKeys("ehredis");
        net.sf.ehcache.Cache cache28 = jbootEhcacheImpl20.getOrAddCache("caredis");
        net.sf.ehcache.Element element29 = null;
        jbootEhredisCacheImpl14.notifyElementPut((net.sf.ehcache.Ehcache) cache28, element29);
        net.sf.ehcache.Element element31 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted((net.sf.ehcache.Ehcache) cache28, element31);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl6);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(cache11);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl18);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl20);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(cache28);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl0 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl2 = jbootCaredisCacheImpl0.getRedisCacheImpl();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl4 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl6 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl7 = jbootEhredisCacheImpl6.getRedisCacheImpl();
        jbootEhredisCacheImpl6.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl9 = jbootEhredisCacheImpl6.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache10 = noneCacheImpl4.get("key", (java.lang.Object) jbootEhcacheImpl9);
        jbootEhcacheImpl9.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl9.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        net.sf.ehcache.event.CacheEventListener cacheEventListener20 = jbootEhcacheImpl9.getCacheEventListener();
        java.lang.Object obj21 = null;
        jbootRedisCacheImpl2.put("jboot.cache.type", (java.lang.Object) jbootEhcacheImpl9, obj21);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl24 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list26 = caffeineCacheImpl24.getKeys("");
        caffeineCacheImpl24.removeAll("cachename");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl30 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl32 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl33 = jbootEhredisCacheImpl32.getRedisCacheImpl();
        jbootEhredisCacheImpl32.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl35 = jbootEhredisCacheImpl32.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache36 = noneCacheImpl30.get("key", (java.lang.Object) jbootEhcacheImpl35);
        jbootEhcacheImpl35.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        caffeineCacheImpl24.remove("", (java.lang.Object) "cachename");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl42 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl44 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl45 = jbootEhredisCacheImpl44.getRedisCacheImpl();
        jbootEhredisCacheImpl44.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl47 = jbootEhredisCacheImpl44.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache48 = noneCacheImpl42.get("key", (java.lang.Object) jbootEhcacheImpl47);
        jbootEhcacheImpl47.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl47.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list59 = jbootEhcacheImpl47.getKeys("caredis");
        java.util.List list60 = jbootEhcacheImpl47.getNames();
        // The following exception was thrown during execution in test generation
        try {
            jbootRedisCacheImpl2.put("none", (java.lang.Object) "cachename", (java.lang.Object) jbootEhcacheImpl47, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl2);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl7);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl9);
        org.junit.Assert.assertNull(jbootCache10);
        org.junit.Assert.assertNotNull(cacheEventListener20);
        org.junit.Assert.assertNull(list26);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl33);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl35);
        org.junit.Assert.assertNull(jbootCache36);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl45);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl47);
        org.junit.Assert.assertNull(jbootCache48);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl0 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl2 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl3 = jbootEhredisCacheImpl2.getRedisCacheImpl();
        jbootEhredisCacheImpl2.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl5 = jbootEhredisCacheImpl2.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache6 = noneCacheImpl0.get("key", (java.lang.Object) jbootEhcacheImpl5);
        java.util.List list7 = noneCacheImpl0.getNames();
        noneCacheImpl0.removeAll("ehredis");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl11 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl12 = jbootEhredisCacheImpl11.getRedisCacheImpl();
        jbootEhredisCacheImpl11.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl14 = jbootEhredisCacheImpl11.getEhcacheImpl();
        java.lang.Integer int17 = jbootEhcacheImpl14.getTtl("value:", (java.lang.Object) (short) -1);
        noneCacheImpl0.put("cachename", (java.lang.Object) "value:", (java.lang.Object) 10.0d, 10);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl22 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl24 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl25 = jbootEhredisCacheImpl24.getRedisCacheImpl();
        jbootEhredisCacheImpl24.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl27 = jbootEhredisCacheImpl24.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache28 = noneCacheImpl22.get("key", (java.lang.Object) jbootEhcacheImpl27);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl30 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list31 = caffeineCacheImpl30.getNames();
        java.lang.Object obj33 = null;
        caffeineCacheImpl30.refresh("key", obj33);
        noneCacheImpl22.setTtl("value:", (java.lang.Object) caffeineCacheImpl30, (int) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl38 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl40 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl41 = jbootEhredisCacheImpl40.getRedisCacheImpl();
        jbootEhredisCacheImpl40.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl43 = jbootEhredisCacheImpl40.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache44 = noneCacheImpl38.get("key", (java.lang.Object) jbootEhcacheImpl43);
        jbootEhcacheImpl43.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl43.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list55 = jbootEhcacheImpl43.getKeys("caredis");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig57 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str58 = jbootCacheConfig57.getAopCacheType();
        jbootEhcacheImpl43.put("hi!", (java.lang.Object) str58, (java.lang.Object) "cachename", (int) ' ');
        noneCacheImpl22.refresh("j2cache", (java.lang.Object) jbootEhcacheImpl43);
        java.util.EventListener eventListener63 = noneCacheImpl0.get("value~~~~~~~", (java.lang.Object) noneCacheImpl22);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl3);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl5);
        org.junit.Assert.assertNull(jbootCache6);
        org.junit.Assert.assertNull(list7);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl12);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl14);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl25);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl27);
        org.junit.Assert.assertNull(jbootCache28);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl41);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl43);
        org.junit.Assert.assertNull(jbootCache44);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "caffeine" + "'", str58, "caffeine");
        org.junit.Assert.assertNull(eventListener63);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl6 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int9 = caffeineCacheImpl6.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl11 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager12 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager12);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl13.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl14);
        caffeineCacheImpl6.put("", (java.lang.Object) noneCacheImpl11, (java.lang.Object) jbootEhcacheImpl13);
        caffeineCacheImpl0.put("jboot_ehredis_channel", (java.lang.Object) false, (java.lang.Object) noneCacheImpl11, (int) (byte) -1);
        java.lang.Integer int21 = noneCacheImpl11.getTtl("ehredis", (java.lang.Object) "redis");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl23 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int26 = caffeineCacheImpl23.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl23.removeAll("j2cache");
        java.util.List list29 = caffeineCacheImpl23.getNames();
        java.util.List list31 = caffeineCacheImpl23.getKeys("redis");
        caffeineCacheImpl23.remove("ehredis", (java.lang.Object) (byte) 0);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader35 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.sf.ehcache.terracotta.InternalEhcache internalEhcache36 = noneCacheImpl11.get("ehredis", (java.lang.Object) caffeineCacheImpl23, iDataLoader35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNull(list31);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        net.sf.ehcache.Ehcache ehcache3 = null;
        net.sf.ehcache.Element element4 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted(ehcache3, element4);
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = jbootEhredisCacheImpl0.get("", (java.lang.Object) 100.0d, iDataLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig0 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str1 = jbootCacheConfig0.getAopCacheType();
        jbootCacheConfig0.setAopCacheLiveSeconds((int) ' ');
        java.lang.String str4 = jbootCacheConfig0.getType();
        jbootCacheConfig0.setType("jboot_ehredis_channel");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "caffeine" + "'", str1, "caffeine");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "caffeine" + "'", str4, "caffeine");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl3 = jbootEhredisCacheImpl0.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl4 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        net.sf.ehcache.Ehcache ehcache6 = null;
        net.sf.ehcache.Element element7 = null;
        jbootEhredisCacheImpl0.notifyElementUpdated(ehcache6, element7);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl10 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl12 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl13 = jbootEhredisCacheImpl12.getRedisCacheImpl();
        jbootEhredisCacheImpl12.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl15 = jbootEhredisCacheImpl12.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache16 = noneCacheImpl10.get("key", (java.lang.Object) jbootEhcacheImpl15);
        jbootEhcacheImpl15.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl15.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        net.sf.ehcache.event.CacheEventListener cacheEventListener26 = jbootEhcacheImpl15.getCacheEventListener();
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl27 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl29 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl30 = jbootEhredisCacheImpl29.getRedisCacheImpl();
        jbootEhredisCacheImpl29.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl32 = jbootEhredisCacheImpl29.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache33 = noneCacheImpl27.get("key", (java.lang.Object) jbootEhcacheImpl32);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl35 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl36 = jbootEhredisCacheImpl35.getRedisCacheImpl();
        jbootEhredisCacheImpl35.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl38 = jbootEhredisCacheImpl35.getEhcacheImpl();
        java.lang.Class<?> wildcardClass39 = jbootEhredisCacheImpl35.getClass();
        noneCacheImpl27.setTtl("key", (java.lang.Object) wildcardClass39, (int) (byte) -1);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl43 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl45 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl46 = jbootEhredisCacheImpl45.getRedisCacheImpl();
        jbootEhredisCacheImpl45.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl48 = jbootEhredisCacheImpl45.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache49 = noneCacheImpl43.get("key", (java.lang.Object) jbootEhcacheImpl48);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl51 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list52 = caffeineCacheImpl51.getNames();
        java.lang.Object obj54 = null;
        caffeineCacheImpl51.refresh("key", obj54);
        noneCacheImpl43.setTtl("value:", (java.lang.Object) caffeineCacheImpl51, (int) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl59 = new io.jboot.components.cache.none.NoneCacheImpl();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl61 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl62 = jbootEhredisCacheImpl61.getRedisCacheImpl();
        jbootEhredisCacheImpl61.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl64 = jbootEhredisCacheImpl61.getEhcacheImpl();
        io.jboot.components.cache.JbootCache jbootCache65 = noneCacheImpl59.get("key", (java.lang.Object) jbootEhcacheImpl64);
        jbootEhcacheImpl64.setTtl("cachename", (java.lang.Object) (byte) 1, 100);
        jbootEhcacheImpl64.put("ehcache", (java.lang.Object) 0L, (java.lang.Object) 1.0d, (int) (short) 1);
        java.util.List list76 = jbootEhcacheImpl64.getKeys("caredis");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig78 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str79 = jbootCacheConfig78.getAopCacheType();
        jbootEhcacheImpl64.put("hi!", (java.lang.Object) str79, (java.lang.Object) "cachename", (int) ' ');
        noneCacheImpl43.refresh("j2cache", (java.lang.Object) jbootEhcacheImpl64);
        noneCacheImpl27.refresh("value:", (java.lang.Object) jbootEhcacheImpl64);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.put("jboot_ehredis_channel", (java.lang.Object) cacheEventListener26, (java.lang.Object) noneCacheImpl27, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class io.jboot.components.cache.ehredis.JbootEhredisCacheImpl does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl3);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl4);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl13);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl15);
        org.junit.Assert.assertNull(jbootCache16);
        org.junit.Assert.assertNotNull(cacheEventListener26);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl30);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl32);
        org.junit.Assert.assertNull(jbootCache33);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl36);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl46);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl48);
        org.junit.Assert.assertNull(jbootCache49);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl62);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl64);
        org.junit.Assert.assertNull(jbootCache65);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "caffeine" + "'", str79, "caffeine");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl5 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager6 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl7 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager6);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl7.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl8);
        caffeineCacheImpl0.put("", (java.lang.Object) noneCacheImpl5, (java.lang.Object) jbootEhcacheImpl7);
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl12 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.util.List list14 = caffeineCacheImpl12.getKeys("");
        io.jboot.components.cache.JbootCacheBase jbootCacheBase15 = noneCacheImpl5.get("cachename", (java.lang.Object) list14);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl18 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl19 = jbootEhredisCacheImpl18.getRedisCacheImpl();
        jbootEhredisCacheImpl18.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl21 = jbootEhredisCacheImpl18.getEhcacheImpl();
        jbootEhcacheImpl21.removeAll("value~~~~~~~");
        net.sf.ehcache.CacheManager cacheManager24 = jbootEhcacheImpl21.getCacheManager();
        noneCacheImpl5.put("hi!", (java.lang.Object) "value", (java.lang.Object) jbootEhcacheImpl21);
        io.jboot.components.cache.JbootCacheManager jbootCacheManager27 = io.jboot.components.cache.JbootCacheManager.me();
        io.jboot.components.cache.JbootCache jbootCache29 = jbootCacheManager27.getCache("caredis");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl30 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl31 = jbootEhredisCacheImpl30.getRedisCacheImpl();
        jbootEhredisCacheImpl30.dispose();
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl33 = jbootEhredisCacheImpl30.getEhcacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl34 = jbootEhredisCacheImpl30.getRedisCacheImpl();
        io.jboot.support.redis.JbootRedis jbootRedis35 = jbootRedisCacheImpl34.getRedis();
        jbootEhcacheImpl21.put("ehredis", (java.lang.Object) "caredis", (java.lang.Object) jbootRedisCacheImpl34, 0);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(list14);
        org.junit.Assert.assertNull(jbootCacheBase15);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl19);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl21);
        org.junit.Assert.assertNotNull(cacheManager24);
        org.junit.Assert.assertNotNull(jbootCacheManager27);
        org.junit.Assert.assertNotNull(jbootCache29);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl31);
        org.junit.Assert.assertNotNull(jbootEhcacheImpl33);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl34);
        org.junit.Assert.assertNotNull(jbootRedis35);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl6 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int9 = caffeineCacheImpl6.getTtl("none", (java.lang.Object) '#');
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl11 = new io.jboot.components.cache.none.NoneCacheImpl();
        net.sf.ehcache.CacheManager cacheManager12 = null;
        io.jboot.components.cache.ehcache.JbootEhcacheImpl jbootEhcacheImpl13 = new io.jboot.components.cache.ehcache.JbootEhcacheImpl(cacheManager12);
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl14 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        jbootEhcacheImpl13.setCacheEventListener((net.sf.ehcache.event.CacheEventListener) jbootEhredisCacheImpl14);
        caffeineCacheImpl6.put("", (java.lang.Object) noneCacheImpl11, (java.lang.Object) jbootEhcacheImpl13);
        caffeineCacheImpl0.put("jboot_ehredis_channel", (java.lang.Object) false, (java.lang.Object) noneCacheImpl11, (int) (byte) -1);
        java.lang.Integer int21 = noneCacheImpl11.getTtl("ehredis", (java.lang.Object) "redis");
        noneCacheImpl11.removeAll("ehredis");
        noneCacheImpl11.remove("redis", (java.lang.Object) 0.0f);
        io.jboot.components.cache.caredis.JbootCaredisCacheImpl jbootCaredisCacheImpl28 = new io.jboot.components.cache.caredis.JbootCaredisCacheImpl();
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl29 = jbootCaredisCacheImpl28.getCaffeineCacheImpl();
        noneCacheImpl11.remove("", (java.lang.Object) caffeineCacheImpl29);
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig32 = new io.jboot.components.cache.JbootCacheConfig();
        io.jboot.components.cache.JbootCache jbootCache33 = noneCacheImpl11.get("hi!", (java.lang.Object) jbootCacheConfig32);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(caffeineCacheImpl29);
        org.junit.Assert.assertNull(jbootCache33);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        java.util.List list6 = caffeineCacheImpl0.getNames();
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl8 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl9 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        jbootEhredisCacheImpl8.dispose();
        net.sf.ehcache.Ehcache ehcache11 = null;
        net.sf.ehcache.Element element12 = null;
        jbootEhredisCacheImpl8.notifyElementEvicted(ehcache11, element12);
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl14 = jbootEhredisCacheImpl8.getRedisCacheImpl();
        java.lang.Integer int15 = caffeineCacheImpl0.getTtl("type must not be null or blank.", (java.lang.Object) jbootRedisCacheImpl14);
        io.jboot.components.cache.none.NoneCacheImpl noneCacheImpl17 = new io.jboot.components.cache.none.NoneCacheImpl();
        com.jfinal.plugin.ehcache.IDataLoader iDataLoader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = jbootRedisCacheImpl14.get("caffeine", (java.lang.Object) noneCacheImpl17, iDataLoader18);
            org.junit.Assert.fail("Expected exception of type io.jboot.exception.JbootIllegalConfigException; message: can not connect to redis host  127.0.0.1:6379 , cause : redis.clients.jedis.exceptions.JedisConnectionException: Could not get a resource from the pool");
        } catch (io.jboot.exception.JbootIllegalConfigException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl9);
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        io.jboot.components.cache.ehredis.JbootEhredisCacheImpl jbootEhredisCacheImpl0 = new io.jboot.components.cache.ehredis.JbootEhredisCacheImpl();
        io.jboot.components.cache.redis.JbootRedisCacheImpl jbootRedisCacheImpl1 = jbootEhredisCacheImpl0.getRedisCacheImpl();
        jbootEhredisCacheImpl0.dispose();
        net.sf.ehcache.Ehcache ehcache3 = null;
        net.sf.ehcache.Element element4 = null;
        jbootEhredisCacheImpl0.notifyElementEvicted(ehcache3, element4);
        // The following exception was thrown during execution in test generation
        try {
            jbootEhredisCacheImpl0.onMessage("caffeine", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to io.jboot.components.cache.ehredis.JbootEhredisMessage");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jbootRedisCacheImpl1);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        java.util.List list6 = caffeineCacheImpl0.getNames();
        java.util.List list8 = caffeineCacheImpl0.getKeys("redis");
        caffeineCacheImpl0.remove("ehredis", (java.lang.Object) (byte) 0);
        caffeineCacheImpl0.removeAll("jboot_caredis_channel");
        caffeineCacheImpl0.removeAll("hi!");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(list8);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        io.jboot.components.cache.caffeine.CaffeineCacheImpl caffeineCacheImpl0 = new io.jboot.components.cache.caffeine.CaffeineCacheImpl();
        java.lang.Integer int3 = caffeineCacheImpl0.getTtl("none", (java.lang.Object) '#');
        caffeineCacheImpl0.removeAll("j2cache");
        io.jboot.components.cache.JbootCacheConfig jbootCacheConfig7 = new io.jboot.components.cache.JbootCacheConfig();
        java.lang.String str8 = jbootCacheConfig7.getAopCacheType();
        java.lang.String str9 = jbootCacheConfig7.getAopCacheType();
        java.lang.Integer int10 = caffeineCacheImpl0.getTtl("cachename", (java.lang.Object) str9);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "caffeine" + "'", str8, "caffeine");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "caffeine" + "'", str9, "caffeine");
        org.junit.Assert.assertNull(int10);
    }
}

