package com.openpojo.issues.issue112;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = serviceRegistrar0.toString();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean2 = logger1.isTraceEnabled();
        com.openpojo.log.Logger logger4 = com.openpojo.log.LoggerFactory.getLogger("Testing Field [");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        logger1.warn((java.lang.Object) logger4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean2 = logger1.isTraceEnabled();
        com.openpojo.log.Logger logger4 = com.openpojo.log.LoggerFactory.getLogger("100");
        com.openpojo.reflection.exception.ReflectionException reflectionException8 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException9 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException8);
        com.openpojo.reflection.exception.ReflectionException reflectionException12 = com.openpojo.reflection.exception.ReflectionException.getInstance("Error creating new logger");
        com.openpojo.reflection.exception.ReflectionException reflectionException13 = com.openpojo.reflection.exception.ReflectionException.getInstance("com.openpojo.log.impl.SLF4JLogger", (java.lang.Throwable) reflectionException12);
        reflectionException9.addSuppressed((java.lang.Throwable) reflectionException12);
        com.openpojo.reflection.exception.ReflectionException reflectionException16 = com.openpojo.reflection.exception.ReflectionException.getInstance("UndefinedLogSource");
        reflectionException12.addSuppressed((java.lang.Throwable) reflectionException16);
        com.openpojo.reflection.exception.ReflectionException reflectionException18 = com.openpojo.reflection.exception.ReflectionException.getInstance("", (java.lang.Throwable) reflectionException16);
        logger4.debug((java.lang.Object) reflectionException16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        logger1.debug((java.lang.Object) logger4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        serviceRegistrar0.initializePojoClassLookupService();
        serviceRegistrar0.initializeRandomGeneratorService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = serviceRegistrar0.toString();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService6 = serviceRegistrar0.getPojoClassLookupService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = serviceRegistrar0.toString();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService1 = serviceRegistrar0.getPojoClassLookupService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = serviceRegistrar0.toString();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.openpojo.log.Logger logger1 = com.openpojo.log.LoggerFactory.getLogger("Error creating new logger");
        boolean boolean2 = logger1.isTraceEnabled();
        java.lang.String[] strArray4 = com.openpojo.log.LoggerFactory.SUPPORTED_LOGGERS;
        logger1.warn("com.openpojo.log.impl.SLF4JLogger", (java.lang.Object[]) strArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.openpojo.reflection.PojoClass pojoClass6 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        java.lang.String[] strArray1 = com.openpojo.log.LoggerFactory.SUPPORTED_LOGGERS;
        java.lang.Class<?> wildcardClass2 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadeClass(strArray1);
        java.lang.String str3 = com.openpojo.log.utils.MessageFormatter.format("com.openpojo.log.impl.Log4JLogger", (java.lang.Object[]) strArray1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.openpojo.reflection.PojoClass pojoClass4 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        java.lang.String[] strArray0 = com.openpojo.log.LoggerFactory.SUPPORTED_LOGGERS;
        java.lang.Class<?> wildcardClass1 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadeClass(strArray0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.openpojo.reflection.PojoClass pojoClass2 = com.openpojo.reflection.facade.FacadeFactory.getLoadedFacadePojoClass(strArray0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.openpojo.registry.ServiceRegistrar serviceRegistrar0 = com.openpojo.registry.ServiceRegistrar.getInstance();
        com.openpojo.random.service.impl.DefaultRandomGeneratorService defaultRandomGeneratorService1 = new com.openpojo.random.service.impl.DefaultRandomGeneratorService();
        java.lang.String str2 = defaultRandomGeneratorService1.getName();
        java.lang.String str3 = defaultRandomGeneratorService1.getName();
        com.openpojo.random.RandomGenerator randomGenerator4 = defaultRandomGeneratorService1.getDefaultRandomGenerator();
        serviceRegistrar0.setRandomGeneratorService((com.openpojo.random.service.RandomGeneratorService) defaultRandomGeneratorService1);
        com.openpojo.random.service.RandomGeneratorService randomGeneratorService6 = serviceRegistrar0.getRandomGeneratorService();
        com.openpojo.reflection.service.PojoClassLookupService pojoClassLookupService7 = serviceRegistrar0.getPojoClassLookupService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serviceRegistrar0.toString();
    }
}

