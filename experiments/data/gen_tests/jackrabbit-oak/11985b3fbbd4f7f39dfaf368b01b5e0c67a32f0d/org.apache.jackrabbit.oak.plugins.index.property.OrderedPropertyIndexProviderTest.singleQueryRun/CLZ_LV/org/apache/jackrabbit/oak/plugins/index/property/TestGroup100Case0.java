package org.apache.jackrabbit.oak.plugins.index.property;

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
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState0 = null;
        boolean boolean1 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.isAscending(nodeState0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.util.ArrayList<java.lang.String> strList0 = com.google.common.collect.Lists.newArrayList();
        org.junit.Assert.assertNotNull(strList0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ordered" + "'", str0, "ordered");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DIRECTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "direction" + "'", str0, "direction");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("JCR-SQL2", (java.lang.Object) 1.0d);
        org.slf4j.Logger logger26 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger26.warn("hi!", (java.lang.Object) (byte) 1);
        logger1.trace("direction", (java.lang.Object) "hi!", (java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger26);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection1 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.fromString("SELECT * FROM [oak:Unstructured]");
        org.junit.Assert.assertNull(orderDirection1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str0 = org.slf4j.Logger.ROOT_LOGGER_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ROOT" + "'", str0, "ROOT");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.util.concurrent.CopyOnWriteArrayList<org.slf4j.Logger> loggerList0 = com.google.common.collect.Lists.newCopyOnWriteArrayList();
        org.junit.Assert.assertNotNull(loggerList0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.util.ArrayList<java.lang.Enum<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection>> orderDirectionEnumList1 = com.google.common.collect.Lists.newArrayListWithCapacity(10);
        org.junit.Assert.assertNotNull(orderDirectionEnumList1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.util.LinkedList<java.io.Serializable> serializableList0 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList2 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList0, (int) '4');
        org.junit.Assert.assertNotNull(serializableList0);
        org.junit.Assert.assertNotNull(serializableListList2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.google.common.collect.ImmutableList<java.lang.Character> charList1 = com.google.common.collect.Lists.charactersOf("JCR-SQL2");
        org.junit.Assert.assertNotNull(charList1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection0 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.junit.Assert.assertTrue("'" + orderDirection0 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection0.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider.setThreshold((int) (byte) 100);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState0 = null;
        boolean boolean1 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.isDescending(nodeState0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.util.List<java.io.Serializable> serializableList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList1 = com.google.common.collect.Lists.reverse(serializableList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState0 = null;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection1 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.fromIndexMeta(nodeState0);
        org.junit.Assert.assertTrue("'" + orderDirection1 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection1.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.util.ArrayList<java.lang.Cloneable> cloneableList0 = com.google.common.collect.Lists.newArrayList();
        java.util.LinkedList<java.io.Serializable> serializableList1 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList2 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList4 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList2, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList5 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList7 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList5, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList8 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList10 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList8, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList11 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList13 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList11, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList14 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray16 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray17 = (java.util.Queue<java.io.Serializable>[]) queueArray16;
        serializableQueueArray17[0] = serializableList1;
        serializableQueueArray17[1] = serializableList2;
        serializableQueueArray17[2] = serializableList5;
        serializableQueueArray17[3] = serializableList8;
        serializableQueueArray17[4] = serializableList11;
        serializableQueueArray17[5] = serializableList14;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList30 = com.google.common.collect.Lists.newArrayList(serializableQueueArray17);
        java.util.LinkedList<java.io.Serializable> serializableList31 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList32 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList34 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList32, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList35 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList37 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList35, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList38 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList40 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList38, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList41 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList43 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList41, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList44 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray46 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray47 = (java.util.Queue<java.io.Serializable>[]) queueArray46;
        serializableQueueArray47[0] = serializableList31;
        serializableQueueArray47[1] = serializableList32;
        serializableQueueArray47[2] = serializableList35;
        serializableQueueArray47[3] = serializableList38;
        serializableQueueArray47[4] = serializableList41;
        serializableQueueArray47[5] = serializableList44;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList60 = com.google.common.collect.Lists.newArrayList(serializableQueueArray47);
        java.util.ArrayList<java.io.Serializable> serializableList62 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Character> charList64 = com.google.common.collect.Lists.charactersOf("JCR-SQL2");
        java.util.LinkedList<java.io.Serializable> serializableList65 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList66 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList68 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList66, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList69 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList71 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList69, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList72 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList74 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList72, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList75 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList77 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList75, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList78 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray80 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray81 = (java.util.Queue<java.io.Serializable>[]) queueArray80;
        serializableQueueArray81[0] = serializableList65;
        serializableQueueArray81[1] = serializableList66;
        serializableQueueArray81[2] = serializableList69;
        serializableQueueArray81[3] = serializableList72;
        serializableQueueArray81[4] = serializableList75;
        serializableQueueArray81[5] = serializableList78;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList94 = com.google.common.collect.Lists.newArrayList(serializableQueueArray81);
        java.util.RandomAccess[] randomAccessArray95 = new java.util.RandomAccess[] { serializableQueueList30, serializableQueueList60, serializableList62, charList64, serializableQueueList94 };
        java.util.List<java.util.RandomAccess> randomAccessList96 = com.google.common.collect.Lists.asList((java.util.RandomAccess) cloneableList0, randomAccessArray95);
        org.junit.Assert.assertNotNull(cloneableList0);
        org.junit.Assert.assertNotNull(serializableList1);
        org.junit.Assert.assertNotNull(serializableList2);
        org.junit.Assert.assertNotNull(serializableListList4);
        org.junit.Assert.assertNotNull(serializableList5);
        org.junit.Assert.assertNotNull(serializableListList7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(serializableListList10);
        org.junit.Assert.assertNotNull(serializableList11);
        org.junit.Assert.assertNotNull(serializableListList13);
        org.junit.Assert.assertNotNull(serializableList14);
        org.junit.Assert.assertNotNull(queueArray16);
        org.junit.Assert.assertNotNull(serializableQueueArray17);
        org.junit.Assert.assertNotNull(serializableQueueList30);
        org.junit.Assert.assertNotNull(serializableList31);
        org.junit.Assert.assertNotNull(serializableList32);
        org.junit.Assert.assertNotNull(serializableListList34);
        org.junit.Assert.assertNotNull(serializableList35);
        org.junit.Assert.assertNotNull(serializableListList37);
        org.junit.Assert.assertNotNull(serializableList38);
        org.junit.Assert.assertNotNull(serializableListList40);
        org.junit.Assert.assertNotNull(serializableList41);
        org.junit.Assert.assertNotNull(serializableListList43);
        org.junit.Assert.assertNotNull(serializableList44);
        org.junit.Assert.assertNotNull(queueArray46);
        org.junit.Assert.assertNotNull(serializableQueueArray47);
        org.junit.Assert.assertNotNull(serializableQueueList60);
        org.junit.Assert.assertNotNull(serializableList62);
        org.junit.Assert.assertNotNull(charList64);
        org.junit.Assert.assertNotNull(serializableList65);
        org.junit.Assert.assertNotNull(serializableList66);
        org.junit.Assert.assertNotNull(serializableListList68);
        org.junit.Assert.assertNotNull(serializableList69);
        org.junit.Assert.assertNotNull(serializableListList71);
        org.junit.Assert.assertNotNull(serializableList72);
        org.junit.Assert.assertNotNull(serializableListList74);
        org.junit.Assert.assertNotNull(serializableList75);
        org.junit.Assert.assertNotNull(serializableListList77);
        org.junit.Assert.assertNotNull(serializableList78);
        org.junit.Assert.assertNotNull(queueArray80);
        org.junit.Assert.assertNotNull(serializableQueueArray81);
        org.junit.Assert.assertNotNull(serializableQueueList94);
        org.junit.Assert.assertNotNull(randomAccessArray95);
        org.junit.Assert.assertNotNull(randomAccessList96);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker4 = null;
        java.lang.Object obj6 = null;
        org.slf4j.Logger logger8 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger8.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable13 = null;
        logger8.info("", throwable13);
        logger1.warn(marker4, "", obj6, (java.lang.Object) "");
        boolean boolean16 = logger1.isDebugEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("JCR-SQL2", (java.lang.Object) 1.0d);
        boolean boolean24 = logger1.isTraceEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.util.LinkedList<java.util.List<java.io.Serializable>> serializableListList0 = com.google.common.collect.Lists.newLinkedList();
        org.junit.Assert.assertNotNull(serializableListList0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean13 = logger9.isErrorEnabled();
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger15.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable20 = null;
        logger15.info("", throwable20);
        org.slf4j.Marker marker22 = null;
        java.lang.Object[] objArray26 = new java.lang.Object[] { true, 0.0f };
        logger15.info(marker22, "JCR-SQL2", objArray26);
        logger1.debug("", (java.lang.Object) logger9, (java.lang.Object) marker22);
        org.slf4j.Marker marker29 = null;
        logger9.trace(marker29, "JCR-SQL2");
        java.lang.Throwable throwable33 = null;
        logger9.warn("ascending", throwable33);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 0.0]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        int int0 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.TRACK_DEPRECATION_EVERY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10000 + "'", int0 == 10000);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.google.common.collect.ImmutableList<java.lang.Character> charList1 = com.google.common.collect.Lists.charactersOf("");
        org.junit.Assert.assertNotNull(charList1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection8 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger1.debug("", (java.lang.Object) orderDirection8, (java.lang.Object) false);
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker13 = null;
        org.slf4j.Logger logger16 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger12.warn(marker13, "hi!", (java.lang.Object) logger16);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection19 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger12.debug("", (java.lang.Object) orderDirection19, (java.lang.Object) false);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection22 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.slf4j.Logger logger24 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker25 = null;
        org.slf4j.Logger logger28 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger24.warn(marker25, "hi!", (java.lang.Object) logger28);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection31 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger24.debug("", (java.lang.Object) orderDirection31, (java.lang.Object) false);
        org.slf4j.Logger logger35 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker36 = null;
        org.slf4j.Logger logger39 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger35.warn(marker36, "hi!", (java.lang.Object) logger39);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection42 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger35.debug("", (java.lang.Object) orderDirection42, (java.lang.Object) false);
        boolean boolean45 = orderDirection42.isAscending();
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection46 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection47 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray48 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] { orderDirection22, orderDirection31, orderDirection42, orderDirection46, orderDirection47 };
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList49 = com.google.common.collect.Lists.asList(orderDirection8, orderDirection19, orderDirectionArray48);
        java.lang.String str50 = orderDirection19.getDirection();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + orderDirection8 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection8.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + orderDirection19 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection19.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection22 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection22.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertTrue("'" + orderDirection31 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection31.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger35);
        org.junit.Assert.assertNotNull(logger39);
        org.junit.Assert.assertTrue("'" + orderDirection42 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection42.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + orderDirection46 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection46.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection47 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection47.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(orderDirectionArray48);
        org.junit.Assert.assertNotNull(orderDirectionList49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ascending" + "'", str50, "ascending");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.google.common.collect.ImmutableList<java.lang.Character> charList1 = com.google.common.collect.Lists.charactersOf("ROOT");
        org.junit.Assert.assertNotNull(charList1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        boolean boolean17 = logger1.isWarnEnabled();
        org.slf4j.Marker marker18 = null;
        org.slf4j.Logger logger22 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger22.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable27 = null;
        logger22.info("", throwable27);
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable36 = null;
        logger31.info("", throwable36);
        org.slf4j.Marker marker38 = null;
        java.lang.Object[] objArray42 = new java.lang.Object[] { true, 0.0f };
        logger31.info(marker38, "JCR-SQL2", objArray42);
        org.slf4j.Marker marker44 = null;
        logger31.debug(marker44, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker47 = null;
        org.slf4j.Logger logger50 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger50.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable55 = null;
        logger50.info("", throwable55);
        org.slf4j.Marker marker57 = null;
        java.lang.Object[] objArray61 = new java.lang.Object[] { true, 0.0f };
        logger50.info(marker57, "JCR-SQL2", objArray61);
        org.slf4j.Logger logger64 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger64.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable69 = null;
        logger64.info("", throwable69);
        org.slf4j.Marker marker71 = null;
        java.lang.Object[] objArray75 = new java.lang.Object[] { true, 0.0f };
        logger64.info(marker71, "JCR-SQL2", objArray75);
        java.lang.Object[] objArray77 = new java.lang.Object[] { logger50, marker71 };
        logger31.warn(marker47, "SELECT * FROM [oak:Unstructured]", objArray77);
        logger22.trace("JCR-SQL2", objArray77);
        org.slf4j.Marker marker80 = null;
        org.slf4j.Logger logger84 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker85 = null;
        java.lang.Throwable throwable87 = null;
        logger84.trace(marker85, "SELECT * FROM [oak:Unstructured]", throwable87);
        logger22.warn(marker80, "JCR-SQL2", (java.lang.Object) (short) -1, (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        logger1.info(marker18, "JCR-SQL2", (java.lang.Object) (short) 100, (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker91 = null;
        boolean boolean92 = logger1.isDebugEnabled(marker91);
        java.lang.Object[] objArray95 = new java.lang.Object[] { 1 };
        logger1.debug("ascending", objArray95);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger50);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger64);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[Logger[hi!], null]");
        org.junit.Assert.assertNotNull(logger84);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray95), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray95), "[1]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        java.lang.String str19 = logger1.getName();
        java.lang.Throwable throwable21 = null;
        logger1.error("", throwable21);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable25 = null;
        logger20.info("", throwable25);
        org.slf4j.Marker marker27 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { true, 0.0f };
        logger20.info(marker27, "JCR-SQL2", objArray31);
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger34.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable39 = null;
        logger34.info("", throwable39);
        org.slf4j.Marker marker41 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { true, 0.0f };
        logger34.info(marker41, "JCR-SQL2", objArray45);
        java.lang.Object[] objArray47 = new java.lang.Object[] { logger20, marker41 };
        logger1.warn(marker17, "SELECT * FROM [oak:Unstructured]", objArray47);
        org.slf4j.Marker marker49 = null;
        boolean boolean50 = logger1.isWarnEnabled(marker49);
        org.slf4j.Marker marker51 = null;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider orderedPropertyIndexProvider53 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider();
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState54 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList55 = orderedPropertyIndexProvider53.getQueryIndexes(nodeState54);
        logger1.warn(marker51, "ascending", (java.lang.Object) nodeState54);
        logger1.error("SELECT * FROM [oak:Unstructured]");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardList55);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Logger logger18 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker19 = null;
        org.slf4j.Logger logger22 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger18.warn(marker19, "hi!", (java.lang.Object) logger22);
        org.slf4j.Logger logger26 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger26.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean30 = logger26.isErrorEnabled();
        org.slf4j.Logger logger32 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger32.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable37 = null;
        logger32.info("", throwable37);
        org.slf4j.Marker marker39 = null;
        java.lang.Object[] objArray43 = new java.lang.Object[] { true, 0.0f };
        logger32.info(marker39, "JCR-SQL2", objArray43);
        logger18.debug("", (java.lang.Object) logger26, (java.lang.Object) marker39);
        logger26.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        java.util.LinkedList<java.io.Serializable> serializableList49 = com.google.common.collect.Lists.newLinkedList();
        logger12.info("", (java.lang.Object) "SELECT * FROM [oak:Unstructured]", (java.lang.Object) serializableList49);
        java.util.Queue<java.io.Serializable> serializableQueue51 = null;
        java.util.LinkedList<java.io.Serializable> serializableList52 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList53 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList55 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList53, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList56 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList58 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList56, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList59 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList61 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList59, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList62 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList64 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList62, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList65 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray67 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray68 = (java.util.Queue<java.io.Serializable>[]) queueArray67;
        serializableQueueArray68[0] = serializableList52;
        serializableQueueArray68[1] = serializableList53;
        serializableQueueArray68[2] = serializableList56;
        serializableQueueArray68[3] = serializableList59;
        serializableQueueArray68[4] = serializableList62;
        serializableQueueArray68[5] = serializableList65;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList81 = com.google.common.collect.Lists.newArrayList(serializableQueueArray68);
        java.util.List<java.util.Queue<java.io.Serializable>> serializableQueueList82 = com.google.common.collect.Lists.asList((java.util.Queue<java.io.Serializable>) serializableList49, serializableQueue51, serializableQueueArray68);
        java.util.List<java.io.Serializable> serializableList83 = com.google.common.collect.Lists.reverse((java.util.List<java.io.Serializable>) serializableList49);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertNotNull(serializableList49);
        org.junit.Assert.assertNotNull(serializableList52);
        org.junit.Assert.assertNotNull(serializableList53);
        org.junit.Assert.assertNotNull(serializableListList55);
        org.junit.Assert.assertNotNull(serializableList56);
        org.junit.Assert.assertNotNull(serializableListList58);
        org.junit.Assert.assertNotNull(serializableList59);
        org.junit.Assert.assertNotNull(serializableListList61);
        org.junit.Assert.assertNotNull(serializableList62);
        org.junit.Assert.assertNotNull(serializableListList64);
        org.junit.Assert.assertNotNull(serializableList65);
        org.junit.Assert.assertNotNull(queueArray67);
        org.junit.Assert.assertNotNull(serializableQueueArray68);
        org.junit.Assert.assertNotNull(serializableQueueList81);
        org.junit.Assert.assertNotNull(serializableQueueList82);
        org.junit.Assert.assertNotNull(serializableList83);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Marker marker11 = null;
        logger1.trace(marker11, "JCR-SQL2", (java.lang.Object) 100.0f);
        org.slf4j.Marker marker15 = null;
        java.util.List<java.lang.Character> charList18 = com.google.common.collect.Lists.charactersOf((java.lang.CharSequence) "ascending");
        logger1.trace(marker15, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) charList18);
        org.slf4j.Marker marker20 = null;
        boolean boolean21 = logger1.isDebugEnabled(marker20);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.util.ArrayList<java.util.Deque<java.io.Serializable>> serializableQueueList1 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (short) 1);
        org.junit.Assert.assertNotNull(serializableQueueList1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker5 = null;
        boolean boolean6 = logger1.isWarnEnabled(marker5);
        org.slf4j.Marker marker7 = null;
        boolean boolean8 = logger1.isWarnEnabled(marker7);
        org.slf4j.Logger logger11 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker12 = null;
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger11.warn(marker12, "hi!", (java.lang.Object) logger15);
        org.slf4j.Logger logger19 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger19.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean23 = logger19.isErrorEnabled();
        org.slf4j.Logger logger25 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger25.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable30 = null;
        logger25.info("", throwable30);
        org.slf4j.Marker marker32 = null;
        java.lang.Object[] objArray36 = new java.lang.Object[] { true, 0.0f };
        logger25.info(marker32, "JCR-SQL2", objArray36);
        logger11.debug("", (java.lang.Object) logger19, (java.lang.Object) marker32);
        logger19.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        logger1.warn("", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        logger1.info("JCR-SQL2");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[true, 0.0]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection0 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.DESC;
        boolean boolean1 = orderDirection0.isAscending();
        org.junit.Assert.assertTrue("'" + orderDirection0 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.DESC + "'", orderDirection0.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.DESC));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Logger logger14 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger14.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean18 = logger14.isErrorEnabled();
        logger14.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker22 = null;
        java.lang.Object obj24 = null;
        org.slf4j.Logger logger26 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger26.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable31 = null;
        logger26.info("", throwable31);
        org.slf4j.Marker marker33 = null;
        java.lang.Object[] objArray37 = new java.lang.Object[] { true, 0.0f };
        logger26.info(marker33, "JCR-SQL2", objArray37);
        org.slf4j.Marker marker39 = null;
        logger26.debug(marker39, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker42 = null;
        org.slf4j.Logger logger45 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger45.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable50 = null;
        logger45.info("", throwable50);
        org.slf4j.Marker marker52 = null;
        java.lang.Object[] objArray56 = new java.lang.Object[] { true, 0.0f };
        logger45.info(marker52, "JCR-SQL2", objArray56);
        org.slf4j.Logger logger59 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger59.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable64 = null;
        logger59.info("", throwable64);
        org.slf4j.Marker marker66 = null;
        java.lang.Object[] objArray70 = new java.lang.Object[] { true, 0.0f };
        logger59.info(marker66, "JCR-SQL2", objArray70);
        java.lang.Object[] objArray72 = new java.lang.Object[] { logger45, marker66 };
        logger26.warn(marker42, "SELECT * FROM [oak:Unstructured]", objArray72);
        logger14.debug(marker22, "SELECT * FROM [oak:Unstructured]", obj24, (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker75 = null;
        logger14.info(marker75, "ROOT", (java.lang.Object) (short) 1);
        logger1.info("ROOT", (java.lang.Object) (short) 100, (java.lang.Object) logger14);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger59);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[Logger[hi!], null]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.util.LinkedList<org.slf4j.Logger> loggerList0 = com.google.common.collect.Lists.newLinkedList();
        org.junit.Assert.assertNotNull(loggerList0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider orderedPropertyIndexProvider0 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider();
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState1 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList2 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState1);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState3 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList4 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState3);
        org.junit.Assert.assertNotNull(wildcardList2);
        org.junit.Assert.assertNotNull(wildcardList4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection8 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger1.debug("", (java.lang.Object) orderDirection8, (java.lang.Object) false);
        boolean boolean11 = logger1.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + orderDirection8 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection8.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        logger5.info("");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger12.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable17 = null;
        logger12.info("", throwable17);
        org.slf4j.Marker marker19 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] { true, 0.0f };
        logger12.info(marker19, "JCR-SQL2", objArray23);
        org.slf4j.Marker marker25 = null;
        logger12.debug(marker25, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker28 = null;
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable36 = null;
        logger31.info("", throwable36);
        org.slf4j.Marker marker38 = null;
        java.lang.Object[] objArray42 = new java.lang.Object[] { true, 0.0f };
        logger31.info(marker38, "JCR-SQL2", objArray42);
        org.slf4j.Logger logger45 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger45.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable50 = null;
        logger45.info("", throwable50);
        org.slf4j.Marker marker52 = null;
        java.lang.Object[] objArray56 = new java.lang.Object[] { true, 0.0f };
        logger45.info(marker52, "JCR-SQL2", objArray56);
        java.lang.Object[] objArray58 = new java.lang.Object[] { logger31, marker52 };
        logger12.warn(marker28, "SELECT * FROM [oak:Unstructured]", objArray58);
        logger5.debug(marker9, "", (java.lang.Object) objArray58, (java.lang.Object) (-1.0d));
        org.slf4j.Marker marker62 = null;
        org.slf4j.Logger logger65 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger65.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean69 = logger65.isErrorEnabled();
        logger65.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker73 = null;
        org.slf4j.Logger logger76 = org.slf4j.LoggerFactory.getLogger("");
        logger76.warn("SELECT * FROM [oak:Unstructured]");
        logger65.warn(marker73, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger76);
        logger5.debug(marker62, "ROOT", (java.lang.Object) logger65, (java.lang.Object) (-1.0f));
        org.slf4j.Marker marker82 = null;
        org.slf4j.Logger logger85 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger85.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable90 = null;
        logger85.info("", throwable90);
        org.slf4j.Marker marker92 = null;
        java.lang.Object[] objArray96 = new java.lang.Object[] { true, 0.0f };
        logger85.info(marker92, "JCR-SQL2", objArray96);
        logger65.error(marker82, "", objArray96);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[Logger[hi!], null]");
        org.junit.Assert.assertNotNull(logger65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(logger76);
        org.junit.Assert.assertNotNull(logger85);
        org.junit.Assert.assertNotNull(objArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray96), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray96), "[true, 0.0]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Logger logger16 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger16.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean20 = logger16.isErrorEnabled();
        logger16.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker24 = null;
        org.slf4j.Logger logger27 = org.slf4j.LoggerFactory.getLogger("");
        logger27.warn("SELECT * FROM [oak:Unstructured]");
        logger16.warn(marker24, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger27);
        logger27.warn("direction", (java.lang.Object) 1.0d);
        logger1.debug("ascending", (java.lang.Object) logger27);
        org.slf4j.Marker marker35 = null;
        logger1.info(marker35, "ascending");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(logger27);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Marker marker11 = null;
        logger1.trace(marker11, "JCR-SQL2", (java.lang.Object) 100.0f);
        boolean boolean15 = logger1.isErrorEnabled();
        org.slf4j.Marker marker16 = null;
        org.slf4j.Logger logger19 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger19.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean23 = logger19.isErrorEnabled();
        logger19.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker27 = null;
        java.lang.Object obj29 = null;
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable36 = null;
        logger31.info("", throwable36);
        org.slf4j.Marker marker38 = null;
        java.lang.Object[] objArray42 = new java.lang.Object[] { true, 0.0f };
        logger31.info(marker38, "JCR-SQL2", objArray42);
        org.slf4j.Marker marker44 = null;
        logger31.debug(marker44, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker47 = null;
        org.slf4j.Logger logger50 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger50.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable55 = null;
        logger50.info("", throwable55);
        org.slf4j.Marker marker57 = null;
        java.lang.Object[] objArray61 = new java.lang.Object[] { true, 0.0f };
        logger50.info(marker57, "JCR-SQL2", objArray61);
        org.slf4j.Logger logger64 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger64.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable69 = null;
        logger64.info("", throwable69);
        org.slf4j.Marker marker71 = null;
        java.lang.Object[] objArray75 = new java.lang.Object[] { true, 0.0f };
        logger64.info(marker71, "JCR-SQL2", objArray75);
        java.lang.Object[] objArray77 = new java.lang.Object[] { logger50, marker71 };
        logger31.warn(marker47, "SELECT * FROM [oak:Unstructured]", objArray77);
        logger19.debug(marker27, "SELECT * FROM [oak:Unstructured]", obj29, (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        logger1.info(marker16, "hi!", obj29);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger50);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger64);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[Logger[hi!], null]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        logger1.error("hi!");
        java.lang.Throwable throwable26 = null;
        logger1.warn("", throwable26);
        java.lang.Class<?> wildcardClass28 = logger1.getClass();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        java.lang.Throwable throwable7 = null;
        logger1.debug("direction", throwable7);
        org.slf4j.Marker marker9 = null;
        boolean boolean10 = logger1.isTraceEnabled(marker9);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker4 = null;
        java.lang.Object obj6 = null;
        org.slf4j.Logger logger8 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger8.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable13 = null;
        logger8.info("", throwable13);
        logger1.warn(marker4, "", obj6, (java.lang.Object) "");
        org.slf4j.Marker marker16 = null;
        logger1.trace(marker16, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) 10.0d, (java.lang.Object) (-1.0d));
        org.slf4j.Marker marker21 = null;
        logger1.info(marker21, "SELECT * FROM [oak:Unstructured]");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection1 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.fromString("direction");
        org.junit.Assert.assertNull(orderDirection1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection1 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.fromString("ascending");
        org.junit.Assert.assertTrue("'" + orderDirection1 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection1.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker5 = null;
        boolean boolean6 = logger1.isWarnEnabled(marker5);
        logger1.trace("hi!");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.info("JCR-SQL2");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Marker marker11 = null;
        logger1.trace(marker11, "JCR-SQL2", (java.lang.Object) 100.0f);
        org.slf4j.Logger logger17 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker18 = null;
        org.slf4j.Logger logger21 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger17.warn(marker18, "hi!", (java.lang.Object) logger21);
        org.slf4j.Logger logger25 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker26 = null;
        org.slf4j.Logger logger29 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger25.warn(marker26, "hi!", (java.lang.Object) logger29);
        logger29.info("");
        org.slf4j.Marker marker33 = null;
        org.slf4j.Logger logger36 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger36.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable41 = null;
        logger36.info("", throwable41);
        org.slf4j.Marker marker43 = null;
        java.lang.Object[] objArray47 = new java.lang.Object[] { true, 0.0f };
        logger36.info(marker43, "JCR-SQL2", objArray47);
        org.slf4j.Marker marker49 = null;
        logger36.debug(marker49, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker52 = null;
        org.slf4j.Logger logger55 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger55.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable60 = null;
        logger55.info("", throwable60);
        org.slf4j.Marker marker62 = null;
        java.lang.Object[] objArray66 = new java.lang.Object[] { true, 0.0f };
        logger55.info(marker62, "JCR-SQL2", objArray66);
        org.slf4j.Logger logger69 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger69.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable74 = null;
        logger69.info("", throwable74);
        org.slf4j.Marker marker76 = null;
        java.lang.Object[] objArray80 = new java.lang.Object[] { true, 0.0f };
        logger69.info(marker76, "JCR-SQL2", objArray80);
        java.lang.Object[] objArray82 = new java.lang.Object[] { logger55, marker76 };
        logger36.warn(marker52, "SELECT * FROM [oak:Unstructured]", objArray82);
        logger29.debug(marker33, "", (java.lang.Object) objArray82, (java.lang.Object) (-1.0d));
        logger17.debug("", objArray82);
        logger1.error("ordered", objArray82);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertNotNull(logger36);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger55);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger69);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[Logger[hi!], null]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker10 = null;
        org.slf4j.Logger logger13 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn(marker10, "hi!", (java.lang.Object) logger13);
        logger13.info("");
        org.slf4j.Marker marker17 = null;
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable25 = null;
        logger20.info("", throwable25);
        org.slf4j.Marker marker27 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { true, 0.0f };
        logger20.info(marker27, "JCR-SQL2", objArray31);
        org.slf4j.Marker marker33 = null;
        logger20.debug(marker33, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker36 = null;
        org.slf4j.Logger logger39 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger39.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable44 = null;
        logger39.info("", throwable44);
        org.slf4j.Marker marker46 = null;
        java.lang.Object[] objArray50 = new java.lang.Object[] { true, 0.0f };
        logger39.info(marker46, "JCR-SQL2", objArray50);
        org.slf4j.Logger logger53 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger53.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable58 = null;
        logger53.info("", throwable58);
        org.slf4j.Marker marker60 = null;
        java.lang.Object[] objArray64 = new java.lang.Object[] { true, 0.0f };
        logger53.info(marker60, "JCR-SQL2", objArray64);
        java.lang.Object[] objArray66 = new java.lang.Object[] { logger39, marker60 };
        logger20.warn(marker36, "SELECT * FROM [oak:Unstructured]", objArray66);
        logger13.debug(marker17, "", (java.lang.Object) objArray66, (java.lang.Object) (-1.0d));
        logger1.debug("", objArray66);
        org.slf4j.Marker marker71 = null;
        org.slf4j.Logger logger74 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker75 = null;
        org.slf4j.Logger logger78 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger74.warn(marker75, "hi!", (java.lang.Object) logger78);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection81 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger74.debug("", (java.lang.Object) orderDirection81, (java.lang.Object) false);
        java.lang.String str84 = orderDirection81.getDirection();
        logger1.trace(marker71, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) orderDirection81);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger39);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger53);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[Logger[hi!], null]");
        org.junit.Assert.assertNotNull(logger74);
        org.junit.Assert.assertNotNull(logger78);
        org.junit.Assert.assertTrue("'" + orderDirection81 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection81.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "ascending" + "'", str84, "ascending");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider.setThreshold((int) (short) 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.util.LinkedList<java.util.LinkedList<java.io.Serializable>> serializableListList0 = com.google.common.collect.Lists.newLinkedList();
        org.junit.Assert.assertNotNull(serializableListList0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Marker marker16 = null;
        boolean boolean17 = logger12.isTraceEnabled(marker16);
        logger12.trace("ordered");
        boolean boolean20 = logger12.isTraceEnabled();
        org.slf4j.Marker marker21 = null;
        org.slf4j.Logger logger24 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger24.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable29 = null;
        logger24.info("", throwable29);
        org.slf4j.Marker marker31 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] { true, 0.0f };
        logger24.info(marker31, "JCR-SQL2", objArray35);
        org.slf4j.Marker marker37 = null;
        logger24.debug(marker37, "SELECT * FROM [oak:Unstructured]");
        logger24.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker42 = null;
        logger24.error(marker42, "ordered", (java.lang.Object) 100.0d);
        java.lang.Throwable throwable47 = null;
        logger24.info("", throwable47);
        logger24.debug("ascending");
        org.slf4j.Marker marker51 = null;
        java.lang.Throwable throwable53 = null;
        logger24.warn(marker51, "JCR-SQL2", throwable53);
        logger12.trace(marker21, "ordered", (java.lang.Object) "JCR-SQL2");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[true, 0.0]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.util.ArrayList<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[]> orderDirectionArrayList1 = com.google.common.collect.Lists.newArrayListWithCapacity(100);
        org.junit.Assert.assertNotNull(orderDirectionArrayList1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.util.ArrayList<java.lang.Object> objList0 = com.google.common.collect.Lists.newArrayList();
        org.junit.Assert.assertNotNull(objList0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider.setThreshold(0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        logger5.info("");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger12.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable17 = null;
        logger12.info("", throwable17);
        org.slf4j.Marker marker19 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] { true, 0.0f };
        logger12.info(marker19, "JCR-SQL2", objArray23);
        org.slf4j.Marker marker25 = null;
        logger12.debug(marker25, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker28 = null;
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable36 = null;
        logger31.info("", throwable36);
        org.slf4j.Marker marker38 = null;
        java.lang.Object[] objArray42 = new java.lang.Object[] { true, 0.0f };
        logger31.info(marker38, "JCR-SQL2", objArray42);
        org.slf4j.Logger logger45 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger45.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable50 = null;
        logger45.info("", throwable50);
        org.slf4j.Marker marker52 = null;
        java.lang.Object[] objArray56 = new java.lang.Object[] { true, 0.0f };
        logger45.info(marker52, "JCR-SQL2", objArray56);
        java.lang.Object[] objArray58 = new java.lang.Object[] { logger31, marker52 };
        logger12.warn(marker28, "SELECT * FROM [oak:Unstructured]", objArray58);
        logger5.debug(marker9, "", (java.lang.Object) objArray58, (java.lang.Object) (-1.0d));
        logger5.error("hi!");
        org.slf4j.Marker marker64 = null;
        boolean boolean65 = logger5.isErrorEnabled(marker64);
        logger5.error("ROOT");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[Logger[hi!], null]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Marker marker16 = null;
        boolean boolean17 = logger12.isTraceEnabled(marker16);
        logger12.trace("ordered");
        boolean boolean20 = logger12.isTraceEnabled();
        org.slf4j.Marker marker21 = null;
        boolean boolean22 = logger12.isDebugEnabled(marker21);
        java.lang.Throwable throwable24 = null;
        logger12.debug("ascending", throwable24);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker5 = null;
        boolean boolean6 = logger1.isWarnEnabled(marker5);
        org.slf4j.Marker marker7 = null;
        boolean boolean8 = logger1.isWarnEnabled(marker7);
        org.slf4j.Marker marker9 = null;
        boolean boolean10 = logger1.isTraceEnabled(marker9);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable25 = null;
        logger20.info("", throwable25);
        org.slf4j.Marker marker27 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { true, 0.0f };
        logger20.info(marker27, "JCR-SQL2", objArray31);
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger34.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable39 = null;
        logger34.info("", throwable39);
        org.slf4j.Marker marker41 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { true, 0.0f };
        logger34.info(marker41, "JCR-SQL2", objArray45);
        java.lang.Object[] objArray47 = new java.lang.Object[] { logger20, marker41 };
        logger1.warn(marker17, "SELECT * FROM [oak:Unstructured]", objArray47);
        logger1.warn("ascending");
        org.slf4j.Marker marker51 = null;
        boolean boolean52 = logger1.isDebugEnabled(marker51);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.List<java.lang.Character> charList1 = com.google.common.collect.Lists.charactersOf((java.lang.CharSequence) "direction");
        java.lang.Class<?> wildcardClass2 = charList1.getClass();
        org.junit.Assert.assertNotNull(charList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEPRECATION_MESSAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs" + "'", str0, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("ROOT");
        boolean boolean2 = logger1.isDebugEnabled();
        org.slf4j.Marker marker3 = null;
        java.lang.Throwable throwable5 = null;
        logger1.trace(marker3, "hi!", throwable5);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Logger logger18 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker19 = null;
        org.slf4j.Logger logger22 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger18.warn(marker19, "hi!", (java.lang.Object) logger22);
        org.slf4j.Logger logger26 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger26.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean30 = logger26.isErrorEnabled();
        org.slf4j.Logger logger32 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger32.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable37 = null;
        logger32.info("", throwable37);
        org.slf4j.Marker marker39 = null;
        java.lang.Object[] objArray43 = new java.lang.Object[] { true, 0.0f };
        logger32.info(marker39, "JCR-SQL2", objArray43);
        logger18.debug("", (java.lang.Object) logger26, (java.lang.Object) marker39);
        logger26.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        java.util.LinkedList<java.io.Serializable> serializableList49 = com.google.common.collect.Lists.newLinkedList();
        logger12.info("", (java.lang.Object) "SELECT * FROM [oak:Unstructured]", (java.lang.Object) serializableList49);
        java.lang.Object obj52 = null;
        logger12.debug("JCR-SQL2", obj52);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertNotNull(serializableList49);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        logger1.info("");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Logger logger13 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger13.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable18 = null;
        logger13.info("", throwable18);
        org.slf4j.Marker marker20 = null;
        java.lang.Object[] objArray24 = new java.lang.Object[] { true, 0.0f };
        logger13.info(marker20, "JCR-SQL2", objArray24);
        logger1.warn("JCR-SQL2", objArray24);
        org.slf4j.Marker marker27 = null;
        boolean boolean28 = logger1.isWarnEnabled(marker27);
        org.slf4j.Marker marker29 = null;
        org.slf4j.Logger logger32 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger32.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable37 = null;
        logger32.info("", throwable37);
        org.slf4j.Marker marker39 = null;
        boolean boolean40 = logger32.isTraceEnabled(marker39);
        java.lang.Throwable throwable42 = null;
        logger32.debug("hi!", throwable42);
        org.slf4j.Marker marker44 = null;
        java.util.LinkedList<java.io.Serializable> serializableList46 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList47 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList49 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList47, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList50 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList52 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList50, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList53 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList55 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList53, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList56 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList58 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList56, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList59 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray61 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray62 = (java.util.Queue<java.io.Serializable>[]) queueArray61;
        serializableQueueArray62[0] = serializableList46;
        serializableQueueArray62[1] = serializableList47;
        serializableQueueArray62[2] = serializableList50;
        serializableQueueArray62[3] = serializableList53;
        serializableQueueArray62[4] = serializableList56;
        serializableQueueArray62[5] = serializableList59;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList75 = com.google.common.collect.Lists.newArrayList(serializableQueueArray62);
        logger32.warn(marker44, "JCR-SQL2", (java.lang.Object) serializableQueueList75);
        org.slf4j.Marker marker77 = null;
        java.lang.Throwable throwable79 = null;
        logger32.error(marker77, "ordered", throwable79);
        logger1.trace(marker29, "ROOT", (java.lang.Object) marker77);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(serializableList46);
        org.junit.Assert.assertNotNull(serializableList47);
        org.junit.Assert.assertNotNull(serializableListList49);
        org.junit.Assert.assertNotNull(serializableList50);
        org.junit.Assert.assertNotNull(serializableListList52);
        org.junit.Assert.assertNotNull(serializableList53);
        org.junit.Assert.assertNotNull(serializableListList55);
        org.junit.Assert.assertNotNull(serializableList56);
        org.junit.Assert.assertNotNull(serializableListList58);
        org.junit.Assert.assertNotNull(serializableList59);
        org.junit.Assert.assertNotNull(queueArray61);
        org.junit.Assert.assertNotNull(serializableQueueArray62);
        org.junit.Assert.assertNotNull(serializableQueueList75);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.util.LinkedList<java.lang.Object> objList0 = com.google.common.collect.Lists.newLinkedList();
        org.junit.Assert.assertNotNull(objList0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.util.ArrayList<java.util.AbstractCollection<java.io.Serializable>> serializableCollectionList1 = com.google.common.collect.Lists.newArrayListWithCapacity(2);
        org.junit.Assert.assertNotNull(serializableCollectionList1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker5 = null;
        boolean boolean6 = logger1.isWarnEnabled(marker5);
        org.slf4j.Marker marker7 = null;
        org.slf4j.Logger logger10 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger10.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable15 = null;
        logger10.info("", throwable15);
        org.slf4j.Marker marker17 = null;
        java.lang.Object[] objArray21 = new java.lang.Object[] { true, 0.0f };
        logger10.info(marker17, "JCR-SQL2", objArray21);
        org.slf4j.Marker marker23 = null;
        logger10.debug(marker23, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker26 = null;
        org.slf4j.Logger logger29 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger29.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable34 = null;
        logger29.info("", throwable34);
        org.slf4j.Marker marker36 = null;
        java.lang.Object[] objArray40 = new java.lang.Object[] { true, 0.0f };
        logger29.info(marker36, "JCR-SQL2", objArray40);
        org.slf4j.Logger logger43 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger43.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable48 = null;
        logger43.info("", throwable48);
        org.slf4j.Marker marker50 = null;
        java.lang.Object[] objArray54 = new java.lang.Object[] { true, 0.0f };
        logger43.info(marker50, "JCR-SQL2", objArray54);
        java.lang.Object[] objArray56 = new java.lang.Object[] { logger29, marker50 };
        logger10.warn(marker26, "SELECT * FROM [oak:Unstructured]", objArray56);
        logger1.error(marker7, "hi!", (java.lang.Object) marker26);
        java.lang.Throwable throwable60 = null;
        logger1.error("SELECT * FROM [oak:Unstructured]", throwable60);
        java.lang.String str62 = logger1.getName();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger43);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        boolean boolean9 = logger1.isTraceEnabled(marker8);
        java.lang.Throwable throwable11 = null;
        logger1.debug("hi!", throwable11);
        java.lang.Throwable throwable14 = null;
        logger1.info("hi!", throwable14);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Logger logger18 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker19 = null;
        org.slf4j.Logger logger22 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger18.warn(marker19, "hi!", (java.lang.Object) logger22);
        org.slf4j.Logger logger26 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger26.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean30 = logger26.isErrorEnabled();
        org.slf4j.Logger logger32 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger32.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable37 = null;
        logger32.info("", throwable37);
        org.slf4j.Marker marker39 = null;
        java.lang.Object[] objArray43 = new java.lang.Object[] { true, 0.0f };
        logger32.info(marker39, "JCR-SQL2", objArray43);
        logger18.debug("", (java.lang.Object) logger26, (java.lang.Object) marker39);
        logger26.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        java.util.LinkedList<java.io.Serializable> serializableList49 = com.google.common.collect.Lists.newLinkedList();
        logger12.info("", (java.lang.Object) "SELECT * FROM [oak:Unstructured]", (java.lang.Object) serializableList49);
        logger12.warn("ordered");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertNotNull(serializableList49);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Marker marker16 = null;
        logger12.warn(marker16, "");
        org.slf4j.Marker marker19 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList22 = com.google.common.collect.Lists.newArrayList((java.lang.Comparable<java.lang.String>[]) strArray21);
        logger12.info(marker19, "JCR-SQL2", (java.lang.Object) strArray21);
        org.slf4j.Marker marker24 = null;
        java.lang.Throwable throwable26 = null;
        logger12.info(marker24, "ascending", throwable26);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strComparableList22);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        java.lang.Throwable throwable18 = null;
        logger1.info("JCR-SQL2", throwable18);
        org.slf4j.Marker marker20 = null;
        java.lang.Object obj23 = null;
        logger1.warn(marker20, "ordered", (java.lang.Object) (short) 0, obj23);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.util.concurrent.CopyOnWriteArrayList<java.util.Deque<java.io.Serializable>> serializableQueueList0 = com.google.common.collect.Lists.newCopyOnWriteArrayList();
        org.junit.Assert.assertNotNull(serializableQueueList0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        logger5.info("");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger12.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable17 = null;
        logger12.info("", throwable17);
        org.slf4j.Marker marker19 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] { true, 0.0f };
        logger12.info(marker19, "JCR-SQL2", objArray23);
        org.slf4j.Marker marker25 = null;
        logger12.debug(marker25, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker28 = null;
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable36 = null;
        logger31.info("", throwable36);
        org.slf4j.Marker marker38 = null;
        java.lang.Object[] objArray42 = new java.lang.Object[] { true, 0.0f };
        logger31.info(marker38, "JCR-SQL2", objArray42);
        org.slf4j.Logger logger45 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger45.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable50 = null;
        logger45.info("", throwable50);
        org.slf4j.Marker marker52 = null;
        java.lang.Object[] objArray56 = new java.lang.Object[] { true, 0.0f };
        logger45.info(marker52, "JCR-SQL2", objArray56);
        java.lang.Object[] objArray58 = new java.lang.Object[] { logger31, marker52 };
        logger12.warn(marker28, "SELECT * FROM [oak:Unstructured]", objArray58);
        logger5.debug(marker9, "", (java.lang.Object) objArray58, (java.lang.Object) (-1.0d));
        logger5.error("hi!");
        org.slf4j.Marker marker64 = null;
        boolean boolean65 = logger5.isErrorEnabled(marker64);
        org.slf4j.Marker marker66 = null;
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] {};
        java.util.List<java.lang.CharSequence> charSequenceList70 = com.google.common.collect.Lists.asList((java.lang.CharSequence) "hi!", charSequenceArray69);
        logger5.trace(marker66, "", (java.lang.Object[]) charSequenceArray69);
        org.slf4j.Marker marker72 = null;
        java.lang.Throwable throwable74 = null;
        logger5.info(marker72, "SELECT * FROM [oak:Unstructured]", throwable74);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[Logger[hi!], null]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(charSequenceArray69);
        org.junit.Assert.assertNotNull(charSequenceList70);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.util.concurrent.CopyOnWriteArrayList<java.lang.Iterable<java.io.Serializable>> serializableIterableList0 = com.google.common.collect.Lists.newCopyOnWriteArrayList();
        org.junit.Assert.assertNotNull(serializableIterableList0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Marker marker16 = null;
        boolean boolean17 = logger12.isTraceEnabled(marker16);
        logger12.trace("ordered");
        org.slf4j.Marker marker20 = null;
        logger12.debug(marker20, "ordered");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        java.lang.Throwable throwable4 = null;
        logger1.trace(marker2, "SELECT * FROM [oak:Unstructured]", throwable4);
        org.slf4j.Marker marker6 = null;
        java.lang.Object obj8 = null;
        logger1.error(marker6, "JCR-SQL2", obj8);
        org.slf4j.Marker marker10 = null;
        logger1.trace(marker10, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", (java.lang.Object) "ROOT");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection8 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger1.debug("", (java.lang.Object) orderDirection8, (java.lang.Object) false);
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker13 = null;
        org.slf4j.Logger logger16 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger12.warn(marker13, "hi!", (java.lang.Object) logger16);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection19 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger12.debug("", (java.lang.Object) orderDirection19, (java.lang.Object) false);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection22 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.slf4j.Logger logger24 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker25 = null;
        org.slf4j.Logger logger28 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger24.warn(marker25, "hi!", (java.lang.Object) logger28);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection31 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger24.debug("", (java.lang.Object) orderDirection31, (java.lang.Object) false);
        org.slf4j.Logger logger35 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker36 = null;
        org.slf4j.Logger logger39 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger35.warn(marker36, "hi!", (java.lang.Object) logger39);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection42 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger35.debug("", (java.lang.Object) orderDirection42, (java.lang.Object) false);
        boolean boolean45 = orderDirection42.isAscending();
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection46 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection47 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray48 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] { orderDirection22, orderDirection31, orderDirection42, orderDirection46, orderDirection47 };
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList49 = com.google.common.collect.Lists.asList(orderDirection8, orderDirection19, orderDirectionArray48);
        boolean boolean50 = orderDirection19.isAscending();
        boolean boolean51 = orderDirection19.isDescending();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + orderDirection8 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection8.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + orderDirection19 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection19.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection22 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection22.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertTrue("'" + orderDirection31 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection31.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger35);
        org.junit.Assert.assertNotNull(logger39);
        org.junit.Assert.assertTrue("'" + orderDirection42 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection42.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + orderDirection46 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection46.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection47 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection47.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(orderDirectionArray48);
        org.junit.Assert.assertNotNull(orderDirectionList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.util.List<java.lang.Character> charList1 = com.google.common.collect.Lists.charactersOf((java.lang.CharSequence) "JCR-SQL2");
        org.junit.Assert.assertNotNull(charList1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker5 = null;
        boolean boolean6 = logger1.isWarnEnabled(marker5);
        org.slf4j.Marker marker7 = null;
        boolean boolean8 = logger1.isWarnEnabled(marker7);
        org.slf4j.Logger logger11 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker12 = null;
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger11.warn(marker12, "hi!", (java.lang.Object) logger15);
        org.slf4j.Logger logger19 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger19.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean23 = logger19.isErrorEnabled();
        org.slf4j.Logger logger25 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger25.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable30 = null;
        logger25.info("", throwable30);
        org.slf4j.Marker marker32 = null;
        java.lang.Object[] objArray36 = new java.lang.Object[] { true, 0.0f };
        logger25.info(marker32, "JCR-SQL2", objArray36);
        logger11.debug("", (java.lang.Object) logger19, (java.lang.Object) marker32);
        logger19.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        logger1.warn("", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        java.lang.Throwable throwable44 = null;
        logger1.trace("ordered", throwable44);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[true, 0.0]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("");
        java.util.ArrayList<java.io.Serializable> serializableList4 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.List<java.io.Serializable> serializableList5 = com.google.common.collect.Lists.reverse((java.util.List<java.io.Serializable>) serializableList4);
        java.util.List<java.util.List<java.io.Serializable>> serializableListList7 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList4, 100);
        java.util.List<java.util.List<java.io.Serializable>> serializableListList9 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList4, 4);
        org.slf4j.Logger logger11 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker12 = null;
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger11.warn(marker12, "hi!", (java.lang.Object) logger15);
        org.slf4j.Logger logger19 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger19.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean23 = logger19.isErrorEnabled();
        org.slf4j.Logger logger25 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger25.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable30 = null;
        logger25.info("", throwable30);
        org.slf4j.Marker marker32 = null;
        java.lang.Object[] objArray36 = new java.lang.Object[] { true, 0.0f };
        logger25.info(marker32, "JCR-SQL2", objArray36);
        logger11.debug("", (java.lang.Object) logger19, (java.lang.Object) marker32);
        logger19.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker42 = null;
        java.lang.Throwable throwable44 = null;
        logger19.info(marker42, "ordered", throwable44);
        logger1.info("ROOT", (java.lang.Object) serializableListList9, (java.lang.Object) "ordered");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(serializableList4);
        org.junit.Assert.assertNotNull(serializableList5);
        org.junit.Assert.assertNotNull(serializableListList7);
        org.junit.Assert.assertNotNull(serializableListList9);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[true, 0.0]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider.setThreshold(10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable25 = null;
        logger20.info("", throwable25);
        org.slf4j.Marker marker27 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { true, 0.0f };
        logger20.info(marker27, "JCR-SQL2", objArray31);
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger34.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable39 = null;
        logger34.info("", throwable39);
        org.slf4j.Marker marker41 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { true, 0.0f };
        logger34.info(marker41, "JCR-SQL2", objArray45);
        java.lang.Object[] objArray47 = new java.lang.Object[] { logger20, marker41 };
        logger1.warn(marker17, "SELECT * FROM [oak:Unstructured]", objArray47);
        org.slf4j.Marker marker49 = null;
        boolean boolean50 = logger1.isInfoEnabled(marker49);
        java.lang.Object obj52 = null;
        logger1.debug("JCR-SQL2", obj52);
        org.slf4j.Marker marker54 = null;
        java.util.concurrent.CopyOnWriteArrayList<java.util.List<java.io.Serializable>> serializableListList56 = com.google.common.collect.Lists.newCopyOnWriteArrayList();
        logger1.info(marker54, "ordered", (java.lang.Object) serializableListList56);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableListList56);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean13 = logger9.isErrorEnabled();
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger15.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable20 = null;
        logger15.info("", throwable20);
        org.slf4j.Marker marker22 = null;
        java.lang.Object[] objArray26 = new java.lang.Object[] { true, 0.0f };
        logger15.info(marker22, "JCR-SQL2", objArray26);
        logger1.debug("", (java.lang.Object) logger9, (java.lang.Object) marker22);
        logger9.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker32 = null;
        java.lang.Throwable throwable34 = null;
        logger9.info(marker32, "ordered", throwable34);
        org.slf4j.Marker marker36 = null;
        logger9.error(marker36, "ROOT");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 0.0]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        boolean boolean17 = logger1.isWarnEnabled();
        org.slf4j.Marker marker18 = null;
        logger1.info(marker18, "direction");
        logger1.warn("");
        org.slf4j.Marker marker23 = null;
        logger1.debug(marker23, "ascending");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker5 = null;
        boolean boolean6 = logger1.isWarnEnabled(marker5);
        org.slf4j.Marker marker7 = null;
        boolean boolean8 = logger1.isWarnEnabled(marker7);
        org.slf4j.Logger logger11 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker12 = null;
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger11.warn(marker12, "hi!", (java.lang.Object) logger15);
        org.slf4j.Logger logger19 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger19.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean23 = logger19.isErrorEnabled();
        org.slf4j.Logger logger25 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger25.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable30 = null;
        logger25.info("", throwable30);
        org.slf4j.Marker marker32 = null;
        java.lang.Object[] objArray36 = new java.lang.Object[] { true, 0.0f };
        logger25.info(marker32, "JCR-SQL2", objArray36);
        logger11.debug("", (java.lang.Object) logger19, (java.lang.Object) marker32);
        logger19.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        logger1.warn("", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker43 = null;
        boolean boolean44 = logger1.isInfoEnabled(marker43);
        org.slf4j.Marker marker45 = null;
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] {};
        java.util.List<java.lang.CharSequence> charSequenceList49 = com.google.common.collect.Lists.asList((java.lang.CharSequence) "hi!", charSequenceArray48);
        logger1.warn(marker45, "hi!", (java.lang.Object[]) charSequenceArray48);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertNotNull(charSequenceList49);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean13 = logger9.isErrorEnabled();
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger15.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable20 = null;
        logger15.info("", throwable20);
        org.slf4j.Marker marker22 = null;
        java.lang.Object[] objArray26 = new java.lang.Object[] { true, 0.0f };
        logger15.info(marker22, "JCR-SQL2", objArray26);
        logger1.debug("", (java.lang.Object) logger9, (java.lang.Object) marker22);
        logger9.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker32 = null;
        java.util.LinkedList<java.io.Serializable> serializableList34 = com.google.common.collect.Lists.newLinkedList();
        org.slf4j.Logger logger36 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger36.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable41 = null;
        logger36.info("", throwable41);
        org.slf4j.Marker marker43 = null;
        java.lang.Object[] objArray47 = new java.lang.Object[] { true, 0.0f };
        logger36.info(marker43, "JCR-SQL2", objArray47);
        org.slf4j.Marker marker49 = null;
        logger36.debug(marker49, "SELECT * FROM [oak:Unstructured]");
        logger36.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker54 = null;
        logger36.error(marker54, "ordered", (java.lang.Object) 100.0d);
        logger36.error("hi!");
        java.lang.Throwable throwable61 = null;
        logger36.warn("", throwable61);
        logger9.debug(marker32, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) serializableList34, (java.lang.Object) throwable61);
        boolean boolean64 = logger9.isInfoEnabled();
        java.lang.Throwable throwable66 = null;
        logger9.trace("ascending", throwable66);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertNotNull(serializableList34);
        org.junit.Assert.assertNotNull(logger36);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.util.ArrayList<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[]> orderDirectionArrayList1 = com.google.common.collect.Lists.newArrayListWithCapacity((int) (short) 10);
        org.junit.Assert.assertNotNull(orderDirectionArrayList1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("");
        org.slf4j.Marker marker23 = null;
        boolean boolean24 = logger1.isErrorEnabled(marker23);
        org.slf4j.Marker marker25 = null;
        org.slf4j.Logger logger28 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger28.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable33 = null;
        logger28.info("", throwable33);
        logger1.trace(marker25, "JCR-SQL2", (java.lang.Object) logger28);
        java.lang.Class<?> wildcardClass36 = logger1.getClass();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection1 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.fromString("hi!");
        org.junit.Assert.assertNull(orderDirection1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.util.List<java.lang.Character> charList1 = com.google.common.collect.Lists.charactersOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(charList1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker5 = null;
        boolean boolean6 = logger1.isWarnEnabled(marker5);
        org.slf4j.Marker marker7 = null;
        org.slf4j.Logger logger10 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger10.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable15 = null;
        logger10.info("", throwable15);
        org.slf4j.Marker marker17 = null;
        java.lang.Object[] objArray21 = new java.lang.Object[] { true, 0.0f };
        logger10.info(marker17, "JCR-SQL2", objArray21);
        org.slf4j.Marker marker23 = null;
        logger10.debug(marker23, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker26 = null;
        org.slf4j.Logger logger29 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger29.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable34 = null;
        logger29.info("", throwable34);
        org.slf4j.Marker marker36 = null;
        java.lang.Object[] objArray40 = new java.lang.Object[] { true, 0.0f };
        logger29.info(marker36, "JCR-SQL2", objArray40);
        org.slf4j.Logger logger43 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger43.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable48 = null;
        logger43.info("", throwable48);
        org.slf4j.Marker marker50 = null;
        java.lang.Object[] objArray54 = new java.lang.Object[] { true, 0.0f };
        logger43.info(marker50, "JCR-SQL2", objArray54);
        java.lang.Object[] objArray56 = new java.lang.Object[] { logger29, marker50 };
        logger10.warn(marker26, "SELECT * FROM [oak:Unstructured]", objArray56);
        logger1.error(marker7, "hi!", (java.lang.Object) marker26);
        java.lang.Throwable throwable60 = null;
        logger1.error("SELECT * FROM [oak:Unstructured]", throwable60);
        org.slf4j.Logger logger64 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger64.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable69 = null;
        logger64.info("", throwable69);
        org.slf4j.Marker marker71 = null;
        java.lang.Object[] objArray75 = new java.lang.Object[] { true, 0.0f };
        logger64.info(marker71, "JCR-SQL2", objArray75);
        org.slf4j.Marker marker77 = null;
        logger64.debug(marker77, "SELECT * FROM [oak:Unstructured]");
        logger64.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker82 = null;
        logger64.error(marker82, "ordered", (java.lang.Object) 100.0d);
        java.lang.Throwable throwable87 = null;
        logger64.info("", throwable87);
        logger64.debug("ascending");
        logger1.warn("ROOT", (java.lang.Object) "ascending");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger43);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[Logger[hi!], null]");
        org.junit.Assert.assertNotNull(logger64);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[true, 0.0]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.trace("SELECT * FROM [oak:Unstructured]");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("direction");
        org.slf4j.Marker marker2 = null;
        java.util.concurrent.CopyOnWriteArrayList<java.util.AbstractSequentialList<java.io.Serializable>> serializableListList4 = com.google.common.collect.Lists.newCopyOnWriteArrayList();
        logger1.debug(marker2, "JCR-SQL2", (java.lang.Object) serializableListList4);
        java.lang.Throwable throwable7 = null;
        logger1.warn("ROOT", throwable7);
        logger1.trace("ascending");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(serializableListList4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Logger logger10 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger10.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable15 = null;
        logger10.info("", throwable15);
        org.slf4j.Marker marker17 = null;
        java.lang.Object[] objArray21 = new java.lang.Object[] { true, 0.0f };
        logger10.info(marker17, "JCR-SQL2", objArray21);
        org.slf4j.Marker marker23 = null;
        logger10.debug(marker23, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker26 = null;
        org.slf4j.Logger logger29 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger29.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable34 = null;
        logger29.info("", throwable34);
        org.slf4j.Marker marker36 = null;
        java.lang.Object[] objArray40 = new java.lang.Object[] { true, 0.0f };
        logger29.info(marker36, "JCR-SQL2", objArray40);
        org.slf4j.Logger logger43 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger43.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable48 = null;
        logger43.info("", throwable48);
        org.slf4j.Marker marker50 = null;
        java.lang.Object[] objArray54 = new java.lang.Object[] { true, 0.0f };
        logger43.info(marker50, "JCR-SQL2", objArray54);
        java.lang.Object[] objArray56 = new java.lang.Object[] { logger29, marker50 };
        logger10.warn(marker26, "SELECT * FROM [oak:Unstructured]", objArray56);
        logger1.trace("JCR-SQL2", objArray56);
        org.slf4j.Marker marker59 = null;
        org.slf4j.Logger logger62 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger62.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean66 = logger62.isErrorEnabled();
        logger62.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker70 = null;
        org.slf4j.Logger logger73 = org.slf4j.LoggerFactory.getLogger("");
        logger73.warn("SELECT * FROM [oak:Unstructured]");
        logger62.warn(marker70, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger73);
        org.slf4j.Marker marker77 = null;
        boolean boolean78 = logger73.isTraceEnabled(marker77);
        logger73.trace("ordered");
        logger1.trace(marker59, "hi!", (java.lang.Object) logger73);
        java.lang.Class<?> wildcardClass82 = logger1.getClass();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger43);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[Logger[hi!], null]");
        org.junit.Assert.assertNotNull(logger62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(logger73);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable25 = null;
        logger20.info("", throwable25);
        org.slf4j.Marker marker27 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { true, 0.0f };
        logger20.info(marker27, "JCR-SQL2", objArray31);
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger34.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable39 = null;
        logger34.info("", throwable39);
        org.slf4j.Marker marker41 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { true, 0.0f };
        logger34.info(marker41, "JCR-SQL2", objArray45);
        java.lang.Object[] objArray47 = new java.lang.Object[] { logger20, marker41 };
        logger1.warn(marker17, "SELECT * FROM [oak:Unstructured]", objArray47);
        org.slf4j.Marker marker49 = null;
        logger1.error(marker49, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[Logger[hi!], null]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("ascending");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection0 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.DESC;
        org.slf4j.Logger logger2 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker3 = null;
        org.slf4j.Logger logger6 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger2.warn(marker3, "hi!", (java.lang.Object) logger6);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection9 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger2.debug("", (java.lang.Object) orderDirection9, (java.lang.Object) false);
        org.slf4j.Logger logger13 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker14 = null;
        org.slf4j.Logger logger17 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger13.warn(marker14, "hi!", (java.lang.Object) logger17);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection20 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger13.debug("", (java.lang.Object) orderDirection20, (java.lang.Object) false);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection23 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.slf4j.Logger logger25 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker26 = null;
        org.slf4j.Logger logger29 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger25.warn(marker26, "hi!", (java.lang.Object) logger29);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection32 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger25.debug("", (java.lang.Object) orderDirection32, (java.lang.Object) false);
        org.slf4j.Logger logger36 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker37 = null;
        org.slf4j.Logger logger40 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger36.warn(marker37, "hi!", (java.lang.Object) logger40);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection43 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger36.debug("", (java.lang.Object) orderDirection43, (java.lang.Object) false);
        boolean boolean46 = orderDirection43.isAscending();
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection47 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection48 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray49 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] { orderDirection23, orderDirection32, orderDirection43, orderDirection47, orderDirection48 };
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList50 = com.google.common.collect.Lists.asList(orderDirection9, orderDirection20, orderDirectionArray49);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray51 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] {};
        java.util.List<java.lang.Enum<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection>> orderDirectionEnumList52 = com.google.common.collect.Lists.asList((java.lang.Enum<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection>) orderDirection0, (java.lang.Enum<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection>) orderDirection20, (java.lang.Enum<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection>[]) orderDirectionArray51);
        java.lang.String str53 = orderDirection0.getDirection();
        org.junit.Assert.assertTrue("'" + orderDirection0 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.DESC + "'", orderDirection0.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.DESC));
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertTrue("'" + orderDirection9 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection9.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertTrue("'" + orderDirection20 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection20.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection23 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection23.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertTrue("'" + orderDirection32 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection32.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger36);
        org.junit.Assert.assertNotNull(logger40);
        org.junit.Assert.assertTrue("'" + orderDirection43 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection43.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + orderDirection47 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection47.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection48 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection48.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(orderDirectionArray49);
        org.junit.Assert.assertNotNull(orderDirectionList50);
        org.junit.Assert.assertNotNull(orderDirectionArray51);
        org.junit.Assert.assertNotNull(orderDirectionEnumList52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "descending" + "'", str53, "descending");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        java.lang.Throwable throwable16 = null;
        logger1.trace(marker14, "", throwable16);
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable25 = null;
        logger20.info("", throwable25);
        org.slf4j.Logger logger29 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger29.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable34 = null;
        logger29.info("", throwable34);
        org.slf4j.Marker marker36 = null;
        java.lang.Object[] objArray40 = new java.lang.Object[] { true, 0.0f };
        logger29.info(marker36, "JCR-SQL2", objArray40);
        org.slf4j.Marker marker42 = null;
        logger29.debug(marker42, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker45 = null;
        org.slf4j.Logger logger48 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger48.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable53 = null;
        logger48.info("", throwable53);
        org.slf4j.Marker marker55 = null;
        java.lang.Object[] objArray59 = new java.lang.Object[] { true, 0.0f };
        logger48.info(marker55, "JCR-SQL2", objArray59);
        org.slf4j.Logger logger62 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger62.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable67 = null;
        logger62.info("", throwable67);
        org.slf4j.Marker marker69 = null;
        java.lang.Object[] objArray73 = new java.lang.Object[] { true, 0.0f };
        logger62.info(marker69, "JCR-SQL2", objArray73);
        java.lang.Object[] objArray75 = new java.lang.Object[] { logger48, marker69 };
        logger29.warn(marker45, "SELECT * FROM [oak:Unstructured]", objArray75);
        logger20.trace("JCR-SQL2", objArray75);
        org.slf4j.Marker marker78 = null;
        org.slf4j.Logger logger81 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger81.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable86 = null;
        logger81.info("", throwable86);
        org.slf4j.Marker marker88 = null;
        java.lang.Object[] objArray92 = new java.lang.Object[] { true, 0.0f };
        logger81.info(marker88, "JCR-SQL2", objArray92);
        logger20.debug(marker78, "SELECT * FROM [oak:Unstructured]", objArray92);
        logger1.info("JCR-SQL2", objArray92);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger48);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger62);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[Logger[hi!], null]");
        org.junit.Assert.assertNotNull(logger81);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[true, 0.0]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        java.lang.Object obj11 = null;
        org.slf4j.Logger logger13 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger13.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable18 = null;
        logger13.info("", throwable18);
        org.slf4j.Marker marker20 = null;
        java.lang.Object[] objArray24 = new java.lang.Object[] { true, 0.0f };
        logger13.info(marker20, "JCR-SQL2", objArray24);
        org.slf4j.Marker marker26 = null;
        logger13.debug(marker26, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker29 = null;
        org.slf4j.Logger logger32 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger32.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable37 = null;
        logger32.info("", throwable37);
        org.slf4j.Marker marker39 = null;
        java.lang.Object[] objArray43 = new java.lang.Object[] { true, 0.0f };
        logger32.info(marker39, "JCR-SQL2", objArray43);
        org.slf4j.Logger logger46 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger46.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable51 = null;
        logger46.info("", throwable51);
        org.slf4j.Marker marker53 = null;
        java.lang.Object[] objArray57 = new java.lang.Object[] { true, 0.0f };
        logger46.info(marker53, "JCR-SQL2", objArray57);
        java.lang.Object[] objArray59 = new java.lang.Object[] { logger32, marker53 };
        logger13.warn(marker29, "SELECT * FROM [oak:Unstructured]", objArray59);
        logger1.debug(marker9, "SELECT * FROM [oak:Unstructured]", obj11, (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker62 = null;
        java.lang.Throwable throwable64 = null;
        logger1.info(marker62, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", throwable64);
        org.slf4j.Marker marker66 = null;
        org.slf4j.Logger logger69 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger69.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable74 = null;
        logger69.info("", throwable74);
        org.slf4j.Marker marker76 = null;
        java.lang.Object[] objArray80 = new java.lang.Object[] { true, 0.0f };
        logger69.info(marker76, "JCR-SQL2", objArray80);
        logger69.info("SELECT * FROM [oak:Unstructured]", (java.lang.Object) true);
        logger69.trace("");
        logger1.info(marker66, "", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger46);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[Logger[hi!], null]");
        org.junit.Assert.assertNotNull(logger69);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[true, 0.0]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("");
        org.slf4j.Marker marker23 = null;
        boolean boolean24 = logger1.isErrorEnabled(marker23);
        org.slf4j.Marker marker25 = null;
        org.slf4j.Logger logger28 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger28.warn("hi!", (java.lang.Object) (byte) 1);
        logger1.warn(marker25, "ROOT", (java.lang.Object) logger28, (java.lang.Object) (byte) 10);
        logger1.trace("ascending");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(logger28);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.util.LinkedList<java.io.Serializable> serializableList0 = com.google.common.collect.Lists.newLinkedList();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.List<java.io.Serializable>> serializableListList2 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableList0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Marker marker11 = null;
        logger1.trace(marker11, "JCR-SQL2", (java.lang.Object) 100.0f);
        org.slf4j.Marker marker15 = null;
        java.lang.Throwable throwable17 = null;
        logger1.warn(marker15, "ROOT", throwable17);
        org.slf4j.Marker marker19 = null;
        org.slf4j.Logger logger22 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker23 = null;
        org.slf4j.Logger logger26 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger22.warn(marker23, "hi!", (java.lang.Object) logger26);
        org.slf4j.Logger logger30 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker31 = null;
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger30.warn(marker31, "hi!", (java.lang.Object) logger34);
        logger34.info("");
        org.slf4j.Marker marker38 = null;
        org.slf4j.Logger logger41 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger41.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable46 = null;
        logger41.info("", throwable46);
        org.slf4j.Marker marker48 = null;
        java.lang.Object[] objArray52 = new java.lang.Object[] { true, 0.0f };
        logger41.info(marker48, "JCR-SQL2", objArray52);
        org.slf4j.Marker marker54 = null;
        logger41.debug(marker54, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker57 = null;
        org.slf4j.Logger logger60 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger60.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable65 = null;
        logger60.info("", throwable65);
        org.slf4j.Marker marker67 = null;
        java.lang.Object[] objArray71 = new java.lang.Object[] { true, 0.0f };
        logger60.info(marker67, "JCR-SQL2", objArray71);
        org.slf4j.Logger logger74 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger74.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable79 = null;
        logger74.info("", throwable79);
        org.slf4j.Marker marker81 = null;
        java.lang.Object[] objArray85 = new java.lang.Object[] { true, 0.0f };
        logger74.info(marker81, "JCR-SQL2", objArray85);
        java.lang.Object[] objArray87 = new java.lang.Object[] { logger60, marker81 };
        logger41.warn(marker57, "SELECT * FROM [oak:Unstructured]", objArray87);
        logger34.debug(marker38, "", (java.lang.Object) objArray87, (java.lang.Object) (-1.0d));
        logger22.debug("", objArray87);
        logger1.trace(marker19, "", (java.lang.Object) objArray87);
        java.lang.Throwable throwable94 = null;
        logger1.debug("SELECT * FROM [oak:Unstructured]", throwable94);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertNotNull(logger30);
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertNotNull(logger41);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger60);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger74);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[Logger[hi!], null]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean13 = logger9.isErrorEnabled();
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger15.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable20 = null;
        logger15.info("", throwable20);
        org.slf4j.Marker marker22 = null;
        java.lang.Object[] objArray26 = new java.lang.Object[] { true, 0.0f };
        logger15.info(marker22, "JCR-SQL2", objArray26);
        logger1.debug("", (java.lang.Object) logger9, (java.lang.Object) marker22);
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable36 = null;
        logger31.info("", throwable36);
        org.slf4j.Logger logger40 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger40.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable45 = null;
        logger40.info("", throwable45);
        org.slf4j.Marker marker47 = null;
        java.lang.Object[] objArray51 = new java.lang.Object[] { true, 0.0f };
        logger40.info(marker47, "JCR-SQL2", objArray51);
        org.slf4j.Marker marker53 = null;
        logger40.debug(marker53, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker56 = null;
        org.slf4j.Logger logger59 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger59.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable64 = null;
        logger59.info("", throwable64);
        org.slf4j.Marker marker66 = null;
        java.lang.Object[] objArray70 = new java.lang.Object[] { true, 0.0f };
        logger59.info(marker66, "JCR-SQL2", objArray70);
        org.slf4j.Logger logger73 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger73.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable78 = null;
        logger73.info("", throwable78);
        org.slf4j.Marker marker80 = null;
        java.lang.Object[] objArray84 = new java.lang.Object[] { true, 0.0f };
        logger73.info(marker80, "JCR-SQL2", objArray84);
        java.lang.Object[] objArray86 = new java.lang.Object[] { logger59, marker80 };
        logger40.warn(marker56, "SELECT * FROM [oak:Unstructured]", objArray86);
        logger31.trace("JCR-SQL2", objArray86);
        logger1.trace("descending", objArray86);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertNotNull(logger40);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger59);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger73);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[Logger[hi!], null]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable25 = null;
        logger20.info("", throwable25);
        org.slf4j.Marker marker27 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { true, 0.0f };
        logger20.info(marker27, "JCR-SQL2", objArray31);
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger34.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable39 = null;
        logger34.info("", throwable39);
        org.slf4j.Marker marker41 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { true, 0.0f };
        logger34.info(marker41, "JCR-SQL2", objArray45);
        java.lang.Object[] objArray47 = new java.lang.Object[] { logger20, marker41 };
        logger1.warn(marker17, "SELECT * FROM [oak:Unstructured]", objArray47);
        org.slf4j.Marker marker49 = null;
        boolean boolean50 = logger1.isInfoEnabled(marker49);
        java.lang.Object obj52 = null;
        logger1.debug("JCR-SQL2", obj52);
        org.slf4j.Marker marker54 = null;
        boolean boolean55 = logger1.isTraceEnabled(marker54);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        java.lang.Object obj11 = null;
        org.slf4j.Logger logger13 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger13.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable18 = null;
        logger13.info("", throwable18);
        org.slf4j.Marker marker20 = null;
        java.lang.Object[] objArray24 = new java.lang.Object[] { true, 0.0f };
        logger13.info(marker20, "JCR-SQL2", objArray24);
        org.slf4j.Marker marker26 = null;
        logger13.debug(marker26, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker29 = null;
        org.slf4j.Logger logger32 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger32.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable37 = null;
        logger32.info("", throwable37);
        org.slf4j.Marker marker39 = null;
        java.lang.Object[] objArray43 = new java.lang.Object[] { true, 0.0f };
        logger32.info(marker39, "JCR-SQL2", objArray43);
        org.slf4j.Logger logger46 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger46.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable51 = null;
        logger46.info("", throwable51);
        org.slf4j.Marker marker53 = null;
        java.lang.Object[] objArray57 = new java.lang.Object[] { true, 0.0f };
        logger46.info(marker53, "JCR-SQL2", objArray57);
        java.lang.Object[] objArray59 = new java.lang.Object[] { logger32, marker53 };
        logger13.warn(marker29, "SELECT * FROM [oak:Unstructured]", objArray59);
        logger1.debug(marker9, "SELECT * FROM [oak:Unstructured]", obj11, (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker62 = null;
        logger1.info(marker62, "ROOT", (java.lang.Object) (short) 1);
        org.slf4j.Marker marker66 = null;
        org.slf4j.Logger logger69 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker70 = null;
        java.lang.Throwable throwable72 = null;
        logger69.trace(marker70, "SELECT * FROM [oak:Unstructured]", throwable72);
        org.slf4j.Marker marker74 = null;
        java.lang.Object obj76 = null;
        logger69.error(marker74, "JCR-SQL2", obj76);
        logger69.warn("hi!");
        logger1.info(marker66, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", (java.lang.Object) logger69);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger46);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[Logger[hi!], null]");
        org.junit.Assert.assertNotNull(logger69);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker4 = null;
        java.lang.Object obj6 = null;
        org.slf4j.Logger logger8 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger8.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable13 = null;
        logger8.info("", throwable13);
        logger1.warn(marker4, "", obj6, (java.lang.Object) "");
        org.slf4j.Marker marker16 = null;
        logger1.trace(marker16, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) 10.0d, (java.lang.Object) (-1.0d));
        boolean boolean21 = logger1.isErrorEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider.setThreshold((int) (short) 100);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean13 = logger9.isErrorEnabled();
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger15.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable20 = null;
        logger15.info("", throwable20);
        org.slf4j.Marker marker22 = null;
        java.lang.Object[] objArray26 = new java.lang.Object[] { true, 0.0f };
        logger15.info(marker22, "JCR-SQL2", objArray26);
        logger1.debug("", (java.lang.Object) logger9, (java.lang.Object) marker22);
        logger9.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        logger9.debug("ascending");
        org.slf4j.Logger logger36 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger36.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable41 = null;
        logger36.info("", throwable41);
        org.slf4j.Marker marker43 = null;
        java.lang.Object[] objArray47 = new java.lang.Object[] { true, 0.0f };
        logger36.info(marker43, "JCR-SQL2", objArray47);
        logger36.info("SELECT * FROM [oak:Unstructured]", (java.lang.Object) true);
        logger9.debug("", (java.lang.Object) true, (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger36);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[true, 0.0]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.trace("hi!");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection1 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.fromString("Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs");
        org.junit.Assert.assertNull(orderDirection1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("JCR-SQL2", (java.lang.Object) 1.0d);
        boolean boolean24 = logger1.isWarnEnabled();
        logger1.warn("direction");
        org.slf4j.Marker marker27 = null;
        boolean boolean28 = logger1.isWarnEnabled(marker27);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider orderedPropertyIndexProvider0 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider();
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState1 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList2 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState1);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState3 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList4 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState3);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState5 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList6 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState5);
        org.junit.Assert.assertNotNull(wildcardList2);
        org.junit.Assert.assertNotNull(wildcardList4);
        org.junit.Assert.assertNotNull(wildcardList6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("JCR-SQL2", (java.lang.Object) 1.0d);
        boolean boolean24 = logger1.isWarnEnabled();
        org.slf4j.Marker marker25 = null;
        java.lang.Throwable throwable27 = null;
        logger1.warn(marker25, "ascending", throwable27);
        org.slf4j.Marker marker29 = null;
        java.lang.Throwable throwable31 = null;
        logger1.trace(marker29, "", throwable31);
        logger1.info("direction");
        org.slf4j.Marker marker35 = null;
        org.slf4j.Logger logger38 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger38.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable43 = null;
        logger38.info("", throwable43);
        org.slf4j.Marker marker45 = null;
        java.lang.Object[] objArray49 = new java.lang.Object[] { true, 0.0f };
        logger38.info(marker45, "JCR-SQL2", objArray49);
        logger1.info(marker35, "direction", objArray49);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(logger38);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[true, 0.0]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        java.lang.Object obj21 = null;
        logger1.error(marker19, "descending", obj21);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider orderedPropertyIndexProvider0 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider();
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState1 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList2 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState1);
        java.lang.Class<?> wildcardClass3 = orderedPropertyIndexProvider0.getClass();
        org.junit.Assert.assertNotNull(wildcardList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        boolean boolean8 = logger1.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("JCR-SQL2", (java.lang.Object) 1.0d);
        boolean boolean24 = logger1.isWarnEnabled();
        org.slf4j.Marker marker25 = null;
        boolean boolean26 = logger1.isErrorEnabled(marker25);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider.setThreshold((int) '4');
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        java.lang.String str19 = logger1.getName();
        org.slf4j.Marker marker20 = null;
        org.slf4j.Logger logger23 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger23.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable28 = null;
        logger23.info("", throwable28);
        org.slf4j.Marker marker30 = null;
        java.lang.Object[] objArray34 = new java.lang.Object[] { true, 0.0f };
        logger23.info(marker30, "JCR-SQL2", objArray34);
        org.slf4j.Marker marker36 = null;
        logger23.debug(marker36, "SELECT * FROM [oak:Unstructured]");
        logger23.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker41 = null;
        logger23.error(marker41, "ordered", (java.lang.Object) 100.0d);
        java.lang.Object obj46 = null;
        logger23.error("ROOT", obj46);
        logger1.info(marker20, "ordered", obj46);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[true, 0.0]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("");
        org.slf4j.Marker marker23 = null;
        logger1.trace(marker23, "hi!");
        boolean boolean26 = logger1.isErrorEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Marker marker11 = null;
        logger1.trace(marker11, "JCR-SQL2", (java.lang.Object) 100.0f);
        boolean boolean15 = logger1.isErrorEnabled();
        org.slf4j.Marker marker16 = null;
        org.slf4j.Logger logger19 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger19.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean23 = logger19.isErrorEnabled();
        logger19.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker27 = null;
        org.slf4j.Logger logger30 = org.slf4j.LoggerFactory.getLogger("");
        logger30.warn("SELECT * FROM [oak:Unstructured]");
        logger19.warn(marker27, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger30);
        org.slf4j.Marker marker34 = null;
        boolean boolean35 = logger30.isTraceEnabled(marker34);
        org.slf4j.Marker marker36 = null;
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] {};
        java.util.List<java.lang.CharSequence> charSequenceList40 = com.google.common.collect.Lists.asList((java.lang.CharSequence) "hi!", charSequenceArray39);
        logger30.error(marker36, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", (java.lang.Object[]) charSequenceArray39);
        logger1.info(marker16, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", (java.lang.Object[]) charSequenceArray39);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(logger19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(logger30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceList40);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.util.ArrayList<java.util.RandomAccess[]> randomAccessArrayList0 = com.google.common.collect.Lists.newArrayList();
        org.junit.Assert.assertNotNull(randomAccessArrayList0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Marker marker7 = null;
        logger1.info(marker7, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.google.common.collect.ImmutableList<java.lang.Character> charList1 = com.google.common.collect.Lists.charactersOf("ordered");
        org.junit.Assert.assertNotNull(charList1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Marker marker16 = null;
        boolean boolean17 = logger12.isTraceEnabled(marker16);
        logger12.debug("");
        org.slf4j.Marker marker20 = null;
        org.slf4j.Logger logger23 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker24 = null;
        org.slf4j.Logger logger27 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger23.warn(marker24, "hi!", (java.lang.Object) logger27);
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean35 = logger31.isErrorEnabled();
        org.slf4j.Logger logger37 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger37.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable42 = null;
        logger37.info("", throwable42);
        org.slf4j.Marker marker44 = null;
        java.lang.Object[] objArray48 = new java.lang.Object[] { true, 0.0f };
        logger37.info(marker44, "JCR-SQL2", objArray48);
        logger23.debug("", (java.lang.Object) logger31, (java.lang.Object) marker44);
        org.slf4j.Marker marker51 = null;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider orderedPropertyIndexProvider54 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider();
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState55 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList56 = orderedPropertyIndexProvider54.getQueryIndexes(nodeState55);
        logger23.debug(marker51, "hi!", (java.lang.Object) 100.0d, (java.lang.Object) wildcardList56);
        org.slf4j.Logger logger59 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger59.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable64 = null;
        logger59.info("", throwable64);
        org.slf4j.Marker marker66 = null;
        java.lang.Object[] objArray70 = new java.lang.Object[] { true, 0.0f };
        logger59.info(marker66, "JCR-SQL2", objArray70);
        org.slf4j.Marker marker72 = null;
        logger59.debug(marker72, "SELECT * FROM [oak:Unstructured]");
        logger59.warn("SELECT * FROM [oak:Unstructured]");
        logger12.warn(marker20, "direction", (java.lang.Object) 100.0d, (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        java.lang.Class<?> wildcardClass78 = logger12.getClass();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertNotNull(logger27);
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(logger37);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[true, 0.0]");
        org.junit.Assert.assertNotNull(wildcardList56);
        org.junit.Assert.assertNotNull(logger59);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[true, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable25 = null;
        logger20.info("", throwable25);
        org.slf4j.Marker marker27 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { true, 0.0f };
        logger20.info(marker27, "JCR-SQL2", objArray31);
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger34.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable39 = null;
        logger34.info("", throwable39);
        org.slf4j.Marker marker41 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { true, 0.0f };
        logger34.info(marker41, "JCR-SQL2", objArray45);
        java.lang.Object[] objArray47 = new java.lang.Object[] { logger20, marker41 };
        logger1.warn(marker17, "SELECT * FROM [oak:Unstructured]", objArray47);
        org.slf4j.Marker marker49 = null;
        boolean boolean50 = logger1.isInfoEnabled(marker49);
        org.slf4j.Logger logger53 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger53.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable58 = null;
        logger53.info("", throwable58);
        org.slf4j.Marker marker60 = null;
        java.lang.Object[] objArray64 = new java.lang.Object[] { true, 0.0f };
        logger53.info(marker60, "JCR-SQL2", objArray64);
        logger1.info("JCR-SQL2", objArray64);
        logger1.trace("descending");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(logger53);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[true, 0.0]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        java.lang.Throwable throwable24 = null;
        logger1.info("", throwable24);
        logger1.debug("ascending");
        org.slf4j.Marker marker28 = null;
        logger1.debug(marker28, "hi!");
        logger1.error("descending");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.google.common.collect.ImmutableList<java.lang.Character> charList1 = com.google.common.collect.Lists.charactersOf("SELECT * FROM [oak:Unstructured]");
        org.junit.Assert.assertNotNull(charList1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        logger1.info("SELECT * FROM [oak:Unstructured]", (java.lang.Object) true);
        org.slf4j.Marker marker17 = null;
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker21 = null;
        org.slf4j.Logger logger24 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn(marker21, "hi!", (java.lang.Object) logger24);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection27 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger20.debug("", (java.lang.Object) orderDirection27, (java.lang.Object) false);
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker32 = null;
        org.slf4j.Logger logger35 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn(marker32, "hi!", (java.lang.Object) logger35);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection38 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger31.debug("", (java.lang.Object) orderDirection38, (java.lang.Object) false);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection41 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.slf4j.Logger logger43 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker44 = null;
        org.slf4j.Logger logger47 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger43.warn(marker44, "hi!", (java.lang.Object) logger47);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection50 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger43.debug("", (java.lang.Object) orderDirection50, (java.lang.Object) false);
        org.slf4j.Logger logger54 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker55 = null;
        org.slf4j.Logger logger58 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger54.warn(marker55, "hi!", (java.lang.Object) logger58);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection61 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger54.debug("", (java.lang.Object) orderDirection61, (java.lang.Object) false);
        boolean boolean64 = orderDirection61.isAscending();
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection65 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection66 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray67 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] { orderDirection41, orderDirection50, orderDirection61, orderDirection65, orderDirection66 };
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList68 = com.google.common.collect.Lists.asList(orderDirection27, orderDirection38, orderDirectionArray67);
        boolean boolean69 = orderDirection38.isAscending();
        logger1.info(marker17, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) boolean69);
        org.slf4j.Marker marker71 = null;
        java.util.concurrent.CopyOnWriteArrayList<org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider> orderedPropertyIndexProviderList73 = com.google.common.collect.Lists.newCopyOnWriteArrayList();
        logger1.info(marker71, "ROOT", (java.lang.Object) orderedPropertyIndexProviderList73);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertTrue("'" + orderDirection27 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection27.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertNotNull(logger35);
        org.junit.Assert.assertTrue("'" + orderDirection38 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection38.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection41 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection41.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger43);
        org.junit.Assert.assertNotNull(logger47);
        org.junit.Assert.assertTrue("'" + orderDirection50 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection50.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger54);
        org.junit.Assert.assertNotNull(logger58);
        org.junit.Assert.assertTrue("'" + orderDirection61 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection61.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + orderDirection65 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection65.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection66 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection66.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(orderDirectionArray67);
        org.junit.Assert.assertNotNull(orderDirectionList68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(orderedPropertyIndexProviderList73);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        boolean boolean9 = logger1.isTraceEnabled(marker8);
        java.lang.Throwable throwable11 = null;
        logger1.debug("hi!", throwable11);
        org.slf4j.Marker marker13 = null;
        java.util.LinkedList<java.io.Serializable> serializableList15 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList16 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList18 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList16, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList19 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList21 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList19, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList22 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList24 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList22, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList25 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList27 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList25, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList28 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray30 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray31 = (java.util.Queue<java.io.Serializable>[]) queueArray30;
        serializableQueueArray31[0] = serializableList15;
        serializableQueueArray31[1] = serializableList16;
        serializableQueueArray31[2] = serializableList19;
        serializableQueueArray31[3] = serializableList22;
        serializableQueueArray31[4] = serializableList25;
        serializableQueueArray31[5] = serializableList28;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList44 = com.google.common.collect.Lists.newArrayList(serializableQueueArray31);
        logger1.warn(marker13, "JCR-SQL2", (java.lang.Object) serializableQueueList44);
        org.slf4j.Marker marker46 = null;
        java.lang.Throwable throwable48 = null;
        logger1.error(marker46, "ordered", throwable48);
        org.slf4j.Marker marker50 = null;
        logger1.info(marker50, "ROOT");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableList15);
        org.junit.Assert.assertNotNull(serializableList16);
        org.junit.Assert.assertNotNull(serializableListList18);
        org.junit.Assert.assertNotNull(serializableList19);
        org.junit.Assert.assertNotNull(serializableListList21);
        org.junit.Assert.assertNotNull(serializableList22);
        org.junit.Assert.assertNotNull(serializableListList24);
        org.junit.Assert.assertNotNull(serializableList25);
        org.junit.Assert.assertNotNull(serializableListList27);
        org.junit.Assert.assertNotNull(serializableList28);
        org.junit.Assert.assertNotNull(queueArray30);
        org.junit.Assert.assertNotNull(serializableQueueArray31);
        org.junit.Assert.assertNotNull(serializableQueueList44);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable25 = null;
        logger20.info("", throwable25);
        org.slf4j.Marker marker27 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { true, 0.0f };
        logger20.info(marker27, "JCR-SQL2", objArray31);
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger34.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable39 = null;
        logger34.info("", throwable39);
        org.slf4j.Marker marker41 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { true, 0.0f };
        logger34.info(marker41, "JCR-SQL2", objArray45);
        java.lang.Object[] objArray47 = new java.lang.Object[] { logger20, marker41 };
        logger1.warn(marker17, "SELECT * FROM [oak:Unstructured]", objArray47);
        org.slf4j.Marker marker49 = null;
        boolean boolean50 = logger1.isInfoEnabled(marker49);
        java.lang.Object obj52 = null;
        logger1.debug("JCR-SQL2", obj52);
        org.slf4j.Logger logger56 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger56.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable61 = null;
        logger56.info("", throwable61);
        org.slf4j.Marker marker63 = null;
        java.lang.Object[] objArray67 = new java.lang.Object[] { true, 0.0f };
        logger56.info(marker63, "JCR-SQL2", objArray67);
        org.slf4j.Marker marker69 = null;
        logger56.debug(marker69, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker72 = null;
        logger56.debug(marker72, "", (java.lang.Object) 10.0d);
        logger56.warn("");
        org.slf4j.Marker marker78 = null;
        logger56.trace(marker78, "hi!");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider orderedPropertyIndexProvider81 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider();
        logger1.trace("ROOT", (java.lang.Object) "hi!", (java.lang.Object) orderedPropertyIndexProvider81);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState83 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList84 = orderedPropertyIndexProvider81.getQueryIndexes(nodeState83);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState85 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList86 = orderedPropertyIndexProvider81.getQueryIndexes(nodeState85);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState87 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList88 = orderedPropertyIndexProvider81.getQueryIndexes(nodeState87);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(logger56);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[true, 0.0]");
        org.junit.Assert.assertNotNull(wildcardList84);
        org.junit.Assert.assertNotNull(wildcardList86);
        org.junit.Assert.assertNotNull(wildcardList88);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        java.lang.Object obj4 = null;
        logger1.warn("ordered", (java.lang.Object) (-1L), obj4);
        org.slf4j.Marker marker6 = null;
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean13 = logger9.isErrorEnabled();
        logger9.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker17 = null;
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("");
        logger20.warn("SELECT * FROM [oak:Unstructured]");
        logger9.warn(marker17, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger20);
        logger1.warn(marker6, "", (java.lang.Object) logger9);
        org.slf4j.Marker marker25 = null;
        java.lang.Throwable throwable27 = null;
        logger1.info(marker25, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", throwable27);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(logger20);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        boolean boolean9 = logger1.isTraceEnabled(marker8);
        org.slf4j.Marker marker10 = null;
        org.slf4j.Logger logger13 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger13.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable18 = null;
        logger13.info("", throwable18);
        org.slf4j.Marker marker20 = null;
        java.lang.Object[] objArray24 = new java.lang.Object[] { true, 0.0f };
        logger13.info(marker20, "JCR-SQL2", objArray24);
        org.slf4j.Marker marker26 = null;
        logger13.debug(marker26, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker29 = null;
        org.slf4j.Logger logger32 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger32.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable37 = null;
        logger32.info("", throwable37);
        org.slf4j.Marker marker39 = null;
        java.lang.Object[] objArray43 = new java.lang.Object[] { true, 0.0f };
        logger32.info(marker39, "JCR-SQL2", objArray43);
        org.slf4j.Logger logger46 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger46.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable51 = null;
        logger46.info("", throwable51);
        org.slf4j.Marker marker53 = null;
        java.lang.Object[] objArray57 = new java.lang.Object[] { true, 0.0f };
        logger46.info(marker53, "JCR-SQL2", objArray57);
        java.lang.Object[] objArray59 = new java.lang.Object[] { logger32, marker53 };
        logger13.warn(marker29, "SELECT * FROM [oak:Unstructured]", objArray59);
        org.slf4j.Marker marker61 = null;
        boolean boolean62 = logger13.isInfoEnabled(marker61);
        java.lang.Object obj64 = null;
        logger13.debug("JCR-SQL2", obj64);
        logger1.trace(marker10, "ordered", (java.lang.Object) "JCR-SQL2");
        java.lang.Throwable throwable68 = null;
        logger1.info("JCR-SQL2", throwable68);
        boolean boolean70 = logger1.isTraceEnabled();
        org.slf4j.Logger logger73 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger73.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable78 = null;
        logger73.info("", throwable78);
        org.slf4j.Marker marker80 = null;
        boolean boolean81 = logger73.isTraceEnabled(marker80);
        logger73.trace("", (java.lang.Object) 'a');
        logger1.debug("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger46);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[Logger[hi!], null]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(logger73);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.util.LinkedList<java.io.Serializable> serializableList0 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList2 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList0, (int) (short) 100);
        java.util.List<java.io.Serializable> serializableList3 = com.google.common.collect.Lists.reverse((java.util.List<java.io.Serializable>) serializableList0);
        java.util.List<java.util.List<java.io.Serializable>> serializableListList5 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList0, 1);
        org.junit.Assert.assertNotNull(serializableList0);
        org.junit.Assert.assertNotNull(serializableListList2);
        org.junit.Assert.assertNotNull(serializableList3);
        org.junit.Assert.assertNotNull(serializableListList5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        logger12.trace("ordered", (java.lang.Object) (-1L));
        org.slf4j.Marker marker19 = null;
        logger12.warn(marker19, "hi!", (java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.trace(marker6, "ordered");
        org.slf4j.Marker marker9 = null;
        java.util.ArrayList<java.io.Serializable> serializableList13 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) 4, (java.lang.Object) (byte) 1);
        org.slf4j.Logger logger17 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger17.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable22 = null;
        logger17.info("", throwable22);
        org.slf4j.Marker marker24 = null;
        java.lang.Object[] objArray28 = new java.lang.Object[] { true, 0.0f };
        logger17.info(marker24, "JCR-SQL2", objArray28);
        org.slf4j.Marker marker30 = null;
        logger17.debug(marker30, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker33 = null;
        logger17.debug(marker33, "", (java.lang.Object) 10.0d);
        logger17.warn("");
        org.slf4j.Marker marker39 = null;
        boolean boolean40 = logger17.isErrorEnabled(marker39);
        org.slf4j.Marker marker41 = null;
        org.slf4j.Logger logger44 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger44.warn("hi!", (java.lang.Object) (byte) 1);
        logger17.warn(marker41, "ROOT", (java.lang.Object) logger44, (java.lang.Object) (byte) 10);
        java.lang.Object[] objArray50 = new java.lang.Object[] { logger44 };
        logger1.trace("JCR-SQL2", objArray50);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(serializableList13);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(logger44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[Logger[hi!]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[Logger[hi!]]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        logger1.error("hi!");
        java.lang.Throwable throwable26 = null;
        logger1.warn("", throwable26);
        org.slf4j.Marker marker28 = null;
        logger1.info(marker28, "hi!");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("direction");
        org.slf4j.Marker marker2 = null;
        java.util.concurrent.CopyOnWriteArrayList<java.util.AbstractSequentialList<java.io.Serializable>> serializableListList4 = com.google.common.collect.Lists.newCopyOnWriteArrayList();
        logger1.debug(marker2, "JCR-SQL2", (java.lang.Object) serializableListList4);
        org.slf4j.Marker marker6 = null;
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("");
        logger9.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker12 = null;
        java.lang.Object obj14 = null;
        org.slf4j.Logger logger16 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger16.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable21 = null;
        logger16.info("", throwable21);
        logger9.warn(marker12, "", obj14, (java.lang.Object) "");
        org.slf4j.Marker marker24 = null;
        logger9.trace(marker24, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) 10.0d, (java.lang.Object) (-1.0d));
        java.lang.Object[] objArray30 = null;
        logger9.trace("JCR-SQL2", objArray30);
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker35 = null;
        org.slf4j.Logger logger38 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger34.warn(marker35, "hi!", (java.lang.Object) logger38);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection41 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger34.debug("", (java.lang.Object) orderDirection41, (java.lang.Object) false);
        org.slf4j.Logger logger45 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker46 = null;
        org.slf4j.Logger logger49 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger45.warn(marker46, "hi!", (java.lang.Object) logger49);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection52 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger45.debug("", (java.lang.Object) orderDirection52, (java.lang.Object) false);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection55 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.slf4j.Logger logger57 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker58 = null;
        org.slf4j.Logger logger61 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger57.warn(marker58, "hi!", (java.lang.Object) logger61);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection64 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger57.debug("", (java.lang.Object) orderDirection64, (java.lang.Object) false);
        org.slf4j.Logger logger68 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker69 = null;
        org.slf4j.Logger logger72 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger68.warn(marker69, "hi!", (java.lang.Object) logger72);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection75 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger68.debug("", (java.lang.Object) orderDirection75, (java.lang.Object) false);
        boolean boolean78 = orderDirection75.isAscending();
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection79 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection80 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray81 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] { orderDirection55, orderDirection64, orderDirection75, orderDirection79, orderDirection80 };
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList82 = com.google.common.collect.Lists.asList(orderDirection41, orderDirection52, orderDirectionArray81);
        logger9.error("Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", (java.lang.Object[]) orderDirectionArray81);
        logger1.error(marker6, "", (java.lang.Object) logger9);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(serializableListList4);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertNotNull(logger38);
        org.junit.Assert.assertTrue("'" + orderDirection41 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection41.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertTrue("'" + orderDirection52 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection52.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection55 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection55.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger57);
        org.junit.Assert.assertNotNull(logger61);
        org.junit.Assert.assertTrue("'" + orderDirection64 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection64.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger68);
        org.junit.Assert.assertNotNull(logger72);
        org.junit.Assert.assertTrue("'" + orderDirection75 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection75.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + orderDirection79 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection79.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection80 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection80.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(orderDirectionArray81);
        org.junit.Assert.assertNotNull(orderDirectionList82);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        boolean boolean9 = logger1.isTraceEnabled(marker8);
        java.lang.Throwable throwable11 = null;
        logger1.debug("hi!", throwable11);
        org.slf4j.Marker marker13 = null;
        java.util.LinkedList<java.io.Serializable> serializableList15 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList16 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList18 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList16, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList19 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList21 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList19, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList22 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList24 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList22, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList25 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList27 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList25, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList28 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray30 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray31 = (java.util.Queue<java.io.Serializable>[]) queueArray30;
        serializableQueueArray31[0] = serializableList15;
        serializableQueueArray31[1] = serializableList16;
        serializableQueueArray31[2] = serializableList19;
        serializableQueueArray31[3] = serializableList22;
        serializableQueueArray31[4] = serializableList25;
        serializableQueueArray31[5] = serializableList28;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList44 = com.google.common.collect.Lists.newArrayList(serializableQueueArray31);
        logger1.warn(marker13, "JCR-SQL2", (java.lang.Object) serializableQueueList44);
        java.lang.Throwable throwable47 = null;
        logger1.info("hi!", throwable47);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableList15);
        org.junit.Assert.assertNotNull(serializableList16);
        org.junit.Assert.assertNotNull(serializableListList18);
        org.junit.Assert.assertNotNull(serializableList19);
        org.junit.Assert.assertNotNull(serializableListList21);
        org.junit.Assert.assertNotNull(serializableList22);
        org.junit.Assert.assertNotNull(serializableListList24);
        org.junit.Assert.assertNotNull(serializableList25);
        org.junit.Assert.assertNotNull(serializableListList27);
        org.junit.Assert.assertNotNull(serializableList28);
        org.junit.Assert.assertNotNull(queueArray30);
        org.junit.Assert.assertNotNull(serializableQueueArray31);
        org.junit.Assert.assertNotNull(serializableQueueList44);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("ROOT");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger5.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker9 = null;
        boolean boolean10 = logger5.isWarnEnabled(marker9);
        org.slf4j.Marker marker11 = null;
        boolean boolean12 = logger5.isWarnEnabled(marker11);
        logger1.debug(marker2, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger5);
        boolean boolean14 = logger1.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Marker marker16 = null;
        boolean boolean17 = logger12.isTraceEnabled(marker16);
        logger12.debug("");
        org.slf4j.Marker marker20 = null;
        java.util.LinkedList<java.io.Serializable> serializableList22 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList24 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList22, (int) (short) 100);
        java.util.ArrayList<java.io.Serializable> serializableList26 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.List<java.io.Serializable> serializableList27 = com.google.common.collect.Lists.reverse((java.util.List<java.io.Serializable>) serializableList26);
        java.util.List<java.util.List<java.io.Serializable>> serializableListList29 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList26, 100);
        logger12.trace(marker20, "direction", (java.lang.Object) serializableList22, (java.lang.Object) serializableList26);
        java.lang.Class<?> wildcardClass31 = serializableList22.getClass();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableList22);
        org.junit.Assert.assertNotNull(serializableListList24);
        org.junit.Assert.assertNotNull(serializableList26);
        org.junit.Assert.assertNotNull(serializableList27);
        org.junit.Assert.assertNotNull(serializableListList29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        java.lang.Throwable throwable24 = null;
        logger1.info("", throwable24);
        logger1.debug("ascending");
        org.slf4j.Marker marker28 = null;
        java.lang.Throwable throwable30 = null;
        logger1.warn(marker28, "JCR-SQL2", throwable30);
        boolean boolean32 = logger1.isDebugEnabled();
        boolean boolean33 = logger1.isTraceEnabled();
        org.slf4j.Logger logger37 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger37.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable42 = null;
        logger37.info("", throwable42);
        org.slf4j.Marker marker44 = null;
        java.lang.Object[] objArray48 = new java.lang.Object[] { true, 0.0f };
        logger37.info(marker44, "JCR-SQL2", objArray48);
        org.slf4j.Marker marker50 = null;
        logger37.debug(marker50, "SELECT * FROM [oak:Unstructured]");
        logger37.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker55 = null;
        logger37.error(marker55, "ordered", (java.lang.Object) 100.0d);
        logger37.error("Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs");
        logger1.info("ROOT", (java.lang.Object) 1L, (java.lang.Object) "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(logger37);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[true, 0.0]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider orderedPropertyIndexProvider0 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider();
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState1 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList2 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState1);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState3 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList4 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState3);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState5 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList6 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState5);
        org.junit.Assert.assertNotNull(wildcardList2);
        org.junit.Assert.assertNotNull(wildcardList4);
        org.junit.Assert.assertNotNull(wildcardList6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker4 = null;
        java.lang.Object obj6 = null;
        org.slf4j.Logger logger8 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger8.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable13 = null;
        logger8.info("", throwable13);
        logger1.warn(marker4, "", obj6, (java.lang.Object) "");
        org.slf4j.Logger logger18 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker19 = null;
        org.slf4j.Logger logger22 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger18.warn(marker19, "hi!", (java.lang.Object) logger22);
        logger1.debug("JCR-SQL2", (java.lang.Object) "hi!");
        org.slf4j.Marker marker25 = null;
        org.slf4j.ILoggerFactory iLoggerFactory27 = org.slf4j.LoggerFactory.getILoggerFactory();
        org.slf4j.Logger logger29 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger29.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable34 = null;
        logger29.info("", throwable34);
        org.slf4j.Marker marker36 = null;
        java.lang.Object[] objArray40 = new java.lang.Object[] { true, 0.0f };
        logger29.info(marker36, "JCR-SQL2", objArray40);
        org.slf4j.Logger logger44 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger44.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean48 = logger44.isErrorEnabled();
        logger44.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker52 = null;
        org.slf4j.Logger logger55 = org.slf4j.LoggerFactory.getLogger("");
        logger55.warn("SELECT * FROM [oak:Unstructured]");
        logger44.warn(marker52, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger55);
        logger55.warn("direction", (java.lang.Object) 1.0d);
        logger29.debug("ascending", (java.lang.Object) logger55);
        logger1.error(marker25, "descending", (java.lang.Object) iLoggerFactory27, (java.lang.Object) logger29);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(iLoggerFactory27);
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(logger55);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        logger5.info("");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger12.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable17 = null;
        logger12.info("", throwable17);
        org.slf4j.Marker marker19 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] { true, 0.0f };
        logger12.info(marker19, "JCR-SQL2", objArray23);
        org.slf4j.Marker marker25 = null;
        logger12.debug(marker25, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker28 = null;
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable36 = null;
        logger31.info("", throwable36);
        org.slf4j.Marker marker38 = null;
        java.lang.Object[] objArray42 = new java.lang.Object[] { true, 0.0f };
        logger31.info(marker38, "JCR-SQL2", objArray42);
        org.slf4j.Logger logger45 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger45.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable50 = null;
        logger45.info("", throwable50);
        org.slf4j.Marker marker52 = null;
        java.lang.Object[] objArray56 = new java.lang.Object[] { true, 0.0f };
        logger45.info(marker52, "JCR-SQL2", objArray56);
        java.lang.Object[] objArray58 = new java.lang.Object[] { logger31, marker52 };
        logger12.warn(marker28, "SELECT * FROM [oak:Unstructured]", objArray58);
        logger5.debug(marker9, "", (java.lang.Object) objArray58, (java.lang.Object) (-1.0d));
        logger5.error("hi!");
        logger5.debug("descending");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[Logger[hi!], null]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        org.slf4j.Logger logger25 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger25.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean29 = logger25.isDebugEnabled();
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean35 = logger31.isErrorEnabled();
        logger31.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker39 = null;
        org.slf4j.Logger logger42 = org.slf4j.LoggerFactory.getLogger("");
        logger42.warn("SELECT * FROM [oak:Unstructured]");
        logger31.warn(marker39, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger42);
        org.slf4j.Marker marker46 = null;
        boolean boolean47 = logger42.isTraceEnabled(marker46);
        logger1.warn("hi!", (java.lang.Object) logger25, (java.lang.Object) marker46);
        org.slf4j.Marker marker49 = null;
        java.lang.Throwable throwable51 = null;
        logger25.warn(marker49, "direction", throwable51);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(logger42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.util.ArrayList<java.util.AbstractList<java.io.Serializable>> serializableListList1 = com.google.common.collect.Lists.newArrayListWithCapacity((int) (byte) 0);
        org.junit.Assert.assertNotNull(serializableListList1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        java.lang.Object obj24 = null;
        logger1.error("ROOT", obj24);
        boolean boolean26 = logger1.isInfoEnabled();
        java.util.ArrayList<java.io.Serializable> serializableList29 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.ArrayList<java.io.Serializable> serializableList31 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.Collection[] collectionArray33 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.io.Serializable>[] serializableCollectionArray34 = (java.util.Collection<java.io.Serializable>[]) collectionArray33;
        serializableCollectionArray34[0] = serializableList29;
        serializableCollectionArray34[1] = serializableList31;
        java.util.ArrayList<java.util.Collection<java.io.Serializable>> serializableCollectionList39 = com.google.common.collect.Lists.newArrayList(serializableCollectionArray34);
        logger1.error("", (java.lang.Object[]) serializableCollectionArray34);
        org.slf4j.Marker marker41 = null;
        java.util.ArrayList<java.io.Serializable> serializableList44 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.ArrayList<java.io.Serializable> serializableList46 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.Collection[] collectionArray48 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.io.Serializable>[] serializableCollectionArray49 = (java.util.Collection<java.io.Serializable>[]) collectionArray48;
        serializableCollectionArray49[0] = serializableList44;
        serializableCollectionArray49[1] = serializableList46;
        java.util.ArrayList<java.util.Collection<java.io.Serializable>> serializableCollectionList54 = com.google.common.collect.Lists.newArrayList(serializableCollectionArray49);
        logger1.trace(marker41, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", (java.lang.Object[]) serializableCollectionArray49);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(serializableList29);
        org.junit.Assert.assertNotNull(serializableList31);
        org.junit.Assert.assertNotNull(collectionArray33);
        org.junit.Assert.assertNotNull(serializableCollectionArray34);
        org.junit.Assert.assertNotNull(serializableCollectionList39);
        org.junit.Assert.assertNotNull(serializableList44);
        org.junit.Assert.assertNotNull(serializableList46);
        org.junit.Assert.assertNotNull(collectionArray48);
        org.junit.Assert.assertNotNull(serializableCollectionArray49);
        org.junit.Assert.assertNotNull(serializableCollectionList54);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Marker marker16 = null;
        logger12.warn(marker16, "");
        org.slf4j.Marker marker19 = null;
        boolean boolean20 = logger12.isErrorEnabled(marker19);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.trace(marker6, "ordered");
        java.util.concurrent.CopyOnWriteArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList10 = com.google.common.collect.Lists.newCopyOnWriteArrayList();
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker13 = null;
        org.slf4j.Logger logger16 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger12.warn(marker13, "hi!", (java.lang.Object) logger16);
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean24 = logger20.isErrorEnabled();
        org.slf4j.Logger logger26 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger26.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable31 = null;
        logger26.info("", throwable31);
        org.slf4j.Marker marker33 = null;
        java.lang.Object[] objArray37 = new java.lang.Object[] { true, 0.0f };
        logger26.info(marker33, "JCR-SQL2", objArray37);
        logger12.debug("", (java.lang.Object) logger20, (java.lang.Object) marker33);
        logger1.warn("ROOT", (java.lang.Object) serializableQueueList10, (java.lang.Object) logger20);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(serializableQueueList10);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[true, 0.0]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.util.LinkedList<java.io.Serializable> serializableList0 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList2 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList0, (int) (short) 100);
        java.util.List<java.io.Serializable> serializableList3 = com.google.common.collect.Lists.reverse((java.util.List<java.io.Serializable>) serializableList0);
        java.util.AbstractList[] abstractListArray5 = new java.util.AbstractList[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractList<java.io.Serializable>[] serializableListArray6 = (java.util.AbstractList<java.io.Serializable>[]) abstractListArray5;
        java.util.List<java.util.AbstractList<java.io.Serializable>> serializableListList7 = com.google.common.collect.Lists.asList((java.util.AbstractList<java.io.Serializable>) serializableList0, (java.util.AbstractList<java.io.Serializable>[]) abstractListArray5);
        org.junit.Assert.assertNotNull(serializableList0);
        org.junit.Assert.assertNotNull(serializableListList2);
        org.junit.Assert.assertNotNull(serializableList3);
        org.junit.Assert.assertNotNull(abstractListArray5);
        org.junit.Assert.assertNotNull(serializableListArray6);
        org.junit.Assert.assertNotNull(serializableListList7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection1 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.fromString("ROOT");
        org.junit.Assert.assertNull(orderDirection1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Marker marker16 = null;
        logger12.warn(marker16, "");
        org.slf4j.Marker marker19 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList22 = com.google.common.collect.Lists.newArrayList((java.lang.Comparable<java.lang.String>[]) strArray21);
        logger12.info(marker19, "JCR-SQL2", (java.lang.Object) strArray21);
        org.slf4j.Marker marker24 = null;
        java.lang.Throwable throwable26 = null;
        logger12.warn(marker24, "JCR-SQL2", throwable26);
        java.lang.Throwable throwable29 = null;
        logger12.warn("descending", throwable29);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strComparableList22);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Marker marker11 = null;
        logger1.trace(marker11, "JCR-SQL2", (java.lang.Object) 100.0f);
        org.slf4j.Marker marker15 = null;
        java.util.List<java.lang.Character> charList18 = com.google.common.collect.Lists.charactersOf((java.lang.CharSequence) "ascending");
        logger1.trace(marker15, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) charList18);
        org.slf4j.Logger logger22 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger22.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable27 = null;
        logger22.info("", throwable27);
        org.slf4j.Marker marker29 = null;
        java.lang.Object[] objArray33 = new java.lang.Object[] { true, 0.0f };
        logger22.info(marker29, "JCR-SQL2", objArray33);
        org.slf4j.Marker marker35 = null;
        logger22.debug(marker35, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker38 = null;
        logger22.debug(marker38, "", (java.lang.Object) 10.0d);
        logger22.warn("");
        org.slf4j.Marker marker44 = null;
        boolean boolean45 = logger22.isErrorEnabled(marker44);
        org.slf4j.Marker marker46 = null;
        org.slf4j.Logger logger49 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger49.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable54 = null;
        logger49.info("", throwable54);
        logger22.trace(marker46, "JCR-SQL2", (java.lang.Object) logger49);
        logger1.warn("descending", (java.lang.Object) logger22);
        org.slf4j.Marker marker58 = null;
        boolean boolean59 = logger1.isInfoEnabled(marker58);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charList18);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker4 = null;
        java.lang.Object obj6 = null;
        org.slf4j.Logger logger8 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger8.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable13 = null;
        logger8.info("", throwable13);
        logger1.warn(marker4, "", obj6, (java.lang.Object) "");
        java.lang.Throwable throwable17 = null;
        logger1.debug("ROOT", throwable17);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean13 = logger9.isErrorEnabled();
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger15.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable20 = null;
        logger15.info("", throwable20);
        org.slf4j.Marker marker22 = null;
        java.lang.Object[] objArray26 = new java.lang.Object[] { true, 0.0f };
        logger15.info(marker22, "JCR-SQL2", objArray26);
        logger1.debug("", (java.lang.Object) logger9, (java.lang.Object) marker22);
        logger9.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker32 = null;
        java.util.LinkedList<java.io.Serializable> serializableList34 = com.google.common.collect.Lists.newLinkedList();
        org.slf4j.Logger logger36 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger36.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable41 = null;
        logger36.info("", throwable41);
        org.slf4j.Marker marker43 = null;
        java.lang.Object[] objArray47 = new java.lang.Object[] { true, 0.0f };
        logger36.info(marker43, "JCR-SQL2", objArray47);
        org.slf4j.Marker marker49 = null;
        logger36.debug(marker49, "SELECT * FROM [oak:Unstructured]");
        logger36.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker54 = null;
        logger36.error(marker54, "ordered", (java.lang.Object) 100.0d);
        logger36.error("hi!");
        java.lang.Throwable throwable61 = null;
        logger36.warn("", throwable61);
        logger9.debug(marker32, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) serializableList34, (java.lang.Object) throwable61);
        org.slf4j.Logger logger66 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger66.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable71 = null;
        logger66.info("", throwable71);
        org.slf4j.Marker marker73 = null;
        java.lang.Object[] objArray77 = new java.lang.Object[] { true, 0.0f };
        logger66.info(marker73, "JCR-SQL2", objArray77);
        org.slf4j.Marker marker79 = null;
        logger66.debug(marker79, "SELECT * FROM [oak:Unstructured]");
        boolean boolean82 = logger66.isWarnEnabled();
        logger9.info("SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger66);
        org.slf4j.Marker marker84 = null;
        java.lang.Throwable throwable86 = null;
        logger9.trace(marker84, "direction", throwable86);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertNotNull(serializableList34);
        org.junit.Assert.assertNotNull(logger36);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger66);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.util.ArrayList<java.io.Serializable> serializableList1 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (short) 100);
        java.util.List<java.io.Serializable> serializableList2 = com.google.common.collect.Lists.reverse((java.util.List<java.io.Serializable>) serializableList1);
        org.junit.Assert.assertNotNull(serializableList1);
        org.junit.Assert.assertNotNull(serializableList2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable25 = null;
        logger20.info("", throwable25);
        org.slf4j.Marker marker27 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { true, 0.0f };
        logger20.info(marker27, "JCR-SQL2", objArray31);
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger34.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable39 = null;
        logger34.info("", throwable39);
        org.slf4j.Marker marker41 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { true, 0.0f };
        logger34.info(marker41, "JCR-SQL2", objArray45);
        java.lang.Object[] objArray47 = new java.lang.Object[] { logger20, marker41 };
        logger1.warn(marker17, "SELECT * FROM [oak:Unstructured]", objArray47);
        logger1.warn("ascending");
        boolean boolean51 = logger1.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.util.LinkedList<java.io.Serializable> serializableList0 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList2 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList0, 10);
        java.util.LinkedList<java.io.Serializable> serializableList3 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList5 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList3, 10);
        org.slf4j.Logger logger7 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger7.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean11 = logger7.isErrorEnabled();
        logger7.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker15 = null;
        org.slf4j.Logger logger18 = org.slf4j.LoggerFactory.getLogger("");
        logger18.warn("SELECT * FROM [oak:Unstructured]");
        logger7.warn(marker15, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger18);
        org.slf4j.Logger logger24 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker25 = null;
        org.slf4j.Logger logger28 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger24.warn(marker25, "hi!", (java.lang.Object) logger28);
        org.slf4j.Logger logger32 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger32.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean36 = logger32.isErrorEnabled();
        org.slf4j.Logger logger38 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger38.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable43 = null;
        logger38.info("", throwable43);
        org.slf4j.Marker marker45 = null;
        java.lang.Object[] objArray49 = new java.lang.Object[] { true, 0.0f };
        logger38.info(marker45, "JCR-SQL2", objArray49);
        logger24.debug("", (java.lang.Object) logger32, (java.lang.Object) marker45);
        logger32.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        java.util.LinkedList<java.io.Serializable> serializableList55 = com.google.common.collect.Lists.newLinkedList();
        logger18.info("", (java.lang.Object) "SELECT * FROM [oak:Unstructured]", (java.lang.Object) serializableList55);
        java.util.Queue<java.io.Serializable> serializableQueue57 = null;
        java.util.LinkedList<java.io.Serializable> serializableList58 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList59 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList61 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList59, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList62 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList64 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList62, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList65 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList67 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList65, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList68 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList70 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList68, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList71 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray73 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray74 = (java.util.Queue<java.io.Serializable>[]) queueArray73;
        serializableQueueArray74[0] = serializableList58;
        serializableQueueArray74[1] = serializableList59;
        serializableQueueArray74[2] = serializableList62;
        serializableQueueArray74[3] = serializableList65;
        serializableQueueArray74[4] = serializableList68;
        serializableQueueArray74[5] = serializableList71;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList87 = com.google.common.collect.Lists.newArrayList(serializableQueueArray74);
        java.util.List<java.util.Queue<java.io.Serializable>> serializableQueueList88 = com.google.common.collect.Lists.asList((java.util.Queue<java.io.Serializable>) serializableList55, serializableQueue57, serializableQueueArray74);
        java.util.List<java.util.Queue<java.io.Serializable>> serializableQueueList89 = com.google.common.collect.Lists.asList((java.util.Queue<java.io.Serializable>) serializableList0, (java.util.Queue<java.io.Serializable>) serializableList3, serializableQueueArray74);
        org.junit.Assert.assertNotNull(serializableList0);
        org.junit.Assert.assertNotNull(serializableListList2);
        org.junit.Assert.assertNotNull(serializableList3);
        org.junit.Assert.assertNotNull(serializableListList5);
        org.junit.Assert.assertNotNull(logger7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(logger38);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[true, 0.0]");
        org.junit.Assert.assertNotNull(serializableList55);
        org.junit.Assert.assertNotNull(serializableList58);
        org.junit.Assert.assertNotNull(serializableList59);
        org.junit.Assert.assertNotNull(serializableListList61);
        org.junit.Assert.assertNotNull(serializableList62);
        org.junit.Assert.assertNotNull(serializableListList64);
        org.junit.Assert.assertNotNull(serializableList65);
        org.junit.Assert.assertNotNull(serializableListList67);
        org.junit.Assert.assertNotNull(serializableList68);
        org.junit.Assert.assertNotNull(serializableListList70);
        org.junit.Assert.assertNotNull(serializableList71);
        org.junit.Assert.assertNotNull(queueArray73);
        org.junit.Assert.assertNotNull(serializableQueueArray74);
        org.junit.Assert.assertNotNull(serializableQueueList87);
        org.junit.Assert.assertNotNull(serializableQueueList88);
        org.junit.Assert.assertNotNull(serializableQueueList89);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker5 = null;
        boolean boolean6 = logger1.isWarnEnabled(marker5);
        org.slf4j.Marker marker7 = null;
        boolean boolean8 = logger1.isWarnEnabled(marker7);
        java.lang.Throwable throwable10 = null;
        logger1.info("SELECT * FROM [oak:Unstructured]", throwable10);
        org.slf4j.Marker marker12 = null;
        boolean boolean13 = logger1.isWarnEnabled(marker12);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("JCR-SQL2", (java.lang.Object) 1.0d);
        boolean boolean24 = logger1.isWarnEnabled();
        org.slf4j.Marker marker25 = null;
        java.lang.Throwable throwable27 = null;
        logger1.warn(marker25, "ascending", throwable27);
        org.slf4j.Marker marker29 = null;
        java.lang.Throwable throwable31 = null;
        logger1.error(marker29, "JCR-SQL2", throwable31);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Marker marker7 = null;
        logger5.warn(marker7, "ROOT");
        logger5.warn("descending");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker5 = null;
        boolean boolean6 = logger1.isWarnEnabled(marker5);
        org.slf4j.Marker marker7 = null;
        org.slf4j.Logger logger10 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker11 = null;
        org.slf4j.Logger logger14 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger10.warn(marker11, "hi!", (java.lang.Object) logger14);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection17 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger10.debug("", (java.lang.Object) orderDirection17, (java.lang.Object) false);
        logger1.warn(marker7, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) false);
        java.lang.String str21 = logger1.getName();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertTrue("'" + orderDirection17 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection17.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Logger logger6 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker7 = null;
        org.slf4j.Logger logger10 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger6.warn(marker7, "hi!", (java.lang.Object) logger10);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection13 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger6.debug("", (java.lang.Object) orderDirection13, (java.lang.Object) false);
        org.slf4j.Logger logger17 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker18 = null;
        org.slf4j.Logger logger21 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger17.warn(marker18, "hi!", (java.lang.Object) logger21);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection24 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger17.debug("", (java.lang.Object) orderDirection24, (java.lang.Object) false);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection27 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.slf4j.Logger logger29 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker30 = null;
        org.slf4j.Logger logger33 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger29.warn(marker30, "hi!", (java.lang.Object) logger33);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection36 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger29.debug("", (java.lang.Object) orderDirection36, (java.lang.Object) false);
        org.slf4j.Logger logger40 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker41 = null;
        org.slf4j.Logger logger44 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger40.warn(marker41, "hi!", (java.lang.Object) logger44);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection47 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger40.debug("", (java.lang.Object) orderDirection47, (java.lang.Object) false);
        boolean boolean50 = orderDirection47.isAscending();
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection51 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection52 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray53 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] { orderDirection27, orderDirection36, orderDirection47, orderDirection51, orderDirection52 };
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList54 = com.google.common.collect.Lists.asList(orderDirection13, orderDirection24, orderDirectionArray53);
        logger1.debug("JCR-SQL2", (java.lang.Object[]) orderDirectionArray53);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger6);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertTrue("'" + orderDirection13 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection13.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertTrue("'" + orderDirection24 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection24.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection27 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection27.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertNotNull(logger33);
        org.junit.Assert.assertTrue("'" + orderDirection36 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection36.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger40);
        org.junit.Assert.assertNotNull(logger44);
        org.junit.Assert.assertTrue("'" + orderDirection47 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection47.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + orderDirection51 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection51.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection52 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection52.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(orderDirectionArray53);
        org.junit.Assert.assertNotNull(orderDirectionList54);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        logger1.info("", (java.lang.Object) 5);
        java.lang.Throwable throwable13 = null;
        logger1.warn("hi!", throwable13);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean13 = logger9.isErrorEnabled();
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger15.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable20 = null;
        logger15.info("", throwable20);
        org.slf4j.Marker marker22 = null;
        java.lang.Object[] objArray26 = new java.lang.Object[] { true, 0.0f };
        logger15.info(marker22, "JCR-SQL2", objArray26);
        logger1.debug("", (java.lang.Object) logger9, (java.lang.Object) marker22);
        org.slf4j.Marker marker29 = null;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider orderedPropertyIndexProvider32 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider();
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState33 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList34 = orderedPropertyIndexProvider32.getQueryIndexes(nodeState33);
        logger1.debug(marker29, "hi!", (java.lang.Object) 100.0d, (java.lang.Object) wildcardList34);
        org.slf4j.Marker marker36 = null;
        logger1.trace(marker36, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker39 = null;
        logger1.info(marker39, "ROOT");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertNotNull(wildcardList34);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        logger1.error("hi!");
        logger1.warn("JCR-SQL2");
        org.slf4j.Marker marker27 = null;
        org.slf4j.Logger logger30 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger30.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean34 = logger30.isErrorEnabled();
        logger30.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker38 = null;
        org.slf4j.Logger logger41 = org.slf4j.LoggerFactory.getLogger("");
        logger41.warn("SELECT * FROM [oak:Unstructured]");
        logger30.warn(marker38, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger41);
        java.lang.Throwable throwable46 = null;
        logger30.info("direction", throwable46);
        org.slf4j.Marker marker48 = null;
        logger30.warn(marker48, "SELECT * FROM [oak:Unstructured]");
        logger1.info(marker27, "ascending", (java.lang.Object) marker48);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(logger41);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean13 = logger9.isErrorEnabled();
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger15.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable20 = null;
        logger15.info("", throwable20);
        org.slf4j.Marker marker22 = null;
        java.lang.Object[] objArray26 = new java.lang.Object[] { true, 0.0f };
        logger15.info(marker22, "JCR-SQL2", objArray26);
        logger1.debug("", (java.lang.Object) logger9, (java.lang.Object) marker22);
        logger9.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker32 = null;
        java.util.LinkedList<java.io.Serializable> serializableList34 = com.google.common.collect.Lists.newLinkedList();
        org.slf4j.Logger logger36 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger36.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable41 = null;
        logger36.info("", throwable41);
        org.slf4j.Marker marker43 = null;
        java.lang.Object[] objArray47 = new java.lang.Object[] { true, 0.0f };
        logger36.info(marker43, "JCR-SQL2", objArray47);
        org.slf4j.Marker marker49 = null;
        logger36.debug(marker49, "SELECT * FROM [oak:Unstructured]");
        logger36.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker54 = null;
        logger36.error(marker54, "ordered", (java.lang.Object) 100.0d);
        logger36.error("hi!");
        java.lang.Throwable throwable61 = null;
        logger36.warn("", throwable61);
        logger9.debug(marker32, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) serializableList34, (java.lang.Object) throwable61);
        org.slf4j.Logger logger66 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger66.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable71 = null;
        logger66.info("", throwable71);
        org.slf4j.Marker marker73 = null;
        java.lang.Object[] objArray77 = new java.lang.Object[] { true, 0.0f };
        logger66.info(marker73, "JCR-SQL2", objArray77);
        org.slf4j.Marker marker79 = null;
        logger66.debug(marker79, "SELECT * FROM [oak:Unstructured]");
        boolean boolean82 = logger66.isWarnEnabled();
        logger9.info("SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger66);
        java.lang.Throwable throwable85 = null;
        logger66.error("", throwable85);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertNotNull(serializableList34);
        org.junit.Assert.assertNotNull(logger36);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger66);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        java.lang.Throwable throwable4 = null;
        logger1.trace(marker2, "SELECT * FROM [oak:Unstructured]", throwable4);
        org.slf4j.Marker marker6 = null;
        java.lang.Object obj8 = null;
        logger1.error(marker6, "JCR-SQL2", obj8);
        logger1.warn("hi!");
        java.lang.Throwable throwable13 = null;
        logger1.info("ordered", throwable13);
        java.lang.String str15 = logger1.getName();
        org.slf4j.Marker marker16 = null;
        logger1.warn(marker16, "ordered");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("direction");
        org.slf4j.Logger logger4 = org.slf4j.LoggerFactory.getLogger("hi!");
        java.lang.Object[] objArray6 = null;
        logger4.info("ascending", objArray6);
        logger1.info("ordered", (java.lang.Object) "ascending");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger4);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        boolean boolean18 = logger1.isInfoEnabled(marker17);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        boolean boolean9 = logger1.isTraceEnabled(marker8);
        org.slf4j.Marker marker10 = null;
        boolean boolean11 = logger1.isInfoEnabled(marker10);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.util.concurrent.CopyOnWriteArrayList<java.lang.Enum<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection>> orderDirectionEnumList0 = com.google.common.collect.Lists.newCopyOnWriteArrayList();
        org.junit.Assert.assertNotNull(orderDirectionEnumList0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("JCR-SQL2", (java.lang.Object) 1.0d);
        boolean boolean24 = logger1.isWarnEnabled();
        java.lang.Class<?> wildcardClass25 = logger1.getClass();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        java.lang.String str19 = logger1.getName();
        org.slf4j.Marker marker20 = null;
        logger1.trace(marker20, "SELECT * FROM [oak:Unstructured]");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("ROOT");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger5.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker9 = null;
        boolean boolean10 = logger5.isWarnEnabled(marker9);
        org.slf4j.Marker marker11 = null;
        boolean boolean12 = logger5.isWarnEnabled(marker11);
        logger1.debug(marker2, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger5);
        org.slf4j.Logger logger16 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger16.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean20 = logger16.isErrorEnabled();
        logger16.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker24 = null;
        org.slf4j.Logger logger27 = org.slf4j.LoggerFactory.getLogger("");
        logger27.warn("SELECT * FROM [oak:Unstructured]");
        logger16.warn(marker24, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger27);
        logger27.trace("ordered", (java.lang.Object) (-1L));
        org.slf4j.Logger logger36 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker37 = null;
        org.slf4j.Logger logger40 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger36.warn(marker37, "hi!", (java.lang.Object) logger40);
        logger40.info("");
        org.slf4j.Marker marker44 = null;
        org.slf4j.Logger logger47 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger47.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable52 = null;
        logger47.info("", throwable52);
        org.slf4j.Marker marker54 = null;
        java.lang.Object[] objArray58 = new java.lang.Object[] { true, 0.0f };
        logger47.info(marker54, "JCR-SQL2", objArray58);
        org.slf4j.Marker marker60 = null;
        logger47.debug(marker60, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker63 = null;
        org.slf4j.Logger logger66 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger66.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable71 = null;
        logger66.info("", throwable71);
        org.slf4j.Marker marker73 = null;
        java.lang.Object[] objArray77 = new java.lang.Object[] { true, 0.0f };
        logger66.info(marker73, "JCR-SQL2", objArray77);
        org.slf4j.Logger logger80 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger80.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable85 = null;
        logger80.info("", throwable85);
        org.slf4j.Marker marker87 = null;
        java.lang.Object[] objArray91 = new java.lang.Object[] { true, 0.0f };
        logger80.info(marker87, "JCR-SQL2", objArray91);
        java.lang.Object[] objArray93 = new java.lang.Object[] { logger66, marker87 };
        logger47.warn(marker63, "SELECT * FROM [oak:Unstructured]", objArray93);
        logger40.debug(marker44, "", (java.lang.Object) objArray93, (java.lang.Object) (-1.0d));
        logger27.error("Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", objArray93);
        logger5.error("hi!", objArray93);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(logger27);
        org.junit.Assert.assertNotNull(logger36);
        org.junit.Assert.assertNotNull(logger40);
        org.junit.Assert.assertNotNull(logger47);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger66);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger80);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray93), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray93), "[Logger[hi!], null]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        boolean boolean17 = logger1.isWarnEnabled();
        org.slf4j.Marker marker18 = null;
        org.slf4j.Logger logger22 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger22.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable27 = null;
        logger22.info("", throwable27);
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable36 = null;
        logger31.info("", throwable36);
        org.slf4j.Marker marker38 = null;
        java.lang.Object[] objArray42 = new java.lang.Object[] { true, 0.0f };
        logger31.info(marker38, "JCR-SQL2", objArray42);
        org.slf4j.Marker marker44 = null;
        logger31.debug(marker44, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker47 = null;
        org.slf4j.Logger logger50 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger50.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable55 = null;
        logger50.info("", throwable55);
        org.slf4j.Marker marker57 = null;
        java.lang.Object[] objArray61 = new java.lang.Object[] { true, 0.0f };
        logger50.info(marker57, "JCR-SQL2", objArray61);
        org.slf4j.Logger logger64 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger64.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable69 = null;
        logger64.info("", throwable69);
        org.slf4j.Marker marker71 = null;
        java.lang.Object[] objArray75 = new java.lang.Object[] { true, 0.0f };
        logger64.info(marker71, "JCR-SQL2", objArray75);
        java.lang.Object[] objArray77 = new java.lang.Object[] { logger50, marker71 };
        logger31.warn(marker47, "SELECT * FROM [oak:Unstructured]", objArray77);
        logger22.trace("JCR-SQL2", objArray77);
        org.slf4j.Marker marker80 = null;
        org.slf4j.Logger logger84 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker85 = null;
        java.lang.Throwable throwable87 = null;
        logger84.trace(marker85, "SELECT * FROM [oak:Unstructured]", throwable87);
        logger22.warn(marker80, "JCR-SQL2", (java.lang.Object) (short) -1, (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        logger1.info(marker18, "JCR-SQL2", (java.lang.Object) (short) 100, (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        logger1.trace("");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger50);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger64);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[Logger[hi!], null]");
        org.junit.Assert.assertNotNull(logger84);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Marker marker16 = null;
        boolean boolean17 = logger12.isTraceEnabled(marker16);
        logger12.trace("ordered");
        boolean boolean20 = logger12.isTraceEnabled();
        org.slf4j.Logger logger23 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger23.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean27 = logger23.isErrorEnabled();
        logger23.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker31 = null;
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("");
        logger34.warn("SELECT * FROM [oak:Unstructured]");
        logger23.warn(marker31, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger34);
        logger34.warn("direction", (java.lang.Object) 1.0d);
        org.slf4j.Marker marker41 = null;
        org.slf4j.Logger logger44 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker45 = null;
        org.slf4j.Logger logger48 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger44.warn(marker45, "hi!", (java.lang.Object) logger48);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection51 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger44.debug("", (java.lang.Object) orderDirection51, (java.lang.Object) false);
        org.slf4j.Logger logger55 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker56 = null;
        org.slf4j.Logger logger59 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger55.warn(marker56, "hi!", (java.lang.Object) logger59);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection62 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger55.debug("", (java.lang.Object) orderDirection62, (java.lang.Object) false);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection65 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.slf4j.Logger logger67 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker68 = null;
        org.slf4j.Logger logger71 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger67.warn(marker68, "hi!", (java.lang.Object) logger71);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection74 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger67.debug("", (java.lang.Object) orderDirection74, (java.lang.Object) false);
        org.slf4j.Logger logger78 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker79 = null;
        org.slf4j.Logger logger82 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger78.warn(marker79, "hi!", (java.lang.Object) logger82);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection85 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger78.debug("", (java.lang.Object) orderDirection85, (java.lang.Object) false);
        boolean boolean88 = orderDirection85.isAscending();
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection89 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection90 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray91 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] { orderDirection65, orderDirection74, orderDirection85, orderDirection89, orderDirection90 };
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList92 = com.google.common.collect.Lists.asList(orderDirection51, orderDirection62, orderDirectionArray91);
        logger34.debug(marker41, "SELECT * FROM [oak:Unstructured]", (java.lang.Object[]) orderDirectionArray91);
        logger12.trace("hi!", (java.lang.Object[]) orderDirectionArray91);
        java.lang.Throwable throwable96 = null;
        logger12.trace("Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", throwable96);
        java.lang.String str98 = logger12.getName();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertNotNull(logger44);
        org.junit.Assert.assertNotNull(logger48);
        org.junit.Assert.assertTrue("'" + orderDirection51 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection51.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger55);
        org.junit.Assert.assertNotNull(logger59);
        org.junit.Assert.assertTrue("'" + orderDirection62 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection62.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection65 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection65.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger67);
        org.junit.Assert.assertNotNull(logger71);
        org.junit.Assert.assertTrue("'" + orderDirection74 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection74.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger78);
        org.junit.Assert.assertNotNull(logger82);
        org.junit.Assert.assertTrue("'" + orderDirection85 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection85.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + orderDirection89 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection89.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection90 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection90.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(orderDirectionArray91);
        org.junit.Assert.assertNotNull(orderDirectionList92);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        logger1.info("SELECT * FROM [oak:Unstructured]", (java.lang.Object) true);
        org.slf4j.Marker marker17 = null;
        java.lang.Throwable throwable19 = null;
        logger1.info(marker17, "ordered", throwable19);
        org.slf4j.Marker marker21 = null;
        java.lang.Throwable throwable23 = null;
        logger1.trace(marker21, "ordered", throwable23);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean13 = logger9.isErrorEnabled();
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger15.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable20 = null;
        logger15.info("", throwable20);
        org.slf4j.Marker marker22 = null;
        java.lang.Object[] objArray26 = new java.lang.Object[] { true, 0.0f };
        logger15.info(marker22, "JCR-SQL2", objArray26);
        logger1.debug("", (java.lang.Object) logger9, (java.lang.Object) marker22);
        logger9.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        logger9.debug("SELECT * FROM [oak:Unstructured]");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 0.0]");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        boolean boolean23 = logger1.isDebugEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        java.lang.Throwable throwable4 = null;
        logger1.trace(marker2, "SELECT * FROM [oak:Unstructured]", throwable4);
        org.slf4j.Marker marker6 = null;
        java.lang.Object obj8 = null;
        logger1.error(marker6, "JCR-SQL2", obj8);
        logger1.warn("hi!");
        java.lang.Throwable throwable13 = null;
        logger1.info("ordered", throwable13);
        boolean boolean15 = logger1.isDebugEnabled();
        org.slf4j.Logger logger18 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger18.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable23 = null;
        logger18.info("", throwable23);
        org.slf4j.Marker marker25 = null;
        java.lang.Object[] objArray29 = new java.lang.Object[] { true, 0.0f };
        logger18.info(marker25, "JCR-SQL2", objArray29);
        org.slf4j.Marker marker31 = null;
        logger18.debug(marker31, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker34 = null;
        logger18.debug(marker34, "", (java.lang.Object) 10.0d);
        logger18.info("ordered");
        org.slf4j.Marker marker40 = null;
        boolean boolean41 = logger18.isTraceEnabled(marker40);
        org.slf4j.Logger logger43 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger43.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean47 = logger43.isErrorEnabled();
        logger43.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker51 = null;
        org.slf4j.Logger logger54 = org.slf4j.LoggerFactory.getLogger("");
        logger54.warn("SELECT * FROM [oak:Unstructured]");
        logger43.warn(marker51, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger54);
        org.slf4j.Marker marker58 = null;
        boolean boolean59 = logger54.isTraceEnabled(marker58);
        org.slf4j.Marker marker60 = null;
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] {};
        java.util.List<java.lang.CharSequence> charSequenceList64 = com.google.common.collect.Lists.asList((java.lang.CharSequence) "hi!", charSequenceArray63);
        logger54.error(marker60, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", (java.lang.Object[]) charSequenceArray63);
        logger1.debug("ROOT", (java.lang.Object) boolean41, (java.lang.Object) marker60);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(logger43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(logger54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(charSequenceArray63);
        org.junit.Assert.assertNotNull(charSequenceList64);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        logger5.info("");
        org.slf4j.Logger logger11 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger11.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable16 = null;
        logger11.info("", throwable16);
        org.slf4j.Marker marker18 = null;
        java.lang.Object[] objArray22 = new java.lang.Object[] { true, 0.0f };
        logger11.info(marker18, "JCR-SQL2", objArray22);
        org.slf4j.Marker marker24 = null;
        logger11.debug(marker24, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker27 = null;
        logger11.debug(marker27, "", (java.lang.Object) 10.0d);
        logger11.warn("JCR-SQL2", (java.lang.Object) 1.0d);
        logger5.warn("direction", (java.lang.Object) "JCR-SQL2");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger11);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[true, 0.0]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable25 = null;
        logger20.info("", throwable25);
        org.slf4j.Marker marker27 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { true, 0.0f };
        logger20.info(marker27, "JCR-SQL2", objArray31);
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger34.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable39 = null;
        logger34.info("", throwable39);
        org.slf4j.Marker marker41 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { true, 0.0f };
        logger34.info(marker41, "JCR-SQL2", objArray45);
        java.lang.Object[] objArray47 = new java.lang.Object[] { logger20, marker41 };
        logger1.warn(marker17, "SELECT * FROM [oak:Unstructured]", objArray47);
        org.slf4j.Marker marker49 = null;
        boolean boolean50 = logger1.isInfoEnabled(marker49);
        org.slf4j.Logger logger53 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger53.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable58 = null;
        logger53.info("", throwable58);
        org.slf4j.Marker marker60 = null;
        java.lang.Object[] objArray64 = new java.lang.Object[] { true, 0.0f };
        logger53.info(marker60, "JCR-SQL2", objArray64);
        logger1.info("JCR-SQL2", objArray64);
        logger1.info("");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(logger53);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[true, 0.0]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("");
        org.slf4j.Marker marker23 = null;
        boolean boolean24 = logger1.isErrorEnabled(marker23);
        org.slf4j.Marker marker25 = null;
        org.slf4j.Logger logger28 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger28.warn("hi!", (java.lang.Object) (byte) 1);
        logger1.warn(marker25, "ROOT", (java.lang.Object) logger28, (java.lang.Object) (byte) 10);
        logger28.error("");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(logger28);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Marker marker11 = null;
        logger1.trace(marker11, "JCR-SQL2", (java.lang.Object) 100.0f);
        org.slf4j.Marker marker15 = null;
        org.slf4j.Logger logger18 = org.slf4j.LoggerFactory.getLogger("direction");
        logger1.warn(marker15, "", (java.lang.Object) "direction");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(logger18);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Marker marker16 = null;
        boolean boolean17 = logger12.isTraceEnabled(marker16);
        logger12.trace("ordered");
        boolean boolean20 = logger12.isTraceEnabled();
        org.slf4j.Marker marker21 = null;
        logger12.warn(marker21, "ROOT");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("JCR-SQL2");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        java.lang.Throwable throwable24 = null;
        logger1.info("", throwable24);
        logger1.debug("ascending");
        org.slf4j.Marker marker28 = null;
        logger1.debug(marker28, "hi!");
        logger1.warn("direction");
        java.util.LinkedList<java.io.Serializable> serializableList34 = com.google.common.collect.Lists.newLinkedList();
        logger1.debug("JCR-SQL2", (java.lang.Object) serializableList34);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(serializableList34);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean13 = logger9.isErrorEnabled();
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger15.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable20 = null;
        logger15.info("", throwable20);
        org.slf4j.Marker marker22 = null;
        java.lang.Object[] objArray26 = new java.lang.Object[] { true, 0.0f };
        logger15.info(marker22, "JCR-SQL2", objArray26);
        logger1.debug("", (java.lang.Object) logger9, (java.lang.Object) marker22);
        logger9.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker32 = null;
        java.util.LinkedList<java.io.Serializable> serializableList34 = com.google.common.collect.Lists.newLinkedList();
        org.slf4j.Logger logger36 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger36.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable41 = null;
        logger36.info("", throwable41);
        org.slf4j.Marker marker43 = null;
        java.lang.Object[] objArray47 = new java.lang.Object[] { true, 0.0f };
        logger36.info(marker43, "JCR-SQL2", objArray47);
        org.slf4j.Marker marker49 = null;
        logger36.debug(marker49, "SELECT * FROM [oak:Unstructured]");
        logger36.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker54 = null;
        logger36.error(marker54, "ordered", (java.lang.Object) 100.0d);
        logger36.error("hi!");
        java.lang.Throwable throwable61 = null;
        logger36.warn("", throwable61);
        logger9.debug(marker32, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) serializableList34, (java.lang.Object) throwable61);
        org.slf4j.Marker marker64 = null;
        java.lang.Throwable throwable66 = null;
        logger9.debug(marker64, "ROOT", throwable66);
        org.slf4j.Marker marker68 = null;
        logger9.debug(marker68, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", (java.lang.Object) 5);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertNotNull(serializableList34);
        org.junit.Assert.assertNotNull(logger36);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[true, 0.0]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Logger logger13 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger13.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable18 = null;
        logger13.info("", throwable18);
        org.slf4j.Marker marker20 = null;
        java.lang.Object[] objArray24 = new java.lang.Object[] { true, 0.0f };
        logger13.info(marker20, "JCR-SQL2", objArray24);
        logger1.warn("JCR-SQL2", objArray24);
        boolean boolean27 = logger1.isDebugEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.util.LinkedList<java.io.Serializable> serializableList0 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList2 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.List<java.io.Serializable>> serializableListList4 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableList0);
        org.junit.Assert.assertNotNull(serializableListList2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider orderedPropertyIndexProvider0 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider();
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState1 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList2 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState1);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState3 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList4 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState3);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState5 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList6 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState5);
        org.junit.Assert.assertNotNull(wildcardList2);
        org.junit.Assert.assertNotNull(wildcardList4);
        org.junit.Assert.assertNotNull(wildcardList6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker5 = null;
        boolean boolean6 = logger1.isWarnEnabled(marker5);
        org.slf4j.Marker marker7 = null;
        boolean boolean8 = logger1.isWarnEnabled(marker7);
        java.lang.Throwable throwable10 = null;
        logger1.info("SELECT * FROM [oak:Unstructured]", throwable10);
        org.slf4j.Logger logger14 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker15 = null;
        org.slf4j.Logger logger18 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger14.warn(marker15, "hi!", (java.lang.Object) logger18);
        logger18.info("");
        org.slf4j.Marker marker22 = null;
        org.slf4j.Logger logger25 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger25.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable30 = null;
        logger25.info("", throwable30);
        org.slf4j.Marker marker32 = null;
        java.lang.Object[] objArray36 = new java.lang.Object[] { true, 0.0f };
        logger25.info(marker32, "JCR-SQL2", objArray36);
        org.slf4j.Marker marker38 = null;
        logger25.debug(marker38, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker41 = null;
        org.slf4j.Logger logger44 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger44.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable49 = null;
        logger44.info("", throwable49);
        org.slf4j.Marker marker51 = null;
        java.lang.Object[] objArray55 = new java.lang.Object[] { true, 0.0f };
        logger44.info(marker51, "JCR-SQL2", objArray55);
        org.slf4j.Logger logger58 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger58.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable63 = null;
        logger58.info("", throwable63);
        org.slf4j.Marker marker65 = null;
        java.lang.Object[] objArray69 = new java.lang.Object[] { true, 0.0f };
        logger58.info(marker65, "JCR-SQL2", objArray69);
        java.lang.Object[] objArray71 = new java.lang.Object[] { logger44, marker65 };
        logger25.warn(marker41, "SELECT * FROM [oak:Unstructured]", objArray71);
        logger18.debug(marker22, "", (java.lang.Object) objArray71, (java.lang.Object) (-1.0d));
        logger18.error("hi!");
        org.slf4j.Marker marker77 = null;
        boolean boolean78 = logger18.isErrorEnabled(marker77);
        org.slf4j.Marker marker79 = null;
        java.lang.CharSequence[] charSequenceArray82 = new java.lang.CharSequence[] {};
        java.util.List<java.lang.CharSequence> charSequenceList83 = com.google.common.collect.Lists.asList((java.lang.CharSequence) "hi!", charSequenceArray82);
        logger18.trace(marker79, "", (java.lang.Object[]) charSequenceArray82);
        logger1.info("descending", (java.lang.Object[]) charSequenceArray82);
        org.slf4j.Marker marker86 = null;
        java.lang.Throwable throwable88 = null;
        logger1.warn(marker86, "ordered", throwable88);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger44);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger58);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[Logger[hi!], null]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(charSequenceArray82);
        org.junit.Assert.assertNotNull(charSequenceList83);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        boolean boolean9 = logger1.isTraceEnabled(marker8);
        java.lang.Throwable throwable11 = null;
        logger1.debug("hi!", throwable11);
        org.slf4j.Marker marker13 = null;
        java.util.LinkedList<java.io.Serializable> serializableList15 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList16 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList18 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList16, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList19 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList21 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList19, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList22 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList24 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList22, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList25 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList27 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList25, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList28 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray30 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray31 = (java.util.Queue<java.io.Serializable>[]) queueArray30;
        serializableQueueArray31[0] = serializableList15;
        serializableQueueArray31[1] = serializableList16;
        serializableQueueArray31[2] = serializableList19;
        serializableQueueArray31[3] = serializableList22;
        serializableQueueArray31[4] = serializableList25;
        serializableQueueArray31[5] = serializableList28;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList44 = com.google.common.collect.Lists.newArrayList(serializableQueueArray31);
        logger1.warn(marker13, "JCR-SQL2", (java.lang.Object) serializableQueueList44);
        org.slf4j.Marker marker46 = null;
        java.lang.Throwable throwable48 = null;
        logger1.error(marker46, "ordered", throwable48);
        org.slf4j.Marker marker50 = null;
        logger1.trace(marker50, "JCR-SQL2");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableList15);
        org.junit.Assert.assertNotNull(serializableList16);
        org.junit.Assert.assertNotNull(serializableListList18);
        org.junit.Assert.assertNotNull(serializableList19);
        org.junit.Assert.assertNotNull(serializableListList21);
        org.junit.Assert.assertNotNull(serializableList22);
        org.junit.Assert.assertNotNull(serializableListList24);
        org.junit.Assert.assertNotNull(serializableList25);
        org.junit.Assert.assertNotNull(serializableListList27);
        org.junit.Assert.assertNotNull(serializableList28);
        org.junit.Assert.assertNotNull(queueArray30);
        org.junit.Assert.assertNotNull(serializableQueueArray31);
        org.junit.Assert.assertNotNull(serializableQueueList44);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        logger5.info("");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger12.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable17 = null;
        logger12.info("", throwable17);
        org.slf4j.Marker marker19 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] { true, 0.0f };
        logger12.info(marker19, "JCR-SQL2", objArray23);
        org.slf4j.Marker marker25 = null;
        logger12.debug(marker25, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker28 = null;
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable36 = null;
        logger31.info("", throwable36);
        org.slf4j.Marker marker38 = null;
        java.lang.Object[] objArray42 = new java.lang.Object[] { true, 0.0f };
        logger31.info(marker38, "JCR-SQL2", objArray42);
        org.slf4j.Logger logger45 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger45.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable50 = null;
        logger45.info("", throwable50);
        org.slf4j.Marker marker52 = null;
        java.lang.Object[] objArray56 = new java.lang.Object[] { true, 0.0f };
        logger45.info(marker52, "JCR-SQL2", objArray56);
        java.lang.Object[] objArray58 = new java.lang.Object[] { logger31, marker52 };
        logger12.warn(marker28, "SELECT * FROM [oak:Unstructured]", objArray58);
        logger5.debug(marker9, "", (java.lang.Object) objArray58, (java.lang.Object) (-1.0d));
        org.slf4j.Marker marker62 = null;
        logger5.debug(marker62, "", (java.lang.Object) "descending");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[Logger[hi!], null]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        boolean boolean9 = logger1.isTraceEnabled(marker8);
        java.lang.Throwable throwable11 = null;
        logger1.debug("hi!", throwable11);
        boolean boolean13 = logger1.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("JCR-SQL2", (java.lang.Object) 1.0d);
        boolean boolean24 = logger1.isWarnEnabled();
        org.slf4j.Marker marker25 = null;
        java.lang.Throwable throwable27 = null;
        logger1.warn(marker25, "ascending", throwable27);
        org.slf4j.Marker marker29 = null;
        java.lang.Throwable throwable31 = null;
        logger1.trace(marker29, "", throwable31);
        logger1.info("direction");
        org.slf4j.Marker marker35 = null;
        java.lang.Throwable throwable37 = null;
        logger1.trace(marker35, "direction", throwable37);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Logger logger18 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker19 = null;
        org.slf4j.Logger logger22 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger18.warn(marker19, "hi!", (java.lang.Object) logger22);
        org.slf4j.Logger logger26 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger26.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean30 = logger26.isErrorEnabled();
        org.slf4j.Logger logger32 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger32.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable37 = null;
        logger32.info("", throwable37);
        org.slf4j.Marker marker39 = null;
        java.lang.Object[] objArray43 = new java.lang.Object[] { true, 0.0f };
        logger32.info(marker39, "JCR-SQL2", objArray43);
        logger18.debug("", (java.lang.Object) logger26, (java.lang.Object) marker39);
        logger26.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        java.util.LinkedList<java.io.Serializable> serializableList49 = com.google.common.collect.Lists.newLinkedList();
        logger12.info("", (java.lang.Object) "SELECT * FROM [oak:Unstructured]", (java.lang.Object) serializableList49);
        org.slf4j.Marker marker51 = null;
        boolean boolean52 = logger12.isWarnEnabled(marker51);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertNotNull(serializableList49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        java.lang.Throwable throwable24 = null;
        logger1.info("", throwable24);
        org.slf4j.Marker marker26 = null;
        boolean boolean27 = logger1.isWarnEnabled(marker26);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection8 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger1.debug("", (java.lang.Object) orderDirection8, (java.lang.Object) false);
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker13 = null;
        org.slf4j.Logger logger16 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger12.warn(marker13, "hi!", (java.lang.Object) logger16);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection19 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger12.debug("", (java.lang.Object) orderDirection19, (java.lang.Object) false);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection22 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.slf4j.Logger logger24 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker25 = null;
        org.slf4j.Logger logger28 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger24.warn(marker25, "hi!", (java.lang.Object) logger28);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection31 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger24.debug("", (java.lang.Object) orderDirection31, (java.lang.Object) false);
        org.slf4j.Logger logger35 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker36 = null;
        org.slf4j.Logger logger39 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger35.warn(marker36, "hi!", (java.lang.Object) logger39);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection42 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger35.debug("", (java.lang.Object) orderDirection42, (java.lang.Object) false);
        boolean boolean45 = orderDirection42.isAscending();
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection46 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection47 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray48 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] { orderDirection22, orderDirection31, orderDirection42, orderDirection46, orderDirection47 };
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList49 = com.google.common.collect.Lists.asList(orderDirection8, orderDirection19, orderDirectionArray48);
        boolean boolean50 = orderDirection19.isAscending();
        java.lang.String str51 = orderDirection19.getDirection();
        java.lang.String str52 = orderDirection19.getDirection();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + orderDirection8 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection8.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + orderDirection19 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection19.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection22 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection22.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertTrue("'" + orderDirection31 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection31.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger35);
        org.junit.Assert.assertNotNull(logger39);
        org.junit.Assert.assertTrue("'" + orderDirection42 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection42.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + orderDirection46 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection46.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection47 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection47.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(orderDirectionArray48);
        org.junit.Assert.assertNotNull(orderDirectionList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ascending" + "'", str51, "ascending");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ascending" + "'", str52, "ascending");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        java.lang.String str19 = logger1.getName();
        org.slf4j.Logger logger22 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger22.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable27 = null;
        logger22.info("", throwable27);
        org.slf4j.Marker marker29 = null;
        java.lang.Object[] objArray33 = new java.lang.Object[] { true, 0.0f };
        logger22.info(marker29, "JCR-SQL2", objArray33);
        org.slf4j.Marker marker35 = null;
        logger22.debug(marker35, "SELECT * FROM [oak:Unstructured]");
        logger22.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker40 = null;
        logger22.error(marker40, "ordered", (java.lang.Object) 100.0d);
        java.lang.Throwable throwable45 = null;
        logger22.info("", throwable45);
        logger22.debug("ascending");
        java.util.ArrayList<java.io.Serializable> serializableList51 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.ArrayList<java.io.Serializable> serializableList53 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.Collection[] collectionArray55 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.io.Serializable>[] serializableCollectionArray56 = (java.util.Collection<java.io.Serializable>[]) collectionArray55;
        serializableCollectionArray56[0] = serializableList51;
        serializableCollectionArray56[1] = serializableList53;
        java.util.ArrayList<java.util.Collection<java.io.Serializable>> serializableCollectionList61 = com.google.common.collect.Lists.newArrayList(serializableCollectionArray56);
        logger22.info("ordered", (java.lang.Object[]) serializableCollectionArray56);
        logger1.info("ascending", (java.lang.Object[]) serializableCollectionArray56);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[true, 0.0]");
        org.junit.Assert.assertNotNull(serializableList51);
        org.junit.Assert.assertNotNull(serializableList53);
        org.junit.Assert.assertNotNull(collectionArray55);
        org.junit.Assert.assertNotNull(serializableCollectionArray56);
        org.junit.Assert.assertNotNull(serializableCollectionList61);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        boolean boolean9 = logger1.isTraceEnabled(marker8);
        java.lang.Throwable throwable11 = null;
        logger1.debug("hi!", throwable11);
        org.slf4j.Marker marker13 = null;
        java.util.LinkedList<java.io.Serializable> serializableList15 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList16 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList18 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList16, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList19 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList21 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList19, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList22 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList24 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList22, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList25 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList27 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList25, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList28 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray30 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray31 = (java.util.Queue<java.io.Serializable>[]) queueArray30;
        serializableQueueArray31[0] = serializableList15;
        serializableQueueArray31[1] = serializableList16;
        serializableQueueArray31[2] = serializableList19;
        serializableQueueArray31[3] = serializableList22;
        serializableQueueArray31[4] = serializableList25;
        serializableQueueArray31[5] = serializableList28;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList44 = com.google.common.collect.Lists.newArrayList(serializableQueueArray31);
        logger1.warn(marker13, "JCR-SQL2", (java.lang.Object) serializableQueueList44);
        org.slf4j.Marker marker46 = null;
        org.slf4j.Logger logger49 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker50 = null;
        java.lang.Throwable throwable52 = null;
        logger49.trace(marker50, "SELECT * FROM [oak:Unstructured]", throwable52);
        org.slf4j.Marker marker54 = null;
        boolean boolean55 = logger49.isWarnEnabled(marker54);
        logger1.error(marker46, "descending", (java.lang.Object) logger49);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableList15);
        org.junit.Assert.assertNotNull(serializableList16);
        org.junit.Assert.assertNotNull(serializableListList18);
        org.junit.Assert.assertNotNull(serializableList19);
        org.junit.Assert.assertNotNull(serializableListList21);
        org.junit.Assert.assertNotNull(serializableList22);
        org.junit.Assert.assertNotNull(serializableListList24);
        org.junit.Assert.assertNotNull(serializableList25);
        org.junit.Assert.assertNotNull(serializableListList27);
        org.junit.Assert.assertNotNull(serializableList28);
        org.junit.Assert.assertNotNull(queueArray30);
        org.junit.Assert.assertNotNull(serializableQueueArray31);
        org.junit.Assert.assertNotNull(serializableQueueList44);
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        logger1.error("Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs");
        org.slf4j.Marker marker25 = null;
        logger1.error(marker25, "JCR-SQL2", (java.lang.Object) (byte) 100);
        org.slf4j.Marker marker29 = null;
        java.util.LinkedList<java.io.Serializable> serializableList31 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList33 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList31, 10);
        java.util.ArrayList<java.io.Serializable> serializableList35 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.ArrayList<java.io.Serializable> serializableList37 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.Collection[] collectionArray39 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.io.Serializable>[] serializableCollectionArray40 = (java.util.Collection<java.io.Serializable>[]) collectionArray39;
        serializableCollectionArray40[0] = serializableList35;
        serializableCollectionArray40[1] = serializableList37;
        java.util.ArrayList<java.util.Collection<java.io.Serializable>> serializableCollectionList45 = com.google.common.collect.Lists.newArrayList(serializableCollectionArray40);
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList46 = com.google.common.collect.Lists.asList((java.lang.Iterable<java.io.Serializable>) serializableList31, (java.lang.Iterable<java.io.Serializable>[]) serializableCollectionArray40);
        logger1.warn(marker29, "ROOT", (java.lang.Object[]) serializableCollectionArray40);
        org.slf4j.Marker marker48 = null;
        org.slf4j.Logger logger51 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger51.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable56 = null;
        logger51.info("", throwable56);
        java.lang.Throwable throwable59 = null;
        logger51.debug("hi!", throwable59);
        org.slf4j.Marker marker61 = null;
        logger51.trace(marker61, "SELECT * FROM [oak:Unstructured]");
        logger1.trace(marker48, "JCR-SQL2", (java.lang.Object) marker61, (java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(serializableList31);
        org.junit.Assert.assertNotNull(serializableListList33);
        org.junit.Assert.assertNotNull(serializableList35);
        org.junit.Assert.assertNotNull(serializableList37);
        org.junit.Assert.assertNotNull(collectionArray39);
        org.junit.Assert.assertNotNull(serializableCollectionArray40);
        org.junit.Assert.assertNotNull(serializableCollectionList45);
        org.junit.Assert.assertNotNull(serializableIterableList46);
        org.junit.Assert.assertNotNull(logger51);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        org.slf4j.Marker marker16 = null;
        logger12.warn(marker16, "");
        org.slf4j.Marker marker19 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList22 = com.google.common.collect.Lists.newArrayList((java.lang.Comparable<java.lang.String>[]) strArray21);
        logger12.info(marker19, "JCR-SQL2", (java.lang.Object) strArray21);
        org.slf4j.Marker marker24 = null;
        java.lang.Throwable throwable26 = null;
        logger12.warn(marker24, "JCR-SQL2", throwable26);
        org.slf4j.Marker marker28 = null;
        java.lang.Throwable throwable30 = null;
        logger12.error(marker28, "descending", throwable30);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strComparableList22);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        boolean boolean9 = logger1.isTraceEnabled(marker8);
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger12.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker16 = null;
        boolean boolean17 = logger12.isWarnEnabled(marker16);
        org.slf4j.Marker marker18 = null;
        org.slf4j.Logger logger21 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger21.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable26 = null;
        logger21.info("", throwable26);
        org.slf4j.Marker marker28 = null;
        java.lang.Object[] objArray32 = new java.lang.Object[] { true, 0.0f };
        logger21.info(marker28, "JCR-SQL2", objArray32);
        org.slf4j.Marker marker34 = null;
        logger21.debug(marker34, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker37 = null;
        org.slf4j.Logger logger40 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger40.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable45 = null;
        logger40.info("", throwable45);
        org.slf4j.Marker marker47 = null;
        java.lang.Object[] objArray51 = new java.lang.Object[] { true, 0.0f };
        logger40.info(marker47, "JCR-SQL2", objArray51);
        org.slf4j.Logger logger54 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger54.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable59 = null;
        logger54.info("", throwable59);
        org.slf4j.Marker marker61 = null;
        java.lang.Object[] objArray65 = new java.lang.Object[] { true, 0.0f };
        logger54.info(marker61, "JCR-SQL2", objArray65);
        java.lang.Object[] objArray67 = new java.lang.Object[] { logger40, marker61 };
        logger21.warn(marker37, "SELECT * FROM [oak:Unstructured]", objArray67);
        logger12.error(marker18, "hi!", (java.lang.Object) marker37);
        logger1.error("ordered", (java.lang.Object) "hi!");
        java.lang.String str71 = logger1.getName();
        org.slf4j.Marker marker72 = null;
        java.lang.Throwable throwable74 = null;
        logger1.trace(marker72, "hi!", throwable74);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(logger21);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger40);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger54);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.util.LinkedList<java.lang.Object[]> objArrayList0 = com.google.common.collect.Lists.newLinkedList();
        org.junit.Assert.assertNotNull(objArrayList0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("JCR-SQL2", (java.lang.Object) 1.0d);
        boolean boolean24 = logger1.isWarnEnabled();
        org.slf4j.Marker marker25 = null;
        java.lang.Throwable throwable27 = null;
        logger1.warn(marker25, "ascending", throwable27);
        org.slf4j.Marker marker29 = null;
        java.lang.Throwable throwable31 = null;
        logger1.trace(marker29, "", throwable31);
        org.slf4j.Marker marker33 = null;
        logger1.info(marker33, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("");
        org.slf4j.Marker marker2 = null;
        java.lang.Throwable throwable4 = null;
        logger1.error(marker2, "direction", throwable4);
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        logger5.info("");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger12.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable17 = null;
        logger12.info("", throwable17);
        org.slf4j.Marker marker19 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] { true, 0.0f };
        logger12.info(marker19, "JCR-SQL2", objArray23);
        org.slf4j.Marker marker25 = null;
        logger12.debug(marker25, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker28 = null;
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable36 = null;
        logger31.info("", throwable36);
        org.slf4j.Marker marker38 = null;
        java.lang.Object[] objArray42 = new java.lang.Object[] { true, 0.0f };
        logger31.info(marker38, "JCR-SQL2", objArray42);
        org.slf4j.Logger logger45 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger45.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable50 = null;
        logger45.info("", throwable50);
        org.slf4j.Marker marker52 = null;
        java.lang.Object[] objArray56 = new java.lang.Object[] { true, 0.0f };
        logger45.info(marker52, "JCR-SQL2", objArray56);
        java.lang.Object[] objArray58 = new java.lang.Object[] { logger31, marker52 };
        logger12.warn(marker28, "SELECT * FROM [oak:Unstructured]", objArray58);
        logger5.debug(marker9, "", (java.lang.Object) objArray58, (java.lang.Object) (-1.0d));
        org.slf4j.Marker marker62 = null;
        org.slf4j.Logger logger65 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger65.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean69 = logger65.isErrorEnabled();
        logger65.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker73 = null;
        org.slf4j.Logger logger76 = org.slf4j.LoggerFactory.getLogger("");
        logger76.warn("SELECT * FROM [oak:Unstructured]");
        logger65.warn(marker73, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger76);
        logger5.debug(marker62, "ROOT", (java.lang.Object) logger65, (java.lang.Object) (-1.0f));
        org.slf4j.Marker marker82 = null;
        java.lang.Throwable throwable84 = null;
        logger5.trace(marker82, "hi!", throwable84);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[Logger[hi!], null]");
        org.junit.Assert.assertNotNull(logger65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(logger76);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Marker marker11 = null;
        logger1.trace(marker11, "JCR-SQL2", (java.lang.Object) 100.0f);
        org.slf4j.Marker marker15 = null;
        java.util.List<java.lang.Character> charList18 = com.google.common.collect.Lists.charactersOf((java.lang.CharSequence) "ascending");
        logger1.trace(marker15, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) charList18);
        java.lang.Throwable throwable21 = null;
        logger1.warn("hi!", throwable21);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charList18);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        java.lang.Throwable throwable8 = null;
        logger5.info("descending", throwable8);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Marker marker7 = null;
        logger5.warn(marker7, "ROOT");
        org.slf4j.Marker marker10 = null;
        boolean boolean11 = logger5.isInfoEnabled(marker10);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isErrorEnabled();
        logger1.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("");
        logger12.warn("SELECT * FROM [oak:Unstructured]");
        logger1.warn(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        java.util.concurrent.CopyOnWriteArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList17 = com.google.common.collect.Lists.newCopyOnWriteArrayList();
        logger12.info("direction", (java.lang.Object) serializableQueueList17, (java.lang.Object) 100.0f);
        boolean boolean20 = logger12.isTraceEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(serializableQueueList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection8 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger1.debug("", (java.lang.Object) orderDirection8, (java.lang.Object) false);
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker13 = null;
        org.slf4j.Logger logger16 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger12.warn(marker13, "hi!", (java.lang.Object) logger16);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection19 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger12.debug("", (java.lang.Object) orderDirection19, (java.lang.Object) false);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection22 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.slf4j.Logger logger24 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker25 = null;
        org.slf4j.Logger logger28 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger24.warn(marker25, "hi!", (java.lang.Object) logger28);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection31 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger24.debug("", (java.lang.Object) orderDirection31, (java.lang.Object) false);
        org.slf4j.Logger logger35 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker36 = null;
        org.slf4j.Logger logger39 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger35.warn(marker36, "hi!", (java.lang.Object) logger39);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection42 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger35.debug("", (java.lang.Object) orderDirection42, (java.lang.Object) false);
        boolean boolean45 = orderDirection42.isAscending();
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection46 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection47 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray48 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] { orderDirection22, orderDirection31, orderDirection42, orderDirection46, orderDirection47 };
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList49 = com.google.common.collect.Lists.asList(orderDirection8, orderDirection19, orderDirectionArray48);
        boolean boolean50 = orderDirection19.isAscending();
        java.lang.String str51 = orderDirection19.getDirection();
        boolean boolean52 = orderDirection19.isDescending();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + orderDirection8 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection8.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertNotNull(logger16);
        org.junit.Assert.assertTrue("'" + orderDirection19 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection19.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection22 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection22.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertTrue("'" + orderDirection31 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection31.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger35);
        org.junit.Assert.assertNotNull(logger39);
        org.junit.Assert.assertTrue("'" + orderDirection42 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection42.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + orderDirection46 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection46.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection47 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection47.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(orderDirectionArray48);
        org.junit.Assert.assertNotNull(orderDirectionList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ascending" + "'", str51, "ascending");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        boolean boolean9 = logger1.isTraceEnabled(marker8);
        java.lang.Throwable throwable11 = null;
        logger1.debug("hi!", throwable11);
        java.lang.Throwable throwable14 = null;
        logger1.warn("SELECT * FROM [oak:Unstructured]", throwable14);
        org.slf4j.Marker marker16 = null;
        java.util.LinkedList<java.io.Serializable> serializableList18 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList19 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList21 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList19, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList22 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList24 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList22, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList25 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList27 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList25, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList28 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList30 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList28, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList31 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray33 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray34 = (java.util.Queue<java.io.Serializable>[]) queueArray33;
        serializableQueueArray34[0] = serializableList18;
        serializableQueueArray34[1] = serializableList19;
        serializableQueueArray34[2] = serializableList22;
        serializableQueueArray34[3] = serializableList25;
        serializableQueueArray34[4] = serializableList28;
        serializableQueueArray34[5] = serializableList31;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList47 = com.google.common.collect.Lists.newArrayList(serializableQueueArray34);
        logger1.warn(marker16, "hi!", (java.lang.Object[]) serializableQueueArray34);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableList18);
        org.junit.Assert.assertNotNull(serializableList19);
        org.junit.Assert.assertNotNull(serializableListList21);
        org.junit.Assert.assertNotNull(serializableList22);
        org.junit.Assert.assertNotNull(serializableListList24);
        org.junit.Assert.assertNotNull(serializableList25);
        org.junit.Assert.assertNotNull(serializableListList27);
        org.junit.Assert.assertNotNull(serializableList28);
        org.junit.Assert.assertNotNull(serializableListList30);
        org.junit.Assert.assertNotNull(serializableList31);
        org.junit.Assert.assertNotNull(queueArray33);
        org.junit.Assert.assertNotNull(serializableQueueArray34);
        org.junit.Assert.assertNotNull(serializableQueueList47);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        java.lang.Object[] objArray3 = null;
        logger1.info("ascending", objArray3);
        org.slf4j.Marker marker5 = null;
        logger1.trace(marker5, "descending");
        boolean boolean8 = logger1.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("ROOT");
        logger1.debug("direction");
        org.junit.Assert.assertNotNull(logger1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        java.lang.Object obj24 = null;
        logger1.error("ROOT", obj24);
        boolean boolean26 = logger1.isInfoEnabled();
        org.slf4j.Marker marker27 = null;
        logger1.info(marker27, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.util.LinkedList<java.lang.String[]> strArrayList0 = com.google.common.collect.Lists.newLinkedList();
        org.junit.Assert.assertNotNull(strArrayList0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        boolean boolean18 = logger1.isErrorEnabled(marker17);
        org.slf4j.Marker marker19 = null;
        boolean boolean20 = logger1.isErrorEnabled(marker19);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.util.ArrayList<java.lang.reflect.AnnotatedElement> annotatedElementList1 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (short) 10);
        org.junit.Assert.assertNotNull(annotatedElementList1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        java.lang.Throwable throwable4 = null;
        logger1.trace(marker2, "SELECT * FROM [oak:Unstructured]", throwable4);
        org.slf4j.Logger logger8 = org.slf4j.LoggerFactory.getLogger("ROOT");
        org.slf4j.Marker marker9 = null;
        org.slf4j.Logger logger12 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger12.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker16 = null;
        boolean boolean17 = logger12.isWarnEnabled(marker16);
        org.slf4j.Marker marker18 = null;
        boolean boolean19 = logger12.isWarnEnabled(marker18);
        logger8.debug(marker9, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger12);
        logger1.warn("hi!", (java.lang.Object) logger8);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(logger12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.util.LinkedList<org.slf4j.ILoggerFactory> iLoggerFactoryList0 = com.google.common.collect.Lists.newLinkedList();
        org.junit.Assert.assertNotNull(iLoggerFactoryList0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.util.ArrayList<java.lang.Object> objList1 = com.google.common.collect.Lists.newArrayListWithCapacity((int) (byte) 10);
        org.junit.Assert.assertNotNull(objList1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        logger5.info("");
        org.slf4j.Marker marker9 = null;
        boolean boolean10 = logger5.isWarnEnabled(marker9);
        boolean boolean11 = logger5.isWarnEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("ROOT");
        org.slf4j.Marker marker2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        logger1.warn(marker2, "hi!", obj4);
        org.slf4j.Marker marker6 = null;
        boolean boolean7 = logger1.isInfoEnabled(marker6);
        org.slf4j.Marker marker8 = null;
        logger1.info(marker8, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        org.slf4j.Logger logger25 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger25.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean29 = logger25.isDebugEnabled();
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger31.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean35 = logger31.isErrorEnabled();
        logger31.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker39 = null;
        org.slf4j.Logger logger42 = org.slf4j.LoggerFactory.getLogger("");
        logger42.warn("SELECT * FROM [oak:Unstructured]");
        logger31.warn(marker39, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger42);
        org.slf4j.Marker marker46 = null;
        boolean boolean47 = logger42.isTraceEnabled(marker46);
        logger1.warn("hi!", (java.lang.Object) logger25, (java.lang.Object) marker46);
        org.slf4j.Marker marker49 = null;
        java.lang.Throwable throwable51 = null;
        logger25.info(marker49, "", throwable51);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(logger42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        java.lang.Throwable throwable4 = null;
        logger1.trace(marker2, "SELECT * FROM [oak:Unstructured]", throwable4);
        org.slf4j.Marker marker6 = null;
        java.lang.Object obj8 = null;
        logger1.error(marker6, "JCR-SQL2", obj8);
        logger1.warn("hi!");
        java.lang.Throwable throwable13 = null;
        logger1.info("ordered", throwable13);
        java.lang.String str15 = logger1.getName();
        org.slf4j.Logger logger18 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger18.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable23 = null;
        logger18.info("", throwable23);
        org.slf4j.Marker marker25 = null;
        java.lang.Object[] objArray29 = new java.lang.Object[] { true, 0.0f };
        logger18.info(marker25, "JCR-SQL2", objArray29);
        logger1.debug("ascending", objArray29);
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger34.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean38 = logger34.isErrorEnabled();
        logger34.error("", (java.lang.Object) "direction");
        org.slf4j.Marker marker42 = null;
        org.slf4j.Logger logger45 = org.slf4j.LoggerFactory.getLogger("");
        logger45.warn("SELECT * FROM [oak:Unstructured]");
        logger34.warn(marker42, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) logger45);
        org.slf4j.Marker marker49 = null;
        logger45.warn(marker49, "");
        org.slf4j.Marker marker52 = null;
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList55 = com.google.common.collect.Lists.newArrayList((java.lang.Comparable<java.lang.String>[]) strArray54);
        logger45.info(marker52, "JCR-SQL2", (java.lang.Object) strArray54);
        logger1.trace("descending", (java.lang.Object[]) strArray54);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strComparableList55);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Marker marker11 = null;
        logger1.trace(marker11, "JCR-SQL2", (java.lang.Object) 100.0f);
        org.slf4j.Marker marker15 = null;
        java.util.List<java.lang.Character> charList18 = com.google.common.collect.Lists.charactersOf((java.lang.CharSequence) "ascending");
        logger1.trace(marker15, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) charList18);
        org.slf4j.Marker marker20 = null;
        org.slf4j.Logger logger23 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger23.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker27 = null;
        boolean boolean28 = logger23.isWarnEnabled(marker27);
        org.slf4j.Marker marker29 = null;
        org.slf4j.Logger logger32 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger32.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable37 = null;
        logger32.info("", throwable37);
        org.slf4j.Marker marker39 = null;
        java.lang.Object[] objArray43 = new java.lang.Object[] { true, 0.0f };
        logger32.info(marker39, "JCR-SQL2", objArray43);
        org.slf4j.Marker marker45 = null;
        logger32.debug(marker45, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker48 = null;
        org.slf4j.Logger logger51 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger51.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable56 = null;
        logger51.info("", throwable56);
        org.slf4j.Marker marker58 = null;
        java.lang.Object[] objArray62 = new java.lang.Object[] { true, 0.0f };
        logger51.info(marker58, "JCR-SQL2", objArray62);
        org.slf4j.Logger logger65 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger65.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable70 = null;
        logger65.info("", throwable70);
        org.slf4j.Marker marker72 = null;
        java.lang.Object[] objArray76 = new java.lang.Object[] { true, 0.0f };
        logger65.info(marker72, "JCR-SQL2", objArray76);
        java.lang.Object[] objArray78 = new java.lang.Object[] { logger51, marker72 };
        logger32.warn(marker48, "SELECT * FROM [oak:Unstructured]", objArray78);
        logger23.error(marker29, "hi!", (java.lang.Object) marker48);
        org.slf4j.Marker marker81 = null;
        boolean boolean82 = logger23.isErrorEnabled(marker81);
        org.slf4j.Marker marker83 = null;
        boolean boolean84 = logger23.isErrorEnabled(marker83);
        logger1.warn(marker20, "ordered", (java.lang.Object) logger23);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charList18);
        org.junit.Assert.assertNotNull(logger23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(logger32);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger51);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger65);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[Logger[hi!], null]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection8 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger1.debug("", (java.lang.Object) orderDirection8, (java.lang.Object) false);
        boolean boolean11 = orderDirection8.isAscending();
        boolean boolean12 = orderDirection8.isDescending();
        org.slf4j.Logger logger14 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker15 = null;
        org.slf4j.Logger logger18 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger14.warn(marker15, "hi!", (java.lang.Object) logger18);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection21 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger14.debug("", (java.lang.Object) orderDirection21, (java.lang.Object) false);
        org.slf4j.Logger logger25 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker26 = null;
        org.slf4j.Logger logger29 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger25.warn(marker26, "hi!", (java.lang.Object) logger29);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection32 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger25.debug("", (java.lang.Object) orderDirection32, (java.lang.Object) false);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection35 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.slf4j.Logger logger37 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker38 = null;
        org.slf4j.Logger logger41 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger37.warn(marker38, "hi!", (java.lang.Object) logger41);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection44 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger37.debug("", (java.lang.Object) orderDirection44, (java.lang.Object) false);
        org.slf4j.Logger logger48 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker49 = null;
        org.slf4j.Logger logger52 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger48.warn(marker49, "hi!", (java.lang.Object) logger52);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection55 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger48.debug("", (java.lang.Object) orderDirection55, (java.lang.Object) false);
        boolean boolean58 = orderDirection55.isAscending();
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection59 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection60 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray61 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] { orderDirection35, orderDirection44, orderDirection55, orderDirection59, orderDirection60 };
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList62 = com.google.common.collect.Lists.asList(orderDirection21, orderDirection32, orderDirectionArray61);
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList63 = com.google.common.collect.Lists.asList(orderDirection8, orderDirectionArray61);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertTrue("'" + orderDirection8 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection8.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(logger14);
        org.junit.Assert.assertNotNull(logger18);
        org.junit.Assert.assertTrue("'" + orderDirection21 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection21.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger25);
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertTrue("'" + orderDirection32 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection32.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection35 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection35.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger37);
        org.junit.Assert.assertNotNull(logger41);
        org.junit.Assert.assertTrue("'" + orderDirection44 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection44.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger48);
        org.junit.Assert.assertNotNull(logger52);
        org.junit.Assert.assertTrue("'" + orderDirection55 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection55.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + orderDirection59 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection59.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection60 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection60.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(orderDirectionArray61);
        org.junit.Assert.assertNotNull(orderDirectionList62);
        org.junit.Assert.assertNotNull(orderDirectionList63);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection0 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        boolean boolean1 = orderDirection0.isAscending();
        org.junit.Assert.assertTrue("'" + orderDirection0 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection0.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.util.concurrent.CopyOnWriteArrayList<org.slf4j.ILoggerFactory> iLoggerFactoryList0 = com.google.common.collect.Lists.newCopyOnWriteArrayList();
        org.junit.Assert.assertNotNull(iLoggerFactoryList0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker4 = null;
        java.lang.Object obj6 = null;
        org.slf4j.Logger logger8 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger8.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable13 = null;
        logger8.info("", throwable13);
        logger1.warn(marker4, "", obj6, (java.lang.Object) "");
        org.slf4j.Marker marker16 = null;
        logger1.trace(marker16, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) 10.0d, (java.lang.Object) (-1.0d));
        java.lang.Object[] objArray22 = null;
        logger1.trace("JCR-SQL2", objArray22);
        org.slf4j.Logger logger26 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker27 = null;
        org.slf4j.Logger logger30 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger26.warn(marker27, "hi!", (java.lang.Object) logger30);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection33 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger26.debug("", (java.lang.Object) orderDirection33, (java.lang.Object) false);
        org.slf4j.Logger logger37 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker38 = null;
        org.slf4j.Logger logger41 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger37.warn(marker38, "hi!", (java.lang.Object) logger41);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection44 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger37.debug("", (java.lang.Object) orderDirection44, (java.lang.Object) false);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection47 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.slf4j.Logger logger49 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker50 = null;
        org.slf4j.Logger logger53 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger49.warn(marker50, "hi!", (java.lang.Object) logger53);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection56 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger49.debug("", (java.lang.Object) orderDirection56, (java.lang.Object) false);
        org.slf4j.Logger logger60 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker61 = null;
        org.slf4j.Logger logger64 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger60.warn(marker61, "hi!", (java.lang.Object) logger64);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection67 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger60.debug("", (java.lang.Object) orderDirection67, (java.lang.Object) false);
        boolean boolean70 = orderDirection67.isAscending();
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection71 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection72 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray73 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] { orderDirection47, orderDirection56, orderDirection67, orderDirection71, orderDirection72 };
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList74 = com.google.common.collect.Lists.asList(orderDirection33, orderDirection44, orderDirectionArray73);
        logger1.error("Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", (java.lang.Object[]) orderDirectionArray73);
        org.slf4j.Marker marker76 = null;
        java.util.concurrent.CopyOnWriteArrayList<java.lang.Cloneable> cloneableList78 = com.google.common.collect.Lists.newCopyOnWriteArrayList();
        logger1.trace(marker76, "direction", (java.lang.Object) cloneableList78, (java.lang.Object) 5);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertNotNull(logger30);
        org.junit.Assert.assertTrue("'" + orderDirection33 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection33.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger37);
        org.junit.Assert.assertNotNull(logger41);
        org.junit.Assert.assertTrue("'" + orderDirection44 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection44.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection47 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection47.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertNotNull(logger53);
        org.junit.Assert.assertTrue("'" + orderDirection56 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection56.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger60);
        org.junit.Assert.assertNotNull(logger64);
        org.junit.Assert.assertTrue("'" + orderDirection67 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection67.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + orderDirection71 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection71.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection72 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection72.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(orderDirectionArray73);
        org.junit.Assert.assertNotNull(orderDirectionList74);
        org.junit.Assert.assertNotNull(cloneableList78);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider orderedPropertyIndexProvider0 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider();
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState1 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList2 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState1);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState3 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList4 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState3);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState5 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList6 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState5);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState7 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList8 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState7);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState9 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList10 = orderedPropertyIndexProvider0.getQueryIndexes(nodeState9);
        org.junit.Assert.assertNotNull(wildcardList2);
        org.junit.Assert.assertNotNull(wildcardList4);
        org.junit.Assert.assertNotNull(wildcardList6);
        org.junit.Assert.assertNotNull(wildcardList8);
        org.junit.Assert.assertNotNull(wildcardList10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        logger1.error("hi!");
        java.lang.Throwable throwable26 = null;
        logger1.warn("", throwable26);
        org.slf4j.Marker marker28 = null;
        org.slf4j.Logger logger31 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker32 = null;
        java.lang.Throwable throwable34 = null;
        logger31.trace(marker32, "SELECT * FROM [oak:Unstructured]", throwable34);
        org.slf4j.Marker marker36 = null;
        boolean boolean37 = logger31.isWarnEnabled(marker36);
        org.slf4j.Marker marker38 = null;
        org.slf4j.Logger logger41 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker42 = null;
        org.slf4j.Logger logger45 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger41.warn(marker42, "hi!", (java.lang.Object) logger45);
        java.lang.Throwable throwable48 = null;
        logger45.info("JCR-SQL2", throwable48);
        java.util.LinkedList<java.io.Serializable> serializableList51 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList52 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList54 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList52, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList55 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList57 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList55, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList58 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList60 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList58, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList61 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList63 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList61, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList64 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray66 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray67 = (java.util.Queue<java.io.Serializable>[]) queueArray66;
        serializableQueueArray67[0] = serializableList51;
        serializableQueueArray67[1] = serializableList52;
        serializableQueueArray67[2] = serializableList55;
        serializableQueueArray67[3] = serializableList58;
        serializableQueueArray67[4] = serializableList61;
        serializableQueueArray67[5] = serializableList64;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList80 = com.google.common.collect.Lists.newArrayList(serializableQueueArray67);
        logger45.info("hi!", (java.lang.Object[]) serializableQueueArray67);
        logger31.debug(marker38, "JCR-SQL2", (java.lang.Object[]) serializableQueueArray67);
        logger1.debug(marker28, "JCR-SQL2", (java.lang.Object) "JCR-SQL2");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(logger41);
        org.junit.Assert.assertNotNull(logger45);
        org.junit.Assert.assertNotNull(serializableList51);
        org.junit.Assert.assertNotNull(serializableList52);
        org.junit.Assert.assertNotNull(serializableListList54);
        org.junit.Assert.assertNotNull(serializableList55);
        org.junit.Assert.assertNotNull(serializableListList57);
        org.junit.Assert.assertNotNull(serializableList58);
        org.junit.Assert.assertNotNull(serializableListList60);
        org.junit.Assert.assertNotNull(serializableList61);
        org.junit.Assert.assertNotNull(serializableListList63);
        org.junit.Assert.assertNotNull(serializableList64);
        org.junit.Assert.assertNotNull(queueArray66);
        org.junit.Assert.assertNotNull(serializableQueueArray67);
        org.junit.Assert.assertNotNull(serializableQueueList80);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList1 = com.google.common.collect.Lists.newArrayListWithCapacity((int) (byte) 10);
        org.junit.Assert.assertNotNull(serializableQueueList1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        org.slf4j.Logger logger20 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger20.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable25 = null;
        logger20.info("", throwable25);
        org.slf4j.Marker marker27 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { true, 0.0f };
        logger20.info(marker27, "JCR-SQL2", objArray31);
        org.slf4j.Logger logger34 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger34.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable39 = null;
        logger34.info("", throwable39);
        org.slf4j.Marker marker41 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { true, 0.0f };
        logger34.info(marker41, "JCR-SQL2", objArray45);
        java.lang.Object[] objArray47 = new java.lang.Object[] { logger20, marker41 };
        logger1.warn(marker17, "SELECT * FROM [oak:Unstructured]", objArray47);
        logger1.warn("ascending");
        java.lang.String str51 = logger1.getName();
        logger1.error("ROOT");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger20);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger34);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Marker marker7 = null;
        logger5.warn(marker7, "ROOT");
        org.slf4j.Marker marker10 = null;
        org.slf4j.Logger logger13 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker14 = null;
        org.slf4j.Logger logger17 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger13.warn(marker14, "hi!", (java.lang.Object) logger17);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection20 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger13.debug("", (java.lang.Object) orderDirection20, (java.lang.Object) false);
        org.slf4j.Logger logger24 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker25 = null;
        org.slf4j.Logger logger28 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger24.warn(marker25, "hi!", (java.lang.Object) logger28);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection31 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger24.debug("", (java.lang.Object) orderDirection31, (java.lang.Object) false);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection34 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.slf4j.Logger logger36 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker37 = null;
        org.slf4j.Logger logger40 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger36.warn(marker37, "hi!", (java.lang.Object) logger40);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection43 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger36.debug("", (java.lang.Object) orderDirection43, (java.lang.Object) false);
        org.slf4j.Logger logger47 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker48 = null;
        org.slf4j.Logger logger51 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger47.warn(marker48, "hi!", (java.lang.Object) logger51);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection54 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger47.debug("", (java.lang.Object) orderDirection54, (java.lang.Object) false);
        boolean boolean57 = orderDirection54.isAscending();
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection58 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection59 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray60 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] { orderDirection34, orderDirection43, orderDirection54, orderDirection58, orderDirection59 };
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList61 = com.google.common.collect.Lists.asList(orderDirection20, orderDirection31, orderDirectionArray60);
        boolean boolean62 = orderDirection31.isAscending();
        logger5.debug(marker10, "ordered", (java.lang.Object) orderDirection31);
        org.slf4j.Marker marker64 = null;
        boolean boolean65 = logger5.isErrorEnabled(marker64);
        org.slf4j.Marker marker66 = null;
        java.lang.Object obj68 = null;
        logger5.warn(marker66, "hi!", obj68);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(logger17);
        org.junit.Assert.assertTrue("'" + orderDirection20 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection20.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger24);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertTrue("'" + orderDirection31 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection31.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection34 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection34.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger36);
        org.junit.Assert.assertNotNull(logger40);
        org.junit.Assert.assertTrue("'" + orderDirection43 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection43.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger47);
        org.junit.Assert.assertNotNull(logger51);
        org.junit.Assert.assertTrue("'" + orderDirection54 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection54.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + orderDirection58 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection58.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection59 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection59.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(orderDirectionArray60);
        org.junit.Assert.assertNotNull(orderDirectionList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Marker marker11 = null;
        logger1.trace(marker11, "JCR-SQL2", (java.lang.Object) 100.0f);
        org.slf4j.Marker marker15 = null;
        java.util.List<java.lang.Character> charList18 = com.google.common.collect.Lists.charactersOf((java.lang.CharSequence) "ascending");
        logger1.trace(marker15, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) charList18);
        org.slf4j.Logger logger22 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger22.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable27 = null;
        logger22.info("", throwable27);
        org.slf4j.Marker marker29 = null;
        java.lang.Object[] objArray33 = new java.lang.Object[] { true, 0.0f };
        logger22.info(marker29, "JCR-SQL2", objArray33);
        org.slf4j.Marker marker35 = null;
        logger22.debug(marker35, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker38 = null;
        logger22.debug(marker38, "", (java.lang.Object) 10.0d);
        logger22.warn("");
        org.slf4j.Marker marker44 = null;
        boolean boolean45 = logger22.isErrorEnabled(marker44);
        org.slf4j.Marker marker46 = null;
        org.slf4j.Logger logger49 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger49.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable54 = null;
        logger49.info("", throwable54);
        logger22.trace(marker46, "JCR-SQL2", (java.lang.Object) logger49);
        logger1.warn("descending", (java.lang.Object) logger22);
        boolean boolean58 = logger22.isInfoEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charList18);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        boolean boolean9 = logger1.isTraceEnabled(marker8);
        java.lang.Throwable throwable11 = null;
        logger1.debug("hi!", throwable11);
        org.slf4j.Marker marker13 = null;
        java.lang.Throwable throwable15 = null;
        logger1.error(marker13, "", throwable15);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.util.LinkedList<java.lang.Enum<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection>> orderDirectionEnumList0 = com.google.common.collect.Lists.newLinkedList();
        org.junit.Assert.assertNotNull(orderDirectionEnumList0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker19 = null;
        logger1.error(marker19, "ordered", (java.lang.Object) 100.0d);
        java.lang.Object obj24 = null;
        logger1.error("ROOT", obj24);
        boolean boolean26 = logger1.isInfoEnabled();
        java.util.ArrayList<java.io.Serializable> serializableList29 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.ArrayList<java.io.Serializable> serializableList31 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.Collection[] collectionArray33 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.io.Serializable>[] serializableCollectionArray34 = (java.util.Collection<java.io.Serializable>[]) collectionArray33;
        serializableCollectionArray34[0] = serializableList29;
        serializableCollectionArray34[1] = serializableList31;
        java.util.ArrayList<java.util.Collection<java.io.Serializable>> serializableCollectionList39 = com.google.common.collect.Lists.newArrayList(serializableCollectionArray34);
        logger1.error("", (java.lang.Object[]) serializableCollectionArray34);
        logger1.info("SELECT * FROM [oak:Unstructured]");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(serializableList29);
        org.junit.Assert.assertNotNull(serializableList31);
        org.junit.Assert.assertNotNull(collectionArray33);
        org.junit.Assert.assertNotNull(serializableCollectionArray34);
        org.junit.Assert.assertNotNull(serializableCollectionList39);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Logger logger10 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger10.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable15 = null;
        logger10.info("", throwable15);
        org.slf4j.Marker marker17 = null;
        java.lang.Object[] objArray21 = new java.lang.Object[] { true, 0.0f };
        logger10.info(marker17, "JCR-SQL2", objArray21);
        org.slf4j.Marker marker23 = null;
        logger10.debug(marker23, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker26 = null;
        org.slf4j.Logger logger29 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger29.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable34 = null;
        logger29.info("", throwable34);
        org.slf4j.Marker marker36 = null;
        java.lang.Object[] objArray40 = new java.lang.Object[] { true, 0.0f };
        logger29.info(marker36, "JCR-SQL2", objArray40);
        org.slf4j.Logger logger43 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger43.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable48 = null;
        logger43.info("", throwable48);
        org.slf4j.Marker marker50 = null;
        java.lang.Object[] objArray54 = new java.lang.Object[] { true, 0.0f };
        logger43.info(marker50, "JCR-SQL2", objArray54);
        java.lang.Object[] objArray56 = new java.lang.Object[] { logger29, marker50 };
        logger10.warn(marker26, "SELECT * FROM [oak:Unstructured]", objArray56);
        logger1.trace("JCR-SQL2", objArray56);
        org.slf4j.Marker marker59 = null;
        org.slf4j.Logger logger63 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker64 = null;
        java.lang.Throwable throwable66 = null;
        logger63.trace(marker64, "SELECT * FROM [oak:Unstructured]", throwable66);
        logger1.warn(marker59, "JCR-SQL2", (java.lang.Object) (short) -1, (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker69 = null;
        java.lang.Throwable throwable71 = null;
        logger1.info(marker69, "descending", throwable71);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger10);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger29);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger43);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[Logger[hi!], null]");
        org.junit.Assert.assertNotNull(logger63);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("");
        org.slf4j.Marker marker23 = null;
        boolean boolean24 = logger1.isErrorEnabled(marker23);
        org.slf4j.Marker marker25 = null;
        org.slf4j.Logger logger28 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger28.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable33 = null;
        logger28.info("", throwable33);
        logger1.trace(marker25, "JCR-SQL2", (java.lang.Object) logger28);
        org.slf4j.Marker marker36 = null;
        java.util.ArrayList<java.io.Serializable> serializableList39 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.ArrayList<java.io.Serializable> serializableList41 = com.google.common.collect.Lists.newArrayListWithExpectedSize((int) (byte) 1);
        java.util.Collection[] collectionArray43 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.io.Serializable>[] serializableCollectionArray44 = (java.util.Collection<java.io.Serializable>[]) collectionArray43;
        serializableCollectionArray44[0] = serializableList39;
        serializableCollectionArray44[1] = serializableList41;
        java.util.ArrayList<java.util.Collection<java.io.Serializable>> serializableCollectionList49 = com.google.common.collect.Lists.newArrayList(serializableCollectionArray44);
        java.util.ArrayList<java.util.Collection<java.io.Serializable>> serializableCollectionList50 = com.google.common.collect.Lists.newArrayList(serializableCollectionArray44);
        logger28.info(marker36, "ordered", (java.lang.Object[]) serializableCollectionArray44);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertNotNull(serializableList39);
        org.junit.Assert.assertNotNull(serializableList41);
        org.junit.Assert.assertNotNull(collectionArray43);
        org.junit.Assert.assertNotNull(serializableCollectionArray44);
        org.junit.Assert.assertNotNull(serializableCollectionList49);
        org.junit.Assert.assertNotNull(serializableCollectionList50);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.info("ordered");
        org.slf4j.Marker marker23 = null;
        boolean boolean24 = logger1.isTraceEnabled(marker23);
        org.slf4j.Marker marker25 = null;
        org.slf4j.Logger logger28 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger28.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker32 = null;
        boolean boolean33 = logger28.isWarnEnabled(marker32);
        org.slf4j.Marker marker34 = null;
        org.slf4j.Logger logger37 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger37.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable42 = null;
        logger37.info("", throwable42);
        org.slf4j.Marker marker44 = null;
        java.lang.Object[] objArray48 = new java.lang.Object[] { true, 0.0f };
        logger37.info(marker44, "JCR-SQL2", objArray48);
        org.slf4j.Marker marker50 = null;
        logger37.debug(marker50, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker53 = null;
        org.slf4j.Logger logger56 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger56.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable61 = null;
        logger56.info("", throwable61);
        org.slf4j.Marker marker63 = null;
        java.lang.Object[] objArray67 = new java.lang.Object[] { true, 0.0f };
        logger56.info(marker63, "JCR-SQL2", objArray67);
        org.slf4j.Logger logger70 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger70.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable75 = null;
        logger70.info("", throwable75);
        org.slf4j.Marker marker77 = null;
        java.lang.Object[] objArray81 = new java.lang.Object[] { true, 0.0f };
        logger70.info(marker77, "JCR-SQL2", objArray81);
        java.lang.Object[] objArray83 = new java.lang.Object[] { logger56, marker77 };
        logger37.warn(marker53, "SELECT * FROM [oak:Unstructured]", objArray83);
        logger28.error(marker34, "hi!", (java.lang.Object) marker53);
        java.lang.Throwable throwable87 = null;
        logger28.error("SELECT * FROM [oak:Unstructured]", throwable87);
        org.slf4j.Marker marker89 = null;
        logger28.debug(marker89, "SELECT * FROM [oak:Unstructured]");
        java.lang.String[] strArray92 = new java.lang.String[] {};
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList93 = com.google.common.collect.Lists.newArrayList((java.lang.Comparable<java.lang.String>[]) strArray92);
        logger1.info(marker25, "descending", (java.lang.Object) "SELECT * FROM [oak:Unstructured]", (java.lang.Object) strComparableList93);
        java.lang.Throwable throwable96 = null;
        logger1.warn("ordered", throwable96);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(logger28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(logger37);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger56);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger70);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[Logger[hi!], null]");
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(strComparableList93);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        logger1.info("SELECT * FROM [oak:Unstructured]", (java.lang.Object) true);
        org.slf4j.Marker marker17 = null;
        java.lang.Throwable throwable19 = null;
        logger1.info(marker17, "ordered", throwable19);
        java.lang.Throwable throwable22 = null;
        logger1.trace("Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", throwable22);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Logger logger13 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger13.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable18 = null;
        logger13.info("", throwable18);
        org.slf4j.Marker marker20 = null;
        java.lang.Object[] objArray24 = new java.lang.Object[] { true, 0.0f };
        logger13.info(marker20, "JCR-SQL2", objArray24);
        logger1.warn("JCR-SQL2", objArray24);
        org.slf4j.Marker marker27 = null;
        boolean boolean28 = logger1.isDebugEnabled(marker27);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.util.LinkedList<java.lang.Class<?>> wildcardClassList0 = com.google.common.collect.Lists.newLinkedList();
        org.junit.Assert.assertNotNull(wildcardClassList0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.info("ordered");
        org.slf4j.Marker marker23 = null;
        boolean boolean24 = logger1.isTraceEnabled(marker23);
        org.slf4j.Marker marker25 = null;
        logger1.info(marker25, "ordered");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.util.LinkedList<java.io.Serializable> serializableList0 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList2 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList0, (int) (short) 100);
        java.util.List<java.io.Serializable> serializableList3 = com.google.common.collect.Lists.reverse((java.util.List<java.io.Serializable>) serializableList0);
        java.util.List<java.io.Serializable> serializableList4 = com.google.common.collect.Lists.reverse(serializableList3);
        org.junit.Assert.assertNotNull(serializableList0);
        org.junit.Assert.assertNotNull(serializableListList2);
        org.junit.Assert.assertNotNull(serializableList3);
        org.junit.Assert.assertNotNull(serializableList4);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker4 = null;
        java.lang.Object obj6 = null;
        org.slf4j.Logger logger8 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger8.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable13 = null;
        logger8.info("", throwable13);
        logger1.warn(marker4, "", obj6, (java.lang.Object) "");
        org.slf4j.Marker marker16 = null;
        logger1.trace(marker16, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) 10.0d, (java.lang.Object) (-1.0d));
        java.lang.Throwable throwable22 = null;
        logger1.warn("ROOT", throwable22);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger8);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("ROOT");
        org.slf4j.Marker marker2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        logger1.warn(marker2, "hi!", obj4);
        org.slf4j.Marker marker6 = null;
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable14 = null;
        logger9.info("", throwable14);
        org.slf4j.Marker marker16 = null;
        java.lang.Object[] objArray20 = new java.lang.Object[] { true, 0.0f };
        logger9.info(marker16, "JCR-SQL2", objArray20);
        org.slf4j.Marker marker22 = null;
        logger9.debug(marker22, "SELECT * FROM [oak:Unstructured]");
        logger9.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker27 = null;
        logger9.error(marker27, "ordered", (java.lang.Object) 100.0d);
        java.lang.Throwable throwable32 = null;
        logger9.info("", throwable32);
        logger9.debug("ascending");
        org.slf4j.Marker marker36 = null;
        java.lang.Throwable throwable38 = null;
        logger9.warn(marker36, "JCR-SQL2", throwable38);
        org.slf4j.Logger logger42 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker43 = null;
        java.lang.Throwable throwable45 = null;
        logger42.trace(marker43, "SELECT * FROM [oak:Unstructured]", throwable45);
        org.slf4j.Marker marker47 = null;
        java.lang.Object obj49 = null;
        logger42.error(marker47, "JCR-SQL2", obj49);
        logger42.warn("hi!");
        java.lang.Throwable throwable54 = null;
        logger42.info("ordered", throwable54);
        java.lang.String str56 = logger42.getName();
        org.slf4j.Logger logger59 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger59.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable64 = null;
        logger59.info("", throwable64);
        org.slf4j.Marker marker66 = null;
        java.lang.Object[] objArray70 = new java.lang.Object[] { true, 0.0f };
        logger59.info(marker66, "JCR-SQL2", objArray70);
        logger42.debug("ascending", objArray70);
        logger9.info("JCR-SQL2", objArray70);
        org.slf4j.Marker marker74 = null;
        java.lang.CharSequence[] charSequenceArray77 = new java.lang.CharSequence[] {};
        java.util.List<java.lang.CharSequence> charSequenceList78 = com.google.common.collect.Lists.asList((java.lang.CharSequence) "hi!", charSequenceArray77);
        logger9.error(marker74, "Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", (java.lang.Object[]) charSequenceArray77);
        logger1.error(marker6, "", (java.lang.Object[]) charSequenceArray77);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger42);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(logger59);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[true, 0.0]");
        org.junit.Assert.assertNotNull(charSequenceArray77);
        org.junit.Assert.assertNotNull(charSequenceList78);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("direction");
        org.slf4j.Marker marker2 = null;
        java.util.concurrent.CopyOnWriteArrayList<java.util.AbstractSequentialList<java.io.Serializable>> serializableListList4 = com.google.common.collect.Lists.newCopyOnWriteArrayList();
        logger1.debug(marker2, "JCR-SQL2", (java.lang.Object) serializableListList4);
        boolean boolean6 = logger1.isWarnEnabled();
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(serializableListList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        logger1.debug(marker17, "", (java.lang.Object) 10.0d);
        logger1.warn("JCR-SQL2", (java.lang.Object) 1.0d);
        logger1.error("ROOT");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        boolean boolean9 = logger1.isTraceEnabled(marker8);
        org.slf4j.Marker marker10 = null;
        org.slf4j.Logger logger13 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger13.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable18 = null;
        logger13.info("", throwable18);
        org.slf4j.Marker marker20 = null;
        boolean boolean21 = logger13.isTraceEnabled(marker20);
        java.lang.Throwable throwable23 = null;
        logger13.debug("hi!", throwable23);
        org.slf4j.Marker marker25 = null;
        java.util.LinkedList<java.io.Serializable> serializableList27 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList28 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList30 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList28, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList31 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList33 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList31, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList34 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList36 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList34, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList37 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList39 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList37, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList40 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray42 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray43 = (java.util.Queue<java.io.Serializable>[]) queueArray42;
        serializableQueueArray43[0] = serializableList27;
        serializableQueueArray43[1] = serializableList28;
        serializableQueueArray43[2] = serializableList31;
        serializableQueueArray43[3] = serializableList34;
        serializableQueueArray43[4] = serializableList37;
        serializableQueueArray43[5] = serializableList40;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList56 = com.google.common.collect.Lists.newArrayList(serializableQueueArray43);
        logger13.warn(marker25, "JCR-SQL2", (java.lang.Object) serializableQueueList56);
        org.slf4j.Marker marker58 = null;
        java.lang.Throwable throwable60 = null;
        logger13.error(marker58, "ordered", throwable60);
        java.lang.Throwable throwable63 = null;
        logger13.debug("ordered", throwable63);
        java.util.LinkedList<java.io.Serializable> serializableList66 = com.google.common.collect.Lists.newLinkedList();
        java.util.LinkedList<java.io.Serializable> serializableList67 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList69 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList67, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList70 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList72 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList70, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList73 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList75 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList73, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList76 = com.google.common.collect.Lists.newLinkedList();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList78 = com.google.common.collect.Lists.partition((java.util.List<java.io.Serializable>) serializableList76, (int) '4');
        java.util.LinkedList<java.io.Serializable> serializableList79 = com.google.common.collect.Lists.newLinkedList();
        java.util.Queue[] queueArray81 = new java.util.Queue[6];
        @SuppressWarnings("unchecked")
        java.util.Queue<java.io.Serializable>[] serializableQueueArray82 = (java.util.Queue<java.io.Serializable>[]) queueArray81;
        serializableQueueArray82[0] = serializableList66;
        serializableQueueArray82[1] = serializableList67;
        serializableQueueArray82[2] = serializableList70;
        serializableQueueArray82[3] = serializableList73;
        serializableQueueArray82[4] = serializableList76;
        serializableQueueArray82[5] = serializableList79;
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList95 = com.google.common.collect.Lists.newArrayList(serializableQueueArray82);
        java.util.ArrayList<java.util.Queue<java.io.Serializable>> serializableQueueList96 = com.google.common.collect.Lists.newArrayList(serializableQueueArray82);
        logger13.warn("descending", (java.lang.Object[]) serializableQueueArray82);
        logger1.error(marker10, "", (java.lang.Object) logger13);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(serializableList27);
        org.junit.Assert.assertNotNull(serializableList28);
        org.junit.Assert.assertNotNull(serializableListList30);
        org.junit.Assert.assertNotNull(serializableList31);
        org.junit.Assert.assertNotNull(serializableListList33);
        org.junit.Assert.assertNotNull(serializableList34);
        org.junit.Assert.assertNotNull(serializableListList36);
        org.junit.Assert.assertNotNull(serializableList37);
        org.junit.Assert.assertNotNull(serializableListList39);
        org.junit.Assert.assertNotNull(serializableList40);
        org.junit.Assert.assertNotNull(queueArray42);
        org.junit.Assert.assertNotNull(serializableQueueArray43);
        org.junit.Assert.assertNotNull(serializableQueueList56);
        org.junit.Assert.assertNotNull(serializableList66);
        org.junit.Assert.assertNotNull(serializableList67);
        org.junit.Assert.assertNotNull(serializableListList69);
        org.junit.Assert.assertNotNull(serializableList70);
        org.junit.Assert.assertNotNull(serializableListList72);
        org.junit.Assert.assertNotNull(serializableList73);
        org.junit.Assert.assertNotNull(serializableListList75);
        org.junit.Assert.assertNotNull(serializableList76);
        org.junit.Assert.assertNotNull(serializableListList78);
        org.junit.Assert.assertNotNull(serializableList79);
        org.junit.Assert.assertNotNull(queueArray81);
        org.junit.Assert.assertNotNull(serializableQueueArray82);
        org.junit.Assert.assertNotNull(serializableQueueList95);
        org.junit.Assert.assertNotNull(serializableQueueList96);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        org.slf4j.Marker marker5 = null;
        boolean boolean6 = logger1.isWarnEnabled(marker5);
        org.slf4j.Marker marker7 = null;
        java.lang.Throwable throwable9 = null;
        logger1.trace(marker7, "", throwable9);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.util.ArrayList<java.lang.CharSequence[]> charSequenceArrayList0 = com.google.common.collect.Lists.newArrayList();
        org.junit.Assert.assertNotNull(charSequenceArrayList0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("");
        logger1.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker4 = null;
        java.lang.Object obj6 = null;
        org.slf4j.Logger logger8 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger8.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable13 = null;
        logger8.info("", throwable13);
        logger1.warn(marker4, "", obj6, (java.lang.Object) "");
        org.slf4j.Marker marker16 = null;
        logger1.trace(marker16, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) 10.0d, (java.lang.Object) (-1.0d));
        java.lang.Object[] objArray22 = null;
        logger1.trace("JCR-SQL2", objArray22);
        org.slf4j.Logger logger26 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker27 = null;
        org.slf4j.Logger logger30 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger26.warn(marker27, "hi!", (java.lang.Object) logger30);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection33 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger26.debug("", (java.lang.Object) orderDirection33, (java.lang.Object) false);
        org.slf4j.Logger logger37 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker38 = null;
        org.slf4j.Logger logger41 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger37.warn(marker38, "hi!", (java.lang.Object) logger41);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection44 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger37.debug("", (java.lang.Object) orderDirection44, (java.lang.Object) false);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection47 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC;
        org.slf4j.Logger logger49 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker50 = null;
        org.slf4j.Logger logger53 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger49.warn(marker50, "hi!", (java.lang.Object) logger53);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection56 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger49.debug("", (java.lang.Object) orderDirection56, (java.lang.Object) false);
        org.slf4j.Logger logger60 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker61 = null;
        org.slf4j.Logger logger64 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger60.warn(marker61, "hi!", (java.lang.Object) logger64);
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection67 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        logger60.debug("", (java.lang.Object) orderDirection67, (java.lang.Object) false);
        boolean boolean70 = orderDirection67.isAscending();
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection71 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection orderDirection72 = org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.DEFAULT_DIRECTION;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] orderDirectionArray73 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection[] { orderDirection47, orderDirection56, orderDirection67, orderDirection71, orderDirection72 };
        java.util.List<org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection> orderDirectionList74 = com.google.common.collect.Lists.asList(orderDirection33, orderDirection44, orderDirectionArray73);
        logger1.error("Ordered Index has been deprecated since Oak 1.1.8. Please replace the index definition ({}) with Lucene Property index and remove the index providers from the repository. See docs at http://jackrabbit.apache.org/oak/docs", (java.lang.Object[]) orderDirectionArray73);
        boolean boolean76 = logger1.isDebugEnabled();
        java.util.List<java.lang.Character> charList79 = com.google.common.collect.Lists.charactersOf((java.lang.CharSequence) "");
        logger1.error("JCR-SQL2", (java.lang.Object) charList79);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger8);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertNotNull(logger30);
        org.junit.Assert.assertTrue("'" + orderDirection33 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection33.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger37);
        org.junit.Assert.assertNotNull(logger41);
        org.junit.Assert.assertTrue("'" + orderDirection44 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection44.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection47 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection47.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger49);
        org.junit.Assert.assertNotNull(logger53);
        org.junit.Assert.assertTrue("'" + orderDirection56 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection56.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(logger60);
        org.junit.Assert.assertNotNull(logger64);
        org.junit.Assert.assertTrue("'" + orderDirection67 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection67.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + orderDirection71 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection71.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertTrue("'" + orderDirection72 + "' != '" + org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC + "'", orderDirection72.equals(org.apache.jackrabbit.oak.plugins.index.property.OrderedIndex.OrderDirection.ASC));
        org.junit.Assert.assertNotNull(orderDirectionArray73);
        org.junit.Assert.assertNotNull(orderDirectionList74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(charList79);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean5 = logger1.isDebugEnabled();
        org.slf4j.Marker marker6 = null;
        logger1.error(marker6, "ROOT", (java.lang.Object) (-1.0f), (java.lang.Object) 10);
        org.slf4j.Logger logger13 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger13.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable18 = null;
        logger13.info("", throwable18);
        org.slf4j.Marker marker20 = null;
        java.lang.Object[] objArray24 = new java.lang.Object[] { true, 0.0f };
        logger13.info(marker20, "JCR-SQL2", objArray24);
        logger1.warn("JCR-SQL2", objArray24);
        org.slf4j.Marker marker27 = null;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider orderedPropertyIndexProvider29 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider();
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState30 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList31 = orderedPropertyIndexProvider29.getQueryIndexes(nodeState30);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState32 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList33 = orderedPropertyIndexProvider29.getQueryIndexes(nodeState32);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState34 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList35 = orderedPropertyIndexProvider29.getQueryIndexes(nodeState34);
        org.slf4j.Logger logger37 = org.slf4j.LoggerFactory.getLogger("");
        logger1.trace(marker27, "hi!", (java.lang.Object) orderedPropertyIndexProvider29, (java.lang.Object) "");
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(logger13);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[true, 0.0]");
        org.junit.Assert.assertNotNull(wildcardList31);
        org.junit.Assert.assertNotNull(wildcardList33);
        org.junit.Assert.assertNotNull(wildcardList35);
        org.junit.Assert.assertNotNull(logger37);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker2 = null;
        org.slf4j.Logger logger5 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn(marker2, "hi!", (java.lang.Object) logger5);
        org.slf4j.Logger logger9 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger9.warn("hi!", (java.lang.Object) (byte) 1);
        boolean boolean13 = logger9.isErrorEnabled();
        org.slf4j.Logger logger15 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger15.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable20 = null;
        logger15.info("", throwable20);
        org.slf4j.Marker marker22 = null;
        java.lang.Object[] objArray26 = new java.lang.Object[] { true, 0.0f };
        logger15.info(marker22, "JCR-SQL2", objArray26);
        logger1.debug("", (java.lang.Object) logger9, (java.lang.Object) marker22);
        logger9.trace("SELECT * FROM [oak:Unstructured]", (java.lang.Object) "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker32 = null;
        java.util.LinkedList<java.io.Serializable> serializableList34 = com.google.common.collect.Lists.newLinkedList();
        org.slf4j.Logger logger36 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger36.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable41 = null;
        logger36.info("", throwable41);
        org.slf4j.Marker marker43 = null;
        java.lang.Object[] objArray47 = new java.lang.Object[] { true, 0.0f };
        logger36.info(marker43, "JCR-SQL2", objArray47);
        org.slf4j.Marker marker49 = null;
        logger36.debug(marker49, "SELECT * FROM [oak:Unstructured]");
        logger36.warn("SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker54 = null;
        logger36.error(marker54, "ordered", (java.lang.Object) 100.0d);
        logger36.error("hi!");
        java.lang.Throwable throwable61 = null;
        logger36.warn("", throwable61);
        logger9.debug(marker32, "SELECT * FROM [oak:Unstructured]", (java.lang.Object) serializableList34, (java.lang.Object) throwable61);
        org.slf4j.Marker marker64 = null;
        org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider orderedPropertyIndexProvider66 = new org.apache.jackrabbit.oak.plugins.index.property.OrderedPropertyIndexProvider();
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState67 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> wildcardList68 = orderedPropertyIndexProvider66.getQueryIndexes(nodeState67);
        logger9.warn(marker64, "hi!", (java.lang.Object) nodeState67);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(logger9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(logger15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, 0.0]");
        org.junit.Assert.assertNotNull(serializableList34);
        org.junit.Assert.assertNotNull(logger36);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[true, 0.0]");
        org.junit.Assert.assertNotNull(wildcardList68);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.slf4j.Logger logger1 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger1.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable6 = null;
        logger1.info("", throwable6);
        org.slf4j.Marker marker8 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, 0.0f };
        logger1.info(marker8, "JCR-SQL2", objArray12);
        org.slf4j.Marker marker14 = null;
        logger1.debug(marker14, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker17 = null;
        boolean boolean18 = logger1.isErrorEnabled(marker17);
        org.slf4j.Marker marker19 = null;
        org.slf4j.Logger logger22 = org.slf4j.LoggerFactory.getLogger("hi!");
        org.slf4j.Marker marker23 = null;
        org.slf4j.Logger logger26 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger22.warn(marker23, "hi!", (java.lang.Object) logger26);
        logger26.info("");
        org.slf4j.Marker marker30 = null;
        org.slf4j.Logger logger33 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger33.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable38 = null;
        logger33.info("", throwable38);
        org.slf4j.Marker marker40 = null;
        java.lang.Object[] objArray44 = new java.lang.Object[] { true, 0.0f };
        logger33.info(marker40, "JCR-SQL2", objArray44);
        org.slf4j.Marker marker46 = null;
        logger33.debug(marker46, "SELECT * FROM [oak:Unstructured]");
        org.slf4j.Marker marker49 = null;
        org.slf4j.Logger logger52 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger52.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable57 = null;
        logger52.info("", throwable57);
        org.slf4j.Marker marker59 = null;
        java.lang.Object[] objArray63 = new java.lang.Object[] { true, 0.0f };
        logger52.info(marker59, "JCR-SQL2", objArray63);
        org.slf4j.Logger logger66 = org.slf4j.LoggerFactory.getLogger("hi!");
        logger66.warn("hi!", (java.lang.Object) (byte) 1);
        java.lang.Throwable throwable71 = null;
        logger66.info("", throwable71);
        org.slf4j.Marker marker73 = null;
        java.lang.Object[] objArray77 = new java.lang.Object[] { true, 0.0f };
        logger66.info(marker73, "JCR-SQL2", objArray77);
        java.lang.Object[] objArray79 = new java.lang.Object[] { logger52, marker73 };
        logger33.warn(marker49, "SELECT * FROM [oak:Unstructured]", objArray79);
        logger26.debug(marker30, "", (java.lang.Object) objArray79, (java.lang.Object) (-1.0d));
        logger1.trace(marker19, "JCR-SQL2", objArray79);
        org.junit.Assert.assertNotNull(logger1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(logger22);
        org.junit.Assert.assertNotNull(logger26);
        org.junit.Assert.assertNotNull(logger33);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger52);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[true, 0.0]");
        org.junit.Assert.assertNotNull(logger66);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[true, 0.0]");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[Logger[hi!], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[Logger[hi!], null]");
    }
}

