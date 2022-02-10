package org.apache.dubbo.common.serialize.fst;

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
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = fSTStreamDecoder3.readStringUTF();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder3.resetToCopyOf(byteArray10, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        byte[] byteArray5 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder3.resetToCopyOf(byteArray5, 57343, (int) (byte) -1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte byte5 = fSTStreamDecoder4.readObjectHeaderTag();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration5 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration5.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration8.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry11 = fSTConfiguration8.getClassRegistry();
        java.lang.ClassLoader classLoader12 = fSTConfiguration8.getClassLoader();
        fSTConfiguration5.setClassLoader(classLoader12);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput19 = fSTConfiguration5.getObjectOutput(byteArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder3.resetToCopyOf(byteArray18, (-1), 1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class class5 = fSTStreamDecoder4.readArrayHeader();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder3.resetWith(byteArray9, 56319);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte byte5 = fSTStreamDecoder3.readFByte();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        fSTStreamDecoder3.consumeEndMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray6 = fSTStreamDecoder3.getBuffer();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration5 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration5.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry8 = fSTConfiguration5.getClassRegistry();
        java.lang.String str9 = fSTConfiguration5.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration10.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry13 = fSTConfiguration10.getClassRegistry();
        fSTConfiguration5.setCoderSpecific((java.lang.Object) fSTClazzNameRegistry13);
        fSTStreamDecoder3.clnames = fSTClazzNameRegistry13;
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder3.resetWith(byteArray21, 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder3.moveTo((int) (byte) 10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        int[] intArray10 = new int[] { (short) 0, (short) 10, (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder3.readFIntArr((int) '#', intArray10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        int[] intArray10 = new int[] { 0, 57343 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder4._readFIntArr((int) (byte) -1, intArray10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        fSTStreamDecoder3.readExternalEnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo6 = fSTStreamDecoder3.readClass();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder4.skip((int) (byte) 100);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        boolean boolean5 = fSTStreamDecoder3.isMapBased();
        int int6 = fSTStreamDecoder3.getObjectHeaderLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = fSTStreamDecoder3.readIntByte();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        boolean boolean5 = fSTStreamDecoder3.isMapBased();
        int int6 = fSTStreamDecoder3.getObjectHeaderLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = fSTStreamDecoder3.getInputPos();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = fSTStreamDecoder4.readFFloat();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration5 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration5.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry8 = fSTConfiguration5.getClassRegistry();
        java.lang.String str9 = fSTConfiguration5.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration10.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry13 = fSTConfiguration10.getClassRegistry();
        fSTConfiguration5.setCoderSpecific((java.lang.Object) fSTClazzNameRegistry13);
        fSTStreamDecoder3.clnames = fSTClazzNameRegistry13;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = fSTStreamDecoder3.readVersionTag();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        fSTStreamDecoder3.readObjectEnd();
        java.lang.Object obj7 = fSTStreamDecoder3.getDirectObject();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte byte8 = fSTStreamDecoder3.readObjectHeaderTag();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        boolean boolean5 = fSTStreamDecoder3.isMapBased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte byte6 = fSTStreamDecoder3.readObjectHeaderTag();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        int int5 = fSTStreamDecoder3.getObjectHeaderLen();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration6.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration9.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry12 = fSTConfiguration9.getClassRegistry();
        java.lang.ClassLoader classLoader13 = fSTConfiguration9.getClassLoader();
        fSTConfiguration6.setClassLoader(classLoader13);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput20 = fSTConfiguration6.getObjectOutput(byteArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder3.resetToCopyOf(byteArray19, (int) (byte) -1, 32);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        fSTStreamDecoder3.readObjectEnd();
        java.lang.Object obj7 = fSTStreamDecoder3.getDirectObject();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = fSTStreamDecoder3.readStringAsc();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder3.reset();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        boolean boolean8 = fSTStreamDecoder4.isEndMarker(" 0.0");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = fSTStreamDecoder4.ensureReadAhead((int) ' ');
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = fSTStreamDecoder4.readStringAsc();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = fSTStreamDecoder4.readVersionTag();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        java.lang.Class class8 = fSTStreamDecoder4.classForName(" 0.0");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        short short9 = fSTStreamDecoder4.readFShort();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        int int5 = fSTStreamDecoder3.getObjectHeaderLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = fSTStreamDecoder3.getInputPos();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo7 = fSTStreamDecoder4.readClass();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        fSTStreamDecoder3.consumeEndMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder3.pushBack(100);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        java.lang.Class class8 = fSTStreamDecoder4.classForName(" 0.0");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float9 = fSTStreamDecoder4.readFFloat();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration5 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration5.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry8 = fSTConfiguration5.getClassRegistry();
        java.lang.String str9 = fSTConfiguration5.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration10.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry13 = fSTConfiguration10.getClassRegistry();
        fSTConfiguration5.setCoderSpecific((java.lang.Object) fSTClazzNameRegistry13);
        fSTStreamDecoder3.clnames = fSTClazzNameRegistry13;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long16 = fSTStreamDecoder3.readFLong();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        fSTConfiguration7.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration13 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration13.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry16 = fSTConfiguration13.getClassRegistry();
        java.lang.ClassLoader classLoader17 = fSTConfiguration13.getClassLoader();
        fSTConfiguration7.setClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass19 = classLoader17.getClass();
        java.lang.Object obj21 = fSTStreamDecoder4.coerceElement((java.lang.Class) wildcardClass19, (java.lang.Object) 100.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder4.skip(55296);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        fSTStreamDecoder3.consumeEndMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        char char6 = fSTStreamDecoder3.readFChar();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        boolean boolean5 = fSTStreamDecoder3.isMapBased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        char char6 = fSTStreamDecoder3.readFChar();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = fSTStreamDecoder3.readFFloat();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = fSTStreamDecoder4.getInputPos();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration7.setForceClzInit(true);
        boolean boolean10 = fSTConfiguration7.isPreferSpeed();
        java.io.Serializable serializable12 = fSTConfiguration7.deepCopy((java.io.Serializable) 10.0f);
        byte[] byteArray14 = fSTConfiguration7.getCrossPlatformBinaryCache("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration15 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration17 = fSTConfiguration15.setForceClzInit(true);
        boolean boolean18 = fSTConfiguration15.isPreferSpeed();
        java.lang.String str19 = fSTConfiguration15.getName();
        byte[] byteArray21 = fSTConfiguration15.asByteArray((java.lang.Object) ' ');
        java.lang.Object obj22 = fSTConfiguration7.asObject(byteArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder4.readPlainBytes(byteArray21, (int) ' ', 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        fSTConfiguration7.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration13 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration13.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry16 = fSTConfiguration13.getClassRegistry();
        java.lang.ClassLoader classLoader17 = fSTConfiguration13.getClassLoader();
        fSTConfiguration7.setClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass19 = classLoader17.getClass();
        java.lang.Object obj21 = fSTStreamDecoder4.coerceElement((java.lang.Class) wildcardClass19, (java.lang.Object) 100.0d);
        fSTStreamDecoder4.readExternalEnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float23 = fSTStreamDecoder4.readFFloat();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = fSTStreamDecoder3.readVersionTag();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        boolean boolean5 = fSTStreamDecoder3.isMapBased();
        java.lang.Class class7 = fSTStreamDecoder3.classForName(" 52");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        short short8 = fSTStreamDecoder3.readFShort();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        fSTStreamDecoder3.consumeEndMarker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = fSTStreamDecoder3.available();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry6 = fSTStreamDecoder3.clnames;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder3.resetWith(byteArray11, 57343);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        int int5 = fSTStreamDecoder3.getObjectHeaderLen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        char char6 = fSTStreamDecoder3.readFChar();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        fSTStreamDecoder3.readObjectEnd();
        byte[] byteArray10 = new byte[] { (byte) 32, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder3.resetWith(byteArray10, (int) (short) 100);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        fSTStreamDecoder3.readObjectEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration7.setForceClzInit(true);
        boolean boolean10 = fSTConfiguration7.isPreferSpeed();
        java.io.Serializable serializable12 = fSTConfiguration7.deepCopy((java.io.Serializable) 10.0f);
        byte[] byteArray14 = fSTConfiguration7.getCrossPlatformBinaryCache("hi!");
        fSTStreamDecoder3.startFieldReading((java.lang.Object) fSTConfiguration7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fSTStreamDecoder3.pushBack((-1));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = fSTStreamDecoder3.readVersionTag();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        fSTStreamDecoder3.readObjectEnd();
        fSTStreamDecoder3.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte byte8 = fSTStreamDecoder3.readFByte();
    }
}

