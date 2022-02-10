package org.apache.dubbo.common.serialize.fst;

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
        org.nustaq.serialization.FSTConfiguration.prettyPrintJson((java.lang.Object) 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        java.lang.Class[] classArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fSTConfiguration0.registerClass(classArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        java.io.OutputStream outputStream3 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration4 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration4.setForceClzInit(true);
        // The following exception was thrown during execution in test generation
        try {
            fSTConfiguration2.encodeToStream(outputStream3, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTConfiguration4);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        int int0 = com.fasterxml.jackson.core.base.GeneratorBase.SURR1_LAST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 56319 + "'", int0 == 56319);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration3 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration3.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry6 = fSTConfiguration3.getClassRegistry();
        java.lang.ClassLoader classLoader7 = fSTConfiguration3.getClassLoader();
        fSTConfiguration0.setClassLoader(classLoader7);
        java.lang.Class class10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration0.cpMap("hi!", class10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration3);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry6);
        org.junit.Assert.assertNotNull(classLoader7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround jacksonAccessWorkaround4 = new org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround(iOContext0, (int) (short) -1, objectCodec2, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        org.nustaq.serialization.FSTConfiguration.isAndroid = false;
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        int int0 = com.fasterxml.jackson.core.base.GeneratorBase.SURR1_FIRST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 55296 + "'", int0 == 55296);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTObjectInput fSTObjectInput7 = fSTConfiguration0.getObjectInputCopyFrom(byteArray4, 0, 55296);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        java.lang.Class class1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTClazzInfo fSTClazzInfo2 = fSTConfiguration0.getClazzInfo(class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver3 = fSTConfiguration0.getLastResortResolver();
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTConfiguration.prettyPrintJson((java.lang.Object) fSTConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class org.nustaq.serialization.FSTConfiguration does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(lastResortClassRessolver3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround jacksonAccessWorkaround11 = new org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround(iOContext0, (-1), objectCodec2, outputStream3, byteArray8, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, -1, 10, 0]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fSTConfiguration0.encodeToStream(outputStream3, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        org.nustaq.serialization.FSTSerializerRegistryDelegate fSTSerializerRegistryDelegate4 = null;
        fSTConfiguration0.setSerializerRegistryDelegate(fSTSerializerRegistryDelegate4);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration3 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration3.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry6 = fSTConfiguration3.getClassRegistry();
        java.lang.ClassLoader classLoader7 = fSTConfiguration3.getClassLoader();
        fSTConfiguration0.setClassLoader(classLoader7);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTDecoder fSTDecoder9 = fSTConfiguration0.getCoderSpecific();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.nustaq.serialization.FSTConfiguration$2 to org.nustaq.serialization.FSTDecoder");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration3);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry6);
        org.junit.Assert.assertNotNull(classLoader7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        int int0 = com.fasterxml.jackson.core.base.GeneratorBase.SURR2_LAST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 57343 + "'", int0 == 57343);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        org.nustaq.serialization.FSTConfiguration.prettyPrintJson((java.lang.Object) 0.0f);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry8 = fSTConfiguration0.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder9.resetWith(byteArray15, 56319);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry8);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 1, 100, 10, 100]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry8 = fSTConfiguration0.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = fSTStreamDecoder9.readFLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.nustaq.serialization.serializers.FSTCollectionSerializer fSTCollectionSerializer0 = new org.nustaq.serialization.serializers.FSTCollectionSerializer();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration1 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration3 = fSTConfiguration1.setForceClzInit(true);
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver4 = fSTConfiguration1.getLastResortResolver();
        java.lang.Class class6 = lastResortClassRessolver4.getClass("");
        org.nustaq.serialization.FSTObjectInput fSTObjectInput7 = null;
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo8 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = fSTCollectionSerializer0.instantiate(class6, fSTObjectInput7, fSTClazzInfo8, fSTFieldInfo9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration1);
        org.junit.Assert.assertNotNull(fSTConfiguration3);
        org.junit.Assert.assertNotNull(lastResortClassRessolver4);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
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
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertNotNull(fSTConfiguration5);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FSTConfiguration{name='null'}" + "'", str9, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration10);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        java.lang.String str4 = fSTConfiguration0.getName();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTObjectInput fSTObjectInput10 = fSTConfiguration0.getObjectInput(byteArray8, 56319);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 10, 0]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround jacksonAccessWorkaround11 = new org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround(iOContext0, 57343, objectCodec2, outputStream3, byteArray8, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 1, 10]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTConfiguration.prettyPrintJson((java.lang.Object) fSTConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class org.nustaq.serialization.FSTConfiguration does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        fSTStreamDecoder3.readExternalEnd();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.nustaq.serialization.serializers.FSTCollectionSerializer fSTCollectionSerializer0 = new org.nustaq.serialization.serializers.FSTCollectionSerializer();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration1 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration1.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration4 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration4.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry7 = fSTConfiguration4.getClassRegistry();
        java.lang.ClassLoader classLoader8 = fSTConfiguration4.getClassLoader();
        fSTConfiguration1.setClassLoader(classLoader8);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration1.getObjectOutput(byteArray14);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration16.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry19 = fSTConfiguration16.getClassRegistry();
        java.lang.ClassLoader classLoader20 = fSTConfiguration16.getClassLoader();
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo21 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fSTCollectionSerializer0.writeObject(fSTObjectOutput15, (java.lang.Object) classLoader20, fSTClazzInfo21, fSTFieldInfo22, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: sun.misc.Launcher$AppClassLoader cannot be cast to java.util.Collection");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration1);
        org.junit.Assert.assertNotNull(fSTConfiguration4);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry7);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 0, 10]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry19);
        org.junit.Assert.assertNotNull(classLoader20);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        java.lang.String str4 = fSTConfiguration0.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration5 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration5.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry8 = fSTConfiguration5.getClassRegistry();
        fSTConfiguration0.setCoderSpecific((java.lang.Object) fSTClazzNameRegistry8);
        int[] intArray11 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = fSTConfiguration0.asSharedByteArray((java.lang.Object) (short) -1, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FSTConfiguration{name='null'}" + "'", str4, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration5);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.nustaq.serialization.serializers.FSTCollectionSerializer fSTCollectionSerializer0 = new org.nustaq.serialization.serializers.FSTCollectionSerializer();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration1 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration1.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration4 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration4.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry7 = fSTConfiguration4.getClassRegistry();
        java.lang.ClassLoader classLoader8 = fSTConfiguration4.getClassLoader();
        fSTConfiguration1.setClassLoader(classLoader8);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration1.getObjectOutput(byteArray14);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration18 = fSTConfiguration16.setForceClzInit(true);
        boolean boolean19 = fSTConfiguration16.isPreferSpeed();
        java.io.Serializable serializable21 = fSTConfiguration16.deepCopy((java.io.Serializable) 10.0f);
        byte[] byteArray23 = fSTConfiguration16.getCrossPlatformBinaryCache("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration24 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration26 = fSTConfiguration24.setForceClzInit(true);
        boolean boolean27 = fSTConfiguration24.isPreferSpeed();
        java.lang.String str28 = fSTConfiguration24.getName();
        byte[] byteArray30 = fSTConfiguration24.asByteArray((java.lang.Object) ' ');
        java.lang.Object obj31 = fSTConfiguration16.asObject(byteArray30);
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo32 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fSTCollectionSerializer0.writeObject(fSTObjectOutput15, obj31, fSTClazzInfo32, fSTFieldInfo33, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.util.Collection");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration1);
        org.junit.Assert.assertNotNull(fSTConfiguration4);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry7);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 0, 10]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTConfiguration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertEquals("'" + serializable21 + "' != '" + 10.0d + "'", serializable21, 10.0d);
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertNotNull(fSTConfiguration24);
        org.junit.Assert.assertNotNull(fSTConfiguration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[32, 51, 50]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 32 + "'", obj31, 32);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.nustaq.serialization.serializers.FSTCPThrowableSerializer fSTCPThrowableSerializer0 = new org.nustaq.serialization.serializers.FSTCPThrowableSerializer();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration1 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration1.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTConfiguration1.getClassRegistry();
        fSTConfiguration1.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = fSTConfiguration1.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration1.setForceClzInit(false);
        boolean boolean10 = fSTConfiguration9.isForceSerializable();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration13 = fSTConfiguration11.setForceClzInit(true);
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver14 = fSTConfiguration11.getLastResortResolver();
        java.lang.Class class16 = lastResortClassRessolver14.getClass("");
        org.nustaq.serialization.serializers.FSTCPThrowableSerializer fSTCPThrowableSerializer17 = new org.nustaq.serialization.serializers.FSTCPThrowableSerializer();
        fSTConfiguration9.registerSerializer(class16, (org.nustaq.serialization.FSTObjectSerializer) fSTCPThrowableSerializer17, true);
        boolean boolean20 = fSTCPThrowableSerializer0.willHandleClass(class16);
        org.junit.Assert.assertNotNull(fSTConfiguration1);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTConfiguration13);
        org.junit.Assert.assertNotNull(lastResortClassRessolver14);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        fSTConfiguration0.clearCaches();
        org.nustaq.serialization.FSTConfiguration.StreamCoderFactory streamCoderFactory5 = null;
        fSTConfiguration0.setStreamCoderFactory(streamCoderFactory5);
        org.nustaq.serialization.FSTSerializerRegistryDelegate fSTSerializerRegistryDelegate7 = null;
        fSTConfiguration0.setSerializerRegistryDelegate(fSTSerializerRegistryDelegate7);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration7.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder10 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration7);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder11 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration7);
        java.lang.Class class13 = fSTStreamDecoder11.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration14.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry17 = fSTConfiguration14.getClassRegistry();
        fSTConfiguration14.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration20.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry23 = fSTConfiguration20.getClassRegistry();
        java.lang.ClassLoader classLoader24 = fSTConfiguration20.getClassLoader();
        fSTConfiguration14.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = classLoader24.getClass();
        java.lang.Object obj28 = fSTStreamDecoder11.coerceElement((java.lang.Class) wildcardClass26, (java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTClazzInfo fSTClazzInfo29 = fSTConfiguration0.getClassInfo((java.lang.Class) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class sun.misc.Launcher$AppClassLoader does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry17);
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry23);
        org.junit.Assert.assertNotNull(classLoader24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.nustaq.serialization.serializers.FSTCollectionSerializer fSTCollectionSerializer0 = new org.nustaq.serialization.serializers.FSTCollectionSerializer();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration1 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration3 = fSTConfiguration1.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration1);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder5 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration1);
        java.lang.Class class7 = fSTStreamDecoder5.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration8.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry11 = fSTConfiguration8.getClassRegistry();
        fSTConfiguration8.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration14.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry17 = fSTConfiguration14.getClassRegistry();
        java.lang.ClassLoader classLoader18 = fSTConfiguration14.getClassLoader();
        fSTConfiguration8.setClassLoader(classLoader18);
        java.lang.Class<?> wildcardClass20 = classLoader18.getClass();
        java.lang.Object obj22 = fSTStreamDecoder5.coerceElement((java.lang.Class) wildcardClass20, (java.lang.Object) 100.0d);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration23 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration23.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry26 = fSTConfiguration23.getClassRegistry();
        fSTConfiguration23.setPreferSpeed(false);
        java.lang.Class class29 = null;
        java.lang.Object obj30 = fSTConfiguration23.getCachedObject(class29);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput31 = fSTConfiguration23.getObjectInput();
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo32 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = fSTCollectionSerializer0.instantiate((java.lang.Class) wildcardClass20, fSTObjectInput31, fSTClazzInfo32, fSTFieldInfo33, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.InstantiationException; message: sun.misc.Launcher$AppClassLoader");
        } catch (java.lang.InstantiationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration1);
        org.junit.Assert.assertNotNull(fSTConfiguration3);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry11);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry17);
        org.junit.Assert.assertNotNull(classLoader18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
        org.junit.Assert.assertNotNull(fSTConfiguration23);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(fSTObjectInput31);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        int int7 = fSTStreamDecoder3.available();
        fSTStreamDecoder3.readExternalEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration9.setForceClzInit(true);
        boolean boolean12 = fSTConfiguration9.isPreferSpeed();
        java.io.Serializable serializable14 = fSTConfiguration9.deepCopy((java.io.Serializable) 10.0f);
        byte[] byteArray16 = fSTConfiguration9.getCrossPlatformBinaryCache("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration17 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = fSTConfiguration17.setForceClzInit(true);
        boolean boolean20 = fSTConfiguration17.isPreferSpeed();
        java.lang.String str21 = fSTConfiguration17.getName();
        byte[] byteArray23 = fSTConfiguration17.asByteArray((java.lang.Object) ' ');
        java.lang.Object obj24 = fSTConfiguration9.asObject(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder3.resetToCopyOf(byteArray23, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + 10.0d + "'", serializable14, 10.0d);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertNotNull(fSTConfiguration17);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[32, 51, 50]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 32 + "'", obj24, 32);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = fSTConfiguration0.setForceClzInit(false);
        boolean boolean9 = fSTConfiguration8.isForceSerializable();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = fSTConfiguration10.setForceClzInit(true);
        boolean boolean13 = fSTConfiguration10.isPreferSpeed();
        fSTConfiguration10.clearCaches();
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = fSTConfiguration10.registerCrossPlatformClassMappingUseSimpleName(classArray15);
        int[] intArray18 = new int[] { 57343 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = fSTConfiguration8.asSharedByteArray((java.lang.Object) fSTConfiguration16, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class org.nustaq.serialization.FSTConfiguration does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration10);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[57343]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry8 = fSTConfiguration0.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier10 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration0.setVerifier(classSecurityVerifier10);
        java.lang.String str13 = fSTConfiguration11.asJsonString((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry8);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " 0.0" + "'", str13, " 0.0");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        java.lang.ClassLoader classLoader3 = fSTConfiguration2.getClassLoader();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(classLoader3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer0 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean1 = fSTMapSerializer0.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration4 = fSTConfiguration2.setForceClzInit(true);
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver5 = fSTConfiguration2.getLastResortResolver();
        java.lang.Class class7 = lastResortClassRessolver5.getClass("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration8.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry11 = fSTConfiguration8.getClassRegistry();
        fSTConfiguration8.setPreferSpeed(false);
        java.lang.Class class14 = null;
        java.lang.Object obj15 = fSTConfiguration8.getCachedObject(class14);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput16 = fSTConfiguration8.getObjectInput();
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo17 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fSTMapSerializer0.instantiate(class7, fSTObjectInput16, fSTClazzInfo17, fSTFieldInfo18, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTConfiguration4);
        org.junit.Assert.assertNotNull(lastResortClassRessolver5);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(fSTObjectInput16);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        fSTStreamDecoder3.readObjectEnd();
        java.lang.Object obj7 = fSTStreamDecoder3.getDirectObject();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = fSTConfiguration6.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration6);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTStreamDecoder9.clnames;
        java.io.InputStream inputStream11 = null;
        fSTStreamDecoder9.setInputStream(inputStream11);
        int int13 = fSTStreamDecoder9.available();
        fSTStreamDecoder9.readExternalEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration15 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration15.setShareReferences(true);
        java.lang.ClassLoader classLoader18 = null;
        fSTConfiguration15.setClassLoader(classLoader18);
        byte[] byteArray21 = new byte[] {};
        fSTConfiguration15.registerCrossPlatformClassBinaryCache("", byteArray21);
        fSTStreamDecoder9.resetWith(byteArray21, 5);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder3.resetWith(byteArray21, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fSTConfiguration15);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        fSTConfiguration0.clearCaches();
        org.nustaq.serialization.FSTConfiguration.StreamCoderFactory streamCoderFactory5 = null;
        fSTConfiguration0.setStreamCoderFactory(streamCoderFactory5);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTObjectInput fSTObjectInput7 = fSTConfiguration0.getObjectInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.nustaq.serialization.serializers.FSTCPEnumSetSerializer fSTCPEnumSetSerializer0 = new org.nustaq.serialization.serializers.FSTCPEnumSetSerializer();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration1 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration1.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration4 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration4.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry7 = fSTConfiguration4.getClassRegistry();
        java.lang.ClassLoader classLoader8 = fSTConfiguration4.getClassLoader();
        fSTConfiguration1.setClassLoader(classLoader8);
        java.io.OutputStream outputStream10 = null;
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput11 = fSTConfiguration1.getObjectOutput(outputStream10);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration12.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry15 = fSTConfiguration12.getClassRegistry();
        fSTConfiguration12.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration18 = fSTConfiguration12.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = fSTConfiguration12.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration21 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration23 = fSTConfiguration21.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder24 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration21);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder25 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration21);
        java.lang.Class class27 = fSTStreamDecoder25.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo28 = fSTConfiguration20.getClazzInfo(class27);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration29.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry32 = fSTConfiguration29.getClassRegistry();
        fSTConfiguration29.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration35 = fSTConfiguration29.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration37 = fSTConfiguration29.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration38 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration40 = fSTConfiguration38.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder41 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration38);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder42 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration38);
        java.lang.Class class44 = fSTStreamDecoder42.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo45 = fSTConfiguration37.getClazzInfo(class44);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo46 = null;
        // The following exception was thrown during execution in test generation
        try {
            fSTCPEnumSetSerializer0.writeObject(fSTObjectOutput11, (java.lang.Object) fSTConfiguration20, fSTClazzInfo45, fSTFieldInfo46, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.nustaq.serialization.FSTConfiguration cannot be cast to java.util.EnumSet");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration1);
        org.junit.Assert.assertNotNull(fSTConfiguration4);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry7);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(fSTObjectOutput11);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry15);
        org.junit.Assert.assertNotNull(fSTConfiguration18);
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertNotNull(fSTConfiguration21);
        org.junit.Assert.assertNotNull(fSTConfiguration23);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(fSTClazzInfo28);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry32);
        org.junit.Assert.assertNotNull(fSTConfiguration35);
        org.junit.Assert.assertNotNull(fSTConfiguration37);
        org.junit.Assert.assertNotNull(fSTConfiguration38);
        org.junit.Assert.assertNotNull(fSTConfiguration40);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertNotNull(fSTClazzInfo45);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration4 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration4.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        java.lang.ClassLoader classLoader11 = fSTConfiguration7.getClassLoader();
        fSTConfiguration4.setClassLoader(classLoader11);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput18 = fSTConfiguration4.getObjectOutput(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround jacksonAccessWorkaround21 = new org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround(iOContext0, 1, objectCodec2, outputStream3, byteArray17, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration4);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 1, 0, 10]");
        org.junit.Assert.assertNotNull(fSTObjectOutput18);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        java.lang.ClassLoader classLoader3 = null;
        fSTConfiguration0.setClassLoader(classLoader3);
        byte[] byteArray6 = new byte[] {};
        fSTConfiguration0.registerCrossPlatformClassBinaryCache("", byteArray6);
        org.nustaq.serialization.FSTSerializerRegistryDelegate fSTSerializerRegistryDelegate8 = null;
        fSTConfiguration0.setSerializerRegistryDelegate(fSTSerializerRegistryDelegate8);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTObjectInput fSTObjectInput11 = fSTConfiguration0.getObjectInput(byteArray9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 100, 10, 0]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo4 = null;
        fSTStreamDecoder3.readArrayEnd(fSTClazzInfo4);
        int[] intArray13 = new int[] { ' ', 'a', 0, '#', 'a', 55296 };
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder3._readFIntArr(56319, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 97, 0, 35, 97, 55296]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        boolean boolean7 = fSTStreamDecoder3.isEndMarker(" 0.0");
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        int int7 = fSTStreamDecoder3.available();
        fSTStreamDecoder3.readExternalEnd();
        int[] intArray13 = new int[] { (byte) -1, (byte) 1, 57343 };
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder3._readFIntArr(32, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 100]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry8 = fSTConfiguration0.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier10 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration0.setVerifier(classSecurityVerifier10);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration12.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry15 = fSTConfiguration12.getClassRegistry();
        java.lang.String str16 = fSTConfiguration12.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration17 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration17.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry20 = fSTConfiguration17.getClassRegistry();
        fSTConfiguration12.setCoderSpecific((java.lang.Object) fSTClazzNameRegistry20);
        fSTConfiguration0.setCoderSpecific((java.lang.Object) fSTConfiguration12);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.serializers.FSTCPEnumSetSerializer fSTCPEnumSetSerializer23 = fSTConfiguration0.getCoderSpecific();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.nustaq.serialization.FSTConfiguration to org.nustaq.serialization.serializers.FSTCPEnumSetSerializer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry8);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FSTConfiguration{name='null'}" + "'", str16, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration17);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry20);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        fSTConfiguration0.clearCaches();
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.registerCrossPlatformClassMappingUseSimpleName(classArray5);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        fSTConfiguration7.setPreferSpeed(false);
        java.lang.Class class13 = null;
        java.lang.Object obj14 = fSTConfiguration7.getCachedObject(class13);
        fSTConfiguration7.setPreferSpeed(true);
        java.lang.String str17 = fSTConfiguration7.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration18 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration18.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry21 = fSTConfiguration18.getClassRegistry();
        fSTConfiguration18.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration24 = fSTConfiguration18.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration26 = fSTConfiguration18.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration27 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = fSTConfiguration27.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder30 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration27);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder31 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration27);
        java.lang.Class class33 = fSTStreamDecoder31.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo34 = fSTConfiguration26.getClazzInfo(class33);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration35 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration37 = fSTConfiguration35.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder38 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration35);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder39 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration35);
        java.lang.Class class41 = fSTStreamDecoder39.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration42 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration42.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry45 = fSTConfiguration42.getClassRegistry();
        fSTConfiguration42.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration48 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration48.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry51 = fSTConfiguration48.getClassRegistry();
        java.lang.ClassLoader classLoader52 = fSTConfiguration48.getClassLoader();
        fSTConfiguration42.setClassLoader(classLoader52);
        java.lang.Class<?> wildcardClass54 = classLoader52.getClass();
        java.lang.Object obj56 = fSTStreamDecoder39.coerceElement((java.lang.Class) wildcardClass54, (java.lang.Object) 100.0d);
        java.lang.Class[] classArray57 = new java.lang.Class[] { class33, wildcardClass54 };
        org.nustaq.serialization.FSTConfiguration fSTConfiguration58 = fSTConfiguration7.registerCrossPlatformClassMappingUseSimpleName(classArray57);
        // The following exception was thrown during execution in test generation
        try {
            fSTConfiguration6.registerClass(classArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class sun.misc.Launcher$AppClassLoader does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FSTConfiguration{name='null'}" + "'", str17, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration18);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry21);
        org.junit.Assert.assertNotNull(fSTConfiguration24);
        org.junit.Assert.assertNotNull(fSTConfiguration26);
        org.junit.Assert.assertNotNull(fSTConfiguration27);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(fSTClazzInfo34);
        org.junit.Assert.assertNotNull(fSTConfiguration35);
        org.junit.Assert.assertNotNull(fSTConfiguration37);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(fSTConfiguration42);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry45);
        org.junit.Assert.assertNotNull(fSTConfiguration48);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry51);
        org.junit.Assert.assertNotNull(classLoader52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0d + "'", obj56, 100.0d);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(fSTConfiguration58);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        fSTConfiguration0.clearCaches();
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.registerCrossPlatformClassMappingUseSimpleName(classArray5);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTObjectInput fSTObjectInput12 = fSTConfiguration0.getObjectInput(byteArray10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 10, 100]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.nustaq.serialization.serializers.FSTCPEnumSetSerializer fSTCPEnumSetSerializer0 = new org.nustaq.serialization.serializers.FSTCPEnumSetSerializer();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration1 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration1.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTConfiguration1.getClassRegistry();
        fSTConfiguration1.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = fSTConfiguration1.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration8.setShareReferences(true);
        java.lang.ClassLoader classLoader11 = null;
        fSTConfiguration8.setClassLoader(classLoader11);
        byte[] byteArray14 = new byte[] {};
        fSTConfiguration8.registerCrossPlatformClassBinaryCache("", byteArray14);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput16 = fSTConfiguration7.getObjectOutput(byteArray14);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration17 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = fSTConfiguration17.setForceClzInit(true);
        boolean boolean20 = fSTConfiguration17.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver21 = fSTConfiguration17.getLastResortResolver();
        java.lang.Class class23 = lastResortClassRessolver21.getClass("");
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer24 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean25 = fSTMapSerializer24.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration26 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration26.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry29 = fSTConfiguration26.getClassRegistry();
        fSTConfiguration26.setPreferSpeed(false);
        java.lang.Class class32 = null;
        java.lang.Object obj33 = fSTConfiguration26.getCachedObject(class32);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput34 = fSTConfiguration26.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration35 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration36 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration36.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry39 = fSTConfiguration36.getClassRegistry();
        fSTConfiguration36.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration42 = fSTConfiguration36.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration44 = fSTConfiguration36.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration45 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration47 = fSTConfiguration45.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder48 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration45);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder49 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration45);
        java.lang.Class class51 = fSTStreamDecoder49.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo52 = fSTConfiguration44.getClazzInfo(class51);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo53 = null;
        fSTMapSerializer24.readObject(fSTObjectInput34, (java.lang.Object) fSTConfiguration35, fSTClazzInfo52, fSTFieldInfo53);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo55 = null;
        // The following exception was thrown during execution in test generation
        try {
            fSTCPEnumSetSerializer0.writeObject(fSTObjectOutput16, (java.lang.Object) lastResortClassRessolver21, fSTClazzInfo52, fSTFieldInfo55, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.nustaq.serialization.FSTConfiguration$3 cannot be cast to java.util.EnumSet");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration1);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput16);
        org.junit.Assert.assertNotNull(fSTConfiguration17);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver21);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration26);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(fSTObjectInput34);
        org.junit.Assert.assertNotNull(fSTConfiguration35);
        org.junit.Assert.assertNotNull(fSTConfiguration36);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry39);
        org.junit.Assert.assertNotNull(fSTConfiguration42);
        org.junit.Assert.assertNotNull(fSTConfiguration44);
        org.junit.Assert.assertNotNull(fSTConfiguration45);
        org.junit.Assert.assertNotNull(fSTConfiguration47);
        org.junit.Assert.assertNotNull(class51);
        org.junit.Assert.assertNotNull(fSTClazzInfo52);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry8 = fSTConfiguration0.getCLInfoRegistry();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration9.setForceClzInit(true);
        boolean boolean12 = fSTConfiguration9.isPreferSpeed();
        fSTConfiguration9.clearCaches();
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        org.nustaq.serialization.FSTConfiguration fSTConfiguration15 = fSTConfiguration9.registerCrossPlatformClassMappingUseSimpleName(classArray14);
        fSTConfiguration0.registerClass(classArray14);
        java.io.InputStream inputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = fSTConfiguration0.decodeFromStream(inputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry8);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(fSTConfiguration15);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer0 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean1 = fSTMapSerializer0.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration4 = fSTConfiguration2.setForceClzInit(true);
        boolean boolean5 = fSTConfiguration2.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver6 = fSTConfiguration2.getLastResortResolver();
        java.lang.Class class8 = lastResortClassRessolver6.getClass("");
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer9 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean10 = fSTMapSerializer9.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration11.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry14 = fSTConfiguration11.getClassRegistry();
        fSTConfiguration11.setPreferSpeed(false);
        java.lang.Class class17 = null;
        java.lang.Object obj18 = fSTConfiguration11.getCachedObject(class17);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput19 = fSTConfiguration11.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration21 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration21.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry24 = fSTConfiguration21.getClassRegistry();
        fSTConfiguration21.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration27 = fSTConfiguration21.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = fSTConfiguration21.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration30 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration32 = fSTConfiguration30.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder33 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration30);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder34 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration30);
        java.lang.Class class36 = fSTStreamDecoder34.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo37 = fSTConfiguration29.getClazzInfo(class36);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo38 = null;
        fSTMapSerializer9.readObject(fSTObjectInput19, (java.lang.Object) fSTConfiguration20, fSTClazzInfo37, fSTFieldInfo38);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration40 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration40.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry43 = fSTConfiguration40.getClassRegistry();
        fSTConfiguration40.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration46 = fSTConfiguration40.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration48 = fSTConfiguration40.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration49 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration51 = fSTConfiguration49.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder52 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration49);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder53 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration49);
        java.lang.Class class55 = fSTStreamDecoder53.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo56 = fSTConfiguration48.getClazzInfo(class55);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo57 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = fSTMapSerializer0.instantiate(class8, fSTObjectInput19, fSTClazzInfo56, fSTFieldInfo57, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTConfiguration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver6);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(fSTObjectInput19);
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertNotNull(fSTConfiguration21);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry24);
        org.junit.Assert.assertNotNull(fSTConfiguration27);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(fSTConfiguration30);
        org.junit.Assert.assertNotNull(fSTConfiguration32);
        org.junit.Assert.assertNotNull(class36);
        org.junit.Assert.assertNotNull(fSTClazzInfo37);
        org.junit.Assert.assertNotNull(fSTConfiguration40);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry43);
        org.junit.Assert.assertNotNull(fSTConfiguration46);
        org.junit.Assert.assertNotNull(fSTConfiguration48);
        org.junit.Assert.assertNotNull(fSTConfiguration49);
        org.junit.Assert.assertNotNull(fSTConfiguration51);
        org.junit.Assert.assertNotNull(class55);
        org.junit.Assert.assertNotNull(fSTClazzInfo56);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer0 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean1 = fSTMapSerializer0.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration2.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration5 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration5.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry8 = fSTConfiguration5.getClassRegistry();
        java.lang.ClassLoader classLoader9 = fSTConfiguration5.getClassLoader();
        fSTConfiguration2.setClassLoader(classLoader9);
        java.io.OutputStream outputStream11 = null;
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput12 = fSTConfiguration2.getObjectOutput(outputStream11);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration13 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration15 = fSTConfiguration13.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder16 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration13);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry17 = fSTStreamDecoder16.clnames;
        java.io.InputStream inputStream18 = null;
        fSTStreamDecoder16.setInputStream(inputStream18);
        int int20 = fSTStreamDecoder16.available();
        int int21 = fSTStreamDecoder16.getObjectHeaderLen();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry25 = fSTConfiguration22.getClassRegistry();
        fSTConfiguration22.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration28 = fSTConfiguration22.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration30 = fSTConfiguration22.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration31 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration33 = fSTConfiguration31.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder34 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration31);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder35 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration31);
        java.lang.Class class37 = fSTStreamDecoder35.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo38 = fSTConfiguration30.getClazzInfo(class37);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo39 = null;
        // The following exception was thrown during execution in test generation
        try {
            fSTMapSerializer0.writeObject(fSTObjectOutput12, (java.lang.Object) fSTStreamDecoder16, fSTClazzInfo38, fSTFieldInfo39, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.nustaq.serialization.coders.FSTStreamDecoder cannot be cast to java.util.Map");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTConfiguration5);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(fSTObjectOutput12);
        org.junit.Assert.assertNotNull(fSTConfiguration13);
        org.junit.Assert.assertNotNull(fSTConfiguration15);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry25);
        org.junit.Assert.assertNotNull(fSTConfiguration28);
        org.junit.Assert.assertNotNull(fSTConfiguration30);
        org.junit.Assert.assertNotNull(fSTConfiguration31);
        org.junit.Assert.assertNotNull(fSTConfiguration33);
        org.junit.Assert.assertNotNull(class37);
        org.junit.Assert.assertNotNull(fSTClazzInfo38);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        int int5 = fSTStreamDecoder3.getObjectHeaderLen();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        java.io.Serializable serializable5 = fSTConfiguration0.deepCopy((java.io.Serializable) 10.0f);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration7.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder10 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration7);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder11 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration7);
        java.lang.Class class13 = fSTStreamDecoder11.classForName("hi!");
        java.lang.Class class15 = fSTStreamDecoder11.classForName(" 0.0");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = fSTConfiguration0.cpMap("hi!", class15);
        fSTConfiguration16.setCoderSpecific((java.lang.Object) 55296);
        fSTConfiguration16.clearCaches();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + 10.0d + "'", serializable5, 10.0d);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        java.io.Serializable serializable5 = fSTConfiguration0.deepCopy((java.io.Serializable) 10.0f);
        byte[] byteArray7 = fSTConfiguration0.getCrossPlatformBinaryCache("hi!");
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = fSTConfiguration0.decodeFromStream(inputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + 10.0d + "'", serializable5, 10.0d);
        org.junit.Assert.assertNull(byteArray7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.nustaq.serialization.serializers.FSTCPEnumSetSerializer fSTCPEnumSetSerializer0 = new org.nustaq.serialization.serializers.FSTCPEnumSetSerializer();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration1 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration3 = fSTConfiguration1.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration1);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder5 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration1);
        java.lang.Class class7 = fSTStreamDecoder5.classForName("hi!");
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer8 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean9 = fSTMapSerializer8.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration10.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry13 = fSTConfiguration10.getClassRegistry();
        fSTConfiguration10.setPreferSpeed(false);
        java.lang.Class class16 = null;
        java.lang.Object obj17 = fSTConfiguration10.getCachedObject(class16);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput18 = fSTConfiguration10.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration20.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry23 = fSTConfiguration20.getClassRegistry();
        fSTConfiguration20.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration26 = fSTConfiguration20.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration28 = fSTConfiguration20.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration31 = fSTConfiguration29.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder32 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration29);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder33 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration29);
        java.lang.Class class35 = fSTStreamDecoder33.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo36 = fSTConfiguration28.getClazzInfo(class35);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo37 = null;
        fSTMapSerializer8.readObject(fSTObjectInput18, (java.lang.Object) fSTConfiguration19, fSTClazzInfo36, fSTFieldInfo37);
        java.io.InputStream inputStream39 = null;
        org.nustaq.serialization.FSTObjectInput fSTObjectInput40 = fSTConfiguration19.getObjectInput(inputStream39);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration41 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration41.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry44 = fSTConfiguration41.getClassRegistry();
        fSTConfiguration41.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration47 = fSTConfiguration41.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration49 = fSTConfiguration41.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration50 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration52 = fSTConfiguration50.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder53 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration50);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder54 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration50);
        java.lang.Class class56 = fSTStreamDecoder54.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo57 = fSTConfiguration49.getClazzInfo(class56);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo58 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = fSTCPEnumSetSerializer0.instantiate(class7, fSTObjectInput40, fSTClazzInfo57, fSTFieldInfo58, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration1);
        org.junit.Assert.assertNotNull(fSTConfiguration3);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration10);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(fSTObjectInput18);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry23);
        org.junit.Assert.assertNotNull(fSTConfiguration26);
        org.junit.Assert.assertNotNull(fSTConfiguration28);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(fSTConfiguration31);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNotNull(fSTClazzInfo36);
        org.junit.Assert.assertNotNull(fSTObjectInput40);
        org.junit.Assert.assertNotNull(fSTConfiguration41);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry44);
        org.junit.Assert.assertNotNull(fSTConfiguration47);
        org.junit.Assert.assertNotNull(fSTConfiguration49);
        org.junit.Assert.assertNotNull(fSTConfiguration50);
        org.junit.Assert.assertNotNull(fSTConfiguration52);
        org.junit.Assert.assertNotNull(class56);
        org.junit.Assert.assertNotNull(fSTClazzInfo57);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver4 = fSTConfiguration0.getLastResortResolver();
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry5 = fSTConfiguration0.getCoderSpecific();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.nustaq.serialization.FSTConfiguration$2 to org.nustaq.serialization.FSTClazzInfoRegistry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        java.lang.ClassLoader classLoader3 = null;
        fSTConfiguration0.setClassLoader(classLoader3);
        byte[] byteArray6 = new byte[] {};
        fSTConfiguration0.registerCrossPlatformClassBinaryCache("", byteArray6);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier8 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration0.setVerifier(classSecurityVerifier8);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = fSTConfiguration10.setForceClzInit(true);
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver13 = fSTConfiguration10.getLastResortResolver();
        java.lang.Class class15 = lastResortClassRessolver13.getClass("");
        fSTConfiguration9.setLastResortResolver(lastResortClassRessolver13);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(fSTConfiguration10);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(lastResortClassRessolver13);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration6.setShareReferences(true);
        java.lang.ClassLoader classLoader9 = null;
        fSTConfiguration6.setClassLoader(classLoader9);
        byte[] byteArray12 = new byte[] {};
        fSTConfiguration6.registerCrossPlatformClassBinaryCache("", byteArray12);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier14 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration15 = fSTConfiguration6.setVerifier(classSecurityVerifier14);
        fSTStreamDecoder3.setConf(fSTConfiguration6);
        java.lang.Class class18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = fSTStreamDecoder3.readFPrimitiveArray((java.lang.Object) 32, class18, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(fSTConfiguration15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        boolean boolean5 = fSTStreamDecoder3.isMapBased();
        int int6 = fSTStreamDecoder3.getObjectHeaderLen();
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry7 = fSTStreamDecoder3.clnames;
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTConfiguration.prettyPrintJson((java.lang.Object) fSTStreamDecoder3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class org.nustaq.serialization.coders.FSTStreamDecoder does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry8 = fSTConfiguration0.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder9.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration4 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration4.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        java.lang.ClassLoader classLoader11 = fSTConfiguration7.getClassLoader();
        fSTConfiguration4.setClassLoader(classLoader11);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput18 = fSTConfiguration4.getObjectOutput(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround jacksonAccessWorkaround21 = new org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround(iOContext0, (int) (short) -1, objectCodec2, outputStream3, byteArray17, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration4);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 1, 0, 10]");
        org.junit.Assert.assertNotNull(fSTObjectOutput18);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        fSTConfiguration0.setPreferSpeed(true);
        java.lang.String str10 = fSTConfiguration0.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration11.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry14 = fSTConfiguration11.getClassRegistry();
        fSTConfiguration11.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration17 = fSTConfiguration11.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = fSTConfiguration11.setForceClzInit(false);
        java.lang.ClassLoader classLoader20 = fSTConfiguration19.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = fSTConfiguration0.asJsonString((java.lang.Object) classLoader20);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class sun.misc.Launcher$AppClassLoader does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FSTConfiguration{name='null'}" + "'", str10, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry14);
        org.junit.Assert.assertNotNull(fSTConfiguration17);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(classLoader20);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry8 = fSTConfiguration0.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier10 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration0.setVerifier(classSecurityVerifier10);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration12.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry15 = fSTConfiguration12.getClassRegistry();
        java.lang.String str16 = fSTConfiguration12.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration17 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration17.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry20 = fSTConfiguration17.getClassRegistry();
        fSTConfiguration12.setCoderSpecific((java.lang.Object) fSTClazzNameRegistry20);
        fSTConfiguration0.setCoderSpecific((java.lang.Object) fSTConfiguration12);
        fSTConfiguration0.setName("FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry8);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FSTConfiguration{name='null'}" + "'", str16, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration17);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry20);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        java.io.Serializable serializable5 = fSTConfiguration0.deepCopy((java.io.Serializable) 10.0f);
        byte[] byteArray7 = fSTConfiguration0.getCrossPlatformBinaryCache("hi!");
        boolean boolean8 = fSTConfiguration0.isStructMode();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + 10.0d + "'", serializable5, 10.0d);
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = fSTConfiguration0.setForceClzInit(false);
        boolean boolean9 = fSTConfiguration8.isForceSerializable();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = fSTConfiguration10.setForceClzInit(true);
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver13 = fSTConfiguration10.getLastResortResolver();
        java.lang.Class class15 = lastResortClassRessolver13.getClass("");
        org.nustaq.serialization.serializers.FSTCPThrowableSerializer fSTCPThrowableSerializer16 = new org.nustaq.serialization.serializers.FSTCPThrowableSerializer();
        fSTConfiguration8.registerSerializer(class15, (org.nustaq.serialization.FSTObjectSerializer) fSTCPThrowableSerializer16, true);
        fSTConfiguration8.clearCaches();
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry20 = fSTConfiguration8.getClassRegistry();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration10);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(lastResortClassRessolver13);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry20);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.StreamCoderFactory streamCoderFactory4 = null;
        fSTConfiguration0.setStreamCoderFactory(streamCoderFactory4);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer0 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean1 = fSTMapSerializer0.writeTupleEnd();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        fSTStreamDecoder3.readObjectEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        fSTConfiguration7.setPreferSpeed(false);
        java.lang.Class class13 = null;
        java.lang.Object obj14 = fSTConfiguration7.getCachedObject(class13);
        fSTConfiguration7.setStructMode(true);
        fSTStreamDecoder3.setConf(fSTConfiguration7);
        fSTStreamDecoder3.close();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
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
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration16.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration19.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry22 = fSTConfiguration19.getClassRegistry();
        java.lang.ClassLoader classLoader23 = fSTConfiguration19.getClassLoader();
        fSTConfiguration16.setClassLoader(classLoader23);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration27 = fSTConfiguration16.registerCrossPlatformClassMapping("hi!", " 0.0");
        int[] intArray31 = new int[] { (-1), (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray32 = fSTConfiguration7.asSharedByteArray((java.lang.Object) fSTConfiguration16, intArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class org.nustaq.serialization.FSTConfiguration does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + 10.0d + "'", serializable12, 10.0d);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry22);
        org.junit.Assert.assertNotNull(classLoader23);
        org.junit.Assert.assertNotNull(fSTConfiguration27);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 10, 1]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        int int7 = fSTStreamDecoder3.available();
        int int8 = fSTStreamDecoder3.getObjectHeaderLen();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration9.setShareReferences(true);
        java.lang.ClassLoader classLoader12 = null;
        fSTConfiguration9.setClassLoader(classLoader12);
        byte[] byteArray15 = new byte[] {};
        fSTConfiguration9.registerCrossPlatformClassBinaryCache("", byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder3.resetToCopyOf(byteArray15, 32, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        fSTConfiguration0.returnObject((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        java.lang.String str18 = fSTConfiguration6.asJsonString((java.lang.Object) (-1.0f));
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer19 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean20 = fSTMapSerializer19.alwaysCopy();
        org.nustaq.serialization.FSTObjectInput fSTObjectInput21 = null;
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo23 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo24 = null;
        fSTMapSerializer19.readObject(fSTObjectInput21, (java.lang.Object) (byte) 10, fSTClazzInfo23, fSTFieldInfo24);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration26 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration26.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry29 = fSTConfiguration26.getClassRegistry();
        fSTConfiguration26.setPreferSpeed(false);
        java.lang.Class class32 = null;
        java.lang.Object obj33 = fSTConfiguration26.getCachedObject(class32);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput34 = fSTConfiguration26.getObjectInput();
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo36 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo37 = null;
        fSTMapSerializer19.readObject(fSTObjectInput34, (java.lang.Object) (-1.0d), fSTClazzInfo36, fSTFieldInfo37);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration39 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration41 = fSTConfiguration39.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder42 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration39);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder43 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration39);
        java.lang.Class class45 = fSTStreamDecoder43.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration46 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration46.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry49 = fSTConfiguration46.getClassRegistry();
        fSTConfiguration46.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration52 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration52.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry55 = fSTConfiguration52.getClassRegistry();
        java.lang.ClassLoader classLoader56 = fSTConfiguration52.getClassLoader();
        fSTConfiguration46.setClassLoader(classLoader56);
        java.lang.Class<?> wildcardClass58 = classLoader56.getClass();
        java.lang.Object obj60 = fSTStreamDecoder43.coerceElement((java.lang.Class) wildcardClass58, (java.lang.Object) 100.0d);
        boolean boolean61 = fSTMapSerializer19.willHandleClass((java.lang.Class) wildcardClass58);
        org.nustaq.serialization.FSTClassInstantiator fSTClassInstantiator62 = fSTConfiguration6.getInstantiator((java.lang.Class) wildcardClass58);
        java.lang.String str64 = fSTConfiguration6.getClassForCPName(" 52");
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -1.0" + "'", str18, " -1.0");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration26);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(fSTObjectInput34);
        org.junit.Assert.assertNotNull(fSTConfiguration39);
        org.junit.Assert.assertNotNull(fSTConfiguration41);
        org.junit.Assert.assertNotNull(class45);
        org.junit.Assert.assertNotNull(fSTConfiguration46);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry49);
        org.junit.Assert.assertNotNull(fSTConfiguration52);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry55);
        org.junit.Assert.assertNotNull(classLoader56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100.0d + "'", obj60, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(fSTClassInstantiator62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + " 52" + "'", str64, " 52");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer0 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean1 = fSTMapSerializer0.alwaysCopy();
        org.nustaq.serialization.FSTObjectInput fSTObjectInput2 = null;
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo4 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo5 = null;
        fSTMapSerializer0.readObject(fSTObjectInput2, (java.lang.Object) (byte) 10, fSTClazzInfo4, fSTFieldInfo5);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration7.setForceClzInit(true);
        boolean boolean10 = fSTConfiguration7.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver11 = fSTConfiguration7.getLastResortResolver();
        java.lang.Class class13 = lastResortClassRessolver11.getClass("");
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer14 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean15 = fSTMapSerializer14.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration16.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry19 = fSTConfiguration16.getClassRegistry();
        fSTConfiguration16.setPreferSpeed(false);
        java.lang.Class class22 = null;
        java.lang.Object obj23 = fSTConfiguration16.getCachedObject(class22);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput24 = fSTConfiguration16.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration25 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration26 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration26.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry29 = fSTConfiguration26.getClassRegistry();
        fSTConfiguration26.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration32 = fSTConfiguration26.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration34 = fSTConfiguration26.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration35 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration37 = fSTConfiguration35.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder38 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration35);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder39 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration35);
        java.lang.Class class41 = fSTStreamDecoder39.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo42 = fSTConfiguration34.getClazzInfo(class41);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo43 = null;
        fSTMapSerializer14.readObject(fSTObjectInput24, (java.lang.Object) fSTConfiguration25, fSTClazzInfo42, fSTFieldInfo43);
        java.io.InputStream inputStream45 = null;
        org.nustaq.serialization.FSTObjectInput fSTObjectInput46 = fSTConfiguration25.getObjectInput(inputStream45);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration47 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration47.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry50 = fSTConfiguration47.getClassRegistry();
        fSTConfiguration47.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration53 = fSTConfiguration47.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration55 = fSTConfiguration47.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration56 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration58 = fSTConfiguration56.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder59 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration56);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder60 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration56);
        java.lang.Class class62 = fSTStreamDecoder60.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo63 = fSTConfiguration55.getClazzInfo(class62);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo64 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj66 = fSTMapSerializer0.instantiate(class13, fSTObjectInput46, fSTClazzInfo63, fSTFieldInfo64, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.nustaq.serialization.coders.Unknown cannot be cast to java.util.Map");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver11);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(fSTObjectInput24);
        org.junit.Assert.assertNotNull(fSTConfiguration25);
        org.junit.Assert.assertNotNull(fSTConfiguration26);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry29);
        org.junit.Assert.assertNotNull(fSTConfiguration32);
        org.junit.Assert.assertNotNull(fSTConfiguration34);
        org.junit.Assert.assertNotNull(fSTConfiguration35);
        org.junit.Assert.assertNotNull(fSTConfiguration37);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(fSTClazzInfo42);
        org.junit.Assert.assertNotNull(fSTObjectInput46);
        org.junit.Assert.assertNotNull(fSTConfiguration47);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry50);
        org.junit.Assert.assertNotNull(fSTConfiguration53);
        org.junit.Assert.assertNotNull(fSTConfiguration55);
        org.junit.Assert.assertNotNull(fSTConfiguration56);
        org.junit.Assert.assertNotNull(fSTConfiguration58);
        org.junit.Assert.assertNotNull(class62);
        org.junit.Assert.assertNotNull(fSTClazzInfo63);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = fSTConfiguration0.setForceClzInit(false);
        java.lang.ClassLoader classLoader9 = fSTConfiguration8.getClassLoader();
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier10 = fSTConfiguration8.getVerifier();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNull(classSecurityVerifier10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = fSTConfiguration0.setForceClzInit(false);
        boolean boolean9 = fSTConfiguration8.isForceSerializable();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = fSTConfiguration10.setForceClzInit(true);
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver13 = fSTConfiguration10.getLastResortResolver();
        java.lang.Class class15 = lastResortClassRessolver13.getClass("");
        org.nustaq.serialization.serializers.FSTCPThrowableSerializer fSTCPThrowableSerializer16 = new org.nustaq.serialization.serializers.FSTCPThrowableSerializer();
        fSTConfiguration8.registerSerializer(class15, (org.nustaq.serialization.FSTObjectSerializer) fSTCPThrowableSerializer16, true);
        boolean boolean19 = fSTCPThrowableSerializer16.alwaysCopy();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration10);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(lastResortClassRessolver13);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        boolean boolean7 = fSTConfiguration0.isForceClzInit();
        org.nustaq.serialization.FSTDecoder fSTDecoder8 = fSTConfiguration0.createStreamDecoder();
        org.nustaq.serialization.FSTSerializerRegistryDelegate fSTSerializerRegistryDelegate9 = null;
        fSTConfiguration0.setSerializerRegistryDelegate(fSTSerializerRegistryDelegate9);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fSTDecoder8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry7 = fSTStreamDecoder3.clnames;
        boolean boolean8 = fSTStreamDecoder3.inArray();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo4 = null;
        fSTStreamDecoder3.readArrayEnd(fSTClazzInfo4);
        int[] intArray10 = new int[] { (short) -1, (short) 100, 55296 };
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder3._readFIntArr(55296, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 55296]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.lang.String str0 = org.nustaq.serialization.FSTObjectSerializer.REALLY_NULL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "REALLY_NULL" + "'", str0, "REALLY_NULL");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = fSTConfiguration0.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration9.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry12 = fSTConfiguration9.getClassRegistry();
        fSTConfiguration9.setPreferSpeed(false);
        java.lang.Class class15 = null;
        java.lang.Object obj16 = fSTConfiguration9.getCachedObject(class15);
        fSTConfiguration9.setPreferSpeed(true);
        java.lang.String str19 = fSTConfiguration9.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration20.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry23 = fSTConfiguration20.getClassRegistry();
        fSTConfiguration20.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration26 = fSTConfiguration20.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration28 = fSTConfiguration20.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration31 = fSTConfiguration29.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder32 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration29);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder33 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration29);
        java.lang.Class class35 = fSTStreamDecoder33.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo36 = fSTConfiguration28.getClazzInfo(class35);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration37 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration39 = fSTConfiguration37.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder40 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration37);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder41 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration37);
        java.lang.Class class43 = fSTStreamDecoder41.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration44 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration44.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry47 = fSTConfiguration44.getClassRegistry();
        fSTConfiguration44.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration50 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration50.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry53 = fSTConfiguration50.getClassRegistry();
        java.lang.ClassLoader classLoader54 = fSTConfiguration50.getClassLoader();
        fSTConfiguration44.setClassLoader(classLoader54);
        java.lang.Class<?> wildcardClass56 = classLoader54.getClass();
        java.lang.Object obj58 = fSTStreamDecoder41.coerceElement((java.lang.Class) wildcardClass56, (java.lang.Object) 100.0d);
        java.lang.Class[] classArray59 = new java.lang.Class[] { class35, wildcardClass56 };
        org.nustaq.serialization.FSTConfiguration fSTConfiguration60 = fSTConfiguration9.registerCrossPlatformClassMappingUseSimpleName(classArray59);
        // The following exception was thrown during execution in test generation
        try {
            fSTConfiguration0.registerClass(classArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class sun.misc.Launcher$AppClassLoader does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "FSTConfiguration{name='null'}" + "'", str19, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry23);
        org.junit.Assert.assertNotNull(fSTConfiguration26);
        org.junit.Assert.assertNotNull(fSTConfiguration28);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(fSTConfiguration31);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNotNull(fSTClazzInfo36);
        org.junit.Assert.assertNotNull(fSTConfiguration37);
        org.junit.Assert.assertNotNull(fSTConfiguration39);
        org.junit.Assert.assertNotNull(class43);
        org.junit.Assert.assertNotNull(fSTConfiguration44);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry47);
        org.junit.Assert.assertNotNull(fSTConfiguration50);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry53);
        org.junit.Assert.assertNotNull(classLoader54);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(fSTConfiguration60);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Object obj4 = fSTStreamDecoder3.getDirectObject();
        boolean boolean5 = fSTStreamDecoder3.isMapBased();
        int int6 = fSTStreamDecoder3.getObjectHeaderLen();
        boolean boolean7 = fSTStreamDecoder3.isMapBased();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry8 = fSTConfiguration0.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier10 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration0.setVerifier(classSecurityVerifier10);
        fSTConfiguration11.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration14.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry17 = fSTConfiguration14.getClassRegistry();
        fSTConfiguration14.setPreferSpeed(false);
        java.lang.Class class20 = null;
        java.lang.Object obj21 = fSTConfiguration14.getCachedObject(class20);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry22 = fSTConfiguration14.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder23 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration14);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = fSTConfiguration11.asByteArray((java.lang.Object) fSTStreamDecoder23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class org.nustaq.serialization.coders.FSTStreamDecoder does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry8);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry22);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration3 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration3.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry6 = fSTConfiguration3.getClassRegistry();
        java.lang.ClassLoader classLoader7 = fSTConfiguration3.getClassLoader();
        fSTConfiguration0.setClassLoader(classLoader7);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration0.registerCrossPlatformClassMapping("hi!", " 0.0");
        java.lang.String str13 = fSTConfiguration0.asJsonString((java.lang.Object) '4');
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration14.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry17 = fSTConfiguration14.getClassRegistry();
        fSTConfiguration14.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = fSTConfiguration14.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration21 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration21.setShareReferences(true);
        java.lang.ClassLoader classLoader24 = null;
        fSTConfiguration21.setClassLoader(classLoader24);
        byte[] byteArray27 = new byte[] {};
        fSTConfiguration21.registerCrossPlatformClassBinaryCache("", byteArray27);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput29 = fSTConfiguration20.getObjectOutput(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTObjectInput fSTObjectInput31 = fSTConfiguration0.getObjectInput(byteArray27, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration3);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry6);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " 52" + "'", str13, " 52");
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry17);
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertNotNull(fSTConfiguration21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput29);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        java.io.Serializable serializable5 = fSTConfiguration0.deepCopy((java.io.Serializable) 10.0f);
        byte[] byteArray7 = fSTConfiguration0.getCrossPlatformBinaryCache("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = fSTConfiguration8.setForceClzInit(true);
        boolean boolean11 = fSTConfiguration8.isPreferSpeed();
        java.lang.String str12 = fSTConfiguration8.getName();
        byte[] byteArray14 = fSTConfiguration8.asByteArray((java.lang.Object) ' ');
        java.lang.Object obj15 = fSTConfiguration0.asObject(byteArray14);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration18 = fSTConfiguration16.setForceClzInit(true);
        boolean boolean19 = fSTConfiguration16.isPreferSpeed();
        fSTConfiguration16.clearCaches();
        org.nustaq.serialization.FSTEncoder fSTEncoder21 = fSTConfiguration16.createStreamEncoder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = fSTConfiguration0.asJsonString((java.lang.Object) fSTConfiguration16);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class org.nustaq.serialization.FSTConfiguration does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + 10.0d + "'", serializable5, 10.0d);
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[32, 51, 50]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 32 + "'", obj15, 32);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTConfiguration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fSTEncoder21);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        fSTStreamDecoder3.readObjectEnd();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        java.lang.ClassLoader classLoader3 = null;
        fSTConfiguration0.setClassLoader(classLoader3);
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer5 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean6 = fSTMapSerializer5.alwaysCopy();
        org.nustaq.serialization.FSTObjectInput fSTObjectInput7 = null;
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo9 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo10 = null;
        fSTMapSerializer5.readObject(fSTObjectInput7, (java.lang.Object) (byte) 10, fSTClazzInfo9, fSTFieldInfo10);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration12.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry15 = fSTConfiguration12.getClassRegistry();
        fSTConfiguration12.setPreferSpeed(false);
        java.lang.Class class18 = null;
        java.lang.Object obj19 = fSTConfiguration12.getCachedObject(class18);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput20 = fSTConfiguration12.getObjectInput();
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo22 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo23 = null;
        fSTMapSerializer5.readObject(fSTObjectInput20, (java.lang.Object) (-1.0d), fSTClazzInfo22, fSTFieldInfo23);
        // The following exception was thrown during execution in test generation
        try {
            java.io.DataInput dataInput25 = fSTConfiguration0.deepCopy((java.io.DataInput) fSTObjectInput20);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class org.nustaq.serialization.FSTObjectInput does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(fSTObjectInput20);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        fSTConfiguration0.clearCaches();
        org.nustaq.serialization.FSTConfiguration.StreamCoderFactory streamCoderFactory5 = null;
        fSTConfiguration0.setStreamCoderFactory(streamCoderFactory5);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration7.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder10 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration7);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry11 = fSTStreamDecoder10.clnames;
        java.io.InputStream inputStream12 = null;
        fSTStreamDecoder10.setInputStream(inputStream12);
        int int14 = fSTStreamDecoder10.available();
        fSTStreamDecoder10.readExternalEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration16.setShareReferences(true);
        java.lang.ClassLoader classLoader19 = null;
        fSTConfiguration16.setClassLoader(classLoader19);
        byte[] byteArray22 = new byte[] {};
        fSTConfiguration16.registerCrossPlatformClassBinaryCache("", byteArray22);
        fSTStreamDecoder10.resetWith(byteArray22, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTObjectOutput fSTObjectOutput26 = fSTConfiguration0.getObjectOutput(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        fSTStreamDecoder3.readObjectEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        fSTConfiguration7.setPreferSpeed(false);
        java.lang.Class class13 = null;
        java.lang.Object obj14 = fSTConfiguration7.getCachedObject(class13);
        fSTConfiguration7.setStructMode(true);
        fSTStreamDecoder3.setConf(fSTConfiguration7);
        long[] longArray25 = new long[] { 10L, (byte) 0, 10L, (byte) 10, 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder3.readFLongArr((int) (byte) 1, longArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[10, 0, 10, 10, 10, 1]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        java.io.Serializable serializable5 = fSTConfiguration0.deepCopy((java.io.Serializable) 10.0f);
        org.nustaq.serialization.FSTEncoder fSTEncoder6 = fSTConfiguration0.createStreamEncoder();
        java.io.OutputStream outputStream7 = null;
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput8 = fSTConfiguration0.getObjectOutput(outputStream7);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + 10.0d + "'", serializable5, 10.0d);
        org.junit.Assert.assertNotNull(fSTEncoder6);
        org.junit.Assert.assertNotNull(fSTObjectOutput8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = fSTStreamEncoder17.getWritten();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration4 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration4.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        java.lang.ClassLoader classLoader11 = fSTConfiguration7.getClassLoader();
        fSTConfiguration4.setClassLoader(classLoader11);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput18 = fSTConfiguration4.getObjectOutput(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround jacksonAccessWorkaround21 = new org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround(iOContext0, (int) '4', objectCodec2, outputStream3, byteArray17, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration4);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 1, 0, 10]");
        org.junit.Assert.assertNotNull(fSTObjectOutput18);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration3 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration3.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry6 = fSTConfiguration3.getClassRegistry();
        java.lang.ClassLoader classLoader7 = fSTConfiguration3.getClassLoader();
        fSTConfiguration0.setClassLoader(classLoader7);
        java.io.OutputStream outputStream9 = null;
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput10 = fSTConfiguration0.getObjectOutput(outputStream9);
        fSTConfiguration0.setStructMode(true);
        java.lang.Class<?> wildcardClass13 = fSTConfiguration0.getClass();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration3);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry6);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(fSTObjectOutput10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
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
        org.nustaq.serialization.FSTConfiguration fSTConfiguration23 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration25 = fSTConfiguration23.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder26 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration23);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry27 = fSTStreamDecoder26.clnames;
        java.io.InputStream inputStream28 = null;
        fSTStreamDecoder26.setInputStream(inputStream28);
        int int30 = fSTStreamDecoder26.available();
        fSTStreamDecoder26.readExternalEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration32 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration32.setShareReferences(true);
        java.lang.ClassLoader classLoader35 = null;
        fSTConfiguration32.setClassLoader(classLoader35);
        byte[] byteArray38 = new byte[] {};
        fSTConfiguration32.registerCrossPlatformClassBinaryCache("", byteArray38);
        fSTStreamDecoder26.resetWith(byteArray38, 5);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder4.resetToCopyOf(byteArray38, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertNotNull(fSTConfiguration13);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry16);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNotNull(fSTConfiguration23);
        org.junit.Assert.assertNotNull(fSTConfiguration25);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(fSTConfiguration32);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration19.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry25 = fSTConfiguration22.getClassRegistry();
        java.lang.ClassLoader classLoader26 = fSTConfiguration22.getClassLoader();
        fSTConfiguration19.setClassLoader(classLoader26);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier28 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = fSTConfiguration19.setVerifier(classSecurityVerifier28);
        fSTStreamEncoder17.setConf(fSTConfiguration29);
        int[] intArray36 = new int[] { 100, 56319, (byte) 1, '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17._writeFIntArr(intArray36, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry25);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 56319, 1, 35, 35]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        fSTConfiguration0.clearCaches();
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.registerCrossPlatformClassMappingUseSimpleName(classArray5);
        boolean boolean7 = fSTConfiguration0.isForceSerializable();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        fSTConfiguration0.clearCaches();
        java.io.OutputStream outputStream5 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = fSTConfiguration6.setForceClzInit(true);
        boolean boolean9 = fSTConfiguration6.isPreferSpeed();
        java.io.Serializable serializable11 = fSTConfiguration6.deepCopy((java.io.Serializable) 10.0f);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration13 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration15 = fSTConfiguration13.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder16 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration13);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder17 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration13);
        java.lang.Class class19 = fSTStreamDecoder17.classForName("hi!");
        java.lang.Class class21 = fSTStreamDecoder17.classForName(" 0.0");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = fSTConfiguration6.cpMap("hi!", class21);
        // The following exception was thrown during execution in test generation
        try {
            fSTConfiguration0.encodeToStream(outputStream5, (java.lang.Object) class21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + serializable11 + "' != '" + 10.0d + "'", serializable11, 10.0d);
        org.junit.Assert.assertNotNull(fSTConfiguration13);
        org.junit.Assert.assertNotNull(fSTConfiguration15);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration19.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry25 = fSTConfiguration22.getClassRegistry();
        java.lang.ClassLoader classLoader26 = fSTConfiguration22.getClassLoader();
        fSTConfiguration19.setClassLoader(classLoader26);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier28 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = fSTConfiguration19.setVerifier(classSecurityVerifier28);
        fSTStreamEncoder17.setConf(fSTConfiguration29);
        int[] intArray31 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17._writeFIntArr(intArray31, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry25);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver4 = fSTConfiguration0.getLastResortResolver();
        org.nustaq.serialization.FSTConfiguration.StreamCoderFactory streamCoderFactory5 = fSTConfiguration0.getStreamCoderFactory();
        org.nustaq.serialization.FSTEncoder fSTEncoder6 = streamCoderFactory5.createStreamEncoder();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver4);
        org.junit.Assert.assertNotNull(streamCoderFactory5);
        org.junit.Assert.assertNotNull(fSTEncoder6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.nustaq.serialization.serializers.FSTCollectionSerializer fSTCollectionSerializer0 = new org.nustaq.serialization.serializers.FSTCollectionSerializer();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration1 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration1.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTConfiguration1.getClassRegistry();
        java.io.OutputStream outputStream5 = null;
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput6 = fSTConfiguration1.getObjectOutput(outputStream5);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration8.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry11 = fSTConfiguration8.getClassRegistry();
        fSTConfiguration8.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = fSTConfiguration8.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = fSTConfiguration8.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration17 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = fSTConfiguration17.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder20 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration17);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder21 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration17);
        java.lang.Class class23 = fSTStreamDecoder21.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo24 = fSTConfiguration16.getClazzInfo(class23);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo25 = null;
        // The following exception was thrown during execution in test generation
        try {
            fSTCollectionSerializer0.writeObject(fSTObjectOutput6, (java.lang.Object) 100.0f, fSTClazzInfo24, fSTFieldInfo25, 57343);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.util.Collection");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration1);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertNotNull(fSTObjectOutput6);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry11);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTConfiguration17);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(fSTClazzInfo24);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = org.nustaq.serialization.FSTConfiguration.createJsonConfiguration(true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: unsupported flag combination");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry7 = fSTConfiguration6.getCLInfoRegistry();
        boolean boolean8 = fSTConfiguration6.isShareReferences();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration3 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration3.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry6 = fSTConfiguration3.getClassRegistry();
        java.lang.ClassLoader classLoader7 = fSTConfiguration3.getClassLoader();
        fSTConfiguration0.setClassLoader(classLoader7);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier9 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = fSTConfiguration0.setVerifier(classSecurityVerifier9);
        java.io.OutputStream outputStream11 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration12.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry15 = fSTConfiguration12.getClassRegistry();
        fSTConfiguration12.setPreferSpeed(false);
        java.lang.Class class18 = null;
        java.lang.Object obj19 = fSTConfiguration12.getCachedObject(class18);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry20 = fSTConfiguration12.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder21 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration12);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier22 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration23 = fSTConfiguration12.setVerifier(classSecurityVerifier22);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration24 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration24.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry27 = fSTConfiguration24.getClassRegistry();
        java.lang.String str28 = fSTConfiguration24.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration29.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry32 = fSTConfiguration29.getClassRegistry();
        fSTConfiguration24.setCoderSpecific((java.lang.Object) fSTClazzNameRegistry32);
        fSTConfiguration12.setCoderSpecific((java.lang.Object) fSTConfiguration24);
        // The following exception was thrown during execution in test generation
        try {
            fSTConfiguration10.encodeToStream(outputStream11, (java.lang.Object) fSTConfiguration24);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class org.nustaq.serialization.FSTConfiguration does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration3);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry6);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(fSTConfiguration10);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry20);
        org.junit.Assert.assertNotNull(fSTConfiguration23);
        org.junit.Assert.assertNotNull(fSTConfiguration24);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "FSTConfiguration{name='null'}" + "'", str28, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry32);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration10.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry13 = fSTConfiguration10.getClassRegistry();
        java.lang.ClassLoader classLoader14 = fSTConfiguration10.getClassLoader();
        fSTConfiguration7.setClassLoader(classLoader14);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput21 = fSTConfiguration7.getObjectOutput(byteArray20);
        fSTStreamDecoder3.resetWith(byteArray20, (int) (short) -1);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration24 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration24.setShareReferences(true);
        java.lang.ClassLoader classLoader27 = null;
        fSTConfiguration24.setClassLoader(classLoader27);
        byte[] byteArray30 = new byte[] {};
        fSTConfiguration24.registerCrossPlatformClassBinaryCache("", byteArray30);
        org.nustaq.serialization.FSTConfiguration.prettyPrintJson((java.lang.Object) byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder3.readPlainBytes(byteArray30, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration10);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry13);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 1, 0, 10]");
        org.junit.Assert.assertNotNull(fSTObjectOutput21);
        org.junit.Assert.assertNotNull(fSTConfiguration24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        double double7 = fSTStreamDecoder3.readFDouble();
        fSTStreamDecoder3.skip((int) (short) 10);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        fSTStreamEncoder17.writeArrayEnd();
        short[] shortArray23 = new short[] { (byte) 1, (short) -1, (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFShortArr(shortArray23, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1, -1, 10, 1]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer0 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean1 = fSTMapSerializer0.alwaysCopy();
        org.nustaq.serialization.FSTObjectInput fSTObjectInput2 = null;
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo4 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo5 = null;
        fSTMapSerializer0.readObject(fSTObjectInput2, (java.lang.Object) (byte) 10, fSTClazzInfo4, fSTFieldInfo5);
        boolean boolean7 = fSTMapSerializer0.writeTupleEnd();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        java.lang.ClassLoader classLoader7 = fSTConfiguration0.getClassLoader();
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier8 = fSTConfiguration0.getVerifier();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration0.deriveConfiguration();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNull(classSecurityVerifier8);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration19.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry25 = fSTConfiguration22.getClassRegistry();
        java.lang.ClassLoader classLoader26 = fSTConfiguration22.getClassLoader();
        fSTConfiguration19.setClassLoader(classLoader26);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier28 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = fSTConfiguration19.setVerifier(classSecurityVerifier28);
        fSTStreamEncoder17.setConf(fSTConfiguration29);
        fSTStreamEncoder17.writeArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeStringUTF("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry25);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        int[] intArray18 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFIntArr(intArray18, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFLong(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createStructConfiguration();
        fSTConfiguration0.setPreferSpeed(false);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createDefaultConfiguration();
        org.nustaq.serialization.FSTSerializerRegistryDelegate fSTSerializerRegistryDelegate1 = null;
        fSTConfiguration0.setSerializerRegistryDelegate(fSTSerializerRegistryDelegate1);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer0 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean1 = fSTMapSerializer0.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration2.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry5 = fSTConfiguration2.getClassRegistry();
        fSTConfiguration2.setPreferSpeed(false);
        java.lang.Class class8 = null;
        java.lang.Object obj9 = fSTConfiguration2.getCachedObject(class8);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput10 = fSTConfiguration2.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration12.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry15 = fSTConfiguration12.getClassRegistry();
        fSTConfiguration12.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration18 = fSTConfiguration12.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = fSTConfiguration12.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration21 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration23 = fSTConfiguration21.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder24 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration21);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder25 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration21);
        java.lang.Class class27 = fSTStreamDecoder25.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo28 = fSTConfiguration20.getClazzInfo(class27);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo29 = null;
        fSTMapSerializer0.readObject(fSTObjectInput10, (java.lang.Object) fSTConfiguration11, fSTClazzInfo28, fSTFieldInfo29);
        boolean boolean31 = fSTMapSerializer0.writeTupleEnd();
        boolean boolean32 = fSTMapSerializer0.writeTupleEnd();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(fSTObjectInput10);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry15);
        org.junit.Assert.assertNotNull(fSTConfiguration18);
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertNotNull(fSTConfiguration21);
        org.junit.Assert.assertNotNull(fSTConfiguration23);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(fSTClazzInfo28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo4 = null;
        fSTStreamDecoder3.readArrayEnd(fSTClazzInfo4);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration6.setShareReferences(true);
        java.lang.ClassLoader classLoader9 = null;
        fSTConfiguration6.setClassLoader(classLoader9);
        byte[] byteArray12 = new byte[] {};
        fSTConfiguration6.registerCrossPlatformClassBinaryCache("", byteArray12);
        org.nustaq.serialization.FSTConfiguration.prettyPrintJson((java.lang.Object) byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder3.resetWith(byteArray12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        java.io.InputStream inputStream6 = null;
        fSTStreamDecoder3.setInputStream(inputStream6);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration8.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry11 = fSTConfiguration8.getClassRegistry();
        fSTConfiguration8.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = fSTConfiguration8.deriveConfiguration();
        java.lang.ClassLoader classLoader15 = fSTConfiguration8.getClassLoader();
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier16 = fSTConfiguration8.getVerifier();
        fSTStreamDecoder3.setConf(fSTConfiguration8);
        int int18 = fSTStreamDecoder3.readIntByte();
        byte byte19 = fSTStreamDecoder3.readObjectHeaderTag();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry11);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNull(classSecurityVerifier16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 32 + "'", byte19 == (byte) 32);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        java.lang.String str18 = fSTConfiguration6.asJsonString((java.lang.Object) (-1.0f));
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer19 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean20 = fSTMapSerializer19.alwaysCopy();
        org.nustaq.serialization.FSTObjectInput fSTObjectInput21 = null;
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo23 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo24 = null;
        fSTMapSerializer19.readObject(fSTObjectInput21, (java.lang.Object) (byte) 10, fSTClazzInfo23, fSTFieldInfo24);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration26 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration26.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry29 = fSTConfiguration26.getClassRegistry();
        fSTConfiguration26.setPreferSpeed(false);
        java.lang.Class class32 = null;
        java.lang.Object obj33 = fSTConfiguration26.getCachedObject(class32);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput34 = fSTConfiguration26.getObjectInput();
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo36 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo37 = null;
        fSTMapSerializer19.readObject(fSTObjectInput34, (java.lang.Object) (-1.0d), fSTClazzInfo36, fSTFieldInfo37);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration39 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration41 = fSTConfiguration39.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder42 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration39);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder43 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration39);
        java.lang.Class class45 = fSTStreamDecoder43.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration46 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration46.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry49 = fSTConfiguration46.getClassRegistry();
        fSTConfiguration46.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration52 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration52.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry55 = fSTConfiguration52.getClassRegistry();
        java.lang.ClassLoader classLoader56 = fSTConfiguration52.getClassLoader();
        fSTConfiguration46.setClassLoader(classLoader56);
        java.lang.Class<?> wildcardClass58 = classLoader56.getClass();
        java.lang.Object obj60 = fSTStreamDecoder43.coerceElement((java.lang.Class) wildcardClass58, (java.lang.Object) 100.0d);
        boolean boolean61 = fSTMapSerializer19.willHandleClass((java.lang.Class) wildcardClass58);
        org.nustaq.serialization.FSTClassInstantiator fSTClassInstantiator62 = fSTConfiguration6.getInstantiator((java.lang.Class) wildcardClass58);
        fSTConfiguration6.setName(" -1.0");
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -1.0" + "'", str18, " -1.0");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration26);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(fSTObjectInput34);
        org.junit.Assert.assertNotNull(fSTConfiguration39);
        org.junit.Assert.assertNotNull(fSTConfiguration41);
        org.junit.Assert.assertNotNull(class45);
        org.junit.Assert.assertNotNull(fSTConfiguration46);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry49);
        org.junit.Assert.assertNotNull(fSTConfiguration52);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry55);
        org.junit.Assert.assertNotNull(classLoader56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100.0d + "'", obj60, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(fSTClassInstantiator62);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        java.lang.String str18 = fSTConfiguration6.asJsonString((java.lang.Object) (-1.0f));
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput19 = fSTConfiguration6.getObjectOutput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration20.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry23 = fSTConfiguration20.getClassRegistry();
        fSTConfiguration20.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration26 = fSTConfiguration20.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration28 = fSTConfiguration20.setForceClzInit(false);
        boolean boolean29 = fSTConfiguration28.isForceSerializable();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration30 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration32 = fSTConfiguration30.setForceClzInit(true);
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver33 = fSTConfiguration30.getLastResortResolver();
        java.lang.Class class35 = lastResortClassRessolver33.getClass("");
        org.nustaq.serialization.serializers.FSTCPThrowableSerializer fSTCPThrowableSerializer36 = new org.nustaq.serialization.serializers.FSTCPThrowableSerializer();
        fSTConfiguration28.registerSerializer(class35, (org.nustaq.serialization.FSTObjectSerializer) fSTCPThrowableSerializer36, true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration39 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration41 = fSTConfiguration39.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder42 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration39);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder43 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration39);
        java.lang.Class class45 = fSTStreamDecoder43.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration46 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration46.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry49 = fSTConfiguration46.getClassRegistry();
        fSTConfiguration46.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration52 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration52.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry55 = fSTConfiguration52.getClassRegistry();
        java.lang.ClassLoader classLoader56 = fSTConfiguration52.getClassLoader();
        fSTConfiguration46.setClassLoader(classLoader56);
        java.lang.Class<?> wildcardClass58 = classLoader56.getClass();
        java.lang.Object obj60 = fSTStreamDecoder43.coerceElement((java.lang.Class) wildcardClass58, (java.lang.Object) 100.0d);
        boolean boolean61 = fSTCPThrowableSerializer36.willHandleClass((java.lang.Class) wildcardClass58);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTClazzInfo fSTClazzInfo62 = fSTConfiguration6.getClazzInfo((java.lang.Class) wildcardClass58);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class sun.misc.Launcher$AppClassLoader does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -1.0" + "'", str18, " -1.0");
        org.junit.Assert.assertNotNull(fSTObjectOutput19);
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry23);
        org.junit.Assert.assertNotNull(fSTConfiguration26);
        org.junit.Assert.assertNotNull(fSTConfiguration28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration30);
        org.junit.Assert.assertNotNull(fSTConfiguration32);
        org.junit.Assert.assertNotNull(lastResortClassRessolver33);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNotNull(fSTConfiguration39);
        org.junit.Assert.assertNotNull(fSTConfiguration41);
        org.junit.Assert.assertNotNull(class45);
        org.junit.Assert.assertNotNull(fSTConfiguration46);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry49);
        org.junit.Assert.assertNotNull(fSTConfiguration52);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry55);
        org.junit.Assert.assertNotNull(classLoader56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100.0d + "'", obj60, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver4 = fSTConfiguration0.getLastResortResolver();
        org.nustaq.serialization.FSTConfiguration.StreamCoderFactory streamCoderFactory5 = fSTConfiguration0.getStreamCoderFactory();
        boolean boolean6 = fSTConfiguration0.isCrossPlatform();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver4);
        org.junit.Assert.assertNotNull(streamCoderFactory5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        fSTStreamDecoder3.readObjectEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        fSTConfiguration7.setPreferSpeed(false);
        java.lang.Class class13 = null;
        java.lang.Object obj14 = fSTConfiguration7.getCachedObject(class13);
        fSTConfiguration7.setStructMode(true);
        fSTStreamDecoder3.setConf(fSTConfiguration7);
        java.io.InputStream inputStream18 = null;
        fSTStreamDecoder3.setInputStream(inputStream18);
        fSTStreamDecoder3.pushBack((int) 'a');
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry22 = fSTStreamDecoder3.clnames;
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry22);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        short[] shortArray19 = new short[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFShortArr(shortArray19, 32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = fSTConfiguration0.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration9.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder12 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration9);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder13 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration9);
        java.lang.Class class15 = fSTStreamDecoder13.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo16 = fSTConfiguration8.getClazzInfo(class15);
        org.nustaq.serialization.FSTEncoder fSTEncoder17 = fSTConfiguration8.createStreamEncoder();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(fSTClazzInfo16);
        org.junit.Assert.assertNotNull(fSTEncoder17);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry6 = fSTStreamDecoder3.clnames;
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry5 = fSTConfiguration0.getCLInfoRegistry();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver6 = fSTConfiguration0.getLastResortResolver();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry5);
        org.junit.Assert.assertNotNull(lastResortClassRessolver6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration21 = fSTConfiguration19.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder22 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration19);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry23 = fSTStreamDecoder22.clnames;
        java.io.InputStream inputStream24 = null;
        fSTStreamDecoder22.setInputStream(inputStream24);
        int int26 = fSTStreamDecoder22.available();
        fSTStreamDecoder22.readExternalEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration28 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration28.setShareReferences(true);
        java.lang.ClassLoader classLoader31 = null;
        fSTConfiguration28.setClassLoader(classLoader31);
        byte[] byteArray34 = new byte[] {};
        fSTConfiguration28.registerCrossPlatformClassBinaryCache("", byteArray34);
        fSTStreamDecoder22.resetWith(byteArray34, 5);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.reset(byteArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration21);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fSTConfiguration28);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
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
        int int16 = fSTStreamDecoder3.getObjectHeaderLen();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + 10.0d + "'", serializable12, 10.0d);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        int int7 = fSTStreamDecoder3.available();
        fSTStreamDecoder3.readExternalEnd();
        int int9 = fSTStreamDecoder3.readFInt();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration19.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry25 = fSTConfiguration22.getClassRegistry();
        java.lang.ClassLoader classLoader26 = fSTConfiguration22.getClassLoader();
        fSTConfiguration19.setClassLoader(classLoader26);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier28 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = fSTConfiguration19.setVerifier(classSecurityVerifier28);
        fSTStreamEncoder17.setConf(fSTConfiguration29);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFLong(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry25);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        fSTStreamDecoder3.readObjectEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        fSTConfiguration7.setPreferSpeed(false);
        java.lang.Class class13 = null;
        java.lang.Object obj14 = fSTConfiguration7.getCachedObject(class13);
        fSTConfiguration7.setStructMode(true);
        fSTStreamDecoder3.setConf(fSTConfiguration7);
        java.io.InputStream inputStream18 = null;
        fSTStreamDecoder3.setInputStream(inputStream18);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = fSTConfiguration20.setForceClzInit(true);
        boolean boolean23 = fSTConfiguration20.isPreferSpeed();
        java.lang.String str24 = fSTConfiguration20.getName();
        byte[] byteArray26 = fSTConfiguration20.asByteArray((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder3.resetToCopyOf(byteArray26, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[32, 51, 50]");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.io.OutputStream outputStream5 = null;
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer6 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean7 = fSTMapSerializer6.alwaysCopy();
        // The following exception was thrown during execution in test generation
        try {
            fSTConfiguration0.encodeToStream(outputStream5, (java.lang.Object) fSTMapSerializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class org.nustaq.serialization.serializers.FSTMapSerializer does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration6.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry9 = fSTConfiguration6.getClassRegistry();
        java.lang.ClassLoader classLoader10 = fSTConfiguration6.getClassLoader();
        fSTConfiguration0.setClassLoader(classLoader10);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier12 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration13 = fSTConfiguration0.setVerifier(classSecurityVerifier12);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry9);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(fSTConfiguration13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeVersionTag(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = org.nustaq.serialization.FSTConfiguration.createJsonConfiguration(true, false);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        fSTConfiguration0.setPreferSpeed(true);
        java.lang.String str10 = fSTConfiguration0.toString();
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier11 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = fSTConfiguration0.setVerifier(classSecurityVerifier11);
        fSTConfiguration12.setStructMode(true);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FSTConfiguration{name='null'}" + "'", str10, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        fSTStreamEncoder17.writeArrayEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = fSTStreamEncoder17.getConf();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo4 = null;
        fSTStreamDecoder3.readArrayEnd(fSTClazzInfo4);
        int int6 = fSTStreamDecoder3.getObjectHeaderLen();
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder3.moveTo((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createMinBinConfiguration();
        fSTConfiguration0.setStructMode(true);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry8 = fSTConfiguration0.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier10 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration0.setVerifier(classSecurityVerifier10);
        fSTConfiguration11.returnObject((java.lang.Object) "FSTConfiguration{name='null'}");
        org.nustaq.serialization.FSTSerializerRegistryDelegate fSTSerializerRegistryDelegate14 = null;
        fSTConfiguration11.setSerializerRegistryDelegate(fSTSerializerRegistryDelegate14);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder16 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry8);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        boolean boolean16 = fSTConfiguration6.isForceSerializable();
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry17 = fSTConfiguration6.getCLInfoRegistry();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry17);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream19 = null;
        fSTStreamEncoder17.setOutstream(outputStream19);
        fSTStreamEncoder17.writeFShort((short) 10);
        java.io.OutputStream outputStream23 = null;
        fSTStreamEncoder17.setOutstream(outputStream23);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder1 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        fSTStreamDecoder3.readObjectEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        fSTConfiguration7.setPreferSpeed(false);
        java.lang.Class class13 = null;
        java.lang.Object obj14 = fSTConfiguration7.getCachedObject(class13);
        fSTConfiguration7.setStructMode(true);
        fSTStreamDecoder3.setConf(fSTConfiguration7);
        org.nustaq.serialization.FSTSerializerRegistryDelegate fSTSerializerRegistryDelegate18 = null;
        fSTConfiguration7.setSerializerRegistryDelegate(fSTSerializerRegistryDelegate18);
        java.lang.String[][] strArray20 = new java.lang.String[][] {};
        org.nustaq.serialization.FSTConfiguration fSTConfiguration21 = fSTConfiguration7.registerCrossPlatformClassMapping(strArray20);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(fSTConfiguration21);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        fSTConfiguration6.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver18 = fSTConfiguration6.getLastResortResolver();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration21 = fSTConfiguration19.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder22 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration19);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder23 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration19);
        java.lang.Class class25 = fSTStreamDecoder23.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration26 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration26.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry29 = fSTConfiguration26.getClassRegistry();
        fSTConfiguration26.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration32 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration32.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry35 = fSTConfiguration32.getClassRegistry();
        java.lang.ClassLoader classLoader36 = fSTConfiguration32.getClassLoader();
        fSTConfiguration26.setClassLoader(classLoader36);
        java.lang.Class<?> wildcardClass38 = classLoader36.getClass();
        java.lang.Object obj40 = fSTStreamDecoder23.coerceElement((java.lang.Class) wildcardClass38, (java.lang.Object) 100.0d);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration41 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration41.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry44 = fSTConfiguration41.getClassRegistry();
        fSTConfiguration41.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration47 = fSTConfiguration41.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration49 = fSTConfiguration41.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration50 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration52 = fSTConfiguration50.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder53 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration50);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder54 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration50);
        java.lang.Class class56 = fSTStreamDecoder54.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo57 = fSTConfiguration49.getClazzInfo(class56);
        java.lang.Class[] classArray58 = new java.lang.Class[] { wildcardClass38, class56 };
        org.nustaq.serialization.FSTConfiguration fSTConfiguration59 = fSTConfiguration6.registerCrossPlatformClassMappingUseSimpleName(classArray58);
        byte[] byteArray60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj61 = fSTConfiguration6.asObject(byteArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(lastResortClassRessolver18);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration21);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(fSTConfiguration26);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry29);
        org.junit.Assert.assertNotNull(fSTConfiguration32);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry35);
        org.junit.Assert.assertNotNull(classLoader36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertNotNull(fSTConfiguration41);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry44);
        org.junit.Assert.assertNotNull(fSTConfiguration47);
        org.junit.Assert.assertNotNull(fSTConfiguration49);
        org.junit.Assert.assertNotNull(fSTConfiguration50);
        org.junit.Assert.assertNotNull(fSTConfiguration52);
        org.junit.Assert.assertNotNull(class56);
        org.junit.Assert.assertNotNull(fSTClazzInfo57);
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertNotNull(fSTConfiguration59);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        boolean boolean0 = org.nustaq.serialization.FSTConfiguration.isAndroid;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        int int7 = fSTStreamDecoder3.available();
        fSTStreamDecoder3.reset();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream19 = null;
        fSTStreamEncoder17.setOutstream(outputStream19);
        fSTStreamEncoder17.writeFShort((short) 10);
        int int23 = fSTStreamEncoder17.getWritten();
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo24 = null;
        fSTStreamEncoder17.writeAttributeName(fSTFieldInfo24);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        java.io.Serializable serializable5 = fSTConfiguration0.deepCopy((java.io.Serializable) 10.0f);
        byte[] byteArray7 = fSTConfiguration0.getCrossPlatformBinaryCache("hi!");
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier8 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration0.setVerifier(classSecurityVerifier8);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + 10.0d + "'", serializable5, 10.0d);
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration19.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry25 = fSTConfiguration22.getClassRegistry();
        java.lang.ClassLoader classLoader26 = fSTConfiguration22.getClassLoader();
        fSTConfiguration19.setClassLoader(classLoader26);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier28 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = fSTConfiguration19.setVerifier(classSecurityVerifier28);
        fSTStreamEncoder17.setConf(fSTConfiguration29);
        fSTStreamEncoder17.writeArrayEnd();
        java.lang.Class class32 = null;
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.registerClass(class32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry25);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration19.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry25 = fSTConfiguration22.getClassRegistry();
        java.lang.ClassLoader classLoader26 = fSTConfiguration22.getClassLoader();
        fSTConfiguration19.setClassLoader(classLoader26);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier28 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = fSTConfiguration19.setVerifier(classSecurityVerifier28);
        fSTStreamEncoder17.setConf(fSTConfiguration29);
        fSTStreamEncoder17.writeArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.skip((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry25);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        fSTConfiguration0.setName(" 52");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        fSTConfiguration7.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration13 = fSTConfiguration7.deriveConfiguration();
        java.lang.ClassLoader classLoader14 = fSTConfiguration7.getClassLoader();
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier15 = fSTConfiguration7.getVerifier();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder16 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration7);
        org.nustaq.serialization.FSTConfiguration.StreamCoderFactory streamCoderFactory17 = fSTConfiguration7.getStreamCoderFactory();
        java.lang.ThreadLocal threadLocal18 = streamCoderFactory17.getOutput();
        java.lang.ThreadLocal threadLocal19 = streamCoderFactory17.getOutput();
        fSTConfiguration0.setCoderSpecific((java.lang.Object) threadLocal19);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertNotNull(fSTConfiguration13);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNull(classSecurityVerifier15);
        org.junit.Assert.assertNotNull(streamCoderFactory17);
        org.junit.Assert.assertNotNull(threadLocal18);
        org.junit.Assert.assertNotNull(threadLocal19);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        fSTConfiguration0.setPreferSpeed(true);
        java.lang.String str10 = fSTConfiguration0.toString();
        java.lang.String str11 = fSTConfiguration0.toString();
        fSTConfiguration0.setPreferSpeed(true);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FSTConfiguration{name='null'}" + "'", str10, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FSTConfiguration{name='null'}" + "'", str11, "FSTConfiguration{name='null'}");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = fSTStreamEncoder17.getConf();
        double[] doubleArray25 = new double[] { (short) 1, 10, 10.0f, 5, 57343 };
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFDoubleArr(doubleArray25, 5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0, 10.0, 5.0, 57343.0]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        boolean boolean19 = fSTStreamEncoder17.isByteArrayBased();
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFShort((short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        java.lang.Object obj7 = fSTStreamDecoder4.getDirectObject();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        java.io.InputStream inputStream6 = null;
        fSTStreamDecoder3.setInputStream(inputStream6);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration8.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry11 = fSTConfiguration8.getClassRegistry();
        fSTConfiguration8.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = fSTConfiguration8.deriveConfiguration();
        java.lang.ClassLoader classLoader15 = fSTConfiguration8.getClassLoader();
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier16 = fSTConfiguration8.getVerifier();
        fSTStreamDecoder3.setConf(fSTConfiguration8);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration18 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = fSTConfiguration18.setForceClzInit(true);
        boolean boolean21 = fSTConfiguration18.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver22 = fSTConfiguration18.getLastResortResolver();
        java.lang.Class class24 = lastResortClassRessolver22.getClass("");
        fSTConfiguration8.setLastResortResolver(lastResortClassRessolver22);
        java.io.InputStream inputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = fSTConfiguration8.decodeFromStream(inputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry11);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNull(classSecurityVerifier16);
        org.junit.Assert.assertNotNull(fSTConfiguration18);
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver22);
        org.junit.Assert.assertNotNull(class24);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        fSTStreamEncoder17.writeArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFShort((short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
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
        boolean boolean16 = fSTStreamDecoder3.inArray();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + 10.0d + "'", serializable12, 10.0d);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer0 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean1 = fSTMapSerializer0.alwaysCopy();
        org.nustaq.serialization.FSTObjectInput fSTObjectInput2 = null;
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo4 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo5 = null;
        fSTMapSerializer0.readObject(fSTObjectInput2, (java.lang.Object) (byte) 10, fSTClazzInfo4, fSTFieldInfo5);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration7.setForceClzInit(true);
        boolean boolean10 = fSTConfiguration7.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver11 = fSTConfiguration7.getLastResortResolver();
        java.lang.Class class13 = lastResortClassRessolver11.getClass("");
        boolean boolean14 = fSTMapSerializer0.willHandleClass(class13);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration15 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration15.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry18 = fSTConfiguration15.getClassRegistry();
        fSTConfiguration15.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration21 = fSTConfiguration15.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        java.lang.ClassLoader classLoader25 = null;
        fSTConfiguration22.setClassLoader(classLoader25);
        byte[] byteArray28 = new byte[] {};
        fSTConfiguration22.registerCrossPlatformClassBinaryCache("", byteArray28);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput30 = fSTConfiguration21.getObjectOutput(byteArray28);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration31 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration31.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry34 = fSTConfiguration31.getClassRegistry();
        fSTConfiguration31.setPreferSpeed(false);
        java.lang.Class class37 = null;
        java.lang.Object obj38 = fSTConfiguration31.getCachedObject(class37);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration39 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration39.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry42 = fSTConfiguration39.getClassRegistry();
        fSTConfiguration39.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration45 = fSTConfiguration39.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration47 = fSTConfiguration39.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration48 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration50 = fSTConfiguration48.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder51 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration48);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder52 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration48);
        java.lang.Class class54 = fSTStreamDecoder52.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo55 = fSTConfiguration47.getClazzInfo(class54);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo56 = null;
        // The following exception was thrown during execution in test generation
        try {
            fSTMapSerializer0.writeObject(fSTObjectOutput30, (java.lang.Object) fSTConfiguration31, fSTClazzInfo55, fSTFieldInfo56, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.nustaq.serialization.FSTConfiguration cannot be cast to java.util.Map");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver11);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(fSTConfiguration15);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry18);
        org.junit.Assert.assertNotNull(fSTConfiguration21);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput30);
        org.junit.Assert.assertNotNull(fSTConfiguration31);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(fSTConfiguration39);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry42);
        org.junit.Assert.assertNotNull(fSTConfiguration45);
        org.junit.Assert.assertNotNull(fSTConfiguration47);
        org.junit.Assert.assertNotNull(fSTConfiguration48);
        org.junit.Assert.assertNotNull(fSTConfiguration50);
        org.junit.Assert.assertNotNull(class54);
        org.junit.Assert.assertNotNull(fSTClazzInfo55);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        java.lang.ClassLoader classLoader7 = fSTConfiguration0.getClassLoader();
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier8 = fSTConfiguration0.getVerifier();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTConfiguration.StreamCoderFactory streamCoderFactory10 = fSTConfiguration0.getStreamCoderFactory();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration0.deriveConfiguration();
        fSTConfiguration0.setCrossPlatform(true);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNull(classSecurityVerifier8);
        org.junit.Assert.assertNotNull(streamCoderFactory10);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        int int7 = fSTStreamDecoder3.available();
        int int8 = fSTStreamDecoder3.getObjectHeaderLen();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration9.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder12 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration9);
        java.lang.Object obj13 = fSTStreamDecoder12.getDirectObject();
        boolean boolean14 = fSTStreamDecoder12.isMapBased();
        int int15 = fSTStreamDecoder12.getObjectHeaderLen();
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry16 = fSTStreamDecoder12.clnames;
        fSTStreamDecoder3.clnames = fSTClazzNameRegistry16;
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry16);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        java.lang.ClassLoader classLoader3 = null;
        fSTConfiguration0.setClassLoader(classLoader3);
        byte[] byteArray6 = new byte[] {};
        fSTConfiguration0.registerCrossPlatformClassBinaryCache("", byteArray6);
        org.nustaq.serialization.FSTConfiguration.prettyPrintJson((java.lang.Object) "");
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        fSTStreamDecoder3.readObjectEnd();
        fSTStreamDecoder3.close();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration6.setShareReferences(true);
        java.lang.ClassLoader classLoader9 = null;
        fSTConfiguration6.setClassLoader(classLoader9);
        byte[] byteArray12 = new byte[] {};
        fSTConfiguration6.registerCrossPlatformClassBinaryCache("", byteArray12);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier14 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration15 = fSTConfiguration6.setVerifier(classSecurityVerifier14);
        fSTStreamDecoder3.setConf(fSTConfiguration6);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder3.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(fSTConfiguration15);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        fSTConfiguration0.setPreferSpeed(true);
        java.lang.String str10 = fSTConfiguration0.toString();
        java.lang.String str11 = fSTConfiguration0.toString();
        java.lang.String str12 = fSTConfiguration0.toString();
        java.lang.Class<?> wildcardClass13 = fSTConfiguration0.getClass();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FSTConfiguration{name='null'}" + "'", str10, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FSTConfiguration{name='null'}" + "'", str11, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FSTConfiguration{name='null'}" + "'", str12, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        java.lang.ClassLoader classLoader3 = null;
        fSTConfiguration0.setClassLoader(classLoader3);
        byte[] byteArray6 = new byte[] {};
        fSTConfiguration0.registerCrossPlatformClassBinaryCache("", byteArray6);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier8 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration0.setVerifier(classSecurityVerifier8);
        byte[] byteArray11 = fSTConfiguration0.getCrossPlatformBinaryCache(" -1.0");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration12.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry15 = fSTConfiguration12.getClassRegistry();
        fSTConfiguration12.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration18 = fSTConfiguration12.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration19.setShareReferences(true);
        java.lang.ClassLoader classLoader22 = null;
        fSTConfiguration19.setClassLoader(classLoader22);
        byte[] byteArray25 = new byte[] {};
        fSTConfiguration19.registerCrossPlatformClassBinaryCache("", byteArray25);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput27 = fSTConfiguration18.getObjectOutput(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTObjectInput fSTObjectInput29 = fSTConfiguration0.getObjectInput(byteArray25, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry15);
        org.junit.Assert.assertNotNull(fSTConfiguration18);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput27);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration18 = fSTConfiguration16.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder19 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration16);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry20 = fSTStreamDecoder19.clnames;
        java.io.InputStream inputStream21 = null;
        fSTStreamDecoder19.setInputStream(inputStream21);
        int int23 = fSTStreamDecoder19.available();
        fSTStreamDecoder19.readExternalEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration25 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration25.setShareReferences(true);
        java.lang.ClassLoader classLoader28 = null;
        fSTConfiguration25.setClassLoader(classLoader28);
        byte[] byteArray31 = new byte[] {};
        fSTConfiguration25.registerCrossPlatformClassBinaryCache("", byteArray31);
        fSTStreamDecoder19.resetWith(byteArray31, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTObjectInput fSTObjectInput37 = fSTConfiguration6.getObjectInputCopyFrom(byteArray31, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: not supported");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTConfiguration18);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fSTConfiguration25);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer0 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration1 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration3 = fSTConfiguration1.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration1);
        java.lang.Class<?> wildcardClass5 = fSTConfiguration1.getClass();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration6.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry9 = fSTConfiguration6.getClassRegistry();
        org.nustaq.serialization.FSTObjectInput fSTObjectInput10 = fSTConfiguration6.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration11.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry14 = fSTConfiguration11.getClassRegistry();
        fSTConfiguration11.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration17 = fSTConfiguration11.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration18 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration18.setShareReferences(true);
        java.lang.ClassLoader classLoader21 = null;
        fSTConfiguration18.setClassLoader(classLoader21);
        byte[] byteArray24 = new byte[] {};
        fSTConfiguration18.registerCrossPlatformClassBinaryCache("", byteArray24);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput26 = fSTConfiguration17.getObjectOutput(byteArray24);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry27 = fSTConfiguration17.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder28 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration17);
        fSTStreamEncoder28.writeArrayEnd();
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer30 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean31 = fSTMapSerializer30.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration32 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration32.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry35 = fSTConfiguration32.getClassRegistry();
        fSTConfiguration32.setPreferSpeed(false);
        java.lang.Class class38 = null;
        java.lang.Object obj39 = fSTConfiguration32.getCachedObject(class38);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput40 = fSTConfiguration32.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration41 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration42 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration42.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry45 = fSTConfiguration42.getClassRegistry();
        fSTConfiguration42.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration48 = fSTConfiguration42.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration50 = fSTConfiguration42.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration51 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration53 = fSTConfiguration51.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder54 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration51);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder55 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration51);
        java.lang.Class class57 = fSTStreamDecoder55.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo58 = fSTConfiguration50.getClazzInfo(class57);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo59 = null;
        fSTMapSerializer30.readObject(fSTObjectInput40, (java.lang.Object) fSTConfiguration41, fSTClazzInfo58, fSTFieldInfo59);
        fSTStreamEncoder28.writeFieldsEnd(fSTClazzInfo58);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo62 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = fSTMapSerializer0.instantiate((java.lang.Class) wildcardClass5, fSTObjectInput10, fSTClazzInfo58, fSTFieldInfo62, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.InstantiationException; message: org.nustaq.serialization.FSTConfiguration");
        } catch (java.lang.InstantiationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration1);
        org.junit.Assert.assertNotNull(fSTConfiguration3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry9);
        org.junit.Assert.assertNotNull(fSTObjectInput10);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry14);
        org.junit.Assert.assertNotNull(fSTConfiguration17);
        org.junit.Assert.assertNotNull(fSTConfiguration18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput26);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration32);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(fSTObjectInput40);
        org.junit.Assert.assertNotNull(fSTConfiguration41);
        org.junit.Assert.assertNotNull(fSTConfiguration42);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry45);
        org.junit.Assert.assertNotNull(fSTConfiguration48);
        org.junit.Assert.assertNotNull(fSTConfiguration50);
        org.junit.Assert.assertNotNull(fSTConfiguration51);
        org.junit.Assert.assertNotNull(fSTConfiguration53);
        org.junit.Assert.assertNotNull(class57);
        org.junit.Assert.assertNotNull(fSTClazzInfo58);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        fSTStreamDecoder3.close();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration8.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry11 = fSTConfiguration8.getClassRegistry();
        fSTConfiguration8.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = fSTConfiguration8.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration15 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration15.setShareReferences(true);
        java.lang.ClassLoader classLoader18 = null;
        fSTConfiguration15.setClassLoader(classLoader18);
        byte[] byteArray21 = new byte[] {};
        fSTConfiguration15.registerCrossPlatformClassBinaryCache("", byteArray21);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput23 = fSTConfiguration14.getObjectOutput(byteArray21);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry24 = fSTConfiguration14.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder25 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration14);
        boolean boolean26 = fSTStreamEncoder25.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream27 = null;
        fSTStreamEncoder25.setOutstream(outputStream27);
        fSTStreamEncoder25.writeFShort((short) 10);
        fSTStreamEncoder25.writeVersionTag(32);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration33 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration33.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry36 = fSTConfiguration33.getClassRegistry();
        fSTConfiguration33.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration39 = fSTConfiguration33.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration40 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration40.setShareReferences(true);
        java.lang.ClassLoader classLoader43 = null;
        fSTConfiguration40.setClassLoader(classLoader43);
        byte[] byteArray46 = new byte[] {};
        fSTConfiguration40.registerCrossPlatformClassBinaryCache("", byteArray46);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput48 = fSTConfiguration39.getObjectOutput(byteArray46);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry49 = fSTConfiguration39.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder50 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration39);
        fSTStreamEncoder50.writeArrayEnd();
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer52 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean53 = fSTMapSerializer52.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration54 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration54.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry57 = fSTConfiguration54.getClassRegistry();
        fSTConfiguration54.setPreferSpeed(false);
        java.lang.Class class60 = null;
        java.lang.Object obj61 = fSTConfiguration54.getCachedObject(class60);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput62 = fSTConfiguration54.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration63 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration64 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration64.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry67 = fSTConfiguration64.getClassRegistry();
        fSTConfiguration64.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration70 = fSTConfiguration64.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration72 = fSTConfiguration64.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration73 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration75 = fSTConfiguration73.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder76 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration73);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder77 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration73);
        java.lang.Class class79 = fSTStreamDecoder77.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo80 = fSTConfiguration72.getClazzInfo(class79);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo81 = null;
        fSTMapSerializer52.readObject(fSTObjectInput62, (java.lang.Object) fSTConfiguration63, fSTClazzInfo80, fSTFieldInfo81);
        fSTStreamEncoder50.writeFieldsEnd(fSTClazzInfo80);
        fSTStreamEncoder25.writeFieldsEnd(fSTClazzInfo80);
        fSTStreamDecoder3.readArrayEnd(fSTClazzInfo80);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry11);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertNotNull(fSTConfiguration15);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput23);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration33);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry36);
        org.junit.Assert.assertNotNull(fSTConfiguration39);
        org.junit.Assert.assertNotNull(fSTConfiguration40);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput48);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration54);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry57);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(fSTObjectInput62);
        org.junit.Assert.assertNotNull(fSTConfiguration63);
        org.junit.Assert.assertNotNull(fSTConfiguration64);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry67);
        org.junit.Assert.assertNotNull(fSTConfiguration70);
        org.junit.Assert.assertNotNull(fSTConfiguration72);
        org.junit.Assert.assertNotNull(fSTConfiguration73);
        org.junit.Assert.assertNotNull(fSTConfiguration75);
        org.junit.Assert.assertNotNull(class79);
        org.junit.Assert.assertNotNull(fSTClazzInfo80);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry18 = fSTConfiguration6.getClassRegistry();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry18);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        int int7 = fSTStreamDecoder3.available();
        fSTStreamDecoder3.readExternalEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration9.setShareReferences(true);
        java.lang.ClassLoader classLoader12 = null;
        fSTConfiguration9.setClassLoader(classLoader12);
        byte[] byteArray15 = new byte[] {};
        fSTConfiguration9.registerCrossPlatformClassBinaryCache("", byteArray15);
        fSTStreamDecoder3.resetWith(byteArray15, 5);
        int int19 = fSTStreamDecoder3.getObjectHeaderLen();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver4 = fSTConfiguration0.getLastResortResolver();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver5 = fSTConfiguration0.getLastResortResolver();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = fSTConfiguration6.setForceClzInit(true);
        boolean boolean9 = fSTConfiguration6.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver10 = fSTConfiguration6.getLastResortResolver();
        java.lang.Class class12 = lastResortClassRessolver10.getClass("hi!");
        java.lang.Object obj13 = fSTConfiguration0.getCachedObject(class12);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer14 = fSTConfiguration0.getCoderSpecific();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast org.nustaq.serialization.FSTConfiguration$2 to org.nustaq.serialization.serializers.FSTMapSerializer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver4);
        org.junit.Assert.assertNotNull(lastResortClassRessolver5);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver10);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream19 = null;
        fSTStreamEncoder17.setOutstream(outputStream19);
        fSTStreamEncoder17.writeFShort((short) 10);
        int int23 = fSTStreamEncoder17.getWritten();
        fSTStreamEncoder17.ensureFree((int) (short) -1);
        fSTStreamEncoder17.writeFFloat(0.0f);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration19.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry25 = fSTConfiguration22.getClassRegistry();
        java.lang.ClassLoader classLoader26 = fSTConfiguration22.getClassLoader();
        fSTConfiguration19.setClassLoader(classLoader26);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier28 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = fSTConfiguration19.setVerifier(classSecurityVerifier28);
        fSTStreamEncoder17.setConf(fSTConfiguration29);
        fSTStreamEncoder17.writeArrayEnd();
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo32 = null;
        fSTStreamEncoder17.writeAttributeName(fSTFieldInfo32);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry25);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        java.io.Serializable serializable5 = fSTConfiguration0.deepCopy((java.io.Serializable) 10.0f);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration6.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry9 = fSTConfiguration6.getClassRegistry();
        fSTConfiguration6.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = fSTConfiguration6.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = fSTConfiguration6.setForceClzInit(false);
        int int15 = fSTConfiguration0.calcObjectSizeBytesNotAUtility((java.lang.Object) false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration16.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry19 = fSTConfiguration16.getClassRegistry();
        fSTConfiguration16.setPreferSpeed(false);
        fSTConfiguration0.setCoderSpecific((java.lang.Object) fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + 10.0d + "'", serializable5, 10.0d);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry9);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry19);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = fSTConfiguration0.setForceClzInit(false);
        java.lang.ClassLoader classLoader9 = fSTConfiguration8.getClassLoader();
        java.lang.String str11 = fSTConfiguration8.getClassForCPName("FSTConfiguration{name='null'}");
        java.io.OutputStream outputStream12 = null;
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput13 = fSTConfiguration8.getObjectOutput(outputStream12);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FSTConfiguration{name='null'}" + "'", str11, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTObjectOutput13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        int int8 = fSTStreamDecoder3.ensureReadAhead((int) (byte) 100);
        java.lang.String str9 = fSTStreamDecoder3.readStringAsc();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        fSTConfiguration0.setPreferSpeed(true);
        java.lang.String str10 = fSTConfiguration0.toString();
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier11 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = fSTConfiguration0.setVerifier(classSecurityVerifier11);
        byte[] byteArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTObjectInput fSTObjectInput15 = fSTConfiguration0.getObjectInput(byteArray13, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FSTConfiguration{name='null'}" + "'", str10, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration12);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        java.io.InputStream inputStream6 = null;
        fSTStreamDecoder3.setInputStream(inputStream6);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration8.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry11 = fSTConfiguration8.getClassRegistry();
        fSTConfiguration8.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = fSTConfiguration8.deriveConfiguration();
        java.lang.ClassLoader classLoader15 = fSTConfiguration8.getClassLoader();
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier16 = fSTConfiguration8.getVerifier();
        fSTStreamDecoder3.setConf(fSTConfiguration8);
        int int18 = fSTStreamDecoder3.readIntByte();
        char char19 = fSTStreamDecoder3.readFChar();
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo20 = fSTStreamDecoder3.readClass();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry11);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNull(classSecurityVerifier16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertNotNull(fSTClazzInfo20);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createStructConfiguration();
        boolean boolean1 = fSTConfiguration0.isCrossPlatform();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration2.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry5 = fSTConfiguration2.getClassRegistry();
        fSTConfiguration2.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = fSTConfiguration2.deriveConfiguration();
        java.lang.ClassLoader classLoader9 = fSTConfiguration2.getClassLoader();
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier10 = fSTConfiguration2.getVerifier();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder11 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration2);
        org.nustaq.serialization.FSTConfiguration.StreamCoderFactory streamCoderFactory12 = fSTConfiguration2.getStreamCoderFactory();
        java.lang.ThreadLocal threadLocal13 = streamCoderFactory12.getOutput();
        fSTConfiguration0.setStreamCoderFactory(streamCoderFactory12);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry5);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNull(classSecurityVerifier10);
        org.junit.Assert.assertNotNull(streamCoderFactory12);
        org.junit.Assert.assertNotNull(threadLocal13);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTDecoder fSTDecoder5 = fSTConfiguration0.createStreamDecoder();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTDecoder5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration17 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = fSTConfiguration17.setForceClzInit(true);
        boolean boolean20 = fSTConfiguration17.isPreferSpeed();
        java.io.Serializable serializable22 = fSTConfiguration17.deepCopy((java.io.Serializable) 10.0f);
        byte[] byteArray24 = fSTConfiguration17.getCrossPlatformBinaryCache("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration25 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration27 = fSTConfiguration25.setForceClzInit(true);
        boolean boolean28 = fSTConfiguration25.isPreferSpeed();
        java.lang.String str29 = fSTConfiguration25.getName();
        byte[] byteArray31 = fSTConfiguration25.asByteArray((java.lang.Object) ' ');
        java.lang.Object obj32 = fSTConfiguration17.asObject(byteArray31);
        java.io.InputStream inputStream33 = null;
        org.nustaq.serialization.FSTObjectInput fSTObjectInput34 = fSTConfiguration17.getObjectInput(inputStream33);
        fSTConfiguration6.returnObject((java.lang.Object) fSTObjectInput34);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertNotNull(fSTConfiguration17);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + serializable22 + "' != '" + 10.0d + "'", serializable22, 10.0d);
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertNotNull(fSTConfiguration25);
        org.junit.Assert.assertNotNull(fSTConfiguration27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[32, 51, 50]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 32 + "'", obj32, 32);
        org.junit.Assert.assertNotNull(fSTObjectInput34);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream19 = null;
        fSTStreamEncoder17.setOutstream(outputStream19);
        int[] intArray23 = new int[] { (byte) -1, 56319 };
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17._writeFIntArr(intArray23, 32, 57343);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 56319]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream19 = null;
        fSTStreamEncoder17.setOutstream(outputStream19);
        fSTStreamEncoder17.writeFShort((short) 10);
        int int23 = fSTStreamEncoder17.getWritten();
        fSTStreamEncoder17.ensureFree((int) (short) -1);
        int int26 = fSTStreamEncoder17.getWritten();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream19 = null;
        fSTStreamEncoder17.setOutstream(outputStream19);
        fSTStreamEncoder17.writeFShort((short) 10);
        int int23 = fSTStreamEncoder17.getWritten();
        fSTStreamEncoder17.ensureFree((int) (short) -1);
        fSTStreamEncoder17.writeFShort((short) 32);
        int int28 = fSTStreamEncoder17.getWritten();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration4 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration4.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry7 = fSTConfiguration4.getClassRegistry();
        fSTConfiguration4.setPreferSpeed(false);
        java.lang.Class class10 = null;
        java.lang.Object obj11 = fSTConfiguration4.getCachedObject(class10);
        fSTConfiguration4.setPreferSpeed(true);
        java.lang.String str14 = fSTConfiguration4.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration15 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration15.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry18 = fSTConfiguration15.getClassRegistry();
        fSTConfiguration15.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration21 = fSTConfiguration15.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration23 = fSTConfiguration15.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration24 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration26 = fSTConfiguration24.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder27 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration24);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder28 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration24);
        java.lang.Class class30 = fSTStreamDecoder28.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo31 = fSTConfiguration23.getClazzInfo(class30);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration32 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration34 = fSTConfiguration32.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder35 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration32);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder36 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration32);
        java.lang.Class class38 = fSTStreamDecoder36.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration39 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration39.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry42 = fSTConfiguration39.getClassRegistry();
        fSTConfiguration39.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration45 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration45.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry48 = fSTConfiguration45.getClassRegistry();
        java.lang.ClassLoader classLoader49 = fSTConfiguration45.getClassLoader();
        fSTConfiguration39.setClassLoader(classLoader49);
        java.lang.Class<?> wildcardClass51 = classLoader49.getClass();
        java.lang.Object obj53 = fSTStreamDecoder36.coerceElement((java.lang.Class) wildcardClass51, (java.lang.Object) 100.0d);
        java.lang.Class[] classArray54 = new java.lang.Class[] { class30, wildcardClass51 };
        org.nustaq.serialization.FSTConfiguration fSTConfiguration55 = fSTConfiguration4.registerCrossPlatformClassMappingUseSimpleName(classArray54);
        // The following exception was thrown during execution in test generation
        try {
            fSTConfiguration0.registerClass(classArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class sun.misc.Launcher$AppClassLoader does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration4);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FSTConfiguration{name='null'}" + "'", str14, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration15);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry18);
        org.junit.Assert.assertNotNull(fSTConfiguration21);
        org.junit.Assert.assertNotNull(fSTConfiguration23);
        org.junit.Assert.assertNotNull(fSTConfiguration24);
        org.junit.Assert.assertNotNull(fSTConfiguration26);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(fSTClazzInfo31);
        org.junit.Assert.assertNotNull(fSTConfiguration32);
        org.junit.Assert.assertNotNull(fSTConfiguration34);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(fSTConfiguration39);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry42);
        org.junit.Assert.assertNotNull(fSTConfiguration45);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry48);
        org.junit.Assert.assertNotNull(classLoader49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0d + "'", obj53, 100.0d);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(fSTConfiguration55);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry8 = fSTConfiguration0.getCLInfoRegistry();
        java.lang.String str9 = fSTConfiguration0.getName();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry8 = fSTConfiguration0.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier10 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration0.setVerifier(classSecurityVerifier10);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration12.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry15 = fSTConfiguration12.getClassRegistry();
        java.lang.String str16 = fSTConfiguration12.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration17 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration17.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry20 = fSTConfiguration17.getClassRegistry();
        fSTConfiguration12.setCoderSpecific((java.lang.Object) fSTClazzNameRegistry20);
        fSTConfiguration0.setCoderSpecific((java.lang.Object) fSTConfiguration12);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput23 = fSTConfiguration0.getObjectOutput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration24 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration24.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration27 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration27.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry30 = fSTConfiguration27.getClassRegistry();
        java.lang.ClassLoader classLoader31 = fSTConfiguration27.getClassLoader();
        fSTConfiguration24.setClassLoader(classLoader31);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput38 = fSTConfiguration24.getObjectOutput(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTObjectInput fSTObjectInput41 = fSTConfiguration0.getObjectInputCopyFrom(byteArray37, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: not supported");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry8);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FSTConfiguration{name='null'}" + "'", str16, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration17);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry20);
        org.junit.Assert.assertNotNull(fSTObjectOutput23);
        org.junit.Assert.assertNotNull(fSTConfiguration24);
        org.junit.Assert.assertNotNull(fSTConfiguration27);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry30);
        org.junit.Assert.assertNotNull(classLoader31);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 1, 0, 10]");
        org.junit.Assert.assertNotNull(fSTObjectOutput38);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createDefaultConfiguration();
        org.nustaq.serialization.FSTObjectInput fSTObjectInput1 = fSTConfiguration0.getObjectInput();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTObjectInput1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        java.lang.ClassLoader classLoader3 = null;
        fSTConfiguration0.setClassLoader(classLoader3);
        byte[] byteArray6 = new byte[] {};
        fSTConfiguration0.registerCrossPlatformClassBinaryCache("", byteArray6);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier8 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration0.setVerifier(classSecurityVerifier8);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier10 = fSTConfiguration0.getVerifier();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNull(classSecurityVerifier10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver3 = fSTConfiguration0.getLastResortResolver();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(lastResortClassRessolver3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        boolean boolean19 = fSTStreamEncoder17.isByteArrayBased();
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFLong((long) 774910240);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        int int7 = fSTStreamDecoder3.available();
        short short8 = fSTStreamDecoder3.readFShort();
        java.lang.Class class10 = fSTStreamDecoder3.classForName(" 0.0");
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 32 + "'", short8 == (short) 32);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = fSTStreamEncoder17.getConf();
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer20 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean21 = fSTMapSerializer20.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry25 = fSTConfiguration22.getClassRegistry();
        fSTConfiguration22.setPreferSpeed(false);
        java.lang.Class class28 = null;
        java.lang.Object obj29 = fSTConfiguration22.getCachedObject(class28);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput30 = fSTConfiguration22.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration31 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration32 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration32.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry35 = fSTConfiguration32.getClassRegistry();
        fSTConfiguration32.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration38 = fSTConfiguration32.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration40 = fSTConfiguration32.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration41 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration43 = fSTConfiguration41.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder44 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration41);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder45 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration41);
        java.lang.Class class47 = fSTStreamDecoder45.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo48 = fSTConfiguration40.getClazzInfo(class47);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo49 = null;
        fSTMapSerializer20.readObject(fSTObjectInput30, (java.lang.Object) fSTConfiguration31, fSTClazzInfo48, fSTFieldInfo49);
        fSTStreamEncoder17.externalEnd(fSTClazzInfo48);
        short[] shortArray54 = new short[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFShortArr(shortArray54, (int) '\000', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(fSTObjectInput30);
        org.junit.Assert.assertNotNull(fSTConfiguration31);
        org.junit.Assert.assertNotNull(fSTConfiguration32);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry35);
        org.junit.Assert.assertNotNull(fSTConfiguration38);
        org.junit.Assert.assertNotNull(fSTConfiguration40);
        org.junit.Assert.assertNotNull(fSTConfiguration41);
        org.junit.Assert.assertNotNull(fSTConfiguration43);
        org.junit.Assert.assertNotNull(class47);
        org.junit.Assert.assertNotNull(fSTClazzInfo48);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[10, -1]");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream19 = null;
        fSTStreamEncoder17.setOutstream(outputStream19);
        fSTStreamEncoder17.writeArrayEnd();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        java.lang.String str18 = fSTConfiguration6.asJsonString((java.lang.Object) (-1.0f));
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer19 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean20 = fSTMapSerializer19.alwaysCopy();
        org.nustaq.serialization.FSTObjectInput fSTObjectInput21 = null;
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo23 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo24 = null;
        fSTMapSerializer19.readObject(fSTObjectInput21, (java.lang.Object) (byte) 10, fSTClazzInfo23, fSTFieldInfo24);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration26 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration26.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry29 = fSTConfiguration26.getClassRegistry();
        fSTConfiguration26.setPreferSpeed(false);
        java.lang.Class class32 = null;
        java.lang.Object obj33 = fSTConfiguration26.getCachedObject(class32);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput34 = fSTConfiguration26.getObjectInput();
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo36 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo37 = null;
        fSTMapSerializer19.readObject(fSTObjectInput34, (java.lang.Object) (-1.0d), fSTClazzInfo36, fSTFieldInfo37);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration39 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration41 = fSTConfiguration39.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder42 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration39);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder43 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration39);
        java.lang.Class class45 = fSTStreamDecoder43.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration46 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration46.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry49 = fSTConfiguration46.getClassRegistry();
        fSTConfiguration46.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration52 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration52.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry55 = fSTConfiguration52.getClassRegistry();
        java.lang.ClassLoader classLoader56 = fSTConfiguration52.getClassLoader();
        fSTConfiguration46.setClassLoader(classLoader56);
        java.lang.Class<?> wildcardClass58 = classLoader56.getClass();
        java.lang.Object obj60 = fSTStreamDecoder43.coerceElement((java.lang.Class) wildcardClass58, (java.lang.Object) 100.0d);
        boolean boolean61 = fSTMapSerializer19.willHandleClass((java.lang.Class) wildcardClass58);
        org.nustaq.serialization.FSTClassInstantiator fSTClassInstantiator62 = fSTConfiguration6.getInstantiator((java.lang.Class) wildcardClass58);
        java.lang.String str63 = fSTConfiguration6.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration64 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration66 = fSTConfiguration64.setForceClzInit(true);
        boolean boolean67 = fSTConfiguration64.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver68 = fSTConfiguration64.getLastResortResolver();
        java.lang.Class class70 = lastResortClassRessolver68.getClass("");
        java.lang.Class class72 = lastResortClassRessolver68.getClass("");
        fSTConfiguration6.returnObject((java.lang.Object) lastResortClassRessolver68);
        boolean boolean74 = fSTConfiguration6.isPreferSpeed();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " -1.0" + "'", str18, " -1.0");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration26);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(fSTObjectInput34);
        org.junit.Assert.assertNotNull(fSTConfiguration39);
        org.junit.Assert.assertNotNull(fSTConfiguration41);
        org.junit.Assert.assertNotNull(class45);
        org.junit.Assert.assertNotNull(fSTConfiguration46);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry49);
        org.junit.Assert.assertNotNull(fSTConfiguration52);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry55);
        org.junit.Assert.assertNotNull(classLoader56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100.0d + "'", obj60, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(fSTClassInstantiator62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "FSTConfiguration{name='null'}" + "'", str63, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration64);
        org.junit.Assert.assertNotNull(fSTConfiguration66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver68);
        org.junit.Assert.assertNotNull(class70);
        org.junit.Assert.assertNotNull(class72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.getDefaultConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration1 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration3 = fSTConfiguration1.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration1);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry5 = fSTStreamDecoder4.clnames;
        java.io.InputStream inputStream6 = null;
        fSTStreamDecoder4.setInputStream(inputStream6);
        int int8 = fSTStreamDecoder4.available();
        fSTStreamDecoder4.readExternalEnd();
        boolean boolean10 = fSTStreamDecoder4.inArray();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = fSTConfiguration0.asByteArray((java.lang.Object) fSTStreamDecoder4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Class org.nustaq.serialization.coders.FSTStreamDecoder does not implement Serializable or externalizable");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration1);
        org.junit.Assert.assertNotNull(fSTConfiguration3);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry8 = fSTConfiguration0.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier10 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration0.setVerifier(classSecurityVerifier10);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration12.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry15 = fSTConfiguration12.getClassRegistry();
        java.lang.String str16 = fSTConfiguration12.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration17 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration17.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry20 = fSTConfiguration17.getClassRegistry();
        fSTConfiguration12.setCoderSpecific((java.lang.Object) fSTClazzNameRegistry20);
        fSTConfiguration0.setCoderSpecific((java.lang.Object) fSTConfiguration12);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput23 = fSTConfiguration0.getObjectOutput();
        boolean boolean24 = fSTConfiguration0.isForceSerializable();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry8);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FSTConfiguration{name='null'}" + "'", str16, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration17);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry20);
        org.junit.Assert.assertNotNull(fSTObjectOutput23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        fSTStreamDecoder3.readObjectEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        fSTConfiguration7.setPreferSpeed(false);
        java.lang.Class class13 = null;
        java.lang.Object obj14 = fSTConfiguration7.getCachedObject(class13);
        fSTConfiguration7.setStructMode(true);
        fSTStreamDecoder3.setConf(fSTConfiguration7);
        java.io.InputStream inputStream18 = null;
        fSTStreamDecoder3.setInputStream(inputStream18);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = fSTConfiguration20.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder23 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration20);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry24 = fSTStreamDecoder23.clnames;
        java.io.InputStream inputStream25 = null;
        fSTStreamDecoder23.setInputStream(inputStream25);
        int int27 = fSTStreamDecoder23.available();
        fSTStreamDecoder23.readExternalEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration29.setShareReferences(true);
        java.lang.ClassLoader classLoader32 = null;
        fSTConfiguration29.setClassLoader(classLoader32);
        byte[] byteArray35 = new byte[] {};
        fSTConfiguration29.registerCrossPlatformClassBinaryCache("", byteArray35);
        fSTStreamDecoder23.resetWith(byteArray35, 5);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamDecoder3.readPlainBytes(byteArray35, 1, 57343);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        java.io.InputStream inputStream6 = null;
        fSTStreamDecoder3.setInputStream(inputStream6);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration8.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry11 = fSTConfiguration8.getClassRegistry();
        fSTConfiguration8.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = fSTConfiguration8.deriveConfiguration();
        java.lang.ClassLoader classLoader15 = fSTConfiguration8.getClassLoader();
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier16 = fSTConfiguration8.getVerifier();
        fSTStreamDecoder3.setConf(fSTConfiguration8);
        int int18 = fSTStreamDecoder3.readIntByte();
        char char19 = fSTStreamDecoder3.readFChar();
        java.lang.Object obj20 = fSTStreamDecoder3.getDirectObject();
        fSTStreamDecoder3.consumeEndMarker();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry11);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNull(classSecurityVerifier16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\n' + "'", char19 == '\n');
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration19.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry25 = fSTConfiguration22.getClassRegistry();
        java.lang.ClassLoader classLoader26 = fSTConfiguration22.getClassLoader();
        fSTConfiguration19.setClassLoader(classLoader26);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier28 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = fSTConfiguration19.setVerifier(classSecurityVerifier28);
        fSTStreamEncoder17.setConf(fSTConfiguration29);
        java.io.OutputStream outputStream31 = null;
        fSTStreamEncoder17.setOutstream(outputStream31);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry25);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        fSTConfiguration0.setName(" 52");
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder7 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.io.OutputStream outputStream8 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration9.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder12 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration9);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry13 = fSTStreamDecoder12.clnames;
        boolean boolean14 = fSTStreamDecoder12.inArray();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration15 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration15.setShareReferences(true);
        java.lang.ClassLoader classLoader18 = null;
        fSTConfiguration15.setClassLoader(classLoader18);
        byte[] byteArray21 = new byte[] {};
        fSTConfiguration15.registerCrossPlatformClassBinaryCache("", byteArray21);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier23 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration24 = fSTConfiguration15.setVerifier(classSecurityVerifier23);
        fSTStreamDecoder12.setConf(fSTConfiguration15);
        java.lang.String str26 = fSTConfiguration15.toString();
        // The following exception was thrown during execution in test generation
        try {
            fSTConfiguration0.encodeToStream(outputStream8, (java.lang.Object) str26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration15);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(fSTConfiguration24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "FSTConfiguration{name='null'}" + "'", str26, "FSTConfiguration{name='null'}");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        fSTConfiguration0.setPreferSpeed(true);
        java.lang.String str10 = fSTConfiguration0.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration11.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry14 = fSTConfiguration11.getClassRegistry();
        fSTConfiguration11.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration17 = fSTConfiguration11.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = fSTConfiguration11.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = fSTConfiguration20.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder23 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration20);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder24 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration20);
        java.lang.Class class26 = fSTStreamDecoder24.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo27 = fSTConfiguration19.getClazzInfo(class26);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration28 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration30 = fSTConfiguration28.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder31 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration28);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder32 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration28);
        java.lang.Class class34 = fSTStreamDecoder32.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration35 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration35.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry38 = fSTConfiguration35.getClassRegistry();
        fSTConfiguration35.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration41 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration41.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry44 = fSTConfiguration41.getClassRegistry();
        java.lang.ClassLoader classLoader45 = fSTConfiguration41.getClassLoader();
        fSTConfiguration35.setClassLoader(classLoader45);
        java.lang.Class<?> wildcardClass47 = classLoader45.getClass();
        java.lang.Object obj49 = fSTStreamDecoder32.coerceElement((java.lang.Class) wildcardClass47, (java.lang.Object) 100.0d);
        java.lang.Class[] classArray50 = new java.lang.Class[] { class26, wildcardClass47 };
        org.nustaq.serialization.FSTConfiguration fSTConfiguration51 = fSTConfiguration0.registerCrossPlatformClassMappingUseSimpleName(classArray50);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration53 = fSTConfiguration51.setForceSerializable(true);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FSTConfiguration{name='null'}" + "'", str10, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry14);
        org.junit.Assert.assertNotNull(fSTConfiguration17);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(fSTClazzInfo27);
        org.junit.Assert.assertNotNull(fSTConfiguration28);
        org.junit.Assert.assertNotNull(fSTConfiguration30);
        org.junit.Assert.assertNotNull(class34);
        org.junit.Assert.assertNotNull(fSTConfiguration35);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry38);
        org.junit.Assert.assertNotNull(fSTConfiguration41);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry44);
        org.junit.Assert.assertNotNull(classLoader45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0d + "'", obj49, 100.0d);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(fSTConfiguration51);
        org.junit.Assert.assertNotNull(fSTConfiguration53);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream19 = null;
        fSTStreamEncoder17.setOutstream(outputStream19);
        fSTStreamEncoder17.writeFShort((short) 10);
        int int23 = fSTStreamEncoder17.getWritten();
        java.io.OutputStream outputStream24 = null;
        fSTStreamEncoder17.setOutstream(outputStream24);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        java.io.InputStream inputStream6 = null;
        fSTStreamDecoder3.setInputStream(inputStream6);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration8.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry11 = fSTConfiguration8.getClassRegistry();
        fSTConfiguration8.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = fSTConfiguration8.deriveConfiguration();
        java.lang.ClassLoader classLoader15 = fSTConfiguration8.getClassLoader();
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier16 = fSTConfiguration8.getVerifier();
        fSTStreamDecoder3.setConf(fSTConfiguration8);
        java.lang.Class class19 = fSTStreamDecoder3.classForName(" -1.0");
        byte byte20 = fSTStreamDecoder3.readFByte();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry11);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNull(classSecurityVerifier16);
        org.junit.Assert.assertNotNull(class19);
// flaky:         org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 10 + "'", byte20 == (byte) 10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        java.io.Serializable serializable5 = fSTConfiguration0.deepCopy((java.io.Serializable) 10.0f);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = fSTConfiguration7.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder10 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration7);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder11 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration7);
        java.lang.Class class13 = fSTStreamDecoder11.classForName("hi!");
        java.lang.Class class15 = fSTStreamDecoder11.classForName(" 0.0");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = fSTConfiguration0.cpMap("hi!", class15);
        fSTConfiguration16.setCoderSpecific((java.lang.Object) 55296);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput19 = fSTConfiguration16.getObjectInput();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + "FSTConfiguration{name='null'}" + "'", serializable5, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTObjectInput19);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFLong((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver4 = fSTConfiguration0.getLastResortResolver();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver5 = fSTConfiguration0.getLastResortResolver();
        org.nustaq.serialization.FSTConfiguration.StreamCoderFactory streamCoderFactory6 = null;
        fSTConfiguration0.setStreamCoderFactory(streamCoderFactory6);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration8.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry11 = fSTConfiguration8.getClassRegistry();
        fSTConfiguration8.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = fSTConfiguration8.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration15 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration15.setShareReferences(true);
        java.lang.ClassLoader classLoader18 = null;
        fSTConfiguration15.setClassLoader(classLoader18);
        byte[] byteArray21 = new byte[] {};
        fSTConfiguration15.registerCrossPlatformClassBinaryCache("", byteArray21);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput23 = fSTConfiguration14.getObjectOutput(byteArray21);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry24 = fSTConfiguration14.getCLInfoRegistry();
        byte[] byteArray26 = new byte[] { (byte) 10 };
        org.nustaq.serialization.FSTObjectInput fSTObjectInput27 = fSTConfiguration14.getObjectInput(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = fSTConfiguration0.asObject(byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver4);
        org.junit.Assert.assertNotNull(lastResortClassRessolver5);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry11);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertNotNull(fSTConfiguration15);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput23);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10]");
        org.junit.Assert.assertNotNull(fSTObjectInput27);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder4 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class class6 = fSTStreamDecoder4.classForName("hi!");
        boolean boolean8 = fSTStreamDecoder4.isEndMarker(" 0.0");
        boolean boolean9 = fSTStreamDecoder4.inArray();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration19.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry25 = fSTConfiguration22.getClassRegistry();
        java.lang.ClassLoader classLoader26 = fSTConfiguration22.getClassLoader();
        fSTConfiguration19.setClassLoader(classLoader26);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier28 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = fSTConfiguration19.setVerifier(classSecurityVerifier28);
        fSTStreamEncoder17.setConf(fSTConfiguration29);
        fSTStreamEncoder17.writeArrayEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration32 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration34 = fSTConfiguration32.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder35 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration32);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder36 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration32);
        java.lang.Class class38 = fSTStreamDecoder36.classForName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeClass(class38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry25);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(fSTConfiguration32);
        org.junit.Assert.assertNotNull(fSTConfiguration34);
        org.junit.Assert.assertNotNull(class38);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = fSTStreamEncoder17.getConf();
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer20 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean21 = fSTMapSerializer20.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry25 = fSTConfiguration22.getClassRegistry();
        fSTConfiguration22.setPreferSpeed(false);
        java.lang.Class class28 = null;
        java.lang.Object obj29 = fSTConfiguration22.getCachedObject(class28);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput30 = fSTConfiguration22.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration31 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration32 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration32.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry35 = fSTConfiguration32.getClassRegistry();
        fSTConfiguration32.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration38 = fSTConfiguration32.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration40 = fSTConfiguration32.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration41 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration43 = fSTConfiguration41.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder44 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration41);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder45 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration41);
        java.lang.Class class47 = fSTStreamDecoder45.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo48 = fSTConfiguration40.getClazzInfo(class47);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo49 = null;
        fSTMapSerializer20.readObject(fSTObjectInput30, (java.lang.Object) fSTConfiguration31, fSTClazzInfo48, fSTFieldInfo49);
        fSTStreamEncoder17.externalEnd(fSTClazzInfo48);
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFShort((short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(fSTObjectInput30);
        org.junit.Assert.assertNotNull(fSTConfiguration31);
        org.junit.Assert.assertNotNull(fSTConfiguration32);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry35);
        org.junit.Assert.assertNotNull(fSTConfiguration38);
        org.junit.Assert.assertNotNull(fSTConfiguration40);
        org.junit.Assert.assertNotNull(fSTConfiguration41);
        org.junit.Assert.assertNotNull(fSTConfiguration43);
        org.junit.Assert.assertNotNull(class47);
        org.junit.Assert.assertNotNull(fSTClazzInfo48);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration3 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration3.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry6 = fSTConfiguration3.getClassRegistry();
        java.lang.ClassLoader classLoader7 = fSTConfiguration3.getClassLoader();
        fSTConfiguration0.setClassLoader(classLoader7);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration0.registerCrossPlatformClassMapping("hi!", " 0.0");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = fSTConfiguration12.setForceClzInit(true);
        boolean boolean15 = fSTConfiguration12.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver16 = fSTConfiguration12.getLastResortResolver();
        java.lang.Class class18 = lastResortClassRessolver16.getClass("");
        java.lang.Class class20 = lastResortClassRessolver16.getClass("");
        fSTConfiguration0.setLastResortResolver(lastResortClassRessolver16);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration3);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry6);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver16);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(class20);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        java.io.InputStream inputStream6 = null;
        fSTStreamDecoder3.setInputStream(inputStream6);
        int int8 = fSTStreamDecoder3.getObjectHeaderLen();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream19 = null;
        fSTStreamEncoder17.setOutstream(outputStream19);
        fSTStreamEncoder17.writeFShort((short) 10);
        fSTStreamEncoder17.writeVersionTag(32);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration25 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration25.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry28 = fSTConfiguration25.getClassRegistry();
        fSTConfiguration25.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration31 = fSTConfiguration25.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration32 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration32.setShareReferences(true);
        java.lang.ClassLoader classLoader35 = null;
        fSTConfiguration32.setClassLoader(classLoader35);
        byte[] byteArray38 = new byte[] {};
        fSTConfiguration32.registerCrossPlatformClassBinaryCache("", byteArray38);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput40 = fSTConfiguration31.getObjectOutput(byteArray38);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry41 = fSTConfiguration31.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder42 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration31);
        fSTStreamEncoder42.writeArrayEnd();
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer44 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean45 = fSTMapSerializer44.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration46 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration46.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry49 = fSTConfiguration46.getClassRegistry();
        fSTConfiguration46.setPreferSpeed(false);
        java.lang.Class class52 = null;
        java.lang.Object obj53 = fSTConfiguration46.getCachedObject(class52);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput54 = fSTConfiguration46.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration55 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration56 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration56.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry59 = fSTConfiguration56.getClassRegistry();
        fSTConfiguration56.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration62 = fSTConfiguration56.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration64 = fSTConfiguration56.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration65 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration67 = fSTConfiguration65.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder68 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration65);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder69 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration65);
        java.lang.Class class71 = fSTStreamDecoder69.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo72 = fSTConfiguration64.getClazzInfo(class71);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo73 = null;
        fSTMapSerializer44.readObject(fSTObjectInput54, (java.lang.Object) fSTConfiguration55, fSTClazzInfo72, fSTFieldInfo73);
        fSTStreamEncoder42.writeFieldsEnd(fSTClazzInfo72);
        fSTStreamEncoder17.writeFieldsEnd(fSTClazzInfo72);
        short[] shortArray79 = new short[] { (byte) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFShortArr(shortArray79, (int) (short) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration25);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry28);
        org.junit.Assert.assertNotNull(fSTConfiguration31);
        org.junit.Assert.assertNotNull(fSTConfiguration32);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput40);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration46);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(fSTObjectInput54);
        org.junit.Assert.assertNotNull(fSTConfiguration55);
        org.junit.Assert.assertNotNull(fSTConfiguration56);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry59);
        org.junit.Assert.assertNotNull(fSTConfiguration62);
        org.junit.Assert.assertNotNull(fSTConfiguration64);
        org.junit.Assert.assertNotNull(fSTConfiguration65);
        org.junit.Assert.assertNotNull(fSTConfiguration67);
        org.junit.Assert.assertNotNull(class71);
        org.junit.Assert.assertNotNull(fSTClazzInfo72);
        org.junit.Assert.assertNotNull(shortArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray79), "[-1, 10]");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        int int7 = fSTStreamDecoder3.available();
        fSTStreamDecoder3.readExternalEnd();
        fSTStreamDecoder3.startFieldReading((java.lang.Object) 10.0f);
        byte byte11 = fSTStreamDecoder3.readFByte();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        boolean boolean7 = fSTConfiguration0.isForceClzInit();
        org.nustaq.serialization.FSTDecoder fSTDecoder8 = fSTConfiguration0.createStreamDecoder();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration9.setShareReferences(true);
        java.lang.ClassLoader classLoader12 = null;
        fSTConfiguration9.setClassLoader(classLoader12);
        byte[] byteArray15 = new byte[] {};
        fSTConfiguration9.registerCrossPlatformClassBinaryCache("", byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTObjectInput fSTObjectInput19 = fSTConfiguration0.getObjectInputCopyFrom(byteArray15, (int) (short) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: not supported");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fSTDecoder8);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.nustaq.serialization.serializers.FSTCPEnumSetSerializer fSTCPEnumSetSerializer0 = new org.nustaq.serialization.serializers.FSTCPEnumSetSerializer();
        boolean boolean1 = fSTCPEnumSetSerializer0.alwaysCopy();
        boolean boolean2 = fSTCPEnumSetSerializer0.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration3 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration3.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry6 = fSTConfiguration3.getClassRegistry();
        java.io.OutputStream outputStream7 = null;
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput8 = fSTConfiguration3.getObjectOutput(outputStream7);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration9.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry12 = fSTConfiguration9.getClassRegistry();
        java.lang.ClassLoader classLoader13 = fSTConfiguration9.getClassLoader();
        org.nustaq.serialization.FSTClassInstantiator fSTClassInstantiator14 = null;
        fSTConfiguration9.setInstantiator(fSTClassInstantiator14);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration16.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry19 = fSTConfiguration16.getClassRegistry();
        fSTConfiguration16.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = fSTConfiguration16.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration23 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration23.setShareReferences(true);
        java.lang.ClassLoader classLoader26 = null;
        fSTConfiguration23.setClassLoader(classLoader26);
        byte[] byteArray29 = new byte[] {};
        fSTConfiguration23.registerCrossPlatformClassBinaryCache("", byteArray29);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput31 = fSTConfiguration22.getObjectOutput(byteArray29);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry32 = fSTConfiguration22.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder33 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration22);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo34 = null;
        fSTStreamEncoder33.writeAttributeName(fSTFieldInfo34);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration36 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration36.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry39 = fSTConfiguration36.getClassRegistry();
        fSTConfiguration36.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration42 = fSTConfiguration36.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration43 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration43.setShareReferences(true);
        java.lang.ClassLoader classLoader46 = null;
        fSTConfiguration43.setClassLoader(classLoader46);
        byte[] byteArray49 = new byte[] {};
        fSTConfiguration43.registerCrossPlatformClassBinaryCache("", byteArray49);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput51 = fSTConfiguration42.getObjectOutput(byteArray49);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry52 = fSTConfiguration42.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder53 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration42);
        fSTStreamEncoder53.writeArrayEnd();
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer55 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean56 = fSTMapSerializer55.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration57 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration57.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry60 = fSTConfiguration57.getClassRegistry();
        fSTConfiguration57.setPreferSpeed(false);
        java.lang.Class class63 = null;
        java.lang.Object obj64 = fSTConfiguration57.getCachedObject(class63);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput65 = fSTConfiguration57.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration66 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration67 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration67.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry70 = fSTConfiguration67.getClassRegistry();
        fSTConfiguration67.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration73 = fSTConfiguration67.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration75 = fSTConfiguration67.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration76 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration78 = fSTConfiguration76.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder79 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration76);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder80 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration76);
        java.lang.Class class82 = fSTStreamDecoder80.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo83 = fSTConfiguration75.getClazzInfo(class82);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo84 = null;
        fSTMapSerializer55.readObject(fSTObjectInput65, (java.lang.Object) fSTConfiguration66, fSTClazzInfo83, fSTFieldInfo84);
        fSTStreamEncoder53.writeFieldsEnd(fSTClazzInfo83);
        fSTStreamEncoder33.externalEnd(fSTClazzInfo83);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo88 = null;
        // The following exception was thrown during execution in test generation
        try {
            fSTCPEnumSetSerializer0.writeObject(fSTObjectOutput8, (java.lang.Object) fSTClassInstantiator14, fSTClazzInfo83, fSTFieldInfo88, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration3);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry6);
        org.junit.Assert.assertNotNull(fSTObjectOutput8);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry12);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry19);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTConfiguration23);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput31);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry32);
        org.junit.Assert.assertNotNull(fSTConfiguration36);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry39);
        org.junit.Assert.assertNotNull(fSTConfiguration42);
        org.junit.Assert.assertNotNull(fSTConfiguration43);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput51);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration57);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(fSTObjectInput65);
        org.junit.Assert.assertNotNull(fSTConfiguration66);
        org.junit.Assert.assertNotNull(fSTConfiguration67);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry70);
        org.junit.Assert.assertNotNull(fSTConfiguration73);
        org.junit.Assert.assertNotNull(fSTConfiguration75);
        org.junit.Assert.assertNotNull(fSTConfiguration76);
        org.junit.Assert.assertNotNull(fSTConfiguration78);
        org.junit.Assert.assertNotNull(class82);
        org.junit.Assert.assertNotNull(fSTClazzInfo83);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround jacksonAccessWorkaround4 = new org.nustaq.serialization.FSTConfiguration.JacksonAccessWorkaround(iOContext0, 1, objectCodec2, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver3 = fSTConfiguration0.getLastResortResolver();
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTConfiguration0.getClassRegistry();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(lastResortClassRessolver3);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration3 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration3.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry6 = fSTConfiguration3.getClassRegistry();
        java.lang.ClassLoader classLoader7 = fSTConfiguration3.getClassLoader();
        fSTConfiguration0.setClassLoader(classLoader7);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration11 = fSTConfiguration0.registerCrossPlatformClassMapping("hi!", " 0.0");
        java.lang.String str13 = fSTConfiguration0.asJsonString((java.lang.Object) '4');
        org.nustaq.serialization.FSTConfiguration fSTConfiguration15 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration15.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry18 = fSTConfiguration15.getClassRegistry();
        fSTConfiguration15.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration21 = fSTConfiguration15.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        java.lang.ClassLoader classLoader25 = null;
        fSTConfiguration22.setClassLoader(classLoader25);
        byte[] byteArray28 = new byte[] {};
        fSTConfiguration22.registerCrossPlatformClassBinaryCache("", byteArray28);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput30 = fSTConfiguration21.getObjectOutput(byteArray28);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry31 = fSTConfiguration21.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder32 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration21);
        boolean boolean33 = fSTStreamEncoder32.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream34 = null;
        fSTStreamEncoder32.setOutstream(outputStream34);
        fSTStreamEncoder32.writeFShort((short) 10);
        fSTStreamEncoder32.writeVersionTag(32);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration40 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration40.setShareReferences(true);
        java.lang.ClassLoader classLoader43 = null;
        fSTConfiguration40.setClassLoader(classLoader43);
        byte[] byteArray46 = new byte[] {};
        fSTConfiguration40.registerCrossPlatformClassBinaryCache("", byteArray46);
        fSTStreamEncoder32.setConf(fSTConfiguration40);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration49 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration49.setShareReferences(true);
        java.lang.ClassLoader classLoader52 = null;
        fSTConfiguration49.setClassLoader(classLoader52);
        byte[] byteArray55 = new byte[] {};
        fSTConfiguration49.registerCrossPlatformClassBinaryCache("", byteArray55);
        org.nustaq.serialization.FSTConfiguration.prettyPrintJson((java.lang.Object) byteArray55);
        fSTStreamEncoder32.reset(byteArray55);
        fSTConfiguration0.registerCrossPlatformClassBinaryCache(" -1.0", byteArray55);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration3);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry6);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(fSTConfiguration11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " 52" + "'", str13, " 52");
        org.junit.Assert.assertNotNull(fSTConfiguration15);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry18);
        org.junit.Assert.assertNotNull(fSTConfiguration21);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput30);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration40);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(fSTConfiguration49);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        java.io.Serializable serializable5 = fSTConfiguration0.deepCopy((java.io.Serializable) 10.0f);
        byte[] byteArray7 = fSTConfiguration0.getCrossPlatformBinaryCache("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = fSTConfiguration8.setForceClzInit(true);
        boolean boolean11 = fSTConfiguration8.isPreferSpeed();
        java.lang.String str12 = fSTConfiguration8.getName();
        byte[] byteArray14 = fSTConfiguration8.asByteArray((java.lang.Object) ' ');
        java.lang.Object obj15 = fSTConfiguration0.asObject(byteArray14);
        java.io.InputStream inputStream16 = null;
        org.nustaq.serialization.FSTObjectInput fSTObjectInput17 = fSTConfiguration0.getObjectInput(inputStream16);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration18 = fSTConfiguration0.deriveConfiguration();
        byte[] byteArray20 = fSTConfiguration18.getCrossPlatformBinaryCache("REALLY_NULL");
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + 10.0d + "'", serializable5, 10.0d);
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[32, 51, 50]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 32 + "'", obj15, 32);
        org.junit.Assert.assertNotNull(fSTObjectInput17);
        org.junit.Assert.assertNotNull(fSTConfiguration18);
        org.junit.Assert.assertNull(byteArray20);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createUnsafeBinaryConfiguration();
        fSTConfiguration0.setShareReferences(false);
        fSTConfiguration0.setPreferSpeed(true);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
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
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration18 = fSTConfiguration16.setForceClzInit(true);
        boolean boolean19 = fSTConfiguration16.isPreferSpeed();
        fSTConfiguration16.clearCaches();
        org.nustaq.serialization.FSTEncoder fSTEncoder21 = fSTConfiguration16.createStreamEncoder();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = fSTConfiguration16.deriveConfiguration();
        fSTStreamDecoder3.startFieldReading((java.lang.Object) fSTConfiguration16);
        java.lang.Class class25 = fSTStreamDecoder3.classForName("");
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + serializable12 + "' != '" + 10.0d + "'", serializable12, 10.0d);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTConfiguration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fSTEncoder21);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(class25);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.nustaq.serialization.serializers.FSTCollectionSerializer fSTCollectionSerializer0 = new org.nustaq.serialization.serializers.FSTCollectionSerializer();
        boolean boolean1 = fSTCollectionSerializer0.writeTupleEnd();
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer2 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean3 = fSTMapSerializer2.alwaysCopy();
        org.nustaq.serialization.FSTObjectInput fSTObjectInput4 = null;
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo6 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo7 = null;
        fSTMapSerializer2.readObject(fSTObjectInput4, (java.lang.Object) (byte) 10, fSTClazzInfo6, fSTFieldInfo7);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration9 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration9.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry12 = fSTConfiguration9.getClassRegistry();
        fSTConfiguration9.setPreferSpeed(false);
        java.lang.Class class15 = null;
        java.lang.Object obj16 = fSTConfiguration9.getCachedObject(class15);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput17 = fSTConfiguration9.getObjectInput();
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo19 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo20 = null;
        fSTMapSerializer2.readObject(fSTObjectInput17, (java.lang.Object) (-1.0d), fSTClazzInfo19, fSTFieldInfo20);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration24 = fSTConfiguration22.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder25 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration22);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder26 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration22);
        java.lang.Class class28 = fSTStreamDecoder26.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration29.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry32 = fSTConfiguration29.getClassRegistry();
        fSTConfiguration29.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration35 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration35.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry38 = fSTConfiguration35.getClassRegistry();
        java.lang.ClassLoader classLoader39 = fSTConfiguration35.getClassLoader();
        fSTConfiguration29.setClassLoader(classLoader39);
        java.lang.Class<?> wildcardClass41 = classLoader39.getClass();
        java.lang.Object obj43 = fSTStreamDecoder26.coerceElement((java.lang.Class) wildcardClass41, (java.lang.Object) 100.0d);
        boolean boolean44 = fSTMapSerializer2.willHandleClass((java.lang.Class) wildcardClass41);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration45 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration45.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry48 = fSTConfiguration45.getClassRegistry();
        fSTConfiguration45.setPreferSpeed(false);
        java.lang.Class class51 = null;
        java.lang.Object obj52 = fSTConfiguration45.getCachedObject(class51);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput53 = fSTConfiguration45.getObjectInput();
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer54 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean55 = fSTMapSerializer54.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration56 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration56.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry59 = fSTConfiguration56.getClassRegistry();
        fSTConfiguration56.setPreferSpeed(false);
        java.lang.Class class62 = null;
        java.lang.Object obj63 = fSTConfiguration56.getCachedObject(class62);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput64 = fSTConfiguration56.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration65 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration66 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration66.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry69 = fSTConfiguration66.getClassRegistry();
        fSTConfiguration66.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration72 = fSTConfiguration66.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration74 = fSTConfiguration66.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration75 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration77 = fSTConfiguration75.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder78 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration75);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder79 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration75);
        java.lang.Class class81 = fSTStreamDecoder79.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo82 = fSTConfiguration74.getClazzInfo(class81);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo83 = null;
        fSTMapSerializer54.readObject(fSTObjectInput64, (java.lang.Object) fSTConfiguration65, fSTClazzInfo82, fSTFieldInfo83);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo85 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj87 = fSTCollectionSerializer0.instantiate((java.lang.Class) wildcardClass41, fSTObjectInput53, fSTClazzInfo82, fSTFieldInfo85, 57343);
            org.junit.Assert.fail("Expected exception of type java.lang.InstantiationException; message: sun.misc.Launcher$AppClassLoader");
        } catch (java.lang.InstantiationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration9);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(fSTObjectInput17);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTConfiguration24);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry32);
        org.junit.Assert.assertNotNull(fSTConfiguration35);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry38);
        org.junit.Assert.assertNotNull(classLoader39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fSTConfiguration45);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(fSTObjectInput53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration56);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry59);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(fSTObjectInput64);
        org.junit.Assert.assertNotNull(fSTConfiguration65);
        org.junit.Assert.assertNotNull(fSTConfiguration66);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry69);
        org.junit.Assert.assertNotNull(fSTConfiguration72);
        org.junit.Assert.assertNotNull(fSTConfiguration74);
        org.junit.Assert.assertNotNull(fSTConfiguration75);
        org.junit.Assert.assertNotNull(fSTConfiguration77);
        org.junit.Assert.assertNotNull(class81);
        org.junit.Assert.assertNotNull(fSTClazzInfo82);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration19 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration19.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration22.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry25 = fSTConfiguration22.getClassRegistry();
        java.lang.ClassLoader classLoader26 = fSTConfiguration22.getClassLoader();
        fSTConfiguration19.setClassLoader(classLoader26);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier28 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = fSTConfiguration19.setVerifier(classSecurityVerifier28);
        fSTStreamEncoder17.setConf(fSTConfiguration29);
        fSTStreamEncoder17.writeArrayEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration32 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration34 = fSTConfiguration32.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder35 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration32);
        java.lang.Object obj36 = fSTStreamDecoder35.getDirectObject();
        fSTStreamDecoder35.consumeEndMarker();
        java.lang.Class class39 = fSTStreamDecoder35.classForName("hi!");
        fSTStreamEncoder17.registerClass(class39);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration41 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration43 = fSTConfiguration41.setForceClzInit(true);
        boolean boolean44 = fSTConfiguration41.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver45 = fSTConfiguration41.getLastResortResolver();
        java.lang.Class class47 = lastResortClassRessolver45.getClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeClass(class47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration19);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry25);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(fSTConfiguration32);
        org.junit.Assert.assertNotNull(fSTConfiguration34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(class39);
        org.junit.Assert.assertNotNull(fSTConfiguration41);
        org.junit.Assert.assertNotNull(fSTConfiguration43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver45);
        org.junit.Assert.assertNotNull(class47);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        java.lang.ClassLoader classLoader7 = fSTConfiguration0.getClassLoader();
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier8 = fSTConfiguration0.getVerifier();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = fSTConfiguration10.setForceClzInit(true);
        boolean boolean13 = fSTConfiguration10.isPreferSpeed();
        fSTConfiguration10.setPreferSpeed(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration18 = fSTConfiguration16.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder19 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration16);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder20 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration16);
        java.lang.Class class22 = fSTStreamDecoder20.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration23 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration23.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry26 = fSTConfiguration23.getClassRegistry();
        fSTConfiguration23.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration29.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry32 = fSTConfiguration29.getClassRegistry();
        java.lang.ClassLoader classLoader33 = fSTConfiguration29.getClassLoader();
        fSTConfiguration23.setClassLoader(classLoader33);
        java.lang.Class<?> wildcardClass35 = classLoader33.getClass();
        java.lang.Object obj37 = fSTStreamDecoder20.coerceElement((java.lang.Class) wildcardClass35, (java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = fSTStreamDecoder9.readFPrimitiveArray((java.lang.Object) true, (java.lang.Class) wildcardClass35, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: unexpected primitive type sun.misc.Launcher$AppClassLoader");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNull(classSecurityVerifier8);
        org.junit.Assert.assertNotNull(fSTConfiguration10);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTConfiguration18);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertNotNull(fSTConfiguration23);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry26);
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry32);
        org.junit.Assert.assertNotNull(classLoader33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = fSTConfiguration0.setForceClzInit(false);
        boolean boolean9 = fSTConfiguration8.isForceSerializable();
        boolean boolean10 = fSTConfiguration8.isCrossPlatform();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration12 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration12.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry15 = fSTConfiguration12.getClassRegistry();
        fSTConfiguration12.setPreferSpeed(false);
        java.lang.Class class18 = null;
        java.lang.Object obj19 = fSTConfiguration12.getCachedObject(class18);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry20 = fSTConfiguration12.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder21 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration12);
        org.nustaq.serialization.FSTConfiguration.ClassSecurityVerifier classSecurityVerifier22 = null;
        org.nustaq.serialization.FSTConfiguration fSTConfiguration23 = fSTConfiguration12.setVerifier(classSecurityVerifier22);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration24 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration24.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry27 = fSTConfiguration24.getClassRegistry();
        java.lang.String str28 = fSTConfiguration24.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration29 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration29.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry32 = fSTConfiguration29.getClassRegistry();
        fSTConfiguration24.setCoderSpecific((java.lang.Object) fSTClazzNameRegistry32);
        fSTConfiguration12.setCoderSpecific((java.lang.Object) fSTConfiguration24);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration36 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration36.setShareReferences(true);
        java.lang.ClassLoader classLoader39 = null;
        fSTConfiguration36.setClassLoader(classLoader39);
        byte[] byteArray42 = new byte[] {};
        fSTConfiguration36.registerCrossPlatformClassBinaryCache("", byteArray42);
        org.nustaq.serialization.FSTConfiguration.prettyPrintJson((java.lang.Object) byteArray42);
        fSTConfiguration24.registerCrossPlatformClassBinaryCache(" 52", byteArray42);
        fSTConfiguration8.registerCrossPlatformClassBinaryCache("FSTConfiguration{name='null'}", byteArray42);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(fSTConfiguration12);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry20);
        org.junit.Assert.assertNotNull(fSTConfiguration23);
        org.junit.Assert.assertNotNull(fSTConfiguration24);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "FSTConfiguration{name='null'}" + "'", str28, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration29);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry32);
        org.junit.Assert.assertNotNull(fSTConfiguration36);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration10.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry13 = fSTConfiguration10.getClassRegistry();
        java.lang.ClassLoader classLoader14 = fSTConfiguration10.getClassLoader();
        fSTConfiguration7.setClassLoader(classLoader14);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput21 = fSTConfiguration7.getObjectOutput(byteArray20);
        fSTStreamDecoder3.resetWith(byteArray20, (int) (short) -1);
        java.lang.Class class24 = fSTStreamDecoder3.readArrayHeader();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration25 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration25.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry28 = fSTConfiguration25.getClassRegistry();
        fSTConfiguration25.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration31 = fSTConfiguration25.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration32 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration32.setShareReferences(true);
        java.lang.ClassLoader classLoader35 = null;
        fSTConfiguration32.setClassLoader(classLoader35);
        byte[] byteArray38 = new byte[] {};
        fSTConfiguration32.registerCrossPlatformClassBinaryCache("", byteArray38);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput40 = fSTConfiguration31.getObjectOutput(byteArray38);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry41 = fSTConfiguration31.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder42 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration31);
        boolean boolean43 = fSTStreamEncoder42.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream44 = null;
        fSTStreamEncoder42.setOutstream(outputStream44);
        fSTStreamEncoder42.writeFShort((short) 10);
        fSTStreamEncoder42.writeVersionTag(32);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration50 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration50.setShareReferences(true);
        java.lang.ClassLoader classLoader53 = null;
        fSTConfiguration50.setClassLoader(classLoader53);
        byte[] byteArray56 = new byte[] {};
        fSTConfiguration50.registerCrossPlatformClassBinaryCache("", byteArray56);
        fSTStreamEncoder42.setConf(fSTConfiguration50);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration59 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration59.setShareReferences(true);
        java.lang.ClassLoader classLoader62 = null;
        fSTConfiguration59.setClassLoader(classLoader62);
        byte[] byteArray65 = new byte[] {};
        fSTConfiguration59.registerCrossPlatformClassBinaryCache("", byteArray65);
        org.nustaq.serialization.FSTConfiguration.prettyPrintJson((java.lang.Object) byteArray65);
        fSTStreamEncoder42.reset(byteArray65);
        fSTStreamDecoder3.resetWith(byteArray65, (int) '4');
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration10);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry13);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 1, 0, 10]");
        org.junit.Assert.assertNotNull(fSTObjectOutput21);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(fSTConfiguration25);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry28);
        org.junit.Assert.assertNotNull(fSTConfiguration31);
        org.junit.Assert.assertNotNull(fSTConfiguration32);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput40);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration50);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(fSTConfiguration59);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[]");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream19 = null;
        fSTStreamEncoder17.setOutstream(outputStream19);
        fSTStreamEncoder17.writeFShort((short) 10);
        fSTStreamEncoder17.writeVersionTag(32);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration25 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration25.setShareReferences(true);
        java.lang.ClassLoader classLoader28 = null;
        fSTConfiguration25.setClassLoader(classLoader28);
        byte[] byteArray31 = new byte[] {};
        fSTConfiguration25.registerCrossPlatformClassBinaryCache("", byteArray31);
        fSTStreamEncoder17.setConf(fSTConfiguration25);
        fSTStreamEncoder17.writeFInt((int) (byte) 0);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration25);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        java.io.Serializable serializable5 = fSTConfiguration0.deepCopy((java.io.Serializable) 10.0f);
        org.nustaq.serialization.FSTEncoder fSTEncoder6 = fSTConfiguration0.createStreamEncoder();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry10 = fSTConfiguration7.getClassRegistry();
        fSTConfiguration7.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration13 = fSTConfiguration7.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration14 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration14.setShareReferences(true);
        java.lang.ClassLoader classLoader17 = null;
        fSTConfiguration14.setClassLoader(classLoader17);
        byte[] byteArray20 = new byte[] {};
        fSTConfiguration14.registerCrossPlatformClassBinaryCache("", byteArray20);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput22 = fSTConfiguration13.getObjectOutput(byteArray20);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry23 = fSTConfiguration13.getCLInfoRegistry();
        java.lang.String str25 = fSTConfiguration13.asJsonString((java.lang.Object) (-1.0f));
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer26 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean27 = fSTMapSerializer26.alwaysCopy();
        org.nustaq.serialization.FSTObjectInput fSTObjectInput28 = null;
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo30 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo31 = null;
        fSTMapSerializer26.readObject(fSTObjectInput28, (java.lang.Object) (byte) 10, fSTClazzInfo30, fSTFieldInfo31);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration33 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration33.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry36 = fSTConfiguration33.getClassRegistry();
        fSTConfiguration33.setPreferSpeed(false);
        java.lang.Class class39 = null;
        java.lang.Object obj40 = fSTConfiguration33.getCachedObject(class39);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput41 = fSTConfiguration33.getObjectInput();
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo43 = null;
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo44 = null;
        fSTMapSerializer26.readObject(fSTObjectInput41, (java.lang.Object) (-1.0d), fSTClazzInfo43, fSTFieldInfo44);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration46 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration48 = fSTConfiguration46.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder49 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration46);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder50 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration46);
        java.lang.Class class52 = fSTStreamDecoder50.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration53 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration53.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry56 = fSTConfiguration53.getClassRegistry();
        fSTConfiguration53.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration59 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration59.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry62 = fSTConfiguration59.getClassRegistry();
        java.lang.ClassLoader classLoader63 = fSTConfiguration59.getClassLoader();
        fSTConfiguration53.setClassLoader(classLoader63);
        java.lang.Class<?> wildcardClass65 = classLoader63.getClass();
        java.lang.Object obj67 = fSTStreamDecoder50.coerceElement((java.lang.Class) wildcardClass65, (java.lang.Object) 100.0d);
        boolean boolean68 = fSTMapSerializer26.willHandleClass((java.lang.Class) wildcardClass65);
        org.nustaq.serialization.FSTClassInstantiator fSTClassInstantiator69 = fSTConfiguration13.getInstantiator((java.lang.Class) wildcardClass65);
        java.lang.String str70 = fSTConfiguration13.toString();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration71 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration73 = fSTConfiguration71.setForceClzInit(true);
        boolean boolean74 = fSTConfiguration71.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver75 = fSTConfiguration71.getLastResortResolver();
        java.lang.Class class77 = lastResortClassRessolver75.getClass("");
        java.lang.Class class79 = lastResortClassRessolver75.getClass("");
        fSTConfiguration13.returnObject((java.lang.Object) lastResortClassRessolver75);
        fSTConfiguration0.setLastResortResolver(lastResortClassRessolver75);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + serializable5 + "' != '" + 10.0d + "'", serializable5, 10.0d);
        org.junit.Assert.assertNotNull(fSTEncoder6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry10);
        org.junit.Assert.assertNotNull(fSTConfiguration13);
        org.junit.Assert.assertNotNull(fSTConfiguration14);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput22);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " -1.0" + "'", str25, " -1.0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration33);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(fSTObjectInput41);
        org.junit.Assert.assertNotNull(fSTConfiguration46);
        org.junit.Assert.assertNotNull(fSTConfiguration48);
        org.junit.Assert.assertNotNull(class52);
        org.junit.Assert.assertNotNull(fSTConfiguration53);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry56);
        org.junit.Assert.assertNotNull(fSTConfiguration59);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry62);
        org.junit.Assert.assertNotNull(classLoader63);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 100.0d + "'", obj67, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(fSTClassInstantiator69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "FSTConfiguration{name='null'}" + "'", str70, "FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration71);
        org.junit.Assert.assertNotNull(fSTConfiguration73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver75);
        org.junit.Assert.assertNotNull(class77);
        org.junit.Assert.assertNotNull(class79);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver4 = fSTConfiguration0.getLastResortResolver();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver5 = fSTConfiguration0.getLastResortResolver();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = fSTConfiguration6.setForceClzInit(true);
        boolean boolean9 = fSTConfiguration6.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver10 = fSTConfiguration6.getLastResortResolver();
        java.lang.Class class12 = lastResortClassRessolver10.getClass("hi!");
        java.lang.Object obj13 = fSTConfiguration0.getCachedObject(class12);
        fSTConfiguration0.setName(" -1.0");
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver4);
        org.junit.Assert.assertNotNull(lastResortClassRessolver5);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver10);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        fSTStreamEncoder17.writeArrayEnd();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = fSTStreamEncoder17.getBuffer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry7 = fSTStreamDecoder3.clnames;
        int int8 = fSTStreamDecoder3.readPlainInt();
        boolean boolean10 = fSTStreamDecoder3.isEndMarker("hi!");
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 774910240 + "'", int8 == 774910240);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.nustaq.serialization.FSTConfiguration.clearGlobalCaches();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setPreferSpeed(false);
        java.lang.Class class6 = null;
        java.lang.Object obj7 = fSTConfiguration0.getCachedObject(class6);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry8 = fSTConfiguration0.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder9 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        java.lang.Class<?> wildcardClass10 = fSTStreamDecoder9.getClass();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        boolean boolean3 = fSTConfiguration0.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver4 = fSTConfiguration0.getLastResortResolver();
        java.lang.Class class6 = lastResortClassRessolver4.getClass("hi!");
        java.lang.Class class8 = lastResortClassRessolver4.getClass("FSTConfiguration{name='null'}");
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver4);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createMinBinConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration1 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration1.setShareReferences(true);
        java.lang.ClassLoader classLoader4 = null;
        fSTConfiguration1.setClassLoader(classLoader4);
        byte[] byteArray7 = new byte[] {};
        fSTConfiguration1.registerCrossPlatformClassBinaryCache("", byteArray7);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput9 = fSTConfiguration0.getObjectInput(byteArray7);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(fSTObjectInput9);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        boolean boolean5 = fSTStreamDecoder3.inArray();
        java.lang.Class<?> wildcardClass6 = fSTStreamDecoder3.getClass();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        fSTStreamEncoder17.writeArrayEnd();
        boolean boolean19 = fSTStreamEncoder17.isByteArrayBased();
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        boolean boolean19 = fSTStreamEncoder17.isByteArrayBased();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration20.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry23 = fSTConfiguration20.getClassRegistry();
        fSTConfiguration20.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration26 = fSTConfiguration20.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration27 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration27.setShareReferences(true);
        java.lang.ClassLoader classLoader30 = null;
        fSTConfiguration27.setClassLoader(classLoader30);
        byte[] byteArray33 = new byte[] {};
        fSTConfiguration27.registerCrossPlatformClassBinaryCache("", byteArray33);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput35 = fSTConfiguration26.getObjectOutput(byteArray33);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry36 = fSTConfiguration26.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder37 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration26);
        boolean boolean38 = fSTStreamEncoder37.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream39 = null;
        fSTStreamEncoder37.setOutstream(outputStream39);
        fSTStreamEncoder37.writeFShort((short) 10);
        fSTStreamEncoder37.writeVersionTag(32);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration45 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration45.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry48 = fSTConfiguration45.getClassRegistry();
        fSTConfiguration45.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration51 = fSTConfiguration45.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration52 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration52.setShareReferences(true);
        java.lang.ClassLoader classLoader55 = null;
        fSTConfiguration52.setClassLoader(classLoader55);
        byte[] byteArray58 = new byte[] {};
        fSTConfiguration52.registerCrossPlatformClassBinaryCache("", byteArray58);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput60 = fSTConfiguration51.getObjectOutput(byteArray58);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry61 = fSTConfiguration51.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder62 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration51);
        fSTStreamEncoder62.writeArrayEnd();
        org.nustaq.serialization.serializers.FSTMapSerializer fSTMapSerializer64 = new org.nustaq.serialization.serializers.FSTMapSerializer();
        boolean boolean65 = fSTMapSerializer64.alwaysCopy();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration66 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration66.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry69 = fSTConfiguration66.getClassRegistry();
        fSTConfiguration66.setPreferSpeed(false);
        java.lang.Class class72 = null;
        java.lang.Object obj73 = fSTConfiguration66.getCachedObject(class72);
        org.nustaq.serialization.FSTObjectInput fSTObjectInput74 = fSTConfiguration66.getObjectInput();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration75 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration76 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration76.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry79 = fSTConfiguration76.getClassRegistry();
        fSTConfiguration76.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration82 = fSTConfiguration76.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration84 = fSTConfiguration76.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration85 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration87 = fSTConfiguration85.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder88 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration85);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder89 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration85);
        java.lang.Class class91 = fSTStreamDecoder89.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo92 = fSTConfiguration84.getClazzInfo(class91);
        org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo fSTFieldInfo93 = null;
        fSTMapSerializer64.readObject(fSTObjectInput74, (java.lang.Object) fSTConfiguration75, fSTClazzInfo92, fSTFieldInfo93);
        fSTStreamEncoder62.writeFieldsEnd(fSTClazzInfo92);
        fSTStreamEncoder37.writeFieldsEnd(fSTClazzInfo92);
        fSTStreamEncoder17.externalEnd(fSTClazzInfo92);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry23);
        org.junit.Assert.assertNotNull(fSTConfiguration26);
        org.junit.Assert.assertNotNull(fSTConfiguration27);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput35);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration45);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry48);
        org.junit.Assert.assertNotNull(fSTConfiguration51);
        org.junit.Assert.assertNotNull(fSTConfiguration52);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput60);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration66);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry69);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(fSTObjectInput74);
        org.junit.Assert.assertNotNull(fSTConfiguration75);
        org.junit.Assert.assertNotNull(fSTConfiguration76);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry79);
        org.junit.Assert.assertNotNull(fSTConfiguration82);
        org.junit.Assert.assertNotNull(fSTConfiguration84);
        org.junit.Assert.assertNotNull(fSTConfiguration85);
        org.junit.Assert.assertNotNull(fSTConfiguration87);
        org.junit.Assert.assertNotNull(class91);
        org.junit.Assert.assertNotNull(fSTClazzInfo92);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createUnsafeBinaryConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration1 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration1.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTConfiguration1.getClassRegistry();
        fSTConfiguration1.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = fSTConfiguration1.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration8.setShareReferences(true);
        java.lang.ClassLoader classLoader11 = null;
        fSTConfiguration8.setClassLoader(classLoader11);
        byte[] byteArray14 = new byte[] {};
        fSTConfiguration8.registerCrossPlatformClassBinaryCache("", byteArray14);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput16 = fSTConfiguration7.getObjectOutput(byteArray14);
        fSTConfiguration7.setShareReferences(true);
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver19 = fSTConfiguration7.getLastResortResolver();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration20 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration22 = fSTConfiguration20.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder23 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration20);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder24 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration20);
        java.lang.Class class26 = fSTStreamDecoder24.classForName("hi!");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration27 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration27.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry30 = fSTConfiguration27.getClassRegistry();
        fSTConfiguration27.setPreferSpeed(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration33 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration33.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry36 = fSTConfiguration33.getClassRegistry();
        java.lang.ClassLoader classLoader37 = fSTConfiguration33.getClassLoader();
        fSTConfiguration27.setClassLoader(classLoader37);
        java.lang.Class<?> wildcardClass39 = classLoader37.getClass();
        java.lang.Object obj41 = fSTStreamDecoder24.coerceElement((java.lang.Class) wildcardClass39, (java.lang.Object) 100.0d);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration42 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration42.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry45 = fSTConfiguration42.getClassRegistry();
        fSTConfiguration42.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration48 = fSTConfiguration42.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration50 = fSTConfiguration42.setForceClzInit(false);
        org.nustaq.serialization.FSTConfiguration fSTConfiguration51 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration53 = fSTConfiguration51.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder54 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration51);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder55 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration51);
        java.lang.Class class57 = fSTStreamDecoder55.classForName("hi!");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo58 = fSTConfiguration50.getClazzInfo(class57);
        java.lang.Class[] classArray59 = new java.lang.Class[] { wildcardClass39, class57 };
        org.nustaq.serialization.FSTConfiguration fSTConfiguration60 = fSTConfiguration7.registerCrossPlatformClassMappingUseSimpleName(classArray59);
        fSTConfiguration60.clearCaches();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration62 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration64 = fSTConfiguration62.setForceClzInit(true);
        boolean boolean65 = fSTConfiguration62.isPreferSpeed();
        org.nustaq.serialization.FSTConfiguration.LastResortClassRessolver lastResortClassRessolver66 = fSTConfiguration62.getLastResortResolver();
        java.lang.Class class68 = lastResortClassRessolver66.getClass("");
        org.nustaq.serialization.FSTClazzInfo fSTClazzInfo69 = fSTConfiguration60.getClazzInfo(class68);
        java.lang.String str70 = fSTConfiguration0.getCPNameForClass(class68);
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration1);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput16);
        org.junit.Assert.assertNotNull(lastResortClassRessolver19);
        org.junit.Assert.assertNotNull(fSTConfiguration20);
        org.junit.Assert.assertNotNull(fSTConfiguration22);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(fSTConfiguration27);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry30);
        org.junit.Assert.assertNotNull(fSTConfiguration33);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry36);
        org.junit.Assert.assertNotNull(classLoader37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertNotNull(fSTConfiguration42);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry45);
        org.junit.Assert.assertNotNull(fSTConfiguration48);
        org.junit.Assert.assertNotNull(fSTConfiguration50);
        org.junit.Assert.assertNotNull(fSTConfiguration51);
        org.junit.Assert.assertNotNull(fSTConfiguration53);
        org.junit.Assert.assertNotNull(class57);
        org.junit.Assert.assertNotNull(fSTClazzInfo58);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(fSTConfiguration60);
        org.junit.Assert.assertNotNull(fSTConfiguration62);
        org.junit.Assert.assertNotNull(fSTConfiguration64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(lastResortClassRessolver66);
        org.junit.Assert.assertNotNull(class68);
        org.junit.Assert.assertNotNull(fSTClazzInfo69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "org.nustaq.serialization.coders.Unknown" + "'", str70, "org.nustaq.serialization.coders.Unknown");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration2 = fSTConfiguration0.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder3 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration0);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry4 = fSTStreamDecoder3.clnames;
        java.io.InputStream inputStream5 = null;
        fSTStreamDecoder3.setInputStream(inputStream5);
        fSTStreamDecoder3.close();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration8 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration10 = fSTConfiguration8.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder11 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration8);
        java.lang.Object obj12 = fSTStreamDecoder11.getDirectObject();
        boolean boolean13 = fSTStreamDecoder11.isMapBased();
        java.lang.Class class15 = fSTStreamDecoder11.classForName(" 52");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration16 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration18 = fSTConfiguration16.setForceClzInit(true);
        org.nustaq.serialization.coders.FSTStreamDecoder fSTStreamDecoder19 = new org.nustaq.serialization.coders.FSTStreamDecoder(fSTConfiguration16);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry20 = fSTStreamDecoder19.clnames;
        boolean boolean21 = fSTStreamDecoder19.inArray();
        fSTStreamDecoder19.readObjectEnd();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration23 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration23.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry26 = fSTConfiguration23.getClassRegistry();
        fSTConfiguration23.setPreferSpeed(false);
        java.lang.Class class29 = null;
        java.lang.Object obj30 = fSTConfiguration23.getCachedObject(class29);
        fSTConfiguration23.setStructMode(true);
        fSTStreamDecoder19.setConf(fSTConfiguration23);
        java.lang.Object obj34 = fSTStreamDecoder3.coerceElement(class15, (java.lang.Object) fSTStreamDecoder19);
        boolean boolean35 = fSTStreamDecoder19.isMapBased();
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTConfiguration2);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry4);
        org.junit.Assert.assertNotNull(fSTConfiguration8);
        org.junit.Assert.assertNotNull(fSTConfiguration10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(fSTConfiguration16);
        org.junit.Assert.assertNotNull(fSTConfiguration18);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fSTConfiguration23);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration0 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration0.setShareReferences(true);
        org.nustaq.serialization.FSTClazzNameRegistry fSTClazzNameRegistry3 = fSTConfiguration0.getClassRegistry();
        fSTConfiguration0.setName("");
        org.nustaq.serialization.FSTConfiguration fSTConfiguration6 = fSTConfiguration0.deriveConfiguration();
        org.nustaq.serialization.FSTConfiguration fSTConfiguration7 = org.nustaq.serialization.FSTConfiguration.createJsonNoRefConfiguration();
        fSTConfiguration7.setShareReferences(true);
        java.lang.ClassLoader classLoader10 = null;
        fSTConfiguration7.setClassLoader(classLoader10);
        byte[] byteArray13 = new byte[] {};
        fSTConfiguration7.registerCrossPlatformClassBinaryCache("", byteArray13);
        org.nustaq.serialization.FSTObjectOutput fSTObjectOutput15 = fSTConfiguration6.getObjectOutput(byteArray13);
        org.nustaq.serialization.FSTClazzInfoRegistry fSTClazzInfoRegistry16 = fSTConfiguration6.getCLInfoRegistry();
        org.nustaq.serialization.coders.FSTStreamEncoder fSTStreamEncoder17 = new org.nustaq.serialization.coders.FSTStreamEncoder(fSTConfiguration6);
        boolean boolean18 = fSTStreamEncoder17.isTagMultiDimSubArrays();
        java.io.OutputStream outputStream19 = null;
        fSTStreamEncoder17.setOutstream(outputStream19);
        fSTStreamEncoder17.writeFShort((short) 10);
        int int23 = fSTStreamEncoder17.getWritten();
        fSTStreamEncoder17.ensureFree((int) (short) -1);
        fSTStreamEncoder17.writeFShort((short) 32);
        java.io.OutputStream outputStream28 = null;
        fSTStreamEncoder17.setOutstream(outputStream28);
        char[] charArray33 = new char[] { '\n', '\000', '\000' };
        // The following exception was thrown during execution in test generation
        try {
            fSTStreamEncoder17.writeFCharArr(charArray33, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fSTConfiguration0);
        org.junit.Assert.assertNotNull(fSTClazzNameRegistry3);
        org.junit.Assert.assertNotNull(fSTConfiguration6);
        org.junit.Assert.assertNotNull(fSTConfiguration7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(fSTObjectOutput15);
        org.junit.Assert.assertNotNull(fSTClazzInfoRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "\n\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "\n\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[\n, \000, \000]");
    }
}
